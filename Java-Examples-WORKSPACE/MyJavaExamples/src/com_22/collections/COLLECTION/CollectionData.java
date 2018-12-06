package com_22.collections.COLLECTION;

//A Collection filled with data using a generator object.

import java.util.ArrayList;

import com_21.generics.Generator;

public class CollectionData<T> extends ArrayList<T> {
	public CollectionData(Generator<T> gen, int quantity) {
		for (int i = 0; i < quantity; i++)
			add(gen.next());
	}

	// A generic convenience method:
	public static <T> CollectionData<T> list(Generator<T> gen, int quantity) {
		return new CollectionData<T>(gen, quantity);
	}
}
/*
 * - This uses the Generator to put as many objects into the container as you
 * need. The resulting container can then be passed to the constructor for any
 * Collection, and that constructor will copy the data into itself. The addAll(
 * ) method that’s part of every Collection subtype can also be used to populate
 * an existing Collection.
 * 
 * - The generic convenience method reduces the amount of typing necessary when
 * using the class.
 * 
 * - CollectionData is an example of the Adapter design pattern;1 it adapts a
 * Generator to the constructor for a Collection.
 */