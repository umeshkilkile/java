package Item7;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * 
 * @author kilkile
 *
 *         null out references once they become obsolete. In the case of our
 *         Stack class, the reference to an item becomes obsolete as soon as
 *         it’s popped off the stack.
 */
public class Stack_Demo_2 {
	private Object[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	public Stack_Demo_2() {
		elements = new Object[DEFAULT_INITIAL_CAPACITY];
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

	/**
	 * Ensure space for at least one more element, roughly doubling the capacity
	 * each time the array needs to grow.
	 */
	private void ensureCapacity() {
		if (elements.length == size)
			elements = Arrays.copyOf(elements, 2 * size + 1);
	}

	public static void main(String[] args) {
		Stack_Demo_2 demo_1 = new Stack_Demo_2();
		demo_1.push("Amsterdam");
		demo_1.push("Munich");

		System.out.println(demo_1.size);
		System.out.println(demo_1.pop());
		System.out.println(demo_1.size);
	}
}
