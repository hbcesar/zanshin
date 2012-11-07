package it.unitn.disi.zanshin.simulation;

import it.unitn.disi.zanshin.simulation.cases.Simulation;

import java.io.IOException;
import java.io.InputStream;
import java.util.Map;
import java.util.Properties;
import java.util.Scanner;
import java.util.Set;

/**
 * TODO: document this type.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class Main {
	/** TODO: document this field. */
	private static final String BASE_PATH = '/' + Main.class.getPackage().getName().replace('.', '/') + '/';

	/** TODO: document this field. */
	private static final String HELP_FILE_PATH = BASE_PATH + "help.txt"; //$NON-NLS-1$

	/** TODO: document this field. */
	private static final String PROPERTIES_FILE_PATH = BASE_PATH + "simulation.properties"; //$NON-NLS-1$

	/** TODO: document this field. */
	private static String helpContents;

	/** TODO: document this field. */
	private static SimulationManager simulationManager;

	/**
	 * TODO: document this method.
	 * 
	 * @param args
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
	 * TODO: document this method.
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
	 * TODO: document this method.
	 * 
	 * @param message
	 * @param params
	 */
	private static void exitWithError(String message, Object ... params) {
		System.err.printf(message, params);
		System.out.println('\n');
		System.exit(1);
	}
	
	/**
	 * TODO: document this method.
	 * @param message
	 * @param e
	 * @param params
	 */
	private static void exitWithError(String message, Throwable e, Object ... params) {
		System.err.printf(message, params);
		System.err.println('\n');
		e.printStackTrace(System.err);
		System.exit(1);
	}

	/**
	 * TODO: document this method.
	 * 
	 * @param message
	 * @param params
	 */
	private static void printMessage(String message, Object ... params) {
		System.out.printf(message, params);
		System.out.println();
	}

	/**
	 * TODO: document this method.
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
	 * TODO: document this method.
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
	 * TODO: document this method.
	 * 
	 * @param args
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
			else
				simulationManager.run(simNum);
		}
		
		// Catches any errors, printing an error message on screen.
		catch (Throwable e) {
			printMessage("Could not run simulation(s): %s", e.getMessage()); //$NON-NLS-1$
		}
	}
}
