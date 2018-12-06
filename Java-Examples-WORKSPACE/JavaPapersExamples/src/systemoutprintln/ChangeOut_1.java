package systemoutprintln;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintStream;
/*
 * System is a final class and cannot be inherited.
 * out - out is static member field of System class and is of type PrintStream.
 * println - Every println makes a call to print method and adds a newline. print calls write() and the story goes on like that.
 */
public class ChangeOut_1 {
	public static void main(String[] args){
		try {
			System.setOut(new PrintStream(new FileOutputStream("C:\\log.txt")));
			System.out.println("Now the output is redirected to log.txt");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
}
