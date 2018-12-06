package com_25.collections.QUEUE;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue_Operations_Demo_2 {
	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.add("IBM");
		queue.add("HP");
		queue.add("Intuit");
		queue.add("Google");
		queue.add("Apple");
		System.out.println(queue + "\n");
		
		/*
		 * element() : Retrieves, but does not remove, the head of this queue
		 */
		String head = queue.element();
		System.out.println("Head : " + head);
		System.out.println(queue + "\n");
		
		/*
		 * offer() : Inserts the specified element into this queue if it is possible to do so immediately without violating capacity restrictions.
		 */
		boolean offered = queue.offer("Umesh");
		System.out.println("Inserted : " + offered);
		System.out.println(queue + "\n");
		
		/*
		 * peek() : Retrieves, but does not remove, the head of this queue, or returns null if this queue is empty.
		 */
		String peeked = queue.peek();
		System.out.println("peeked : " + peeked);
		System.out.println(queue + "\n");
		
		/*
		 * poll() : Retrieves and removes the head of this queue, or returns null if this queue is empty.
		 */
		String polled = queue.poll();
		System.out.println("Polled : " + polled);
		System.out.println(queue + "\n");
		
		/*
		 * remove() : Retrieves and removes the head of this queue.
		 */
		String removed = queue.remove();
		System.out.println("Removed : " + removed);
		System.out.println(queue);
		
	}
}
