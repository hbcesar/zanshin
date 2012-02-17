package it.unitn.disi.zanshin.adaptation.qualia.model;

/**
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public interface Procedure {
	/**
	 * TODO: document this method.
	 * @return
	 */
	String getId();
	
	/**
	 * TODO: document this method.
	 * @param procedureClass
	 * @return
	 */
	<P extends Procedure> P as(Class<P> procedureClass);

	/**
	 * TODO: document this method.
	 * @param adaptationAlgorithm
	 */
	void replaceDefaultProcedure(AdaptationAlgorithm adaptationAlgorithm);
}
