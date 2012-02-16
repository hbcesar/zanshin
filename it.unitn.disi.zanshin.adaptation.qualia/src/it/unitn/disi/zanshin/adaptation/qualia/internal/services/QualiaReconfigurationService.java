package it.unitn.disi.zanshin.adaptation.qualia.internal.services;

import it.unitn.disi.zanshin.services.IReconfigurationService;

/**
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class QualiaReconfigurationService implements IReconfigurationService {
	/** This service's ID. */
	private static final String ID = "qualia"; //$NON-NLS-1$
	
	/** @see it.unitn.disi.zanshin.services.IReconfigurationService#getId() */
	@Override
	public String getId() {
		return ID;
	}
}
