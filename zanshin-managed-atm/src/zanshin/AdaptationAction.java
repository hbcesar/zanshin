package zanshin;

import java.util.Arrays;

/**
 * TODO: document this type.
 *
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public class AdaptationAction {
	/** TODO: document this field. */
	private AdaptationInstruction instruction;
	
	/** TODO: document this field. */
	private Object[] params;
	
	/** Constructor. */
	public AdaptationAction(AdaptationInstruction instruction, Object ... params) {
		this.instruction = instruction;
		this.params = params;
	}

	/** Getter for instruction. */
	public AdaptationInstruction getInstruction() {
		return instruction;
	}

	/** Getter for params. */
	public Object[] getParams() {
		return params;
	}
	
	/** @see java.lang.Object#toString() */
	@Override
	public String toString() {
		return new StringBuilder().append(instruction).append('(').append(Arrays.toString(params)).append(')').toString();
	}
}
