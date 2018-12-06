package com_21.generics;

public class SimpleGenerics_Demo_3 {
	public static void main(String[] args) {
		/*
		 * Multiple Type Parameters without Diamond
		 */
		Pair<String, Integer> p1 = new OrderedPair<String, Integer>("Even", 8);
		Pair<String, String> p2 = new OrderedPair<String, String>("hello", "world");

		System.out.println(p1.getKey() + " : " + p1.getValue());
		System.out.println(p2.getKey() + " : " + p2.getValue());

		/*
		 * Multiple Type Parameters with Diamond
		 */
		Pair<String, Integer> p3 = new OrderedPair("Even", 8);
		Pair<String, String> p4 = new OrderedPair("hello", "world");

		System.out.println(p3.getKey() + " : " + p3.getValue());
		System.out.println(p4.getKey() + " : " + p4.getValue());
		
		/*
		 * Parameterized Types
		 */
		OrderedPair<String, BoxWithGenerics<Integer>> p = new OrderedPair<>("primes", new BoxWithGenerics<Integer>());
		
		String key = p.getKey();
		BoxWithGenerics<Integer> boxWithGenerics = p.getValue();
		boxWithGenerics.set(1000);
		System.out.println(key + " : " + boxWithGenerics.get());
		

	}
}
