package com_37.threads;

// Another idiom that you may see is that of the self-managed Runnable
// A Runnable containing its own driver Thread.
public class SelfManaged_DEMO_15 implements Runnable {
	private int countDown = 5;
	private Thread t = new Thread(this);

	public SelfManaged_DEMO_15() {
		t.start();
	}

	public String toString() {
		return Thread.currentThread().getName() + "(" + countDown + "), ";
	}

	public void run() {
		while (true) {
			System.out.print(this);
			if (--countDown == 0)
				return;
		}
	}

	public static void main(String[] args) {
		for (int i = 0; i < 5; i++)
			new SelfManaged_DEMO_15();
	}
}
/*
 * - This is not especially different from inheriting from Thread except that
 * the syntax is slightly more awkward. However, implementing an interface does
 * allow you to inherit from a different class, whereas inheriting from Thread
 * does not.
 * 
 * - Notice that start( ) is called within the constructor. This example is
 * quite simple and therefore probably safe, but you should be aware that
 * starting threads inside a constructor can be quite problematic, because
 * another task might start executing before the constructor has completed,
 * which means the task may be able to access the object in an unstable state.
 * This is yet another reason to prefer the use of Executors to the explicit
 * creation of Thread objects.
 */