package com.javascanner_5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FindPattern_8 {
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream inputStream = new FileInputStream("test.txt");
		Scanner scanner = new Scanner(inputStream);

		String result = scanner.findInLine("wor");
		System.out.println("result = " + result);

		scanner.close();
	}
}
