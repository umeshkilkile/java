package com_19.string;

public class Filename_DEMO_2 {
	private String fullPath;
	private char pathSeparator, extensionSeparator;

	public Filename_DEMO_2(String str, char sep, char ext) {
		fullPath = str;
		pathSeparator = sep;
		extensionSeparator = ext;
	}

	public String extension() {
		int dot = fullPath.lastIndexOf(extensionSeparator);
		return fullPath.substring(dot + 1);
	}

	// gets filename without extension
	public String filename() {
		int dot = fullPath.lastIndexOf(extensionSeparator);
		int sep = fullPath.lastIndexOf(pathSeparator);
		return fullPath.substring(sep + 1, dot);
	}

	public String path() {
		int sep = fullPath.lastIndexOf(pathSeparator);
		return fullPath.substring(0, sep);
	}

	public static void main(String[] args) {
		final String FPATH = "/home/user/index.html";
		Filename_DEMO_2 myHomePage = new Filename_DEMO_2(FPATH, '/', '.');
		System.out.println("Extension = " + myHomePage.extension());
		System.out.println("Filename = " + myHomePage.filename());
		System.out.println("Path = " + myHomePage.path());
	}
}
