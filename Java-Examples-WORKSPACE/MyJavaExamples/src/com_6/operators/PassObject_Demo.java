package com_6.operators;

/*In many programming languages, the method f( ) would appear to be making a copy of its argument Letter y inside 
 * the scope of the method. But once again a reference is being passed*/
public class PassObject_Demo {
	static void f(Letter y) {
		y.c = 'z';
	}

	public static void main(String[] args) {
		Letter x = new Letter();
		x.c = 'a';
		System.out.println("1: x.c: " + x.c);
		f(x);
		System.out.println("2: x.c: " + x.c);
	}
}
