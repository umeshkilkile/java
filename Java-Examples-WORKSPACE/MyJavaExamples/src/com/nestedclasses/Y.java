package com.nestedclasses;

class Y implements A {
	B makeB() {
		// Anonymous inner class:
		return new B() {
		};
	}
}
