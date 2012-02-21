package it.unitn.disi.zanshin.adaptation.qualia.model;

import it.unitn.disi.zanshin.model.eca.AdaptationSession;
import it.unitn.disi.zanshin.model.gore.AwReq;


/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public abstract class AbstractProcedure implements Procedure {
	/** TODO: document this field. */
	protected String id;

	/** @see it.unitn.disi.zanshin.adaptation.qualia.model.Procedure#getId() */
	@Override
	public String getId() {
		// By default, generate the procedure's id from it's class name.
		if (id == null)
			id = generateProcedureId();
		return id;
	}

	/**
	 * TODO: document this method.
	 */
	private String generateProcedureId() {
		// Starts with the name of the class, removing the interface name at the end.
		StringBuilder builder = new StringBuilder(getClass().getSimpleName());
		int idx = builder.lastIndexOf(Procedure.class.getSimpleName());
		if (idx != -1)
			builder.delete(idx, builder.length());

		// Replace upper case letters with lower case ones and, except for the first one, precede them with a dash.
		builder.setCharAt(0, Character.toLowerCase(builder.charAt(0)));
		idx = -1;
		while ((++idx) < builder.length()) {
			if (Character.isUpperCase(builder.charAt(idx))) {
				builder.setCharAt(idx, Character.toLowerCase(builder.charAt(idx)));
				builder.insert(idx++, '-');
			}
		}
		return builder.toString();
	}

	/** @see it.unitn.disi.zanshin.adaptation.qualia.model.Procedure#as(java.lang.Class) */
	@SuppressWarnings("unchecked")
	@Override
	public <P extends Procedure> P as(Class<P> procedureClass) {
		// If the cast is allowed, convert this instance to the specified procedure class.
		if (procedureClass.isAssignableFrom(this.getClass()))
			return (P) this;
		else return null;
	}

	/** @see it.unitn.disi.zanshin.adaptation.qualia.model.Procedure#checkApplicability(it.unitn.disi.zanshin.model.gore.AwReq, it.unitn.disi.zanshin.model.eca.AdaptationSession, it.unitn.disi.zanshin.model.eca.ApplicabilityCondition) */
	@Override
	public boolean checkApplicability(AwReq awreq, AdaptationSession session) {
		// By default, procedures are applicable.
		return true;
	}
}
