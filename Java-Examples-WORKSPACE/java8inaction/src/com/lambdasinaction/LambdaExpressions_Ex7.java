package com.lambdasinaction;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * Code without using Lambda and functional interface
 */
public class LambdaExpressions_Ex7 {
	public static void main(String[] args) {
		try {
			String line = processFile();
			System.out.println(line);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static String processFile() throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader("Notes.txt"))) {
			return br.readLine();
		}
	}
}
