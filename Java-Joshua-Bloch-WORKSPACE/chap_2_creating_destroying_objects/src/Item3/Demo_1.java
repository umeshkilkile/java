package Item3;

public class Demo_1 {
	public static void main(String[] args) {
		
		LogFile logFile = LogFile.getInstance();
		System.out.println(logFile.hashCode());
		logFile.writeToFile("Logged...");
		
		LogFile logFile2 = LogFile.getInstance();
		System.out.println(logFile2.hashCode());
		logFile2.writeToFile("Logged again...");
		
		LogFile logFile3 = LogFile.getInstance();
		System.out.println(logFile3.hashCode());
		logFile3.writeToFile("Logged again and again...");
		
	}
}
