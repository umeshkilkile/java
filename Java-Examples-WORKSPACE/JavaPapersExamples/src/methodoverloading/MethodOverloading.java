package methodoverloading;

public class MethodOverloading {
	public static void main(String[] args) {

	}

	public static long add(int a, int b) {
		return a + b;
	}

	public static long add(int num1, String s1) {
		return num1 + Integer.parseInt(s1);
	}

	public static long add(String s1, int num1) {
		return num1 + Integer.parseInt(s1);
	}
}
