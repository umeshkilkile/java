package com.comp;

import java.io.File;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class MethodReference_Static_Demo_2 {
	public static void main(String[] args) {

		/*
		 * There are four main kinds of method references:
		 * 
		 * 1. A method reference to a static method:
		 * 
		 */
		Function<Double, Double> sqrtConverter = Math::sqrt;
		Double result = sqrtConverter.apply(2.0);
		System.out.println(result);

		/*
		 * 2. A method reference to an instance method. Specifically, you’re
		 * referring to a method of an object that will be supplied as the first
		 * parameter of the lambda:
		 * 
		 */
		Function<Invoice, Integer> invoiceToId = Invoice::getId;
		Integer invoiceId = invoiceToId.apply(new Invoice(100.78, "AutoParts", 1001, "Ford"));
		System.out.println(invoiceId);

		/*
		 * 3. A method reference to an instance method of an existing object:
		 */
		Consumer<Object> print = System.out::println;
		print.accept("Hi");

		/*
		 * Specifically, this kind of method reference is very useful when you
		 * want to refer to a private helper method and inject it into another
		 * method:
		 */
		String dir = "C:\\UMESH SUBHASH KILKILE\\MY_TEST_EXAMPLES_WORKSPACE\\MY_JAVA_JEE_STUDY_WORKSPACE\\Java-8-WORKSPACE\\5-MethodReferences\\src\\com\\comp";
		File directory = new File(dir);
		// get all the files from a directory
		File[] fList = directory.listFiles();
		for (File file : fList) {
			System.out.println(file.getName());
		}

		System.out.println("Files with .java extension");
		File[] javaFiles = directory.listFiles(MethodReference_Static_Demo_2::isJava);
		for (File file : javaFiles) {
			System.out.println(file.getName());
		}

		/*
		 * 4. A constructor reference:
		 */
		Supplier<List<String>> listOfString = ArrayList::new;
		System.out.println(listOfString.getClass());
		
		Supplier<Invoice> inv = Invoice::new;
		System.out.println("Inv : " + inv.get().id);
		System.out.println("Inv : " + inv.get().customer);
	}

	private static boolean isJava(File f) {
		return f.getName().endsWith(".java");
	}
}
