package com_37.threads;

//Interrupting a blocked NIO channel.

import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.channels.SocketChannel;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public class NIOInterruption_DEMO_38 {
	public static void main(String[] args) throws Exception {
		ExecutorService exec = Executors.newCachedThreadPool();
		ServerSocket server = new ServerSocket(8088);
		InetSocketAddress isa = new InetSocketAddress("localhost", 8088);
		SocketChannel sc1 = SocketChannel.open(isa);
		SocketChannel sc2 = SocketChannel.open(isa);
		Future<?> f = exec.submit(new NIOBlocked(sc1));
		exec.execute(new NIOBlocked(sc2));
		exec.shutdown();
		TimeUnit.SECONDS.sleep(1);
		// Produce an interrupt via cancel:
		f.cancel(true);
		TimeUnit.SECONDS.sleep(1);
		// Release the block by closing the channel:
		sc2.close();
	}
}
/*
 * As shown, you can also close the underlying channel to release the block,
 * although this should rarely be necessary. Note that using execute( ) to start
 * both tasks and calling e.shutdownNow( ) will easily terminate everything;
 * capturing the Future in the example above was only necessary to send the
 * interrupt to one thread and not the other.
 */