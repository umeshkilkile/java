package com_26.collections.DEQUEUE;

import java.util.Deque;
import java.util.LinkedList;

public class DeQueue_Demo_1 {
	public static void main(String[] args) {
		int time = Integer.parseInt("5");
		/*
		 * Deque implementation
		 */
		Deque<Integer> deque = new LinkedList<Integer>();
		
		for (int i = time; i >= 0; i--)
			deque.add(i);

		while (!deque.isEmpty()) {
			System.out.println(deque.remove());
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
