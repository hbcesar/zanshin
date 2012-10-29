package it.unitn.disi.zanshin.simulation.cases.acad;

import it.unitn.disi.zanshin.remote.IZanshinServer;
import it.unitn.disi.zanshin.remote.ZanshinRemote;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.logging.Logger;

/**
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class Test {
	/** TODO: document this field. */
	private static final String REMOTE_SERVER_ADDRESS = "127.0.0.1"; //$NON-NLS-1$
	
	/** TODO: document this field. */
	private static final String REQUIREMENTS_FILE_NAME = "acad.ecore"; //$NON-NLS-1$
	
	/** TODO: document this field. */
	private static final Logger log = Logger.getLogger(Test.class.getName());
	
	/** TODO: document this field. */
	private static ZanshinRemote zanshin;
	
	/**
	 * TODO: document this method.
	 * @param args
	 * @throws Exception
	 */
	public static void main(String[] args) throws Exception {
		log.info("Testing Zanshin remote..."); //$NON-NLS-1$

		zanshin = new ZanshinRemote(REMOTE_SERVER_ADDRESS, IZanshinServer.RMI_PORT);
		
		log.info("Registering the target system..."); //$NON-NLS-1$
		String targetSystemId = registerTargetSystem();
		log.info(String.format("Target system registered as: %s", targetSystemId)); //$NON-NLS-1$
		
		log.info("Done!"); //$NON-NLS-1$
	}

	private static String registerTargetSystem() throws IOException {
		String targetSystemId = null;
		
		// Loads the requirements file.
		String requirementsPath = Test.class.getPackage().getName().replace('.', '/') + '/' + REQUIREMENTS_FILE_NAME;
		InputStream in = Thread.currentThread().getContextClassLoader().getResourceAsStream(requirementsPath);
		
		// Reads the requirements file's contents.
		StringBuilder builder = new StringBuilder();
		performRead(new InputStreamReader(in), builder);
		
		// Sends the requirements to Zanshin in order to register itself as a new target system managed by the framework.
		targetSystemId = zanshin.registerTargetSystem(builder.toString());
		
		return targetSystemId;
	}
	
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
