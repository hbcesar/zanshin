package it.unitn.disi.acad.simulation.cases;


import static it.unitn.disi.acad.simulation.cases.Simulation.*;
import it.unitn.disi.acad.simulation.SimulationUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;


/**
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public final class SimulationManager {
	/** List of simulations to run. */
	private List<Simulation> simulations = new ArrayList<>();
	
	/** Constructor. Receives the simulation properties with the name of the simulation classes to load. */
	public SimulationManager(Properties props) {
		// Reads the simulation package's name.
		String pkgName = props.getProperty(PROPERTIES_CASES_PREFIX + PROPERTIES_CASES_PACKAGE);
		
		// Loads all simulations listed in the properties and place them in the list.
		for (int num = 1; true; num++) {
			String name = props.getProperty(PROPERTIES_CASES_PREFIX + num + PROPERTIES_CASES_NAME);
			String className = props.getProperty(PROPERTIES_CASES_PREFIX + num + PROPERTIES_CASES_CLASS);
			
			if ((name != null) && (className != null)) {
				// Loads the simulation class and places an instance in the list.
				try {
					@SuppressWarnings("unchecked")
					Class<? extends Simulation> clazz = (Class<? extends Simulation>) Class.forName(pkgName + "." + className); //$NON-NLS-1$
					simulations.add(clazz.newInstance());
					SimulationUtils.log.info("Loaded simulation class: {0}", clazz.getName()); //$NON-NLS-1$
				}
				
				// In case of problems, display an error message but proceed with the other simulations.
				catch (ReflectiveOperationException e) {
					SimulationUtils.log.error("Could not load simulation: {0}", e, name); //$NON-NLS-1$
				}
			}
			
			// When the property associated with the specified number is not found, break out of the loop.
			else break;
		}
	}
	
	/**
	 * Runs the simulations that were loaded.
	 */
	public void runSimulations() {
		SimulationUtils.log.info("Starting the simulations..."); //$NON-NLS-1$
		
		try {
			// Runs all the simulations.
			for (Simulation simulation : simulations) {
				// Initializes the simulation.
				try {
					simulation.init();
				}
				catch (Exception e) {
					SimulationUtils.log.error("An error occurred during the initialization of {0}. Skipping to the next simulation.", e, simulation.getClass().getSimpleName()); //$NON-NLS-1$
					continue;
				}
				
				// Runs the simulation until it has finished or until an error is found.
				while (!simulation.hasFinished()) {
					// When activated, runs the next part of the current simulation.
					try {
						simulation.runNextPart();
					}
					catch (Exception e) {
						SimulationUtils.log.error("An error occurred during the execution of {0}. Skipping to the next simulation.", e, simulation.getClass().getSimpleName()); //$NON-NLS-1$
						break;
					}
					
					// Then waits to be activated in order to continue.
					synchronized (this) {
						wait();
					}
				}
			}
		}
		catch (InterruptedException e) {
			SimulationUtils.log.error("Simulation thread was interrupted!", e); //$NON-NLS-1$
		}
		
		SimulationUtils.log.info("The simulation has finished."); //$NON-NLS-1$
	}
}
