package ubs;

public class Test {
	public static void main(String argv[]) {
		A a = new A();
		a.start();

		synchronized (a) {
			System.out.println("waiting");
			try {
				a.wait();
			} catch (InterruptedException e) {
			}
			System.out.println(a.count);
		}
	}
}
