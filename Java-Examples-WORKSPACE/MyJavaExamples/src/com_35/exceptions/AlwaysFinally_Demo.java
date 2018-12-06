package com_35.exceptions;

public class AlwaysFinally_Demo {
	public static void main(String[] args) {
		System.out.println("Entering first try block");
		try {
			System.out.println("Entering second try block");
			try {
				throw new Exception();
			} finally {
				System.out.println("finally in 2nd try block");
			}
		} catch (Exception e) {
			System.out.println("Caught FourException in 1st try block");
		} finally {
			System.out.println("finally in 1st try block");
		}
	}
}
