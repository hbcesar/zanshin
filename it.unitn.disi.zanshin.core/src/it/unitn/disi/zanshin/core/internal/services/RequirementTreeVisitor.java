package it.unitn.disi.zanshin.core.internal.services;

import it.unitn.disi.zanshin.model.gore.Requirement;

import java.util.Stack;

/**
 * Abstract class that implements the GoF Design Pattern "Visitor" to parse a requirement tree breadth-first, visiting
 * each requirement in it. The meaning of "visit" should be defined by the class that extends this abstract class, by
 * overriding the visit() method.
 * 
 * @author Vitor E. Silva Souza (vitorsouza@gmail.com)
 * @version 1.0
 */
public abstract class RequirementTreeVisitor {
	/** The root of the requirements tree, where the visitor will start parsing. */
	private Requirement root;

	/** Constructor. */
	public RequirementTreeVisitor(Requirement root) {
		this.root = root;
	}

	/**
	 * Parses the requirements tree, visiting each requirement.
	 */
	public void parse() {
		// Uses a stack to perform a breadth-first search in the requirement tree to check all elements.
		Stack<Requirement> stack = new Stack<Requirement>();
		stack.push(root);

		// Goes through the the requirement tree, visiting each requirement in the model.
		while (!stack.isEmpty()) {
			Requirement req = stack.pop();
			visit(req);

			// Adds this requirements children to the stack to continue the search.
			for (Requirement child : req.getChildren())
				stack.push(child);
		}
	}

	/**
	 * Visits a requirement. The meaning of "visit" should be specified in the subclass.
	 * 
	 * @param req
	 *          The requirement being visited.
	 */
	protected abstract void visit(Requirement req);
}
