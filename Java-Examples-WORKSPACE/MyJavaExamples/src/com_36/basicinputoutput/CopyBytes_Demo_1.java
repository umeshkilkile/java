package com_36.basicinputoutput;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/*
 * CopyBytes_Demo_1 spends most of its time in a simple loop that reads the input stream and writes the output stream, one byte at a time
 */
public class CopyBytes_Demo_1 {
	public static void main(String[] args) throws IOException {

		FileInputStream in = null;
		FileOutputStream out = null;

		try {
			in = new FileInputStream("C:\\UMESH SUBHASH KILKILE\\MY_TEST_EXAMPLES_WORKSPACE\\MY_JAVA_JEE_STUDY_WORKSPACE\\Java-Oracle-Java-Examples-WORKSPACE\\OracleJavaExamples\\xanadu.txt");
			out = new FileOutputStream("C:\\UMESH SUBHASH KILKILE\\MY_TEST_EXAMPLES_WORKSPACE\\MY_JAVA_JEE_STUDY_WORKSPACE\\Java-Oracle-Java-Examples-WORKSPACE\\OracleJavaExamples\\outagain.txt");
			int c;

			while ((c = in.read()) != -1) {
				out.write(c);
			}
		} finally {//Always Close Streams, This practice helps avoid serious resource leaks.
			if (in != null) {
				in.close();
			}
			if (out != null) {
				out.close();
			}
			System.out.println("Completed...");
		}
	}
}
/*
 * Byte streams should only be used for the most primitive I/O.
 */
