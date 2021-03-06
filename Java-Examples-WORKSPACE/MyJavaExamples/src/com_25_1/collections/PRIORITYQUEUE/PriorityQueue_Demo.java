package com_25_1.collections.PRIORITYQUEUE;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Random;
import java.util.Set;

public class PriorityQueue_Demo {
	public static void main(String[] args) {
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<Integer>();
		Random rand = new Random(47);
		for (int i = 0; i < 10; i++)
			priorityQueue.offer(rand.nextInt(i + 10));
		System.out.println("1priorityQueue -> " + priorityQueue);

		List<Integer> ints = Arrays.asList(25, 22, 20, 18, 14, 9, 3, 1, 1, 2, 3, 9, 14, 18, 21, 23, 25);
		priorityQueue = new PriorityQueue<Integer>(ints);
		System.out.println("2priorityQueue -> " + priorityQueue);

		priorityQueue = new PriorityQueue<Integer>(ints.size(), Collections.reverseOrder());
		priorityQueue.addAll(ints);
		System.out.println(priorityQueue);

		String fact = "EDUCATION SHOULD ESCHEW OBFUSCATION";
		List<String> strings = Arrays.asList(fact.split(""));
		PriorityQueue<String> stringPQ = new PriorityQueue<String>(strings);
		System.out.println(stringPQ);

		stringPQ = new PriorityQueue<String>(strings.size(), Collections.reverseOrder());
		stringPQ.addAll(strings);
		System.out.println(stringPQ);

		Set<Character> charSet = new HashSet<Character>();
		for (char c : fact.toCharArray())
			charSet.add(c); // Autoboxing
		PriorityQueue<Character> characterPQ = new PriorityQueue<Character>(charSet);
		System.out.println(characterPQ);
	}
}
/*
 * You can see that duplicates are allowed, and the lowest values have the
 * highest priority (in the case of String, spaces also count as values and are
 * higher in priority than letters). To show how you can change the ordering by
 * providing your own Comparator object, the third constructor call to
 * PriorityQueue<Integer> and the second call to PriorityQueue<String> use the
 * reverse-order Comparator produced by Collections.reverseOrder( )
 */