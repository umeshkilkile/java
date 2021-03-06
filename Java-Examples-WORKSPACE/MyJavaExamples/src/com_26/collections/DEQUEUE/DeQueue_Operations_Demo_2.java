package com_26.collections.DEQUEUE;

import java.util.Deque;
import java.util.LinkedList;

public class DeQueue_Operations_Demo_2 {
	public static void main(String[] args) {
		Deque<String> deque = new LinkedList<String>();
		deque.add("IBM");
		deque.addFirst("HP");
		deque.add("Intuit");
		deque.addLast("Google");
		deque.add("Apple");
		System.out.println(deque + "\n");
		
		String head = deque.element();
		System.out.println("Head : " + head);
		System.out.println(deque + "\n");
		
		
		boolean offered = deque.offer("Umesh");
		System.out.println("Inserted : " + offered);
		System.out.println(deque + "\n");
		
		
		 
		String peeked = deque.peek();
		System.out.println("peeked : " + peeked);
		System.out.println(deque + "\n");
		
		
		 
		String polled = deque.poll();
		System.out.println("Polled : " + polled);
		System.out.println(deque + "\n");
		
		
		 
		String removed = deque.remove();
		System.out.println("Removed : " + removed);
		System.out.println(deque);
	}
}
