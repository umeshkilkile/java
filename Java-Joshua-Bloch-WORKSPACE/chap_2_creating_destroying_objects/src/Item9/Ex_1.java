package Item9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex_1 {
	// try-finally - No longer the best way to close resources!
	static String firstLineOfFile(String path) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(path));
		try {
			return br.readLine();
		} finally {
			br.close();
		}
	}

	public static void main(String[] args) {
		String path = "C:\\UMESH SUBHASH KILKILE\\MyLogFile.txt";
		try {
			String s = firstLineOfFile(path);
			System.out.println("s = " + s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
/*
 * This may not look bad, but it gets worse when you add a second resource:
 */
