package com_35.exceptions;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class Simple_Try_Catch_Demo_1 {
	private List<Integer> list;
	private static final int SIZE = 10;

	public Simple_Try_Catch_Demo_1() {
		list = new ArrayList<Integer>(SIZE);
		for (int i = 0; i < SIZE; i++) {
			list.add(new Integer(i));
		}
	}

	public void writeList() {
		// The FileWriter constructor throws IOException, which must be caught.
		PrintWriter out = null;
		try {
			System.out.println("Entered try statement");
			out = new PrintWriter(new FileWriter("C:\\UMESH SUBHASH KILKILE\\MY_TEST_EXAMPLES_WORKSPACE\\MY_JAVA_JEE_STUDY_WORKSPACE\\Java-Oracle-Java-Examples-WORKSPACE\\OracleJavaExamples\\OutFile.txt"));
			for (int i = 0; i < SIZE; i++) {
				out.println("Value at: " + i + " = " + list.get(i));
			}
		} catch (IndexOutOfBoundsException e) {
			System.err.println("IndexOutOfBoundsException: " + e.getMessage());
		} catch (IOException e) {
			System.err.println("Caught IOException: " + e.getMessage());
		} finally {
			if (out != null) {
				System.out.println("Closing PrintWriter");
				out.close();
			} else {
				System.out.println("PrintWriter not open");
			}
		}

	}

	public static void main(String[] args) {
		Simple_Try_Catch_Demo_1 catch_Demo_1 = new Simple_Try_Catch_Demo_1();
		catch_Demo_1.writeList();
	}
}

/*
 * Definition: An exception is an event, which occurs during the execution of a
 * program, that disrupts the normal flow of the program's instructions.
 */