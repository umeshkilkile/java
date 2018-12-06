import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class WorkingWithFiles {
	public static void main(String[] args) {
		File file = new File("C:\\Users\\kilkile\\Desktop\\data.txt");
		StringBuilder builder = new StringBuilder();
		String temp = "";
		try (BufferedReader br = new BufferedReader(new FileReader(file))) {
			String line;
			while ((line = br.readLine()) != null) {
				
				temp = line.substring(23, 64);
				
				
				
				line = line.replaceAll(temp, "umesh-optic-test");
				System.out.println(line);

			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
