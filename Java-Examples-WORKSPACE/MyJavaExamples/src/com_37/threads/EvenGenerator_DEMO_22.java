package com_37.threads;

public class EvenGenerator_DEMO_22 extends IntGenerator {
	private int currentEvenValue = 0;

	public int next() {
		++currentEvenValue; // Danger point here!
		++currentEvenValue;
		return currentEvenValue;
	}

	public static void main(String[] args) {
		EvenChecker.test(new EvenGenerator_DEMO_22());
	}

}
/*
 * - This program will eventually fail because the EvenChecker tasks are able to
 * access the information in EvenGenerator while it�s in an "incorrect" state.
 * 
 * - This example shows a fundamental problem when you are using threads: You
 * never know when a thread might be run. Imagine sitting at a table with a
 * fork, about to spear the last piece of food on a platter, and as your fork
 * reaches for it, the food suddenly vanishes�because your thread was suspended
 * and another diner came in and ate the food. That�s the problem you�re dealing
 * with when writing concurrent programs. For concurrency to work, you need some
 * way to prevent two tasks from accessing the same resource, at least during
 * critical periods.
 * 
 * - Preventing this kind of collision is simply a matter of putting a lock on a
 * resource when one task is using it. The first task that accesses a resource
 * must lock it, and then the other tasks cannot access that resource until it
 * is unlocked, at which time another task locks and uses it, and so on.
 * 
 * - To solve the problem of thread collision, virtually all concurrency schemes
 * serialize access to shared resources. This means that only one task at a time
 * is allowed to access the shared resource. This is ordinarily accomplished by
 * putting a clause around a piece of code that only allows one task at a time
 * to pass through that piece of code. Because this clause produces mutual
 * exclusion, a common name for such a mechanism is mutex.
 * 
 * E.g., - Consider the bathroom in your house; multiple people (tasks driven by
 * threads) may each want to have exclusive use of the bathroom (the shared
 * resource). To access the bathroom, a person knocks on the door to see if it�s
 * available. If so, they enter and lock the door. Any other task that wants to
 * use the bathroom is "blocked" from using it, so those tasks wait at the door
 * until the bathroom is available.
 * 
 * - The analogy breaks down a bit when the bathroom is released and it comes
 * time to give access to another task. There isn�t actually a line of people,
 * and we don�t know for sure who gets the bathroom next, because the thread
 * scheduler isn�t deterministic that way. Instead, it�s as if there is a group
 * of blocked tasks milling about in front of the bathroom, and when the task
 * that has locked the bathroom unlocks it and emerges, the one that happens to
 * be nearest the door at the moment goes in. As noted earlier, suggestions can
 * be made to the thread scheduler via yield( ) and setPriority( ), but these
 * suggestions may not have much of an effect, depending on your platform and
 * JVM implementation.
 * 
 * What is mutex(Mutual Exlusion)?
 * 
 * - Mutual exclusion is a property of concurrency control, which is instituted
 * for the purpose of preventing race conditions; it is the requirement that one
 * thread of execution never enters its critical section at the same time that
 * another concurrent thread of execution enters its own critical section.
 * 
 * Race condition - This problem (called a race condition) can be avoided by
 * using the requirement of mutual exclusion to ensure that simultaneous updates
 * to the same part of the piece of code cannot occur.
 */