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
public class ZanshinRemote {
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

	/**
	 * TODO: document this method.
	 * 
	 * @param requirements
	 * @return
	 * @throws RemoteException
	 */
	public String registerTargetSystem(String requirements) throws RemoteException {
		return zanshinServer.registerTargetSystem(requirements);
	}
}
