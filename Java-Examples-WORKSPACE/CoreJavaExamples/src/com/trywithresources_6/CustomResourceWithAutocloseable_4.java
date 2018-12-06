package com.trywithresources_6;

public class CustomResourceWithAutocloseable_4 implements AutoCloseable {

	/*
	 * To construct a custom resource that will be correctly handled by a
	 * try-with-resources block, the class should implement the Closeable or
	 * AutoCloseable interfaces, and override the close method:
	 */
	@Override
	public void close() throws Exception {
		// Do clean up work here
		System.out.println("CustomResourceWithAutocloseable.close()");
	}

}
