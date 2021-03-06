package com_24.collections.LIST;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class LinkedListFeatures_Demo {
	public static void main(String[] args) {
		List<String> compsList = Arrays.asList("Accenture", "Boeing", "Citrix", "Dell", "EMC");
		LinkedList<String> pets = new LinkedList<String>(compsList);
		System.out.println(pets);
		// Identical:
		System.out.println("pets.getFirst(): " + pets.getFirst());
		System.out.println("pets.element(): " + pets.element());
		
		// Only differs in empty-list behavior:
		System.out.println("pets.peek(): " + pets.peek());
		
		// Identical; remove and return the first element:
		System.out.println("pets.remove(): " + pets.remove());
		System.out.println("pets.removeFirst(): " + pets.removeFirst());
		
		// Only differs in empty-list behavior:
		System.out.println("pets.poll(): " + pets.poll());
		System.out.println(pets);
		pets.addFirst("Microsoft");
		System.out.println("After addFirst(): " + pets);

		pets.offer("EMC");
		System.out.println("After offer(): " + pets);
		pets.add("Philips");
		System.out.println("After add(): " + pets);
		pets.addLast("Amazon");
		System.out.println("After addLast(): " + pets);
		System.out.println("pets.removeLast(): " + pets.removeLast());
	}
}
