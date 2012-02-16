package it.unitn.disi.zanshin.simulation.internal.services;

import java.io.IOException;

import it.unitn.disi.zanshin.simulation.Activator;
import it.unitn.disi.zanshin.simulation.SimulationManager;

import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.eclipse.osgi.framework.console.CommandProvider;

/**
 * Command provider for the OSGi command prompt, that responds to the "sim" command to start the simulations.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class StartSimulationCommandProvider implements CommandProvider {
	/**
	 * Responds to the "sim" command in the OSGi command prompt, starting the simulations.
	 * 
	 * @param interpreter
	 *          The command interpreter, which can be used to interact with the command prompt.
	 */
	public void _sim(CommandInterpreter interpreter) {
		// Checks if a simulation number has been provided.
		Integer simNum = null;
		String arg = interpreter.nextArgument();
		if ((arg != null) && (!arg.isEmpty()))
			try {
				simNum = Integer.parseInt(arg);
			}
			catch (NumberFormatException e) {
				// Invalid argument: not a number.
				interpreter.println("\tInvalid argument: \"" + arg + "\". Use 'sim <N>', where <N> is an integer number. E.g., 'sim 1'"); //$NON-NLS-1$ //$NON-NLS-2$
			}

		// Asks the bundle's activator to start the simulation.
		SimulationManager manager = null;
		try {
			interpreter.println("\n\nCreating the simulation manager..."); //$NON-NLS-1$
			if (simNum == null)
				manager = Activator.createSimulationManager();
			else manager = Activator.createSimulationManager(simNum);

		}
		catch (IOException e) {
			interpreter.println("\n\nCould not configure the simulation, check the configuration file. Exception message: " + e.getMessage()); //$NON-NLS-1$
		}

		// Continues only when the simulation manager was created successfully.
		if (manager != null) {
			// If no specific simulation was selected, run all simulations.
			if (simNum == null) {
				interpreter.println("\nRunning all simulations...\n"); //$NON-NLS-1$
				manager.runAll();
			}

			// Otherwise, run only the specific simulation.
			else try {
				interpreter.println("\nRunning simulation # " + simNum + "\n"); //$NON-NLS-1$ //$NON-NLS-2$
				manager.run(simNum);
			}
			catch (IllegalArgumentException e) {
				interpreter.println("\n\t*** Simulation # " + simNum + " does not exist. Check the configuration file.\n"); //$NON-NLS-1$ //$NON-NLS-2$
			}
		}
	}

	/** @see org.eclipse.osgi.framework.console.CommandProvider#getHelp() */
	@Override
	public String getHelp() {
		return "\tsim - starts all simulations configured in META-INF/simulation.properties\n\tsim <N> - starts simulations number N, as configured in META-INF/simulation.properties\n"; //$NON-NLS-1$
	}

}
