package com_25.collection.STACK;

public class StackUsingLinkedList_Demo_2 {
	public static void main(String[] args) {
		com_25.collection.STACK.Stack<String> stack = new com_25.collection.STACK.Stack<String>();
		for (String s : "My dog has fleas".split(" "))
			stack.push(s);
		while (!stack.empty())
			System.out.print(stack.pop() + " ");
	}
}
