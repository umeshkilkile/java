package com.reflections;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/*
 * Java code to demonstrate use of Class object created by JVM
 */
public class ClassDemo_1 {
	public static void main(String[] args) {
		Student s1 = new Student();

		Class c1 = s1.getClass();
		/*
		 * Getting hold of object using c1
		 */
		System.out.println(c1.getName());
		/*
		 * Getting all methods in array
		 */
		System.out.println("*** Method names ***");
		Method[] methods = c1.getMethods();
		for (Method m : methods) {
			System.out.println(m.getName());
		}

		/*
		 * Getting all fields in an array
		 */
		System.out.println("*** Field names ***");
		Field[] fields = c1.getDeclaredFields();
		for (Field f : fields) {
			System.out.println(f.getName());
		}

		/*
		 * Note : For every loaded .class file, only one object of Class is
		 * created.
		 */
		Student s2 = new Student();
		// c2 will point to same object where
		// c1 is pointing
		Class c2 = s2.getClass();
		System.out.println(c1 == c2); // true
	}
}
