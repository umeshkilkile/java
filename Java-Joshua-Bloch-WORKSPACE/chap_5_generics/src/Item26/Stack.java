package Item26;

import java.util.Arrays;
import java.util.EmptyStackException;

/*
 * Item 26: Favor generic types
 */
public class Stack<E> {
	private E[] elements;
	private int size = 0;
	private static final int DEFAULT_INITIAL_CAPACITY = 16;

	@SuppressWarnings("unchecked")
	public Stack() {
		elements = (E[]) new Object[DEFAULT_INITIAL_CAPACITY];
	}

	public void push(E e) {
		ensureCapacity();
		elements[size++] = e;
	}

	public E pop() {
		if (size == 0)
			throw new EmptyStackException();
		E result = (E) elements[--size];
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
		//Strings
		Stack<String> demo_1 = new Stack<String>();
		demo_1.push("Amsterdam");
		demo_1.push("Munich");

		System.out.println(demo_1.size);
		System.out.println(demo_1.pop());
		System.out.println(demo_1.size);

		System.out.println();

		//Integers
		Stack<Integer> demo_2 = new Stack<Integer>();
		demo_2.push(100);
		demo_2.push(200);

		System.out.println(demo_2.size);
		System.out.println(demo_2.pop());
		System.out.println(demo_2.size);
	}
}
