package com.interfaces;

public class Demo_3 {
	public static void main(String[] args) {
		MyInterface myInterface = new MyInterfaceImpl2();
		myInterface.sayHello();

		MyOtherInterface myOtherInterface = new MyInterfaceImpl2();
		myOtherInterface.sayGoodbye();

		MyInterfaceImpl2 impl2 = new MyInterfaceImpl2();
		impl2.sayHello();
		impl2.sayGoodbye();
	}
}
