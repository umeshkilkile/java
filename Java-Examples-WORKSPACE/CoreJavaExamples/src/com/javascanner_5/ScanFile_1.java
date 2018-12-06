package com.javascanner_5;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScanFile_1 {
	public static void main(String[] args) {
		Scanner scanner = null;
		try {
			scanner = new Scanner(new File("test.txt"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (scanner.hasNext()) {
			System.out.println(scanner.next());
		}
		scanner.close();
	}
}
