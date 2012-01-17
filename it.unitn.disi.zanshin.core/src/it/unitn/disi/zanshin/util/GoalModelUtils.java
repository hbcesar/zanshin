package it.unitn.disi.zanshin.util;

import it.unitn.disi.zanshin.model.gore.AwReq;
import it.unitn.disi.zanshin.model.gore.DomainAssumption;
import it.unitn.disi.zanshin.model.gore.Goal;
import it.unitn.disi.zanshin.model.gore.GorePackage;
import it.unitn.disi.zanshin.model.gore.QualityConstraint;
import it.unitn.disi.zanshin.model.gore.Requirement;
import it.unitn.disi.zanshin.model.gore.Softgoal;
import it.unitn.disi.zanshin.model.gore.Task;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class GoalModelUtils {
	/**
	 * Returns the EMF code for the requirement's type, given the requiremnet instance.
	 * 
	 * @param req
	 *          The requirement instance.
	 * @return The code that represents the requirement's type, <code>-1</code> if the type is not recognized.
	 */
	public static int getEmfType(Requirement req) {
		// Delegates to the utility method that receives the requirement's class.
		return getEmfType(req.getClass());
	}

	/**
	 * Returns the EMF code for the requirement's type, given the requirement class.
	 * 
	 * @param reqClass
	 *          The requirement class.
	 * @return The code that represents the requirement's type, <code>-1</code> if the type is not recognized.
	 */
	public static int getEmfType(Class<? extends Requirement> reqClass) {
		// Checks if it's one of the recognized interfaces, returning their code.
		if (AwReq.class.isAssignableFrom(reqClass))
			return GorePackage.AW_REQ;
		else if (DomainAssumption.class.isAssignableFrom(reqClass))
			return GorePackage.DOMAIN_ASSUMPTION;
		else if (Goal.class.isAssignableFrom(reqClass))
			return GorePackage.GOAL;
		else if (QualityConstraint.class.isAssignableFrom(reqClass))
			return GorePackage.QUALITY_CONSTRAINT;
		else if (Softgoal.class.isAssignableFrom(reqClass))
			return GorePackage.SOFTGOAL;
		else if (Task.class.isAssignableFrom(reqClass))
			return GorePackage.TASK;

		// If it's not, return an unrecognizable code.
		return -1;
	}
}
