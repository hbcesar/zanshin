package it.unitn.disi.zanshin.simulation;

/**
 * Enumeration of available commands of the simulation console.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public enum Command {
	/** Quits the simulation console. */
	EXIT("exit"), //$NON-NLS-1$

	/** Shows the list of available commands. */
	HELP("help"), //$NON-NLS-1$

	/** Lists the simulations that were loaded and can be executed. */
	LIST("list"), //$NON-NLS-1$

	/** Executes one or all the simulations loaded. */
	SIM("sim"); //$NON-NLS-1$

	/** The command's name. */
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
	 * Retrieves the command enum object given its name, or <code>null</code> in case of an unknown command name.
	 * 
	 * @param line
	 *          The command line that was typed by the user at the console (the command is supposed to be the 1st word).
	 * @return The command enum object that represents the command typed by the user, or <code>null</code> if the command
	 *         typed is unknown.
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

	/**
	 * Retrieves the arguments of the command line typed by the user.
	 * 
	 * @param line
	 *          The command line that was typed by the user at the console (the arguments are supposed to be any words
	 *          after the 1st).
	 * @return An array of strings, each of which a word that was included as argument to the command in the command line,
	 *         or <code>null</code> if there were no arguments.
	 */
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
