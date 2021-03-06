package com_22.collections.COLLECTION;

import java.util.Iterator;

public class IterableClass_Demo implements Iterable<String> {

	protected String[] words = ("And that is how " + "we know the Earth to be banana-shaped.").split(" ");

	@Override
	public Iterator<String> iterator() {
		return new Iterator<String>() {
			private int index = 0;

			public boolean hasNext() {
				return index < words.length;
			}

			public String next() {
				return words[index++];
			}

			public void remove() { // Not implemented
				throw new UnsupportedOperationException();
			}
		};
	}

	public static void main(String[] args) {
		for (String s : new IterableClass_Demo())
			System.out.print(s + " ");
	}
}
/*
 * The iterator( ) method returns an instance of an anonymous inner
 * implementation of Iterator<String> which delivers each word in the array. In
 * main( ), you can see that IterableClass does indeed work in a foreach
 * statement.
 */