package com_36.basicinputoutput;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

//Uses anonymous inner classes.
public class DirList2_DEMO_2 {
	/*
	 * Note that the argument to filter( ) must be final. This is required by
	 * the anonymous inner class so that it can use an object from outside its
	 * scope. This design is an improvement because the FilenameFilter class is
	 * now tightly bound to DirList2.
	 */
	public static FilenameFilter filter(final String regex) {
		// Creation of anonymous inner class:
		return new FilenameFilter() {
			private Pattern pattern = Pattern.compile(regex);

			public boolean accept(File dir, String name) {
				return pattern.matcher(name).matches();
			}
		}; // End of anonymous inner class
	}

	public static void main(String[] args) {
		File path = new File(".");
		String[] list;
		if (args.length == 0)
			list = path.list();
		else
			list = path.list(filter(args[0]));
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		for (String dirItem : list)
			System.out.println(dirItem);
	}
}
