package com.javascanner_5;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.Scanner;

public class ValidateInput_6 {
	public static void main(String[] args) {
		String input = "2000";
		InputStream stdin = System.in;
		System.setIn(new ByteArrayInputStream(input.getBytes()));

		Scanner scanner = new Scanner(System.in);

		boolean isIntInput = scanner.hasNextInt();
		System.out.println("isIntInput = " + isIntInput);

		System.setIn(stdin);
		scanner.close();
	}
}
