package com_35.exceptions;

public class TryCatchFinally_Demo_3 {
	public static void main(String[] args) {
		SomeClass class1 = new SomeClass();

		int what = class1.returnWhat();
		System.out.println(what);
	}
}

/*
 * Note: If the JVM exits while the try or catch code is being executed, then
 * the finally block may not execute. Likewise, if the thread executing the try
 * or catch code is interrupted or killed, the finally block may not execute
 * even though the application as a whole continues.
 * 
 * Important: The finally block is a key tool for preventing resource leaks.
 * When closing a file or otherwise recovering resources, place the code in a
 * finally block to ensure that resource is always recovered.
 */