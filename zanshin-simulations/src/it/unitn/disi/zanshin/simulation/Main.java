package it.unitn.disi.zanshin.simulation;

import it.unitn.disi.zanshin.simulation.cases.Simulation;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

/**
 * Main class that can be executed and provides a console for running the simulations of Zanshin.
 * 
 * Simulations should be defined in a file called simulation.properties, located in the same package as this class. This
 * file follows the syntax below (where # should be replaced with the simulation number:
 * 
 * cases.#.name = <simulation name> cases.#.simulationClass = <fully-qualified name of the simulation class>
 * 
 * The simulation class should implement the Simulation interface, but we advise that you extend the AbstractSimulation
 * class.
 * 
 * The console loads the simulations defined in the properties file and provides commands for listing the simulations
 * that have been loaded, running all simulations or running one particular simulation given its number. For a list of
 * available commands, the user should type 'help' (without the quotes) and press Enter.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class Main {
	/** Base path for files that this class needs to load, starting from the root of the classpath. */
	private static final String BASE_PATH = '/' + Main.class.getPackage().getName().replace('.', '/') + '/';

	/** Path to the file that contains the help associated with the console (list of commands). */
	private static final String HELP_FILE_PATH = BASE_PATH + "help.txt"; //$NON-NLS-1$

	/** Path to the properties file that contains the configuration of the simulations to be loaded. */
	private static final String PROPERTIES_FILE_PATH = BASE_PATH + "simulation.properties"; //$NON-NLS-1$

	/** Contents of the help file, loaded lazily the first time the 'help' command is executed. */
	private static String helpContents;

	/** The simulation manager, responsible for loading and running simulations. */
	private static SimulationManager simulationManager;

	/**
	 * Main method, which opens the console and accepts commands from the user.
	 * 
	 * @param args
	 *          No arguments are necessary (any arguments given are ignored).
	 */
	public static void main(String[] args) {
		printMessage("残心へようこそ (Welcome to Zanshin!)\n\nInitializing simulations, please wait...\n"); //$NON-NLS-1$

		// Initializes the simulations.
		init();
		printMessage("Done. If you need assistance, use the 'help' command.\n"); //$NON-NLS-1$

		// Reads commands from the standard input.
		try (Scanner scanner = new Scanner(System.in)) {
			String line = scanner.nextLine();
			Command command = Command.retrieveCommand(line);

			// Keeps running until the user quits.
			while (command != Command.EXIT) {
				switch (command) {
				case HELP:
					printHelp();
					break;

				case LIST:
					printLoadedSimulations();
					break;

				case SIM:
					runSimulations(Command.retrieveArguments(line));
					break;

				default:
					printMessage("Unkown command: %s", line); //$NON-NLS-1$
					printMessage("For a list of available commands, type: %s", Command.HELP); //$NON-NLS-1$
				}

				// Reads the next command.
				line = scanner.nextLine();
				command = Command.retrieveCommand(line);
			}
		}

		printMessage("\nさようなら (Goodbye!)"); //$NON-NLS-1$
		System.exit(0);
	}

	/**
	 * Initializes the simulation console, by loading the simulations properties and instantiating the simulation manager.
	 */
	private static void init() {
		Properties props = null;

		// Loads the simulations properties.
		try (InputStream inputStream = Main.class.getResourceAsStream(PROPERTIES_FILE_PATH)) {
			props = new Properties();
			props.load(inputStream);
			inputStream.close();
		}
		catch (IOException e) {
			props = null;
		}

		// If properties were not properly loaded, exits with an error.
		if (props == null)
			exitWithError("Could not read properties file: %s. Aborting.", PROPERTIES_FILE_PATH); //$NON-NLS-1$

		try {
			// Otherwise, initializes the simulation manager.
			simulationManager = new SimulationManager(props);
		}
		// In case of exceptions loading the simulation manager, exits with an error.
		catch (Throwable e) {
			exitWithError("Could not load the simulation manager. Aborting.", e); //$NON-NLS-1$
		}
	}

	/**
	 * Prints an error message and quits the application (VM exit).
	 * 
	 * @param message
	 *          The message to be printed, following printf format.
	 * @param params
	 *          Parameters to be merged into the message, following printf rules.
	 */
	private static void exitWithError(String message, Object ... params) {
		System.err.printf(message, params);
		System.err.println('\n');
		System.exit(1);
	}

	/**
	 * Prints an error message, plus the stack trace of an exception, and quits the application (VM exit).
	 * 
	 * @param message
	 *          The message to be printed, following printf format.
	 * @param e
	 *          The exception whose stack trace will be printed also.
	 * @param params
	 *          Parameters to be merged into the message, following printf rules.
	 */
	private static void exitWithError(String message, Throwable e, Object ... params) {
		System.err.printf(message, params);
		System.err.println('\n');
		e.printStackTrace(System.err);
		System.exit(1);
	}

	/**
	 * Prints an informational message on the screen.
	 * 
	 * @param message
	 *          The message to be printed, following printf format.
	 * @param params
	 *          Parameters to be merged into the message, following printf rules.
	 */
	private static void printMessage(String message, Object ... params) {
		System.out.printf(message, params);
		System.out.println();
	}

	/**
	 * Prints the contents of the help associated with the simulation console.
	 */
	private static void printHelp() {
		// When used for the first time, loads the contents of the help document.
		if (helpContents == null) {
			StringBuilder builder = new StringBuilder();
			try (Scanner scanner = new Scanner(Main.class.getResourceAsStream(HELP_FILE_PATH))) {
				while (scanner.hasNextLine())
					builder.append(scanner.nextLine()).append('\n');
				helpContents = builder.toString();
			}
		}

		// Prints the contents of the help document.
		printMessage(helpContents);
	}

	/**
	 * Prints the number and the name of all simulations that have been loaded.
	 */
	private static void printLoadedSimulations() {
		// Obtains the set of loaded simulations.
		Set<Map.Entry<Integer, Simulation>> simulations = simulationManager.list();

		// If no simulations were loaded, prints an informational message.
		if (simulations.isEmpty()) {
			printMessage("There are no simulations loaded. You should configure them in: %s", PROPERTIES_FILE_PATH); //$NON-NLS-1$
		}

		// If simulations were loaded, prints their names alongside their numbers.
		else {
			printMessage("#\tSimulation"); //$NON-NLS-1$
			for (Map.Entry<Integer, Simulation> entry : simulations)
				printMessage("%d\t%s", entry.getKey(), entry.getValue().getName()); //$NON-NLS-1$
		}

		printMessage(""); //$NON-NLS-1$
	}

	/**
	 * Runs one or all the simulations, depending on the given arguments.
	 * 
	 * @param args
	 *          <code>null</code> if you want to run all simulations, otherwise submit the number of one simulation you'd
	 *          like to run (the console does not support running many but not all simulations).
	 */
	private static void runSimulations(String ... args) {
		Integer simNum = null;

		// Checks if the simulation number has been informed and parses it. In case of errors, abort.
		if ((args != null) && (args.length > 0)) {
			try {
				simNum = Integer.parseInt(args[0]);
			}
			catch (NumberFormatException e) {
				printMessage("Invalid simulation number: %s", args[0]); //$NON-NLS-1$
				return;
			}
		}

		try {
			// If a simulation number was not specified, runs all simulations.
			if (simNum == null)
				simulationManager.runAll();

			// Otherwise, runs the specified simulation.
			else simulationManager.run(simNum);
		}

		// Catches any errors, printing an error message on screen.
		catch (Throwable e) {
			printMessage("Could not run simulation(s): %s", e.getMessage()); //$NON-NLS-1$
		}
	}
}
