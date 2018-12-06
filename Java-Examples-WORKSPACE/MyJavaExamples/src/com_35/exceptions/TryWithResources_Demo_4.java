package com_35.exceptions;

import java.io.BufferedReader;
import java.io.FileReader;

public class TryWithResources_Demo_4 {
	public static void main(String[] args) {
		try (BufferedReader br = new BufferedReader(new FileReader("C:\\UMESH SUBHASH KILKILE\\MY_TEST_EXAMPLES_WORKSPACE\\MY_JAVA_JEE_STUDY_WORKSPACE\\Java-Oracle-Java-Examples-WORKSPACE\\OracleJavaExamples\\OutFile.txt"))) {
			System.out.println(br.readLine());
			System.out.println(br);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/*
 * Consider using the try-with-resources statement in these situations, which
 * automatically releases system resources when no longer needed. The The
 * try-with-resources Statement section has more information.
 */
