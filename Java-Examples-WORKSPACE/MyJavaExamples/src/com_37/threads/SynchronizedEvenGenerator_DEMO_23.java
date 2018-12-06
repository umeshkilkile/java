package com_37.threads;

//Simplifying mutexes with the synchronized keyword.
/*
 * The first task that enters next( ) acquires the lock, and any further
 * tasks that try to acquire the lock are blocked from doing so until the
 * first task releases the lock. At that point, the scheduling mechanism
 * selects another task that is waiting on the lock. This way, only one task
 * at a time can pass through the code that is guarded by the mutex.
 */
public class SynchronizedEvenGenerator_DEMO_23 extends IntGenerator {
	private int currentEvenValue = 0;

	public synchronized int next() {
		++currentEvenValue;
		Thread.yield(); // Cause failure faster
		++currentEvenValue;
		return currentEvenValue;
	}

	public static void main(String[] args) {
		EvenChecker.test(new SynchronizedEvenGenerator_DEMO_23());
	}
}
/*
 * - To prevent collisions over resources, Java has built-in support in the form
 * of the synchronized keyword. When a task wishes to execute a piece of code
 * guarded by the synchronized keyword, it checks to see if the lock is
 * available, then acquires it, executes the code, and releases it.
 * 
 * - The shared resource is typically just a piece of memory in the form of an
 * object, but may also be a file, an I/O port, or something like a printer. To
 * control access to a shared resource, you first put it inside an object. Then
 * any method that uses the resource can be made synchronized. If a task is in a
 * call to one of the synchronized methods, all other tasks are blocked from
 * entering any of the synchronized methods of that object until the first task
 * returns from its call.
 * 
 * - In production code, you’ve already seen that you should make the data
 * elements of a class private and access that memory only through methods. You
 * can prevent collisions by declaring those methods synchronized, like this:
 * 
 * synchronized void f() { }
 * 
 * synchronized void g() { }
 * 
 * - All objects automatically contain a single lock (also referred to as a
 * monitor). When you call any synchronized method, that object is locked and no
 * other synchronized method of that object can be called until the first one
 * finishes and releases the lock. For the preceding methods, if f( ) is called
 * for an object by one task, a different task cannot call f( ) or g( ) for the
 * same object until f( ) is completed and releases the lock. Thus, there is a
 * single lock that is shared by all the synchronized methods of a particular
 * object, and this lock can be used to prevent object memory from being written
 * by more than one task at a time.
 * 
 * - Note that it’s especially important to make fields private when working
 * with concurrency; otherwise the synchronized keyword cannot prevent another
 * task from accessing a field directly, and thus producing collisions.
 * 
 * - One task may acquire an object’s lock multiple times. This happens if one
 * method calls a second method on the same object, which in turn calls another
 * method on the same object, etc. The JVM keeps track of the number of times
 * the object has been locked. If the object is unlocked, it has a count of
 * zero. As a task acquires the lock for the first time, the count goes to one.
 * Each time the same task acquires another lock on the same object, the count
 * is incremented. Naturally, multiple lock acquisition is only allowed for the
 * task that acquired the lock in the first place. Each time the task leaves a
 * synchronized method, the count is decremented, until the count goes to zero,
 * releasing the lock entirely for use by other tasks.
 * 
 * - When should you synchronize? Apply Brian’s Rule of Synchronization
 * 
 * -> If you are writing a variable that might next be read by another thread,
 * or reading a variable that might have last been written by another thread,
 * you must use synchronization, and further, both the reader and the writer
 * must synchronize using the same monitor lock.
 * 
 * - If you have more than one method in your class that deals with the critical
 * data, you must synchronize all relevant methods. If you synchronize only one
 * of the methods, then the others are free to ignore the object lock and can be
 * called with impunity. This is an important point: Every method that accesses
 * a critical shared resource must be synchronized or it won’t work right.
 * 
 */