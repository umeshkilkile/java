package com_36.basicinputoutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

/*
 * Objects of type Scanner are useful for breaking down formatted input into tokens and translating individual tokens according to their data type. 
 * By default, a scanner uses white space to separate tokens.
 */
public class Scanner_Demo_5 {
	public static void main(String[] args) throws IOException {
		Scanner s = null;

		try {
			s = new Scanner(new BufferedReader(new FileReader("C:\\UMESH SUBHASH KILKILE\\MY_TEST_EXAMPLES_WORKSPACE\\MY_JAVA_JEE_STUDY_WORKSPACE\\Java-Oracle-Java-Examples-WORKSPACE\\OracleJavaExamples\\xanadu.txt")));
			
			//s.useDelimiter(",\\s*");//To use a different token separator, invoke useDelimiter(), specifying a regular expression
			
			while (s.hasNext()) {
				System.out.println(s.next());
			}
		} finally {
			if (s != null) {
				s.close();
			}
		}
	}
}
