package zanshin;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public final class ZanshinUtil {
	/**
	 * TODO: document this method.
	 * 
	 * @param path
	 * @return
	 * @throws IOException
	 */
	public static StringBuilder readLocalFile(String path) throws IOException {
		// Retrieves the file from the same package as this class.
		InputStream inputStream = Thread.currentThread().getContextClassLoader().getResourceAsStream(path);

		// Reads the file's contents to a string builder and returns it.
		StringBuilder builder = new StringBuilder();
		Reader reader = new InputStreamReader(inputStream);
		try {
			performRead(reader, builder);
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if (reader != null)
				try {
					reader.close();
				}
				catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
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
	public static void performRead(Reader reader, StringBuilder builder) throws IOException {
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

	/**
	 * TODO: document this method.
	 * 
	 * @param aspectClass
	 * @param joinPoint
	 */
	public static void logAspect(Class<?> aspectClass, String adviceName, JoinPoint joinPoint) {
		Signature sig = joinPoint.getSignature();
		String line = "" + joinPoint.getSourceLocation().getLine();
		String source = joinPoint.getSourceLocation().getWithinType().getCanonicalName();
		Logger.defaultLogger.info("Applying aspect {0} ({1}) to method {2}.{3}, line {4}, in {5}", aspectClass.getName(), adviceName, sig.getDeclaringTypeName(), sig.getName(), line, source);
	}
}
