package zanshin.aspects;

import java.awt.Frame;

import zanshin.TargetSystemController;
import zanshin.ZanshinUtil;
import atm.ATM;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public aspect Init {
	/**
	 * TODO: document this method.
	 */
	pointcut init():
		execution(void ATMMain.main(String[]));

	/**
	 * TODO: document this method.
	 */
	pointcut atmCreation():
		call(ATM.new(..));
	
	/**
	 * TODO: document this method.
	 */
	pointcut frameCreation():
		call(Frame.new(..));
	
	/**
	 * TODO: document this method.
	 */
	pointcut sessionStart():
		execution(void ATM.switchOn());
	
	/**
	 * TODO: document this method.
	 */
	pointcut sessionEnd():
		execution(void ATM.switchOff());
	
	/**
	 * TODO: document this method.
	 */
	before(): init() {
		ZanshinUtil.logAspect(getClass(), "before", thisJoinPoint);
	}
	
	/**
	 * TODO: document this method.
	 * @return
	 */
	after() returning(ATM atm): atmCreation() {
		ZanshinUtil.logAspect(getClass(), "after returning", thisJoinPoint);

		// Injecting a reference to the ATM in the ATM Zanshin Controler.
		TargetSystemController controller = TargetSystemController.getInstance();
		controller.setAtm(atm);
	}	
	
	/**
	 * TODO: document this method.
	 * @return
	 */
	after() returning(Frame frame): frameCreation() {
		ZanshinUtil.logAspect(getClass(), "after returning", thisJoinPoint);

		// Injecting a reference to the Frame in the ATM Zanshin Controler.
		TargetSystemController controller = TargetSystemController.getInstance();
		controller.setFrame(frame);
	}
	
	/**
	 * TODO: document this method.
	 */
	after() returning(): sessionStart() {
		ZanshinUtil.logAspect(getClass(), "after returning", thisJoinPoint);

		// Starts a user session on Zanshin.
		TargetSystemController controller = TargetSystemController.getInstance();
		controller.startSession();
	}
	
	/**
	 * TODO: document this method.
	 */
	after() returning(): sessionEnd() {
		ZanshinUtil.logAspect(getClass(), "after returning", thisJoinPoint);

		// Ends the user session on Zanshin.
		TargetSystemController controller = TargetSystemController.getInstance();
		controller.endSession();
	}
}
