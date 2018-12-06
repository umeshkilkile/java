package micellaneous;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class ChangeOutPutStream {
	public static void main(String[] args) {
		try {

			System.out.println("All SOP lines will be printed to C:\\MyLogs.txt");
			
			System.setOut(new PrintStream(new File("C:\\MyLogs.txt")));

			System.out.println("This line will be printed to above file path");
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
