package com.javascanner_5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class InputStreamToString_2 {
	public static void main(String[] args) {
		FileInputStream inputStream = null;
		try {
			inputStream = new FileInputStream("test.txt");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		Scanner scanner = new Scanner(inputStream);
		scanner.useDelimiter(" ");

		String result = scanner.next();

		System.out.println("result = " + result);

		scanner.close();
	}
}
