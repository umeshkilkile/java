package com.innerclasses;

public class Factories_Demo_15 {
	public static void serviceConsumer(ServiceFactory fact) {
		Service s = fact.getService();
		s.method1();
		s.method2();
	}

	public static void main(String[] args) {
		serviceConsumer(Implementation1.factory);
		// Implementations are completely interchangeable:
		serviceConsumer(Implementation2.factory);
	}
}
