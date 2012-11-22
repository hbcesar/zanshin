import zanshin.ZanshinUtil;
import atm.physical.CashDispenser;
import banking.Money;

/**
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public aspect CashDisp {
	/**
	 * TODO: document this method.
	 */
	pointcut SetCash() : 
			execution (void CashDispenser.setInitialCash(Money));

	/**
	 * TODO: document this method.
	 */
	before(): SetCash() {
		ZanshinUtil.logAspect(getClass(), "before", thisJoinPoint);

	}
}
