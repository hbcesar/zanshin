package it.unitn.disi.acad.simulation.cases;

import it.unitn.disi.acad.model.scalable.AR1;
import it.unitn.disi.acad.model.scalable.G00000;
import it.unitn.disi.acad.model.scalable.ScalableFactory;
import it.unitn.disi.acad.model.scalable.ScalableGoalModel;
import it.unitn.disi.acad.simulation.Activator;
import it.unitn.disi.acad.simulation.SimulationUtils;
import it.unitn.disi.zanshin.model.eca.EcaFactory;
import it.unitn.disi.zanshin.model.eca.MaxExecutionsPerSessionApplicabilityCondition;
import it.unitn.disi.zanshin.model.eca.RetryStrategy;
import it.unitn.disi.zanshin.model.eca.SimpleResolutionCondition;
import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.DefinableRequirement;
import it.unitn.disi.zanshin.model.gore.Goal;
import it.unitn.disi.zanshin.model.gore.Requirement;
import it.unitn.disi.zanshin.services.IRepositoryService;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Random;
import java.util.Stack;

import org.osgi.framework.ServiceReference;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class ScalableModelSimulation extends AbstractSimulation {
	/** TODO: document this field. */
	private static final int MAX_CHILDREN = 5;
	
	/** TODO: document this field. */
	private static final int[] GOAL_MODEL_SIZES = new int[] {10, 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000};
	
	/** The repository service. */
	private IRepositoryService repositoryService;

	/** TODO: document this field. */
	private Random random;
	
	/** TODO: document this field. */
	private ScalableGoalModel model;
	
	/** TODO: document this field. */
	public static ScalableGoalModel modelCopy;
	
	/** TODO: document this field. */
	private long startTimestamp;

	/** @see it.unitn.disi.acad.simulation.cases.AbstractSimulation#doInit() */
	@Override
	public void doInit() throws Exception {
		// Initializes the random number generator.
		random = new Random(System.currentTimeMillis());

		// Obtains the repository service and registers the goal model there.
		ServiceReference<IRepositoryService> serviceReference = Activator.getContext().getServiceReference(IRepositoryService.class);
		repositoryService = Activator.getContext().getService(serviceReference);

		// Creates a simulation part for each goal model size.
		for (final int modelSize : GOAL_MODEL_SIZES) {
			parts.add(new SimulationPart() {
				@Override
				public void run() throws Exception {
					// Creates a random goal model of the given size.
					startTimestamp = System.currentTimeMillis();
					model = createRandomModel(modelSize);
					repositoryService.storeGoalModel(model);
					
					// Creates an exact copy of the model.
					modelCopy = createCopy(model);
					
					// Writes the model size in the date attribute of the root.
					model.getRootGoal().setTime(new Date(modelSize));
					
					// Obtains the element that is going to fail.
					AwReq awreq = model.getAwReqs().get(0);
					DefinableRequirement target = awreq.getTarget();
					
					// Prints the elapsed amount of time.
					long endTimestamp = System.currentTimeMillis();
					System.out.println(MessageFormat.format(">>> TIMING <<< Model Size: {0}; Preparation time: {1}", modelSize, (endTimestamp - startTimestamp))); //$NON-NLS-1$
					
					// Times the simulation of the failure and adaptation.
					startTimestamp = System.currentTimeMillis();
					target.start();
					target.fail();
					target.end();
				}

				@Override
				public boolean shouldWait() {
					return true;
				}
			});
			
			parts.add(new SimulationPart() {
				@Override
				public void run() throws Exception {
					AwReq awreq = model.getAwReqs().get(0);
					DefinableRequirement target = awreq.getTarget();
					target.start();
					target.success();
					target.end();
					
					// Prints the elapsed amount of time.
					long endTimestamp = System.currentTimeMillis();
					System.out.println(MessageFormat.format(">>> TIMING <<< Model Size: {0}; Target System time: {1}", modelSize, (endTimestamp - startTimestamp))); //$NON-NLS-1$
				}

				@Override
				public boolean shouldWait() {
					return false;
				}
			});
		}
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param numElements
	 * @return
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 */
	private ScalableGoalModel createRandomModel(int numElements) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		SimulationUtils.log.debug("Creating a random goal model with {0} elements...", numElements); //$NON-NLS-1$
		
		// Creates the scalable model and adds a root.
		ScalableFactory factory = ScalableFactory.eINSTANCE;
		ScalableGoalModel model = factory.createScalableGoalModel();
		G00000 root = factory.createG00000();
		model.setRootGoal(root);

		// Objects needed for generating the names of the classes that implement the different goals.
		String factoryMethodPrefix = "createG"; //$NON-NLS-1$
		NumberFormat nf = NumberFormat.getIntegerInstance();
		nf.setMinimumIntegerDigits(5);
		nf.setGroupingUsed(false);

		// Determines the index of the target element, avoiding the ones that are closer to the root.
		int targetIndex = (numElements * 3 / 4) + random.nextInt(numElements / 4);
		Goal target = null;
		
		// Creates the specified number of elements.
		Goal[] goals = new Goal[numElements];
		for (int count = 1; count < numElements; count++) {
			Method method = factory.getClass().getMethod(factoryMethodPrefix + nf.format(count));
			Goal goal = (Goal) method.invoke(factory);
			goals[count] = goal;
			
			// Checks if this is the target.
			if (count == targetIndex)
				target = goal;
		}

		// Use stacks to know when to move to the next level of the tree.
		Stack<Goal> levelStack = new Stack<>();
		Stack<Goal> nextLevelStack = new Stack<>();
		levelStack.push(root);

		// Places the elements randomly in the tree.
		SimulationUtils.log.debug("{0} elements have been created. Placing them randomly in the tree...", numElements); //$NON-NLS-1$
		int count = 1, levelCount = 1;
		out: while (true) {
			SimulationUtils.log.debug("Creating elements in level {0}...", levelCount); //$NON-NLS-1$
			
			// Process the elements of the current level.
			while (!levelStack.empty()) {
				Goal goal = levelStack.pop();
				int numChildren = random.nextInt(MAX_CHILDREN + 1);
				
				// For the first 5 elements, enforce a minimum of 2 children.
				if ((count <= 5) && (numChildren < 2))
					numChildren = 2;
				
				// Places a random amount of children in this goal (between 0 and MAX_CHILDREN).
				for (int i = 0; i < numChildren; i++) {
					// Associates the instance corresponding to the count with the parent goal.
					Goal child = goals[count++];
					child.setParent(goal);
					
					// If we have created enough elements, break out of the main loop.
					if (count >= numElements)
						break out;
					
					// Otherwise, add this element to the stack of elements of the next level.
					nextLevelStack.push(child);
				}
			}
			
			// Move to the next level, by considering the next level stack the current level stack.
			levelStack = nextLevelStack;
			nextLevelStack = new Stack<>();
			levelCount++;
		}
		
		// Adds an ECA-based AwReq targeting a randomly selected goal with strategy Retry.
		SimulationUtils.log.debug("Creating AwReq AR1 targeting {0} with a Retry strategy applicable once per session", target.eClass().getName()); //$NON-NLS-1$
		EcaFactory ecaFactory = EcaFactory.eINSTANCE;
		AR1 awreq = factory.createAR1();
		awreq.setTarget(target);
		SimpleResolutionCondition resolutionCondition = ecaFactory.createSimpleResolutionCondition();
		awreq.setCondition(resolutionCondition);
		RetryStrategy strategy = ecaFactory.createRetryStrategy();
		MaxExecutionsPerSessionApplicabilityCondition applicabilityCondition = ecaFactory.createMaxExecutionsPerSessionApplicabilityCondition();
		applicabilityCondition.setMaxExecutions(1);
		strategy.setCondition(applicabilityCondition);
		strategy.setAwReq(awreq);
		strategy.setTime(3000l);
		awreq.setGoalModel(model);

		// Returns the scalable model.
		SimulationUtils.log.debug("Random goal model with {0} elements created successfully.", numElements); //$NON-NLS-1$
		return model;
	}

	/**
	 * TODO: document this method.
	 * @param model
	 * @return
	 * @throws SecurityException 
	 * @throws NoSuchMethodException 
	 * @throws InvocationTargetException 
	 * @throws IllegalArgumentException 
	 * @throws IllegalAccessException 
	 */
	protected ScalableGoalModel createCopy(ScalableGoalModel model) throws NoSuchMethodException, SecurityException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		SimulationUtils.log.debug("Creating a copy of the random goal model that was just created..."); //$NON-NLS-1$
		
		// Creates the scalable model and adds a root.
		ScalableFactory factory = ScalableFactory.eINSTANCE;
		ScalableGoalModel newModel = factory.createScalableGoalModel();
		G00000 root = factory.createG00000();
		newModel.setRootGoal(root);
		
		// To identify the target...
		DefinableRequirement target = model.getAwReqs().get(0).getTarget();
		DefinableRequirement newTarget = null;

		// Objects needed for generating the names of the classes that implement the different goals.
		String factoryMethodPrefix = "create"; //$NON-NLS-1$
		
		// Recursively copy elements of the tree.
		Stack<Goal> stack = new Stack<>();
		Stack<Goal> newStack = new Stack<>();
		stack.push(model.getRootGoal());
		newStack.push(newModel.getRootGoal());
		while (!stack.empty()) {
			Goal goal = stack.pop();
			Goal newGoal = newStack.pop();
			
			if (target.eClass().equals(goal.eClass()))
				newTarget = newGoal;
			
			for (Requirement req : goal.getChildren()) {
				Goal child = (Goal) req;
				Method method = factory.getClass().getMethod(factoryMethodPrefix + child.eClass().getName());
				Goal newChild = (Goal) method.invoke(factory);
				newChild.setParent(newGoal);
				
				stack.push(child);
				newStack.push(newChild);
			}
		}
		
		// Adds an ECA-based AwReq targeting a randomly selected goal with strategy Retry.
		SimulationUtils.log.debug("Like in the original, creating AwReq AR1 targeting {0} with a Retry strategy applicable once per session", newTarget.eClass().getName()); //$NON-NLS-1$
		EcaFactory ecaFactory = EcaFactory.eINSTANCE;
		AR1 awreq = factory.createAR1();
		awreq.setTarget(newTarget);
		SimpleResolutionCondition resolutionCondition = ecaFactory.createSimpleResolutionCondition();
		awreq.setCondition(resolutionCondition);
		RetryStrategy strategy = ecaFactory.createRetryStrategy();
		MaxExecutionsPerSessionApplicabilityCondition applicabilityCondition = ecaFactory.createMaxExecutionsPerSessionApplicabilityCondition();
		applicabilityCondition.setMaxExecutions(1);
		strategy.setCondition(applicabilityCondition);
		strategy.setAwReq(awreq);
		strategy.setTime(3000l);
		awreq.setGoalModel(newModel);

		// Returns the scalable model.
		SimulationUtils.log.debug("Copy of goal model created successfully."); //$NON-NLS-1$
		return newModel;
	}
}
