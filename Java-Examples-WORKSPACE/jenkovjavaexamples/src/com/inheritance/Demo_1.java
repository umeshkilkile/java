package com.inheritance;

public class Demo_1 {
	public static void main(String[] args) {
		Parent p1 = new Parent();
		System.out.println("p1.x = " + p1.x);
		System.out.println("p1.y = " + p1.y);
		System.out.println("p1.getX() = " + p1.getX());
		System.out.println("p1.getY() = " + p1.getY());
		p1.m1();
		System.out.println("----------------------Set1");

		Parent p2 = new Child();
		System.out.println("p2.x = " + p2.x);
		System.out.println("p2.y = " + p2.y);
		System.out.println("p2.getX() = " + p2.getX());
		System.out.println("p2.getY() = " + p2.getY());
		p2.m1();
		System.out.println("----------------------Set2");

		Child p3 = new Child();
		System.out.println("p3.x = " + p3.x);
		System.out.println("p3.y = " + p3.y);
		System.out.println("p3.getX() = " + p3.getX());
		System.out.println("p3.getY() = " + p3.getY());
		p3.m1();
	}
}
