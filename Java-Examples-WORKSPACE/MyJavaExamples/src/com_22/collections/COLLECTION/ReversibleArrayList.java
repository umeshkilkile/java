package com_22.collections.COLLECTION;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

//The "Adapter Method" idiom allows you to use foreach with additional kinds of Iterables.
class ReversibleArrayList<T> extends ArrayList<T> {
	public ReversibleArrayList(Collection<T> c) {
		super(c);
	}

	public Iterable<T> reversed() {
		return new Iterable<T>() {
			public Iterator<T> iterator() {
				return new Iterator<T>() {
					int current = size() - 1;

					public boolean hasNext() {
						return current > -1;
					}

					public T next() {
						return get(current--);
					}

					public void remove() { // Not implemented
						throw new UnsupportedOperationException();
					}
				};
			}
		};
	}
}
/*
 * If you simply put the ral object in the foreach statement, you get the
 * (default) forward iterator. But if you call reversed( ) on the object, it
 * produces different behavior.
 */
