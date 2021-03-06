package com_36.basicinputoutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * Example in Line-Oriented I/O
 */
public class CopyLines_Demo_3 {
	public static void main(String[] args) throws IOException {

		BufferedReader inputStream = null;
		PrintWriter outputStream = null;

		try {
			inputStream = new BufferedReader(new FileReader("C:\\UMESH SUBHASH KILKILE\\MY_TEST_EXAMPLES_WORKSPACE\\MY_JAVA_JEE_STUDY_WORKSPACE\\Java-Oracle-Java-Examples-WORKSPACE\\OracleJavaExamples\\xanadu.txt"));
			outputStream = new PrintWriter(new FileWriter("C:\\UMESH SUBHASH KILKILE\\MY_TEST_EXAMPLES_WORKSPACE\\MY_JAVA_JEE_STUDY_WORKSPACE\\Java-Oracle-Java-Examples-WORKSPACE\\OracleJavaExamples\\characteroutput.txt"));

			String l;
			while ((l = inputStream.readLine()) != null) {
				outputStream.println(l);
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
			System.out.println("Completed...");
		}
	}
}

/*
 * Invoking readLine returns a line of text with the line. CopyLines outputs
 * each line using println, which appends the line terminator for the current
 * operating system. This might not be the same line terminator that was used in
 * the input file.
 */
