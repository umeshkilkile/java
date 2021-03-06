package com_36.basicinputoutput;

import java.io.File;
import java.util.Arrays;

/*
 * Display a directory listing using regular expressions.
 */

public class DirList_DEMO_1 {
	public static void main(String[] args) {
		File path = new File(".");
		String[] list;
		if (args.length == 0) {
			list = path.list();
		} else {
			/*
			 * Tthe list( ) method is calling accept( ) for each of the file
			 * names in the directory object to see which one should be
			 * included; this is indicated by the boolean result returned by
			 * accept( ).
			 */
			list = path.list(new DirFilter(args[0]));
		}

		Arrays.sort(list, String.CASE_INSENSITIVE_ORDER);

		for (String dirItem : list) {
			System.out.println(dirItem);
		}
	}
}
