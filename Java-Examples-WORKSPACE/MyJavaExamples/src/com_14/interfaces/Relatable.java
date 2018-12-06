package com_14.interfaces;

public interface Relatable {

	// this (object calling isLargerThan)
	// and other must be instances of
	// the same class returns 1, 0, -1
	// if this is greater than,
	// equal to, or less than other
	public int isLargerThan(Relatable other);
	
	public Object findLargest(Object obj1, Object obj2);
	
	public Object findSmallest(Object obj1, Object obj2);
	
	public boolean isEqual(Object obj1, Object obj2);
}

