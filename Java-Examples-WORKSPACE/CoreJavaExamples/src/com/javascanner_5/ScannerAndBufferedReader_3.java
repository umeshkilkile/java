package com.javascanner_5;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ScannerAndBufferedReader_3 {
	public static void main(String[] args) {
		BufferedReader reader = null;
		String result;
		try {
			reader = new BufferedReader(new FileReader("test.txt"));
			result = reader.readLine();
			System.out.println("result = " + result);

			result = reader.readLine();
			System.out.println("result = " + result);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				reader.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
/*
 * BufferedReader when we want to read the input into lines.
 * 
 * Scanner to read the input into tokens
 */