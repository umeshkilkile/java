package com_25.collection.STACK;

import java.util.Stack;

public class Demo_1 {
	public static void main(String[] args) {
		Stack stack = new Stack();

		stack.push("1");
		stack.push("2");
		stack.push("3");

		// look at top object ("3"), without taking it off the stack.
		Object objTop = stack.peek();
		System.out.println(objTop);

		Object obj3 = stack.pop(); // the string "3" is at the top of the stack.
		System.out.println(obj3);
		Object obj2 = stack.pop(); // the string "2" is at the top of the stack.
		Object obj1 = stack.pop(); // the string "1" is at the top of the stack.
		System.out.println(obj1);

		int index = stack.search("3"); // index = 1
		System.out.println("index = " + index);
	}
}
