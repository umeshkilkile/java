package com_37.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Restaurant_DEMO_44 {
	Meal meal;
	ExecutorService exec = Executors.newCachedThreadPool();
	WaitPerson waitPerson = new WaitPerson(this);
	Chef chef = new Chef(this);

	public Restaurant_DEMO_44() {
		exec.execute(chef);
		exec.execute(waitPerson);
	}

	public static void main(String[] args) {
		new Restaurant_DEMO_44();
	}
}
/*
 * Producers and consumers
 * 
 * - Consider a restaurant that has one chef and one waitperson. The waitperson
 * must wait for the chef to prepare a meal. When the chef has a meal ready, the
 * chef notifies the waitperson, who then gets and delivers the meal and goes
 * back to waiting. This is an example of task cooperation: The chef represents
 * the producer, and the waitperson represents the consumer. Both tasks must
 * handshake with each other as meals are produced and consumed, and the system
 * must shut down in an orderly fashion. Here is the story modeled in above
 * code:
 * 
 * - The Restaurant is the focal point for both the WaitPerson and the Chef.
 * Both must know what Restaurant they are working for because they must place
 * or fetch the meal from the restaurant’s "meal window," restaurant.meal. In
 * run( ), the WaitPerson goes into wait( ) mode, stopping that task until it is
 * woken up with a notifyAll( ) from the Chef. Since this is a very simple
 * program, we know that only one task will be waiting on the WaitPerson’s lock:
 * the WaitPerson task itself. For this reason, it’s theoretically possible to
 * call notify( ) instead of notifyAll( ). However, in more complex situations,
 * multiple tasks may be waiting on a particular object lock, so you don’t know
 * which task should be awakened. Thus, it’s safer to call notifyAll( ), which
 * wakes up all the tasks waiting on that lock. Each task must then decide
 * whether the notification is relevant.
 * 
 * - Once the Chef delivers a Meal and notifies the WaitPerson, the Chef waits
 * until the WaitPerson collects the meal and notifies the Chef, who can then
 * produce the next Meal.
 * 
 * - Notice that the wait( ) is wrapped in a while( ) statement that is testing
 * for the same thing that is being waited for. This seems a bit strange at
 * first—if you’re waiting for an order, once you wake up, the order must be
 * available, right? As noted earlier, the problem is that in a concurrent
 * application, some other task might swoop in and grab the order while the
 * WaitPerson is waking up. The only safe approach is to always use the
 * following idiom for a wait( ) (within proper synchronization, of course, and
 * programming against the possibility of missed signals):
 * 
 * while(conditionlsNotMet) wait();
 * 
 * - This guarantees that the condition will be met before you get out of the
 * wait loop, and if you have been notified of something that doesn’t concern
 * the condition (as can happen with notifyAll( )), or the condition changes
 * before you get fully out of the wait loop, you are guaranteed to go back into
 * waiting.
 * 
 * - Observe that the call to notifyAll( ) must first capture the lock on
 * waitPerson. The call to wait( ) in WaitPerson.run( ) automatically releases
 * the lock, so this is possible. Because the lock must be owned in order for
 * notifyAll( ) to be called, it’s guaranteed that two tasks trying to call
 * notifyAll( ) on one object won’t step on each other’s toes.
 * 
 * - Both run( ) methods are designed for orderly shutdown by enclosing the
 * entire run( ) with a try block. The catch clause closes right before the
 * closing brace of the run( ) method, so if the task receives an
 * InterruptedException, it ends immediately after catching the exception.
 * 
 * - In Chef, note that after calling shutdownNow( ) you could simply return
 * from run( ), and normally that’s what you should do. However, it’s a little
 * more interesting to do it this way. Remember that shutdownNow( ) sends an
 * interrupt( ) to all the tasks that the ExecutorService started. But in the
 * case of the Chef, the task doesn’t shut down immediately upon getting the
 * interrupt( ), because the interrupt only throws InterruptedException as the
 * task attempts to enter an (interruptible) blocking operation. Thus, you’ll
 * see "Order up!" displayed first, and then the InterruptedException is thrown
 * when the Chef attempts to call sleep( ). If you remove the call to sleep( ),
 * the task will get to the top of the run( ) loop and exit because of the
 * Thread.interrupted( ) test, without throwing an exception.
 */
