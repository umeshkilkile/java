package com.innerclasses;

public class Sequence_Demo_3 {
	private Object[] items;
	private int next = 0;

	public Sequence_Demo_3(int size) {
		items = new Object[size];
	}

	public void add(Object x) {
		if (next < items.length)
			items[next++] = x;
	}

	private class SequenceSelector implements Selector {
		private int i = 0;

		public boolean end() {
			return i == items.length;
		}

		public Object current() {
			return items[i];
		}

		public void next() {
			if (i < items.length)
				i++;
		}
	}

	public Selector selector() {
		return new SequenceSelector();
	}

	public static void main(String[] args) {
		Sequence_Demo_3 sequence = new Sequence_Demo_3(10);
		for (int i = 0; i < 10; i++)
			sequence.add(Integer.toString(i));
		Selector selector = sequence.selector();
		while (!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}
	}
}
/*
 * - When you create an inner class, an object of that inner class has a link to
 * the enclosing object that made it, and so it can access the members of that
 * enclosing object—without any special qualifications. In addition, inner
 * classes have access rights to all the elements in the enclosing class.
 * 
 * - So an inner class has automatic access to the members of the enclosing
 * class. How can this happen? The inner class secretly captures a reference to
 * the particular object of the enclosing class that was responsible for
 * creating it. Then, when you refer to a member of the enclosing class, that
 * reference is used to select that member. Fortunately, the compiler takes care
 * of all these details for you, but now you can see that an object of an inner
 * class can be created only in association with an object of the enclosing
 * class (when, as you shall see, the inner class is non-static). Construction
 * of the inner-class object requires the reference to the object of the
 * enclosing class, and the compiler will complain if it cannot access that
 * reference. Most of the time this occurs without any intervention on the part
 * of the programmer.
 */
