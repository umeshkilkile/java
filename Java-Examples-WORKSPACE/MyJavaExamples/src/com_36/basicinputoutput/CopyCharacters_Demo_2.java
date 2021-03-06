package com_36.basicinputoutput;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CopyCharacters_Demo_2 {
	public static void main(String[] args) throws IOException {

		FileReader inputStream = null;
		FileWriter outputStream = null;

		try {
			inputStream = new FileReader(
					"C:\\UMESH SUBHASH KILKILE\\MY_TEST_EXAMPLES_WORKSPACE\\MY_JAVA_JEE_STUDY_WORKSPACE\\Java-Oracle-Java-Examples-WORKSPACE\\OracleJavaExamples\\xanadu.txt");
			outputStream = new FileWriter(
					"C:\\UMESH SUBHASH KILKILE\\MY_TEST_EXAMPLES_WORKSPACE\\MY_JAVA_JEE_STUDY_WORKSPACE\\Java-Oracle-Java-Examples-WORKSPACE\\OracleJavaExamples\\characteroutput.txt");

			int c;
			while ((c = inputStream.read()) != -1) {
				outputStream.write(c);
			}
		} finally {
			if (inputStream != null) {
				inputStream.close();
			}
			if (outputStream != null) {
				outputStream.close();
			}
			System.out.println("Completed");
		}
	}
}

/*
 * Notice that both CopyBytes and CopyCharacters use an int variable to read to
 * and write from. However, in CopyCharacters, the int variable holds a
 * character value in its last 16 bits; in CopyBytes, the int variable holds a
 * byte value in its last 8 bits.
 */
