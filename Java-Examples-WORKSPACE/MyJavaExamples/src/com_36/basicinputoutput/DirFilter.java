package com_36.basicinputoutput;

import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

public class DirFilter implements FilenameFilter {
	private Pattern pattern;

	public DirFilter(String regex) {
		pattern = Pattern.compile(regex);
	}

	/*
	 * DirFilter�s sole reason for existence is to provide the accept( ) method
	 * to the list( ) method so that list( ) can "call back" accept( ) to
	 * determine which file names should be included in the list.
	 */
	@Override
	public boolean accept(File dir, String name) {
		return pattern.matcher(name).matches();
	}
}
