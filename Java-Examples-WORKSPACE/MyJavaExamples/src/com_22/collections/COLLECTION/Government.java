package com_22.collections.COLLECTION;

import com_21.generics.Generator;

class Government implements Generator<String> {
	String[] foundation = ("strange women lying in ponds " + "distributing swords is no basis for a system of "
			+ "government").split(" ");
	private int index;

	public String next() {
		return foundation[index++];
	}
}
