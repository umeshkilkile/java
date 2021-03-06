package com_37.threads;

//Using explicit Lock objects to create critical sections.
public class ExplicitCriticalSection_DEMO_32 {
	public static void main(String[] args) throws Exception {
		PairManager pman1 = new ExplicitPairManager1(), pman2 = new ExplicitPairManager2();
		CriticalSection_DEMO_31.testApproaches(pman1, pman2);
	}
}
/*
 * This reuses most of CriticalSection.java and creates new PairManager types
 * that use explicit Lock objects. ExplicitPairManager2 shows the creation of a
 * critical section using a Lock object; the call to store( ) is outside of the
 * critical section.
 * 
 * - A synchronized block must be given an object to synchronize upon, and
 * usually the most sensible object to use is just the current object that the
 * method is being called for: synchronized(this), which is the approach taken
 * in PairManager2. That way, when the lock is acquired for the synchronized
 * block, other synchronized methods and critical sections in the object cannot
 * be called. So the effect of the critical section, when synchronizing on this,
 * is simply to reduce the scope of synchronization.
 */