package com_25.collections.QUEUE;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

public class HeapSort_Demo_3 {
	public static void main(String[] args) {
		List<String> l = new ArrayList<>();
		l.add("Paris");
		l.add("Helsinki");
		l.add("London");
		l.add("Mumbai");

		System.out.println("Before : " + l);

		List<String> l2 = heapSort(l);
		System.out.println("l2 = " + l2);
	}

	static <E> List<E> heapSort(Collection<E> c) {
		Queue<E> queue = new PriorityQueue<E>(c);
		System.out.println("queue : " + queue);
		
		List<E> result = new ArrayList<E>();

		while (!queue.isEmpty())
			result.add(queue.remove());

		return result;
	}
}
