package com_21.generics;

public class A {
	String name;
	
	A(){
		
	}
	
	A(String name){
		this.name = name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
