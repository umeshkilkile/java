package com.nestedclasses;

public class ClassInInterface_Demo_2 implements ClassInInterface {

	@Override
	public void howdy() {
		System.out.println("ClassInInterface_Demo_2.howdy()");
	}

	public static void main(String[] args) {
		ClassInInterface classInInterface = new ClassInInterface_Demo_2();
		classInInterface.howdy();
		
	}
}
