package com_25.collections.QUEUE;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_Demo_1 {
	public static void main(String[] args) {
		int time = Integer.parseInt("5");
		/*
		 * Queue implementation
		 */
		Queue<Integer> queue = new LinkedList<Integer>();

		/*
		 * NOTE : ArrayList can not be used as Queue as ArrayList not implements
		 * Queue interface
		 */
		// Queue<Integer> queue = new ArrayList<Integer>();

		for (int i = time; i >= 0; i--)
			queue.add(i);
		System.out.println("queue = " + queue);
		
		while (!queue.isEmpty()) {
			System.out.println(queue.remove());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
