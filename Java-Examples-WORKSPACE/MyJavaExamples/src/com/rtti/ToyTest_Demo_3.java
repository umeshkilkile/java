package com.rtti;

public class ToyTest_Demo_3 {
	static void printInfo(Class cc) {
		System.out.println("Class name: " + cc.getName() + " is interface? [" + cc.isInterface() + "]");
		System.out.println("Simple name: " + cc.getSimpleName());
		System.out.println("Canonical name : " + cc.getCanonicalName());
	}

	public static void main(String[] args) {
		Class c = null;
		try {
			/*
			 * Notice that you must use the fully qualified name (including the
			 * package name) in the string that you pass to forName( ).
			 */
			c = Class.forName("com.rtti.FancyToy");
		} catch (ClassNotFoundException e) {
			System.out.println("Can�t find FancyToy");
			System.exit(1);
		}
		printInfo(c);
		for (Class face : c.getInterfaces())
			printInfo(face);
		Class up = c.getSuperclass();
		Object obj = null;
		try {
			// Requires default constructor:
			obj = up.newInstance();
		} catch (InstantiationException e) {
			System.out.println("Cannot instantiate");
			System.exit(1);
		} catch (IllegalAccessException e) {
			System.out.println("Cannot access");
			System.exit(1);
		}
		System.out.println("-------------------------");
		printInfo(obj.getClass());
	}
}
/*
 * The newlnstance( ) method of Class is a way to implement a
 * "virtual constructor," which allows you to say,
 * "I don�t know exactly what type you are, but create yourself properly anyway."
 * In the preceding example, up is just a Class reference with no further type
 * information known at compile time. And when you create a new instance, you
 * get back an Object reference. But that reference is pointing to a Toy object.
 * Of course, before you can send any messages other than those accepted by
 * Object, you must investigate it a bit and do some casting. In addition, the
 * class that�s being created with newlnstance( ) must have a default
 * constructor.
 */