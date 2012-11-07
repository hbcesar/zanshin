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
	/** The name to which Zanshin will bind its RMI server. */
	String RMI_NAME = "Zanshin"; //$NON-NLS-1$

	/** The port through which Zanshin and target systems should communicate using RMI. */
	int RMI_PORT = 1099;

	/**
	 * Registers a target system with Zanshin, sending its requirements model and meta-model. After a target system is
	 * registered, it can send log information about its requirements instances (using the target system ID returned from
	 * this method) and Zanshin will provide the feedback loop functionality.
	 * 
	 * @param targetSystem
	 *          A callback reference to the target system itself (an RMI stub), so Zanshin can send adaptation
	 *          instructions.
	 * @param metaModel
	 *          The meta-model that defines what are the classes of requirements, parameters, etc. in this target system.
	 * @param model
	 *          The requirements model for the target system, which uses the classes defined in the meta-model and
	 *          describes their inter-relation, parameters' default values, etc.
	 * @return The ID of the registered target system, to be used in future communications with Zanshin.
	 * @throws RemoteException
	 *           If any errors occur at the server or during communication with it.
	 */
	String registerTargetSystem(ITargetSystem targetSystem, String metaModel, String model) throws RemoteException;

	/**
	 * Verifies if a target system with the given ID has been registered.
	 * 
	 * @param targetSystemId
	 *          The ID that identifies the target system we're interested in.
	 * @return <code>true</code> if there is a target system with the given ID registered in Zanshin, <code>false</code>
	 *         otherwise.
	 * @throws RemoteException
	 *           If any errors occur at the server or during communication with it.
	 */
	Boolean isTargetSystemRegistered(String targetSystemId) throws RemoteException;

	/**
	 * Un-registers a target system in Zanshin, making it unavailable for further operations (it is no longer an adaptive
	 * system managed by Zanshin).
	 * 
	 * @param targetSystemId
	 *          The ID that identifies the target system we're interested in.
	 * @return <code>true</code> if the target system with the given ID was properly unregisteed in Zanshin,
	 *         <code>false</code> otherwise.
	 * @throws RemoteException
	 *           If any errors occur at the server or during communication with it.
	 */
	Boolean unregisterTargetSystem(String targetSystemId) throws RemoteException;

	/**
	 * Creates a user session for the target system whose ID is given. A user session should be created for every time a
	 * single user uses the target system to pursue the satisfaction of its requirements. Later, the user session ID
	 * should be passed alongside the target system ID to Zanshin calls that log the life-cycle methods of requirements
	 * instances.
	 * 
	 * @param targetSystemId
	 *          The ID that identifies the target system we're interested in.
	 * @return The ID that identifies the user session that has just been created.
	 * @throws RemoteException
	 *           If any errors occur at the server or during communication with it.
	 */
	Long createUserSession(String targetSystemId) throws RemoteException;

	/**
	 * Disposes a user session that is associated with a target system, given both session and target system IDs. Target
	 * systems should perform this operation when users are done pursuing the satisfaction of requirements in order to
	 * free Zanshin resources associated to it.
	 * 
	 * @param targetSystemId
	 *          The ID that identifies the target system we're interested in.
	 * @param userSessionId
	 *          The ID that identifies the user session we're interested in.
	 * @return <code>true</code> if the target system with the given ID was properly unregisteed in Zanshin,
	 *         <code>false</code> otherwise.
	 */
	Boolean disposeUserSession(String targetSystemId, Long userSessionId) throws RemoteException;

	/**
	 * Given the ID of the target system and user session and the name of one of this system's requirements (which must
	 * match the name specified in this system's meta-model), informs Zanshin that this particular requirements instance
	 * (i.e., associated with the given user session) has switched to the Started state.
	 * 
	 * @param targetSystemId
	 *          The ID that identifies the target system we're interested in.
	 * @param userSessionId
	 *          The ID that identifies the user session we're interested in.
	 * @param requirementsName
	 */
	void logRequirementStart(String targetSystemId, Long userSessionId, String requirementsName) throws RemoteException;

	/**
	 * Given the ID of the target system and user session and the name of one of this system's requirements (which must
	 * match the name specified in this system's meta-model), informs Zanshin that this particular requirements instance
	 * (i.e., associated with the given user session) has switched to the Success state.
	 * 
	 * @param targetSystemId
	 *          The ID that identifies the target system we're interested in.
	 * @param userSessionId
	 *          The ID that identifies the user session we're interested in.
	 * @param requirementsName
	 */
	void logRequirementSuccess(String targetSystemId, Long userSessionId, String requirementsName) throws RemoteException;

	/**
	 * Given the ID of the target system and user session and the name of one of this system's requirements (which must
	 * match the name specified in this system's meta-model), informs Zanshin that this particular requirements instance
	 * (i.e., associated with the given user session) has switched to the Failed state.
	 * 
	 * @param targetSystemId
	 *          The ID that identifies the target system we're interested in.
	 * @param userSessionId
	 *          The ID that identifies the user session we're interested in.
	 * @param requirementsName
	 */
	void logRequirementFailure(String targetSystemId, Long userSessionId, String requirementsName) throws RemoteException;

	/**
	 * Given the ID of the target system and user session and the name of one of this system's requirements (which must
	 * match the name specified in this system's meta-model), informs Zanshin that this particular requirements instance
	 * (i.e., associated with the given user session) has switched to the Cancelled state.
	 * 
	 * @param targetSystemId
	 *          The ID that identifies the target system we're interested in.
	 * @param userSessionId
	 *          The ID that identifies the user session we're interested in.
	 * @param requirementsName
	 */
	void logRequirementCancellation(String targetSystemId, Long userSessionId, String requirementsName) throws RemoteException;
}
