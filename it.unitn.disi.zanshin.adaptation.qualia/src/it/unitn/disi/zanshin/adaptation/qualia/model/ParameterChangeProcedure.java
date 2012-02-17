package it.unitn.disi.zanshin.adaptation.qualia.model;

import java.util.List;

import it.unitn.disi.zanshin.model.gore.Configuration;
import it.unitn.disi.zanshin.model.gore.Parameter;

/**
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public interface ParameterChangeProcedure extends Procedure {
	Configuration changeParameters(List<Parameter> parameters, List<String> values);
}
