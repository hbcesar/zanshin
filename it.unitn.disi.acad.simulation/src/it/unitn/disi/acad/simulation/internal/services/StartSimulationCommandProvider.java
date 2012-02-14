package it.unitn.disi.acad.simulation.internal.services;

import java.io.IOException;

import it.unitn.disi.acad.simulation.Activator;

import org.eclipse.osgi.framework.console.CommandInterpreter;
import org.eclipse.osgi.framework.console.CommandProvider;

/**
 * TODO: document this type.
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
		interpreter.println("\n\nStarting the simulation...\n"); //$NON-NLS-1$

		// Asks the bundle's activator to start the simulation.
		try {
			Activator.startSimulation();
		}
		catch (IOException e) {
			interpreter.println("\n\nCould not start the simulation: " + e.getMessage()); //$NON-NLS-1$
		}
	}

	/** @see org.eclipse.osgi.framework.console.CommandProvider#getHelp() */
	@Override
	public String getHelp() {
		return "\tsim - starts the simulations configured in META-INF/simulation.properties\n"; //$NON-NLS-1$
	}

}
