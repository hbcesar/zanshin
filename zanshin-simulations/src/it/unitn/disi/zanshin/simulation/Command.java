package it.unitn.disi.zanshin.simulation;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public enum Command {
	/** TODO: document this field. */
	EXIT("exit"), //$NON-NLS-1$

	/** TODO: document this field. */
	HELP("help"), //$NON-NLS-1$

	/** TODO: document this field. */
	LIST("list"), //$NON-NLS-1$

	/** TODO: document this field. */
	SIM("sim"); //$NON-NLS-1$

	/** TODO: document this field. */
	private final String name;

	/** Constructor. */
	private Command(String name) {
		this.name = name;
	}

	/** @see java.lang.Enum#toString() */
	@Override
	public String toString() {
		return name;
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param line
	 * @return
	 */
	public static Command retrieveCommand(String line) {
		// Extracts the first word of the line and converts it all to lower-case.
		int idx = line.indexOf(' ');
		if (idx != -1)
			line = line.substring(0, idx);
		line = line.toLowerCase();

		// Checks if the first word corresponds to one of the known commands.
		for (Command command : Command.values())
			if (command.name.equals(line))
				return command;

		// Otherwise, returns nothing.
		return null;
	}

	public static String[] retrieveArguments(String line) {
		// Checks if there's something other than the command in the line, returning nothing if there isn't.
		int idx = line.indexOf(' ');
		if (idx == -1)
			return null;
		
		// Removes the command from the command line, breaks the rest of the arguments and returns.
		line = line.substring(idx + 1);
		return line.split("\\s"); //$NON-NLS-1$
	}
}
