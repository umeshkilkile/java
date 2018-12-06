package com.javascanner_5;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class ScanInputfromConsole_5 {
	public static void main(String[] args) {
		String input = "Hello";
		InputStream stdin = System.in;
		System.setIn(new ByteArrayInputStream(input.getBytes()));

		Scanner scanner = new Scanner(System.in);

		String result = scanner.next();
		System.out.println("result = " + result);
		System.setIn(stdin);
		scanner.close();
	}
}
