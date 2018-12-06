package com_37.threads;

public class SerialNumberGenerator_DEMO_27 {
	private static volatile int serialNumber = 0;

	public static int nextSerialNumber() {
		return serialNumber++; // Not thread-safe
	}
}

/*
 * - A Java increment is not atomic and involves both a read and a write, so
 * there’s room for threading problems even in such a simple operation.
 * 
 * - As you shall see, volatility isn’t actually the issue here; the real
 * problem is that nextSerialNumber( ) accesses a shared, mutable value without
 * synchronizing.
 * 
 * - The serialNumber field is volatile because it is possible for each thread
 * to have a local stack and maintain copies of some variables there. If you
 * define a variable as volatile, it tells the compiler not to do any
 * optimizations that would remove reads and writes that keep the field in exact
 * synchronization with the local data in the threads. In effect, reads and
 * writes go directly to memory, and are not cached, volatile also restricts
 * compiler reordering of accesses during optimization. However, volatile
 * doesn’t affect the fact that an increment isn’t an atomic operation.
 * 
 * - Basically, you should make a field volatile if that field could be
 * simultaneously accessed by multiple tasks, and at least one of those accesses
 * is a write.For example, a field that is used as a flag to stop a task must be
 * declared volatile; otherwise, that flag could be cached in a register, and
 * when you make changes to the flag from outside the task, the cached value
 * wouldn’t be changed and the task wouldn’t know it should stop.
 */
