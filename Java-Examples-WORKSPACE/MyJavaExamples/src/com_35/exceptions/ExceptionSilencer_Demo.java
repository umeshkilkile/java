package com_35.exceptions;

public class ExceptionSilencer_Demo {
	public static void main(String[] args) {
		try {
			throw new RuntimeException();
		} finally {
			// Using �return� inside the finally block
			// will silence any thrown exception.
			return;
		}
	}
}
/*
 * If you run this program you�ll see that it produces no output, even though an
 * exception is thrown.
 */