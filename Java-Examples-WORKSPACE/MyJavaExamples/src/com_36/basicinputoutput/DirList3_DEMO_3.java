package com_36.basicinputoutput;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

//Building the anonymous inner class "in-place."

public class DirList3_DEMO_3 {
	/*
	 * The argument to main( ) is now final, since the anonymous inner class
	 * uses args[0] directly.
	 */
	public static void main(final String[] args) {
		File path = new File(".");
		String[] list;
		if (args.length == 0)
			list = path.list();
		else
			list = path.list(new FilenameFilter() {
				private Pattern pattern = Pattern.compile(args[0]);

				public boolean accept(File dir, String name) {
					return pattern.matcher(name).matches();
				}
			});
		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);
		for (String dirItem : list)
			System.out.println(dirItem);
	}
}
/*
 * This shows you how anonymous inner classes allow the creation of specific,
 * one-off classes to solve problems. One benefit of this approach is that it
 * keeps the code that solves a particular problem isolated in one spot. On the
 * other hand, it is not always as easy to read, so you must use it judiciously.
 */
