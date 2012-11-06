package it.unitn.disi.zanshin.remote;

import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class ZanshinRemote implements IZanshinServer {
	/** TODO: document this field. */
	private IZanshinServer zanshinServer;

	static {
		// Uses a custom security manager that allows RMI to operate.
		System.setSecurityManager(new ZanshinSecurityManager());
	}

	/** Constructor. May throw RMI exceptions. */
	public ZanshinRemote(String address, int port) throws RemoteException, NotBoundException {
		// Loads the RMI registry using the given address and port.
		Registry rmiRegistry = LocateRegistry.getRegistry(address, port);

		// Instantiates a remote skeleton for Zanshin's server.
		zanshinServer = (IZanshinServer) rmiRegistry.lookup(IZanshinServer.RMI_NAME);
	}

	/** @see it.unitn.disi.zanshin.remote.IZanshinServer#registerTargetSystem(it.unitn.disi.zanshin.remote.ITargetSystem, java.lang.String, java.lang.String) */
	@Override
	public String registerTargetSystem(ITargetSystem targetSystem, String metaModel, String model) throws RemoteException {
		return zanshinServer.registerTargetSystem(targetSystem, metaModel, model);
	}

	/** @see it.unitn.disi.zanshin.remote.IZanshinServer#createUserSession(java.lang.String) */
	@Override
	public Long createUserSession(String targetSystemId) throws RemoteException {
		return zanshinServer.createUserSession(targetSystemId);
	}

	/**
	 * @see it.unitn.disi.zanshin.remote.IZanshinServer#logRequirementStart(java.lang.String, java.lang.Long,
	 *      java.lang.String)
	 */
	@Override
	public void logRequirementStart(String targetSystemId, Long userSessionId, String requirementsName) throws RemoteException {
		zanshinServer.logRequirementStart(targetSystemId, userSessionId, requirementsName);
	}

	/**
	 * @see it.unitn.disi.zanshin.remote.IZanshinServer#logRequirementSuccess(java.lang.String, java.lang.Long,
	 *      java.lang.String)
	 */
	@Override
	public void logRequirementSuccess(String targetSystemId, Long userSessionId, String requirementsName) throws RemoteException {
		zanshinServer.logRequirementSuccess(targetSystemId, userSessionId, requirementsName);
	}

	/**
	 * @see it.unitn.disi.zanshin.remote.IZanshinServer#logRequirementFailure(java.lang.String, java.lang.Long,
	 *      java.lang.String)
	 */
	@Override
	public void logRequirementFailure(String targetSystemId, Long userSessionId, String requirementsName) throws RemoteException {
		zanshinServer.logRequirementFailure(targetSystemId, userSessionId, requirementsName);
	}

	/**
	 * @see it.unitn.disi.zanshin.remote.IZanshinServer#logRequirementCancellation(java.lang.String, java.lang.Long,
	 *      java.lang.String)
	 */
	@Override
	public void logRequirementCancellation(String targetSystemId, Long userSessionId, String requirementsName) throws RemoteException {
		zanshinServer.logRequirementCancellation(targetSystemId, userSessionId, requirementsName);
	}

	/** @see it.unitn.disi.zanshin.remote.IZanshinServer#isTargetSystemRegistered(java.lang.String) */
	@Override
	public Boolean isTargetSystemRegistered(String targetSystemId) throws RemoteException {
		return zanshinServer.isTargetSystemRegistered(targetSystemId);
	}

	/** @see it.unitn.disi.zanshin.remote.IZanshinServer#unregisterTargetSystem(java.lang.String) */
	@Override
	public Boolean unregisterTargetSystem(String targetSystemId) throws RemoteException {
		return zanshinServer.unregisterTargetSystem(targetSystemId);
	}
}
