package com_21.generics;

import java.util.Iterator;
import java.util.Random;

public class CoffeeGenerator_Demo_20 implements Generator<Coffee>, Iterable<Coffee> {
	private Class[] types = { Latte.class, Mocha.class, Cappuccino.class, Americano.class, Breve.class, };
	private static Random rand = new Random(47);

	public CoffeeGenerator_Demo_20() {
	}

	// For iteration:
	private int size = 0;

	public CoffeeGenerator_Demo_20(int sz) {
		size = sz;
	}

	public Coffee next() {
		try {
			return (Coffee) types[rand.nextInt(types.length)].newInstance();
			// Report programmer errors at run time:
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}

	class CoffeeIterator implements Iterator<Coffee> {
		int count = size;

		public boolean hasNext() {
			return count > 0;
		}

		public Coffee next() {
			count--;
			return CoffeeGenerator_Demo_20.this.next();
		}

		public void remove() { // Not implemented
			throw new UnsupportedOperationException();
		}
	};

	public Iterator<Coffee> iterator() {
		return new CoffeeIterator();
	}

	public static void main(String[] args) {
		CoffeeGenerator_Demo_20 gen = new CoffeeGenerator_Demo_20();
		for (int i = 0; i < 5; i++)
			System.out.println(gen.next());
		System.out.println("-------------------------");
		for (Coffee c : new CoffeeGenerator_Demo_20(5))
			System.out.println(c);
	}

}
/*
 * The parameterized Generator interface ensures that next( ) returns the
 * parameter type. CoffeeGenerator also implements the Iterable interface, so it
 * can be used in a foreach statement. However, it requires an "end sentinel" to
 * know when to stop, and this is produced using the second constructor.
 */