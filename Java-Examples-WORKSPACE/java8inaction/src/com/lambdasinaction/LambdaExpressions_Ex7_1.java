package com.lambdasinaction;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/*
 * Code refactored using Functional interface and lambdas
 */
public class LambdaExpressions_Ex7_1 {
	public static void main(String[] args) {
		try {
			String line1 = processFile((BufferedReader br) -> br.readLine());
			System.out.println("line1 = " + line1);

			String line1_2_3 = processFile((BufferedReader br) -> br.readLine() + br.readLine() + br.readLine());
			System.out.println("line2 = " + line1_2_3);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public static String processFile(BufferedReaderProcessor brp) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader("Notes.txt"))) {
			return brp.process(br);
		}
	}
}
