package com.abstractclasses;

/*
 * The purpose of abstract classes is to function as base classes which can be extended by subclasses to create a full implementation. For instance, imagine that a certain process requires 3 steps:

The step before the action.
The action.
The step after the action.
If the steps before and after the action are always the same, the 3-step process could be implemented in an abstract superclass with this Java code:
 */
public abstract class MyAbstractProcess {
	public void process() {
		stepBefore();
		action();
		stepAfter();
	}

	public void stepBefore() {
		// implementation directly in abstract superclass
		System.out.println("steps before");
	}

	public abstract void action(); // implemented by subclasses

	public void stepAfter() {
		// implementation directly in abstract superclass
		System.out.println("steps after");
	}
}
