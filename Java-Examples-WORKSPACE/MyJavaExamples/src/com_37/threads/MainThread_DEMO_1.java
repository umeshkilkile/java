package com_37.threads;

public class MainThread_DEMO_1 {
	public static void main(String[] args) {
		LiftOff launch = new LiftOff();
		/*
		 * The task’s run( ) is not driven by a separate thread; it is simply
		 * called directly in main( ) (actually, this is using a thread: the one
		 * that is always allocated for main( )):
		 */
		launch.run();
	}
}
