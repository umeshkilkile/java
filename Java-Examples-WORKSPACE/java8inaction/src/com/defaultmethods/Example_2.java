package com.defaultmethods;

public class Example_2 {
	public static void main(String[] args) {
		MyInterface interface1 = new MyClass1();

		int sum = interface1.add(10, 20);
		System.out.println("Sum = " + sum);

		int diff = interface1.sub(20, 10);
		System.out.println("Diff = " + diff);
		System.out.println("-------------------------");
		
		MyInterface interface2 = new MyClass2();
		int sum2 = interface2.add(10, 20);
		System.out.println("Sum2 = " + sum2);

		int diff2 = interface2.sub2(20, 10);
		System.out.println("Diff2 = " + diff2);
		
	}
}
