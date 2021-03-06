package com.classnotfound_11;

public class WhenClassNotFoundException_1 {
	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

/*
 * 1. ClassNotFoundException and NoClassDefFoundError occur when the JVM can not
 * find a requested class on the classpath.
 * 
 * 2. ClassNotFoundException is a checked exception which occurs when an
 * application tries to load a class through its fully-qualified name and can
 * not find its definition on the classpath.
 * 
 * 3. This occurs mainly when trying to load classes using Class.forName(),
 * ClassLoader.loadClass() or ClassLoader.findSystemClass().
 * 
 * While both of these exceptions are related to classpath and Java runtime
 * unable to find a class at run time, it�s important to note their differences.
 * 
 * Java runtime throws ClassNotFoundException while trying to load a class at
 * runtime only and the name was provided during runtime. In the case of
 * NoClassDefFoundError, the class was present at compile time, but Java runtime
 * could not find it in Java classpath during runtime.
 */