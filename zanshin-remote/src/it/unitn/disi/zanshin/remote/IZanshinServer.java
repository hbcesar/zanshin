package it.unitn.disi.zanshin.remote;

import it.unitn.disi.zanshin.model.gore.MonitorableMethod;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public interface IZanshinServer extends Remote {
	/** TODO: document this field. */
	String RMI_NAME = "Zanshin"; //$NON-NLS-1$

	/** TODO: document this field. */
	int RMI_PORT = 1099;

	/**
	 * TODO: document this method.
	 * 
	 * @param requirements
	 * @return
	 * @throws RemoteException
	 */
	String registerTargetSystem(String requirements) throws RemoteException;

	/**
	 * TODO: document this method.
	 * 
	 * @param targetSystemId
	 * @return
	 * @throws RemoteException
	 */
	String createUserSession(String targetSystemId) throws RemoteException;

	/**
	 * TODO: document this method.
	 * 
	 * @param targetSystemId
	 * @param userSessionId
	 * @param requirementsName
	 * @param method
	 */
	void logRequirementLifecycleMethodCall(String targetSystemId, String userSessionId, String requirementsName, MonitorableMethod method);
}
