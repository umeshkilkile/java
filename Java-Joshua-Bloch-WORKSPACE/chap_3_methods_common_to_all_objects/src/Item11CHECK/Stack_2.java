package Item11CHECK;

import java.util.Arrays;
import java.util.EmptyStackException;

public class Stack_2 implements Cloneable {
	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	public Stack_2() {
		this.elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(Object e) {
		ensureCapacity();
		elements[size++] = e;
	}

	public Object pop() {
		if (size == 0)
			throw new EmptyStackException();
		Object result = elements[--size];
		elements[size] = null; // Eliminate obsolete reference
		return result;
	}

	// Ensure space for at least one more element.
	private void ensureCapacity() {
		if (elements.length == size)
			elements = Arrays.copyOf(elements, 2 * size + 1);
	}

	@Override
	public Stack_2 clone() {
		try {
			Stack_2 result = (Stack_2) super.clone();
			result.elements = elements.clone(); //Note that we do not have to cast the result of elements.clone() to Object[]. 	As of release 1.5, calling clone on an array returns an array whose compile-time type is the same as that of the array being cloned.
			return result;
		} catch (CloneNotSupportedException e) {
			throw new AssertionError();
		}
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < elements.length; i++){
			sb.append(" " + elements[i]);
		}
		return sb.toString();
	}
}

/*
 * NOTES: 1. In effect, the clone method functions as another constructor; you
 * must ensure that it does no harm to the original object and that it properly
 * establishes invariants on the clone. 
 * 2. The clone architecture is
 * incompatible with normal use of final fields referring to mutable objects
 * 3. Object’s clone method is not synchronized
 */