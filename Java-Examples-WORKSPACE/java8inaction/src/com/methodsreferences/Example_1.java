package com.methodsreferences;

import java.io.File;
import java.io.FileFilter;

public class Example_1 {
	public static void main(String[] args) {
		// Before Java 8

		/*
		 * Filtering files with the isHidden method requires wrapping the method
		 * inside a FileFilter object before passing it to the File.listFiles
		 * method.
		 */
		File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
			@Override
			public boolean accept(File pathname) {
				return pathname.isHidden();
			}
		});
		System.out.println("hiddenFiles = " + hiddenFiles.length);

		// Using Java 8
		/*
		 * - In Java 8 you can pass the isHidden function to the listFiles
		 * method using the method reference :: syntax.
		 * 
		 * - Java 8 method reference :: syntax (meaning “use this method as a
		 * value”);
		 * 
		 * - In Java 8 when you write File::isHidden you create a method
		 * reference, which can similarly be passed around.
		 */
		File[] hiddenFiles2 = new File(".").listFiles(File::isHidden);
		System.out.println("hiddenFiles2 = " + hiddenFiles2.length);
	}
}
