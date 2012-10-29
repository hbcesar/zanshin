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
	 * @param requirements
	 * @return
	 * @throws RemoteException
	 */
	String registerTargetSystem(String requirements) throws RemoteException;
}
