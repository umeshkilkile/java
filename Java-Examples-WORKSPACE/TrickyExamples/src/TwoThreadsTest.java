class TwoThreadsTest {
	public static void main(String args[]) {
		System.out.println("Start");

		new SimpleThread("get").start();
		new SimpleThread("get").start();

	}
}