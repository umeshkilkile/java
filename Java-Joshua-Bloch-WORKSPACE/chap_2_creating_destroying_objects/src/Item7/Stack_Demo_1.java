package Item7;

import java.util.Arrays;
import java.util.EmptyStackException;

//Can you spot the "memory leak"?

/**
 *
 * Item 6: Eliminate obsolete object references
 * 
 * @author kilkile
 *
 *         If a stack grows and then shrinks, the objects that were popped off
 *         the stack will not be garbage collected, even if the program using
 *         the stack has no more references to them. This is because the stack
 *         maintains obsolete references to these objects. An obsolete reference
 *         is simply a reference that will never be dereferenced again.
 */
public class Stack_Demo_1 {
	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	public Stack_Demo_1() {
		elements = new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(Object e) {
		ensureCapacity();
		elements[size++] = e;
	}

	public Object pop() {
		if (size == 0)
			throw new EmptyStackException();
		return elements[--size];
	}

	/**
	 * Ensure space for at least one more element, roughly doubling the capacity
	 * each time the array needs to grow.
	 */
	private void ensureCapacity() {
		if (elements.length == size)
			elements = Arrays.copyOf(elements, 2 * size + 1);
	}

	public static void main(String[] args) {
		Stack_Demo_1 demo_1 = new Stack_Demo_1();
		demo_1.push("Amsterdam");
		demo_1.push("Munich");

		System.out.println(demo_1.size);
		System.out.println(demo_1.pop());
		System.out.println(demo_1.size);
	}
}
