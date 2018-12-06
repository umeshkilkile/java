package ubs;

public class Test3 {
	public static void main(String[] args) throws Exception {
		try {
			int a = 5;
			int b = 0;
			int c = a / b;
			System.out.println(c);
		} catch (Exception e) {
			System.out.println("There is an error");
		} finally {
			System.out.println("There is no error");
		}
	}
}
