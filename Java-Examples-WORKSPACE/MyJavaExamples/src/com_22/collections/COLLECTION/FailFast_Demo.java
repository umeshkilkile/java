package com_22.collections.COLLECTION;

import java.util.ArrayList;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/*
 * - It’s quite easy to see the fail-fast mechanism in operation—all you must do
 * is create an iterator and then add something to the collection that the
 * iterator is pointing to,
 * 
 * - The exception happens because something is placed in the container after the iterator 
 * is acquired from the container. The possibility that two parts of the program might modify 
 * the same container produces an uncertain state, so the exception notifies you that you should 
 * change your code—in this case, acquire the iterator after you have added all the elements to the container.
 */
public class FailFast_Demo {
	public static void main(String[] args) {
		Collection<String> c = new ArrayList<String>();
		Iterator<String> it = c.iterator();
		c.add("An object");
		try {
			String s = it.next();
		} catch (ConcurrentModificationException e) {
			System.out.println(e);
		}
	}
}
/*
 * Fail fast
 * 
 * The Java containers also have a mechanism to prevent more than one process
 * from modifying the contents of a container. The problem occurs if you’re in
 * the middle of iterating through a container, and then some other process
 * steps in and inserts, removes, or changes an object in that container. Maybe
 * you’ve already passed that element in the container, maybe it’s ahead of you,
 * maybe the size of the container shrinks after you call size( )—there are many
 * scenarios for disaster. The Java containers library uses a fail-fast
 * mechanism that looks for any changes to the container other than the ones
 * your process is personally responsible for. If it detects that someone else
 * is modifying the container, it immediately produces a ConcurrentModification-
 * Exception. This is the "fail-fast" aspect—it doesn’t try to detect a problem
 * later on using a more complex algorithm.
 */
