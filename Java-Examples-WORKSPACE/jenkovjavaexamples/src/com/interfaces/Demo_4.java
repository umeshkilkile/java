package com.interfaces;

public class Demo_4 {
	public static void main(String[] args) {
		MySubclass mySubclass = new MySubclass();
		mySubclass.sayHello();

		MySuperClass mySuperClass = new MySubclass();
		mySuperClass.sayHello();

		MySuperClass superClass = new MySuperClass();
		superClass.sayHello();

		MyInterface myInterface = new MySubclass();
		myInterface.sayHello();
	}
}
