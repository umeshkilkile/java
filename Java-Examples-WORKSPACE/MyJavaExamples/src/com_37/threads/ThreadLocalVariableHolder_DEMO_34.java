package com_37.threads;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//Automatically giving each thread its own storage.
public class ThreadLocalVariableHolder_DEMO_34 {
	private static ThreadLocal<Integer> value = new ThreadLocal<Integer>() {
		private Random rand = new Random(47);

		@Override
		protected synchronized Integer initialValue() {
			return rand.nextInt(10000);
		}
	};

	public static void increment() {
		value.set(value.get() + 1);
	}

	public static int get() {
		return value.get();
	}

	public static void main(String[] args) throws Exception {
		ExecutorService exec = Executors.newCachedThreadPool();
		for (int i = 0; i < 5; i++)
			exec.execute(new Accessor(i));
		TimeUnit.SECONDS.sleep(3); // Run for a while
		exec.shutdownNow(); // All Accessors will quit
	}
}
/*
 * Thread local storage
 * 
 * - A second way to prevent tasks from colliding over shared resources is to
 * eliminate the sharing of variables. Thread local storage is a mechanism that
 * automatically creates different storage for the same variable, for each
 * different thread that uses an object. Thus, if you have five threads using an
 * object with a variable x, thread local storage generates five different
 * pieces of storage for x. Basically, they allow you to associate state with a
 * thread.
 * 
 * - The creation and management of thread local storage is taken care of by the
 * java.lang.ThreadLocal class
 * 
 * - ThreadLocal objects are usually stored as static fields. When you create a
 * ThreadLocal object, you are only able to access the contents of the object
 * using the get( ) and set( ) methods. The get( ) method returns a copy of the
 * object that is associated with that thread, and set( ) inserts its argument
 * into the object stored for that thread, returning the old object that was in
 * storage. The increment( ) and get( ) methods demonstrate this in
 * ThreadLocalVariableHolder. Notice that increment( ) and get( ) are not
 * synchronized, because ThreadLocal guarantees that no race condition can
 * occur.
 * 
 * - When you run this program, you’ll see evidence that the individual threads
 * are each allocated their own storage, since each one keeps its own count even
 * though there’s only one ThreadLocalVariableHolder object.
 */
