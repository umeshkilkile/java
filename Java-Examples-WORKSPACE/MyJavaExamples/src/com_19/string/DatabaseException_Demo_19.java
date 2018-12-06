package com_19.string;

public class DatabaseException_Demo_19 extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7873522991435526392L;

	public DatabaseException_Demo_19(int transactionID, int queryID, String message) {
		super(String.format("(t%d, q%d) %s", transactionID, queryID, message));
	}

	public static void main(String[] args) {
		try {
			throw new DatabaseException_Demo_19(3, 7, "Write failed");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
/*
 * - String.format( ) is a static method which takes all the same arguments as
 * Formatter’s format( ) but returns a String.
 */