package com.nestedclasses;

//If your class must implement increment() in
//some other way, you must use an inner class:
class Callee2 extends MyIncrement {
	private int i = 0;

	public void increment() {
		super.increment();
		i++;
		System.out.println(i);
	}

	private class Closure implements Incrementable {
		public void increment() {
			// Specify outer-class method, otherwise
			// you’d get an infinite recursion:
			Callee2.this.increment();
		}
	}

	Incrementable getCallbackReference() {
		return new Closure();
	}
}
