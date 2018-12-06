package com_22.collections.COLLECTION;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

//Adding groups of elements to Collection objects.
public class AddingGroups_Demo {
	public static void main(String[] args) {
		Collection<Integer> collection = new ArrayList<Integer>(Arrays.asList(1, 2, 3, 4, 5));
		Integer[] moreInts = { 6, 7, 8, 9, 10 };
		collection.addAll(Arrays.asList(moreInts));
		// Runs significantly faster, but you can’t
		// construct a Collection this way:
		Collections.addAll(collection, 11, 12, 13, 14, 15);
		Collections.addAll(collection, moreInts);
		// Produces a list "backed by" an array:
		List<Integer> list = Arrays.asList(16, 17, 18, 19, 20);
		list.set(1, 99); // OK -- modify an element
		// list.add(21); // Runtime error because the
		// underlying array cannot be resized.
	}
}
/*
 * - There are utility methods in both the Arrays and Collections classes in
 * java.util that add groups of elements to a Collection.
 * 
 * - Arrays.asList( ) takes either an array or a comma-separated list of
 * elements (using varargs) and turns it into a List object.
 * 
 * - Collections.addAll( ) takes a Collection object and either an array or a
 * comma-separated list and adds the elements to the Collection.
 * 
 * - However, Collections.addAll( ) runs much faster, and it’s just as easy to
 * construct the Collection with no elements and then call Collections.addAll(
 * ), so this is the preferred approach.
 * 
 * - It’s also possible to use the output of Arrays.asList( ) directly, as a
 * List, but the underlying representation in this case is the array, which
 * cannot be resized. If you try to add( ) or delete( ) elements in such a list,
 * that would attempt to change the size of an array, so you’ll get an
 * "Unsupported Operation" error at run time.
 */
