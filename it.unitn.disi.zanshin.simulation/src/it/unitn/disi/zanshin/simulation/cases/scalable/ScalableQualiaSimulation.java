package it.unitn.disi.zanshin.simulation.cases.scalable;

import it.unitn.disi.zanshin.model.eca.EcaFactory;
import it.unitn.disi.zanshin.model.eca.ReconfigurationStrategy;
import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.Configuration;
import it.unitn.disi.zanshin.model.gore.DefinableRequirement;
import it.unitn.disi.zanshin.model.gore.DifferentialRelation;
import it.unitn.disi.zanshin.model.gore.DifferentialRelationOperator;
import it.unitn.disi.zanshin.model.gore.Goal;
import it.unitn.disi.zanshin.model.gore.GoreFactory;
import it.unitn.disi.zanshin.model.gore.Parameter;
import it.unitn.disi.zanshin.model.gore.ParameterMetric;
import it.unitn.disi.zanshin.model.gore.ParameterType;
import it.unitn.disi.zanshin.services.IRepositoryService;
import it.unitn.disi.zanshin.simulation.Activator;
import it.unitn.disi.zanshin.simulation.SimulationUtils;
import it.unitn.disi.zanshin.simulation.cases.AbstractSimulation;
import it.unitn.disi.zanshin.simulation.cases.SimulationPart;
import it.unitn.disi.zanshin.simulation.model.scalable.AR1;
import it.unitn.disi.zanshin.simulation.model.scalable.G00000;
import it.unitn.disi.zanshin.simulation.model.scalable.ScalableFactory;
import it.unitn.disi.zanshin.simulation.model.scalable.ScalableGoalModel;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.text.MessageFormat;
import java.text.NumberFormat;
import java.util.Date;
import java.util.Random;
import java.util.Stack;

/**
 * Simulation that mimics systems of different sizes being made adaptive using the adaptation framework, testing the
 * scalability of the framework to different system sizes. System size here is measured in the number of elements in its
 * requirements model.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class ScalableQualiaSimulation extends AbstractSimulation {
	/** Constant that indicates the maximum number of children for each model element when generating random models. */
	private static final int MAX_CHILDREN = 5;

	/** Constant that defines the size of the goal model to build. */
	private static final int GOAL_MODEL_SIZE = 300;
	
	/** Constant that defines different numbers for the amount of parameters and relations. */
	private static final int[] NUMBERS_OF_RELATIONS = new int[] { 100, 200, 300, 400, 500, 600, 700, 800, 900, 1000 };

	/** The repository service. */
	private IRepositoryService repositoryService;

	/** Random number generator to determine the number of children for each generated goal model element. */
	private Random random;

	/** The generated goal model for the current simulation part. */
	private ScalableGoalModel model;

	/** The starting timestamp, used when the simulation part ends to calculate the time taken to perform it. */
	private long startTimestamp;

	/** @see it.unitn.disi.zanshin.simulation.cases.AbstractSimulation#doInit() */
	@Override
	public void doInit() throws Exception {
		// Initializes the random number generator.
		random = new Random(System.currentTimeMillis());

		// Obtains the repository service.
		repositoryService = Activator.getRepositoryService();

		// Creates a simulation part for each goal model size.
		for (final int numberOfRelations : NUMBERS_OF_RELATIONS) {
			parts.add(new SimulationPart() {
				@Override
				public void run() throws Exception {
					// Creates a random goal model of the given size.
					startTimestamp = System.currentTimeMillis();
					model = createRandomModel(GOAL_MODEL_SIZE, numberOfRelations);
					repositoryService.storeGoalModel(model);

					// Writes the model size in the date attribute of the root.
					model.getRootGoal().setTime(new Date(numberOfRelations));

					// Obtains the element that is going to fail.
					AwReq awreq = (AwReq) model.getRootGoal().getChildren().get(0);
					DefinableRequirement target = awreq.getTarget();

					// Prints the elapsed amount of time.
					long endTimestamp = System.currentTimeMillis();
					System.out.println(MessageFormat.format(">>> TIMING <<< Number of relations: {0}; Preparation time: {1}", numberOfRelations, (endTimestamp - startTimestamp))); //$NON-NLS-1$

					// Times the simulation of the failure and adaptation.
					startTimestamp = System.currentTimeMillis();
					target.start();
					target.fail();
				}

				@Override
				public boolean shouldWait() {
					return true;
				}
			});

			parts.add(new SimulationPart() {
				@Override
				public void run() throws Exception {
					AwReq awreq = (AwReq) model.getRootGoal().getChildren().get(0);
					DefinableRequirement target = awreq.getTarget();
					target.start();
					target.success();

					// Prints the elapsed amount of time.
					long endTimestamp = System.currentTimeMillis();
					System.out.println(MessageFormat.format(">>> TIMING <<< Number of relations: {0}; Target System time: {1}", numberOfRelations, (endTimestamp - startTimestamp))); //$NON-NLS-1$
				}

				@Override
				public boolean shouldWait() {
					return false;
				}
			});
		}
	}

	/**
	 * Creates a random requirements model of the specified size for the scalability simulation.
	 * 
	 * @param numElements
	 *          The number of elements the random requirements model should contain.
	 * @return A random requirements model, using elements from the scalable.ecore EMF model.
	 * @throws NoSuchMethodException
	 *           If the factory method for creating goal model elements cannot be found.
	 * @throws IllegalAccessException
	 *           If the factory method for creating goal model elements cannot be invoked.
	 * @throws InvocationTargetException
	 *           If the factory method for creating goal model elements cannot be invoked.
	 */
	private ScalableGoalModel createRandomModel(int numElements, int numberOfRelations) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException {
		SimulationUtils.log.debug("Creating a random goal model with {0} elements and {1} parameters/relations...", numElements, numberOfRelations); //$NON-NLS-1$

		// Creates the scalable model and adds a root.
		ScalableFactory factory = ScalableFactory.eINSTANCE;
		ScalableGoalModel model = factory.createScalableGoalModel();
		G00000 root = factory.createG00000();
		model.setRootGoal(root);

		// Adds the AwReq as first child of the root goal, so it's easier to retrieve later.
		AR1 awreq = factory.createAR1();
		awreq.setParent(root);

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
		awreq.setTarget(target);
		SimulationUtils.log.info("Target for goal model of {0} elements: {1}", numElements, target.eClass().getName()); //$NON-NLS-1$

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

		// Creates N parameters and relations between these parameters and the failing AwReq.
		GoreFactory goreFactory = GoreFactory.eINSTANCE;
		Configuration configuration = goreFactory.createConfiguration();
		configuration.setGoalModel(model);
		for (int i = 0; i < numberOfRelations; i++) {
			Parameter param = goreFactory.createParameter();
			param.setType(ParameterType.NUMERIC_CONTROL_VARIABLE);
			param.setUnit("10"); //$NON-NLS-1$
			param.setValue("50"); //$NON-NLS-1$
			param.setMetric(ParameterMetric.INTEGER);
			param.setConfiguration(configuration);
			
			DifferentialRelation relation = goreFactory.createDifferentialRelation();
			relation.setIndicator(awreq);
			relation.setParameter(param);
			relation.setLowerBound("0"); //$NON-NLS-1$
			relation.setUpperBound("150"); //$NON-NLS-1$
			relation.setOperator(DifferentialRelationOperator.GREATER_THAN);
			model.getRelations().add(relation);
		}
		
		// Uses qualia to adapt.
		EcaFactory ecaFactory = EcaFactory.eINSTANCE;
		awreq.setCondition(ecaFactory.createReconfigurationResolutionCondition());
		ReconfigurationStrategy strategy = ecaFactory.createReconfigurationStrategy();
		strategy.setCondition(ecaFactory.createReconfigurationApplicabilityCondition());
		strategy.setAlgorithmId("qualia"); //$NON-NLS-1$
		awreq.getStrategies().add(strategy);

		// Returns the scalable model.
		SimulationUtils.log.debug("Random goal model with {0} elements and {1} parameters/relations created successfully.", numElements, numberOfRelations); //$NON-NLS-1$
		return model;
	}
}
