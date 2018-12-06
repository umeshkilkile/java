package Item3;

public class Demo_2 {
	public static void main(String[] args) {

		LogFile2 logFile = LogFile2.INSTANCE;
		System.out.println(logFile.hashCode());
		logFile.writeToFile("Logged...");

		LogFile2 logFile2 = LogFile2.INSTANCE;
		System.out.println(logFile2.hashCode());
		logFile2.writeToFile("Logged again...");

		LogFile2 logFile3 = LogFile2.INSTANCE;
		System.out.println(logFile3.hashCode());
		logFile3.writeToFile("Logged again and again...");
	}
}
