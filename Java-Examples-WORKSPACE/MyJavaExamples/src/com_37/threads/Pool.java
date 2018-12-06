package com_37.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Semaphore;

public class Pool<T> {
	private int size;
	private List<T> items = new ArrayList<T>();
	private volatile boolean[] checkedOut;
	private Semaphore available;

	public Pool(Class<T> classObject, int size) {
		this.size = size;
		checkedOut = new boolean[size];
		available = new Semaphore(size, true);
		// Load pool with objects that can be checked out:
		for (int i = 0; i < size; ++i)
			try {
				// Assumes a default constructor:
				items.add(classObject.newInstance());
			} catch (Exception e) {
				throw new RuntimeException(e);
			}
	}

	public T checkOut() throws InterruptedException {
		available.acquire();
		return getItem();
	}

	public void checkIn(T x) {
		if (releaseItem(x))
			available.release();
	}

	private synchronized T getItem() {
		for (int i = 0; i < size; ++i)
			if (!checkedOut[i]) {
				checkedOut[i] = true;
				return items.get(i);
			}
		return null; // Semaphore prevents reaching here
	}

	private synchronized boolean releaseItem(T item) {
		int index = items.indexOf(item);
		if (index == -1)
			return false; // Not in the list
		if (checkedOut[index]) {
			checkedOut[index] = false;
			return true;
		}
		return false; // Wasn’t checked out
	}
}
/*
 * Semaphore
 * 
 * - A normal lock (from concurrent.locks or the built-in synchronized lock)
 * only allows one task at a time to access a resource. A counting semaphore
 * allows n tasks to access the resource at the same time. You can also think of
 * a semaphore as handing out "permits" to use a resource, although no actual
 * permit objects are used.
 * 
 * - As an example, consider the concept of the object pool, which manages a
 * limited number of objects by allowing them to be checked out for use, and
 * then checked back in again when the user is finished. This functionality can
 * be encapsulated in a generic class as in above example:
 * 
 * - In this simplified form, the constructor uses newInstance( ) to load the
 * pool with objects. If you need a new object, you call checkOut( ), and when
 * you’re finished with an object, you hand it to checkIn( ).
 * 
 * - The boolean checkedOut array keeps track of the objects that are checked
 * out, and is managed by the getItem( ) and releaseItem( ) methods. These, in
 * turn, are guarded by the Semaphore available, so that, in checkOut( ),
 * available blocks the progress of the call if there are no more semaphore
 * permits available (which means there are no more objects in the pool). In
 * checkIn( ), if the object being checked in is valid, a permit is returned to
 * the semaphore.
 */