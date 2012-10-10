package it.unitn.disi.zanshin.simulation.internal.services;

import it.unitn.disi.zanshin.services.ITargetSystemControllerService;

/**
 * Defines the interface for a simulated controller, which is a class that is plugged in the Simulations Traget System
 * Controller Service to responds to specific instructions from Zanshin the way a real system would respond. In this way
 * there's no need to implement a full target system controller when all we want is to run some specific simulations.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public interface SimulatedController extends ITargetSystemControllerService {}
