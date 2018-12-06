package com_14.interfaces;

public class Factories_Demo {
	public static void serviceConsumer(ServiceFactory fact) {
		Service s = fact.getService();
		s.method1();
		s.method2();
	}

	public static void main(String[] args) {
		serviceConsumer(new Implementation1Factory());
		// Implementations are completely interchangeable:
		serviceConsumer(new Implementation2Factory());
	}
}
