package com.trywithresources_6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class TryWithResourcesMultipleResources_3 {
	public static void main(String... args) {
		try (Scanner scanner = new Scanner(new File("test.txt"));
				PrintWriter writer = new PrintWriter(new File("text2.txt"))) {
			while (scanner.hasNext()) {
				writer.print(scanner.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
