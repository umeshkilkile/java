package com_21.generics;

import java.util.ArrayList;
import java.util.List;

public class SimpleGenerics_Demo_1 {
	public static void main(String[] args) {

		/*
		 * Before generics, casting is required
		 */
		List list = new ArrayList();
		list.add("hello");
		String s = (String) list.get(0);
		System.out.println("s : " + s);

		/*
		 * After generics, casting is not required
		 */
		List<String> list2 = new ArrayList<String>();
		list2.add("hello");
		String s2 = list2.get(0); // no cast
		System.out.println("s2 : " + s2);
	}
}
