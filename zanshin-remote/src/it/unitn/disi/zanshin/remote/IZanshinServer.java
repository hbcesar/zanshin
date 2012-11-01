package it.unitn.disi.zanshin.remote;

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
	 * @param metaModel
	 * @param model
	 * @return
	 * @throws RemoteException
	 */
	String registerTargetSystem(String metaModel, String model) throws RemoteException;

	/**
	 * TODO: document this method.
	 * 
	 * @param targetSystemId
	 * @return
	 * @throws RemoteException
	 */
	Long createUserSession(String targetSystemId) throws RemoteException;

	/**
	 * TODO: document this method.
	 * @param targetSystemId
	 * @param userSessionId
	 * @param requirementsName
	 */
	void logRequirementStart(String targetSystemId, Long userSessionId, String requirementsName) throws RemoteException;

	/**
	 * TODO: document this method.
	 * @param targetSystemId
	 * @param userSessionId
	 * @param requirementsName
	 */
	void logRequirementSuccess(String targetSystemId, Long userSessionId, String requirementsName) throws RemoteException;

	/**
	 * TODO: document this method.
	 * @param targetSystemId
	 * @param userSessionId
	 * @param requirementsName
	 */
	void logRequirementFailure(String targetSystemId, Long userSessionId, String requirementsName) throws RemoteException;

	/**
	 * TODO: document this method.
	 * @param targetSystemId
	 * @param userSessionId
	 * @param requirementsName
	 */
	void logRequirementCancellation(String targetSystemId, Long userSessionId, String requirementsName) throws RemoteException;
}
