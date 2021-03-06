package com.nestedclasses;

//Inheriting from inner classes
public class InheritInner_Demo_7 extends WithInner.Inner {
	// ! InheritInner() {} // Won�t compile
	InheritInner_Demo_7(WithInner wi) {
		wi.super();
	}

	public static void main(String[] args) {
		WithInner wi = new WithInner();
		InheritInner_Demo_7 ii = new InheritInner_Demo_7(wi);
	}
}