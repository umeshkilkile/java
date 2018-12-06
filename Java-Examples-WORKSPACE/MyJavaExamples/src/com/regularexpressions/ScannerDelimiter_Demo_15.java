package com.regularexpressions;

import java.util.Scanner;

public class ScannerDelimiter_Demo_15 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner("12, 42, 78, 99, 42");
		scanner.useDelimiter("\\s*,\\s*");
		while (scanner.hasNextInt())
			System.out.println(scanner.nextInt());
	}
}
/*
 * By default, a Scanner splits input tokens along whitespace, but you can also
 * specify your own delimiter pattern in the form of a regular expression:
 */