package com_37.threads;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

//Using CyclicBarriers.

public class HorseRace_CyclicBarrier_DEMO_52 {
	static final int FINISH_LINE = 75;
	private List<Horse> horses = new ArrayList<Horse>();
	private ExecutorService exec = Executors.newCachedThreadPool();
	private CyclicBarrier barrier;

	public HorseRace_CyclicBarrier_DEMO_52(int nHorses, final int pause) {
		barrier = new CyclicBarrier(nHorses, new Runnable() {
			public void run() {
				StringBuilder s = new StringBuilder();
				for (int i = 0; i < FINISH_LINE; i++)
					s.append("="); // The fence on the racetrack
				System.out.println(s);
				for (Horse horse : horses)
					System.out.println(horse.tracks());
				for (Horse horse : horses)
					if (horse.getStrides() >= FINISH_LINE) {
						System.out.println(horse + "won!");
						exec.shutdownNow();
						return;
					}
				try {
					TimeUnit.MILLISECONDS.sleep(pause);
				} catch (InterruptedException e) {
					System.out.println("barrier-action sleep interrupted");
				}
			}
		});
		for (int i = 0; i < nHorses; i++) {
			Horse horse = new Horse(barrier);
			horses.add(horse);
			exec.execute(horse);
		}
	}

	public static void main(String[] args) {
		int nHorses = 7;
		int pause = 200;
		if (args.length > 0) { // Optional argument
			int n = new Integer(args[0]);
			nHorses = n > 0 ? n : nHorses;
		}
		if (args.length > 1) { // Optional argument
			int p = new Integer(args[1]);
			pause = p > -1 ? p : pause;
		}
		new HorseRace_CyclicBarrier_DEMO_52(nHorses, pause);
	}
}
/*
 * CyclicBarrier
 * 
 * - A CyclicBarrier is used in situations where you want to create a group of
 * tasks to perform work in parallel, and then wait until they are all finished
 * before moving on to the next step (something like join( ), it would seem). It
 * brings all the parallel tasks into alignment at the barrier so you can move
 * forward in unison. This is very similar to the CountDownLatch, except that a
 * CountDownLatch is a one-shot event, whereas a CyclicBarrier can be reused
 * over and over.
 * 
 * - A CyclicBarrier can be given a "barrier action," which is a Runnable that
 * is automatically executed when the count reaches zero�this is another
 * distinction between CyclicBarrier and CountdownLatch. Here, the barrier
 * action is created as an anonymous class that is handed to the constructor of
 * CyclicBarrier.
 * 
 * - I tried having each horse print itself, but then the order of display was
 * dependent on the task manager. The CyclicBarrier allows each horse to do
 * whatever it needs to do in order to move forward, and then it has to wait at
 * the barrier until all the other horses have moved forward. When all horses
 * have moved, the CyclicBarrier automatically calls its Runnable barrieraction
 * task to display the horses in order, along with the fence.
 * 
 * - Once all the tasks have passed the barrier, it is automatically ready for
 * the next round.
 * 
 * - To give it the effect of very simple animation, make the size of your
 * console window small enough so that only the horses show.
 */