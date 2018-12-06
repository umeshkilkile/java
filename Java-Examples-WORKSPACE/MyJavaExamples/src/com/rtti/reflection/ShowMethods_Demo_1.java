package com.rtti.reflection;

/*
 * - Using reflection to show all the methods of a class, even if the methods are
 * defined in the base class.
 * 
 * - The result produced by Class.forName( ) cannot be known at compile time, and therefore all the method signature information 
 * is being extracted at run time.
 * 
 * - You can see that the output includes a public default constructor, even though no constructor was defined. The constructor you 
 * see is the one that’s automatically synthesized by the compiler. If you then make ShowMethods a non-public class 
 * (that is, package access), the synthesized default constructor no longer shows up in the output. 
 * The synthesized default constructor is automatically given the same access as the class.
 */

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.regex.Pattern;

public class ShowMethods_Demo_1 {
	private static String usage = "usage:\n" + "ShowMethods qualified.class.name\n"
			+ "To show all methods in class or:\n" + "ShowMethods qualified.class.name word\n"
			+ "To search for methods involving ‘word’";
	private static Pattern p = Pattern.compile("\\w+\\.");

	public static void main(String[] args) {
		if (args.length < 1) {
			System.out.println(usage);
			System.exit(0);
		}
		int lines = 0;
		try {
			System.out.println(args[0]);
			Class<?> c = Class.forName(args[0]);
			Method[] methods = c.getMethods();
			Constructor[] ctors = c.getConstructors();
			if (args.length == 1) {
				for (Method method : methods)
					System.out.println(p.matcher(method.toString()).replaceAll(""));
				System.out.println("-------------------------");
				for (Constructor ctor : ctors)
					System.out.println(p.matcher(ctor.toString()).replaceAll(""));
				lines = methods.length + ctors.length;
			} else {
				for (Method method : methods)
					if (method.toString().indexOf(args[1]) != -1) {
						System.out.println(p.matcher(method.toString()).replaceAll(""));
						lines++;
					}
				System.out.println("----------------------");
				for (Constructor ctor : ctors)
					if (ctor.toString().indexOf(args[1]) != -1) {
						System.out.println(p.matcher(ctor.toString()).replaceAll(""));
						lines++;
					}
			}
		} catch (ClassNotFoundException e) {
			System.out.println("No such class: " + e);
		}
	}
}
/*
 * NOTE :
 * 
 * - pass com.rtti.reflection.ShowMethods_Demo_1 as command line arguments
 * 
 * - pass java.lang.String char int String as command line arguments
 */