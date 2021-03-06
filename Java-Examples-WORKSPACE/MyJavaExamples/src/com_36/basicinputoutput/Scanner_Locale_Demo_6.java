package com_36.basicinputoutput;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class Scanner_Locale_Demo_6 {
	public static void main(String[] args) throws IOException {

		Scanner s = null;
		double sum = 0;

		try {
			s = new Scanner(new BufferedReader(new FileReader("C:\\UMESH SUBHASH KILKILE\\MY_TEST_EXAMPLES_WORKSPACE\\MY_JAVA_JEE_STUDY_WORKSPACE\\Java-Oracle-Java-Examples-WORKSPACE\\OracleJavaExamples\\usnumbers.txt")));
			s.useLocale(Locale.US);

			while (s.hasNext()) {
				if (s.hasNextDouble()) {
					sum += s.nextDouble();
				} else {
					s.next();
				}
			}
		} finally {
			s.close();
		}

		System.out.println(sum);
	}
}
