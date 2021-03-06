package com_10.lambdaexpressions;

import java.io.File;
import java.io.FileFilter;

public class Lambdas_DEMO_4 {
	public static void main(String[] args) {

		// Before Java 8
		File[] hiddenFiles = new File(".").listFiles(new FileFilter() {
			public boolean accept(File pathname) {
				return pathname.isHidden();
			}
		});
		System.out.println(hiddenFiles.length);

		// Now, in Java 8 you can rewrite that code as follows:
		File[] hiddenFiles2 = new File(".").listFiles(File::isHidden);
		System.out.println(hiddenFiles2.length);
		
		// Java 8 method reference :: syntax (meaning �use this method as
		// a value�)
	}
}
