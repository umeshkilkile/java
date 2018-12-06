package com_37.threads;

//Interrupting a blocked task by closing the underlying resource.
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class CloseResource_DEMO_37 {
	public static void main(String[] args) throws Exception {
		ExecutorService exec = Executors.newCachedThreadPool();
		ServerSocket server = new ServerSocket(8080);
		InputStream socketInput = new Socket("localhost", 8080).getInputStream();
		exec.execute(new IOBlocked(socketInput));
		exec.execute(new IOBlocked(System.in));
		TimeUnit.MILLISECONDS.sleep(100);
		System.out.println("Shutting down all threads");
		exec.shutdownNow();
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Closing " + socketInput.getClass().getName());
		socketInput.close(); // Releases blocked thread
		TimeUnit.SECONDS.sleep(1);
		System.out.println("Closing " + System.in.getClass().getName());
		System.in.close(); // Releases blocked thread
	}
}
/*
 * After shutdownNow( ) is called, the delays before calling close( ) on the two
 * input streams emphasize that the tasks unblock once the underlying resource
 * is closed. It�s interesting to note that the interrupt( ) appears when you
 * are closing the Socket but not when closing System.in.
 */