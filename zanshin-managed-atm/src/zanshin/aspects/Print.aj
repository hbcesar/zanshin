import zanshin.AtmRequirement;
import zanshin.TargetSystemController;
import zanshin.ZanshinUtil;
import atm.physical.ReceiptPrinter;
import banking.Receipt;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public aspect Print {
	
	/**
	 * TODO: document this method.
	 */
	pointcut printReceipt(): 
			execution (void ReceiptPrinter.printReceipt(Receipt));

	/**
	 * TODO: document this method.
	 */
	before(): printReceipt() {
		ZanshinUtil.logAspect(getClass(), "before", thisJoinPoint);

		// Logs the task has started.
		TargetSystemController controller = TargetSystemController.getInstance();
		controller.logRequirementStart(AtmRequirement.T_PRINT_RECEIPT);
	}
	
	/**
	 * TODO: document this method.
	 */
	after() throwing(): printReceipt() {
		ZanshinUtil.logAspect(getClass(), "after throwing", thisJoinPoint);

		// In case of errors, logs that the task has failed.
		TargetSystemController controller = TargetSystemController.getInstance();
		controller.logRequirementFailure(AtmRequirement.T_PRINT_RECEIPT);
	}
	
	/**
	 * TODO: document this method.
	 */
	after() returning(): printReceipt() {
		ZanshinUtil.logAspect(getClass(), "after returning", thisJoinPoint);

		// If no errors happened, logs that the task was successful.
		TargetSystemController controller = TargetSystemController.getInstance();
		controller.logRequirementSuccess(AtmRequirement.T_PRINT_RECEIPT);
	}
}
