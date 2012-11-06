package it.unitn.disi.zanshin.simulation;

import it.unitn.disi.zanshin.remote.ITargetSystem;
import it.unitn.disi.zanshin.remote.ZanshinRemote;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 * TODO: document this type.
 * 
 * Creation of the RMI stub thanks to Giuliano Mega, guru of distributed systems. :)
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class SimulationUtils {
	/** TODO: document this field. */
	private static ITargetSystem simulatedTargetSystem = new SimulatedTargetSystem();

	/** TODO: document this field. */
	private static ITargetSystem simulatedTargetSystemStub;

	/**
	 * TODO: document this method.
	 * 
	 * @throws RemoteException
	 */
	public static void init() throws RemoteException {
		simulatedTargetSystemStub = (ITargetSystem) UnicastRemoteObject.exportObject(simulatedTargetSystem, 0);
	}

	/**
	 * TODO: document this method.
	 * 
	 * @return
	 * @throws IOException
	 */
	public static String registerTargetSystem(ZanshinRemote zanshin, String metaModelFilePath, String modelFilePath) throws IOException {
		String targetSystemId = null;

		// If the target system stub has not been initialized yet, throws an exception.
		if (simulatedTargetSystemStub == null)
			throw new IllegalStateException("The simulated target system stub has not been initialized. Did you call init()?"); //$NON-NLS-1$

		// Loads the requirements meta-model and model files.
		StringBuilder metaModelBuilder = readLocalFile(metaModelFilePath);
		StringBuilder modelBuilder = readLocalFile(modelFilePath);

		// Sends the requirements to Zanshin in order to register itself as a new target system managed by the framework.
		targetSystemId = zanshin.registerTargetSystem(simulatedTargetSystemStub, metaModelBuilder.toString(), modelBuilder.toString());

		return targetSystemId;
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param fileName
	 * @return
	 * @throws IOException
	 */
	private static StringBuilder readLocalFile(String path) throws IOException {
		// Retrieves the file from the same package as this class.
		InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(path);

		// Reads the file's contents to a string builder and returns it.
		StringBuilder builder = new StringBuilder();
		try (Reader reader = new InputStreamReader(inputStream)) {
			performRead(reader, builder);
		}
		return builder;
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param reader
	 * @param builder
	 * @throws IOException
	 */
	private static void performRead(Reader reader, StringBuilder builder) throws IOException {
		// Defines a 1KB buffer to use in the reading.
		char[] buffer = new char[1024];

		// Reads the contents one buffer at a time.
		for (;;) {
			int charsRead = reader.read(buffer);
			if (charsRead == -1)
				break;
			builder.append(buffer, 0, charsRead);
		}
	}
}
