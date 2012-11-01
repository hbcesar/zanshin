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
	private static final String META_MODEL_FILE_NAME = "acad.ecore"; //$NON-NLS-1$
	
	/** TODO: document this field. */
	private static final String MODEL_FILE_NAME = "model.acad"; //$NON-NLS-1$
	
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
		
		Long sessionId = zanshin.createUserSession(targetSystemId);
		log.info(String.format("Created a new user session with id: %d", sessionId)); //$NON-NLS-1$
		
		zanshin.logRequirementStart(targetSystemId, sessionId, "T_InputInfo"); //$NON-NLS-1$
		log.info("Sending log information on the start of task T_InputInfo. Check Zanshin log for appropriate monitoring..."); //$NON-NLS-1$
		
		log.info("Done!"); //$NON-NLS-1$
	}

	private static String registerTargetSystem() throws IOException {
		String targetSystemId = null;
		
		// Loads the requirements meta-model and model files.
		StringBuilder metaModelBuilder = readLocalFile(META_MODEL_FILE_NAME);
		StringBuilder modelBuilder = readLocalFile(MODEL_FILE_NAME);
		
		// Sends the requirements to Zanshin in order to register itself as a new target system managed by the framework.
		targetSystemId = zanshin.registerTargetSystem(metaModelBuilder.toString(), modelBuilder.toString());
		
		return targetSystemId;
	}
	
	private static StringBuilder readLocalFile(String fileName) throws IOException {
		// Retrieves the file from the same package as this class.
		String path = Test.class.getPackage().getName().replace('.', '/') + '/' + fileName;
		InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(path);
		
		// Reads the file's contents to a string builder and returns it.
		StringBuilder builder = new StringBuilder();
		try (Reader reader = new InputStreamReader(inputStream)) {
			performRead(reader, builder);
		}
		return builder;
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
