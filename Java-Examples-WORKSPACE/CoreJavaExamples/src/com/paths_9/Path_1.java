package com.paths_9;

import java.io.File;
import java.io.IOException;

public class Path_1 {
	public static void main(String[] args) {
		File file = new File("foo/foo-one.txt");
		String path = file.getPath();
		System.out.println("path = " + path);

		// The getAbsolutePath() method returns the pathname of the file after
		// resolving the path for the current user directory � this is called an
		// absolute pathname.
		String absolutePath = file.getAbsolutePath();
		System.out.println("absolutePath = " + absolutePath);

		File file2 = new File("foo/./../foo-one.txt");
		String absolutePath2 = file2.getAbsolutePath();
		System.out.println("absolutePath2 = " + absolutePath2);

		File file3 = new File("foo/./../foo-two.txt");
		String canonicalPath = null;
		try {
			canonicalPath = file3.getCanonicalPath();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("canonicalPath = " + canonicalPath);
		
		
	}
}

/*
 * 
 * foo/foo-one.txt // on Unix systems
 * 
 * 
 * foo\foo-one.txt // on Windows systems
 */
