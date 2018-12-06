package com_25.collection.STACK;

import java.util.LinkedList;

/*
 * LinkedList has methods that directly implement stack functionality, so you can also just use a LinkedList 
 * rather than making a stack class. However, a stack class can sometimes tell the story better:
 */
public class Stack<T> {
	private LinkedList<T> storage = new LinkedList<T>();

	public void push(T v) {
		storage.addFirst(v);
	}

	public T peek() {
		return storage.getFirst();
	}

	public T pop() {
		return storage.removeFirst();
	}

	public boolean empty() {
		return storage.isEmpty();
	}

	public String toString() {
		return storage.toString();
	}
}
