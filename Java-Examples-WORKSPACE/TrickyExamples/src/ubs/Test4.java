package ubs;

public class Test4 extends Thread {
	public static void main(String[] args) {
		new Test4().start();
	}

	public void run() {
		System.out.println("Hack");
	}

	public void run(String[] args) {
		System.out.println("Build");
	}
}
