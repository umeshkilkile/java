package com.micellaneous;

/*- Constructor initialization : 
 * i will first be initialized to 0, then to 7. This is true with all the primitive types and with object references, 
 * including those that are given explicit initialization at the point of definition. 
 * For this reason, the compiler doesn’t try to force you to initialize elements in the constructor at any particular place, 
 * or before they are used—initialization is already guaranteed.
 */
public class Counter_Demo {
	int i;

	Counter_Demo() {
		System.out.println(i);
		i = 7;
	}

	public static void main(String[] args) {
		Counter_Demo counter_Demo = new Counter_Demo();
		System.out.println(counter_Demo.i);
	}
}
