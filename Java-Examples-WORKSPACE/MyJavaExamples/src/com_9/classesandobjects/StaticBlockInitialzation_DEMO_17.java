package com_9.classesandobjects;

public class StaticBlockInitialzation_DEMO_17 {
	static int initialValue = 100;
	
	static {
		initialValue = 10;
		System.out.println("Inside static block : " + initialValue);
	}
	
	public StaticBlockInitialzation_DEMO_17(int initialValue) {
		this.initialValue = initialValue; 
		System.out.println("Inside parameterized constructor");
	}
	public StaticBlockInitialzation_DEMO_17() {
		System.out.println("Inside default constructor");
	}
	
	public static void main(String[] args) {
		System.out.println("Inside main");
		StaticBlockInitialzation_DEMO_17 initialzation_17 = new StaticBlockInitialzation_DEMO_17(1000);
		StaticBlockInitialzation_DEMO_17 initialzation_18 = new StaticBlockInitialzation_DEMO_17();
	}
}

