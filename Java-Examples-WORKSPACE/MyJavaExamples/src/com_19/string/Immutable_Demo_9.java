package com_19.string;

public class Immutable_Demo_9 {
	/*
	 * - Looking at the definition for upcase( ), you can see that the reference
	 * that’s passed in has the name s, and it exists for only as long as the
	 * body of upcase( ) is being executed. When upcase( ) completes, the local
	 * reference s vanishes. upcase( ) returns the result, which is the original
	 * string with all the characters set to uppercase. Of course, it actually
	 * returns a reference to the result. But it turns out that the reference
	 * that it returns is for a new object, and the original q is left alone.
	 * 
	 * - When q is passed in to upcase( ) it’s actually a copy of the reference
	 * to q. The object this reference is connected to stays in a single
	 * physical location. The references are copied as they are passed around.
	 */
	public static String upcase(String s) {
		return s.toUpperCase();
	}

	public static void main(String[] args) {
		String q = "howdy";
		System.out.println(q); // howdy
		String qq = upcase(q);
		System.out.println(qq); // HOWDY
		System.out.println(qq.toLowerCase());
		System.out.println(q); // howdy
	}
}
