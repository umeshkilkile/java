package com.rtti;

import java.util.ArrayList;
import java.util.List;

/*
 * Here�s an example that uses the generic class syntax. It stores a class reference, and later produces a List filled with objects 
 * that it generates using newlnstance( ):
 */
public class FilledList_Demo_8<T> {
	private Class<T> type;

	public FilledList_Demo_8(Class<T> type) {
		this.type = type;
	}

	public List<T> create(int nElements) {
		List<T> result = new ArrayList<T>();
		try {
			for (int i = 0; i < nElements; i++)
				result.add(type.newInstance());
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
		return result;
	}

	public static void main(String[] args) {
		FilledList_Demo_8<CountedInteger> fl = new FilledList_Demo_8<CountedInteger>(CountedInteger.class);
		System.out.println(fl.create(15));
	}
}
/*
 * Notice that this class must assume that any type that it works with has a
 * default constructor (one without arguments), and you�ll get an exception if
 * that isn�t the case. The compiler does not issue any warnings for this
 * program.
 */