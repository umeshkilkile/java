package com.stacktrace_20;

import java.io.PrintWriter;
import java.io.StringWriter;

public class Ex_1 {
	public static void main(String[] args) {

		StringWriter sw = new StringWriter();
		PrintWriter pw = new PrintWriter(sw);

		try {
			int a = 1 / 0;

			System.out.println(a);
		} catch (ArithmeticException e) {
			e.printStackTrace(pw);
		} catch (Exception e) {
			e.printStackTrace(pw);
		} finally {
			System.out.println(sw.toString());
		}
	}
}
