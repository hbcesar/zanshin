package it.unitn.disi.zanshin.controller.internal.server;

/**
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class SessionManager {
	/** TODO: document this field. */
	private String targetSystemId;
	
	/** TODO: document this field. */
	private ZanshinClassLoader classLoader;
	
	/** Constructor. */
	public SessionManager(String targetSystemId, ZanshinClassLoader classLoader) {
		this.targetSystemId = targetSystemId;
		this.classLoader = classLoader;
	}

	/** Getter for targetSystemId. */
	public String getTargetSystemId() {
		return targetSystemId;
	}
}
