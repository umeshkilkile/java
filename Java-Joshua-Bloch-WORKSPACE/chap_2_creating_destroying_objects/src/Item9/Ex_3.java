package Item9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ex_3 {
	// try-with-resources - the the best way to close resources!
	static String firstLineOfFile(String path) throws IOException {
		try (BufferedReader br = new BufferedReader(new FileReader(path))) {
			return br.readLine();
		}
	}

	public static void main(String[] args) {
		String path = "C:\\UMESH SUBHASH KILKILE\\MyLogFile.txt";
		String s;
		try {
			s = firstLineOfFile(path);
			System.out.println("s = " + s);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
