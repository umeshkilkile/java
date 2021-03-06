package com_24.collections.LIST;

import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class ListIterator_Demo {
	public static void main(String[] args) {
		List<String> compsList = Arrays.asList("Accenture", "Boeing", "Citrix", "Dell", "EMC");
		ListIterator<String> it = compsList.listIterator();

		// Forward
		while (it.hasNext())
			System.out.print(it.next() + " : " + it.nextIndex() + " : " + it.previousIndex() + " ; ");
		System.out.println();

		// Backwards:
		while (it.hasPrevious())
			System.out.print(it.previous().toString() + " ");
		System.out.println();
		
		System.out.println(compsList);
		it = compsList.listIterator(3);
		while (it.hasNext()) {
			it.next();
			it.set("HD");
		}
		System.out.println(compsList);
	}
}
