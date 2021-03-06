package com_21.generics;

import java.util.ArrayList;
import java.util.List;

public class Generics_Demo_1 {
	public static void main(String[] args) {
		List<A> listA = new ArrayList<A>();
		listA.add(new A("Apple"));
		listA.add(new A("Apple2"));
		System.out.println(listA);

		List<B> listB = new ArrayList<B>();
		listB.add(new B("Blackberry"));
		listB.add(new B("Blackberry2"));
		System.out.println(listB);
		
		List<A> listA1 = new ArrayList<A>();
		listA1.add(new B("B1"));
		listA1.add(new B("B2"));
		System.out.println(listA1);
		
		/*List<B> listB1 = new ArrayList<B>();
		listB1.add(new A("A1"));
		listB1.add(new A("A2"));
		System.out.println(listB1);*/
		
	}
}
