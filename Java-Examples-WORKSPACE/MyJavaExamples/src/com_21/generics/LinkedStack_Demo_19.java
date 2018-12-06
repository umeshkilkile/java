package com_21.generics;

public class LinkedStack_Demo_19<T> {
	private static class Node<U> {
		U item;
		Node<U> next;

		Node() {
			item = null;
			next = null;
		}

		Node(U item, Node<U> next) {
			this.item = item;
			this.next = next;
		}

		boolean end() {
			return item == null && next == null;
		}
	}

	private Node<T> top = new Node<T>(); // End sentinel

	public void push(T item) {
		top = new Node<T>(item, top);
	}

	public T pop() {
		T result = top.item;
		if (!top.end())
			top = top.next;
		return result;
	}

	public static void main(String[] args) {
		LinkedStack_Demo_19<String> lss = new LinkedStack_Demo_19<String>();
		for (String s : "Phasers on stun!".split(" "))
			lss.push(s);
		String s;
		while ((s = lss.pop()) != null)
			System.out.println(s);
	}
}
/*
 * - The inner class Node is also a generic, and has its own type parameter.
 * 
 * - The inner class Node is also a generic, and has its own type parameter.
 * 
 * - This example makes use of an end sentinel to determine when the stack is
 * empty. The end sentinel is created when the LinkedStack is constructed, and
 * each time you call push( ) a new Node<T> is created and linked to the
 * previous Node<T>. When you call pop( ), you always return the top.item, and
 * then you discard the current Node<T> and move to the next one� except when
 * you hit the end sentinel, in which case you don�t move. That way, if the
 * client keeps calling pop( ), they keep getting null back to indicate that the
 * stack is empty.
 */
