package com.strings;

public class String_Demo_2 {
	public static void main(String[] args) {

		/*
		 * - Both expression below gives you String object, but there is subtle
		 * difference between them.
		 * 
		 * - When you create String object using new() operator, it always
		 * create a new object in heap memory.
		 * 
		 * - On the other hand, if you create object using String literal syntax
		 * e.g. "Java", it may return an existing object from String pool (a
		 * cache of String object in Perm gen space, which is now moved to heap
		 * space in recent Java release), if it's already exists. Otherwise it
		 * will create a new string object and put in string pool for future
		 * re-use.
		 * 
		 * - At high level both are String object, but main difference comes
		 * from the point that new() operator always creates a new String
		 * object. Also when you create String using literal they are interned.
		 * 
		 * Read more:
		 * http://www.java67.com/2014/08/difference-between-string-literal-and-
		 * new-String-object-Java.html#ixzz5DUYf90br
		 */
		String a = "Java";
		String b = "Java";
		System.out.println(a == b); // true
		System.out.println(a.equals(b));// true
		System.out.println(a.hashCode() + " : " + b.hashCode());

		System.out.println("---------------------------");
		/*
		 * Here two different objects are created and they have different
		 * references:
		 */
		String c = new String("Java");
		String d = new String("Java");
		System.out.println(c == d); // false
		System.out.println(c.equals(d)); // true
		System.out.println(c.hashCode() + " : " + d.hashCode());

		System.out.println("---------------------------");
		System.out.println(a == c);// false
		System.out.println(a.equals(c)); // true

		System.out.println("---------------------------");
		c = c.intern();
		System.out.println(a == c);// true
		System.out.println(a.equals(c)); // true

	}
}
