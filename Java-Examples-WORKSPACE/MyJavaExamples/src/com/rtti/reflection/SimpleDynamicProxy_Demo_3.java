package com.rtti.reflection;

import java.lang.reflect.Proxy;

public class SimpleDynamicProxy_Demo_3 {
	public static void consumer(Interface iface) {
		iface.doSomething();
		iface.somethingElse("bonobo");
	}

	public static void main(String[] args) {
		RealObject real = new RealObject();
		consumer(real);
		System.out.println("-------------------------------------");
		// Insert a proxy and call again:
		Interface proxy = (Interface) Proxy.newProxyInstance(Interface.class.getClassLoader(),
				new Class[] { Interface.class }, new DynamicProxyHandler(real));
		consumer(proxy);
	}
}
/*
 * - You create a dynamic proxy by calling the static method
 * Proxy.newProxyInstance( ), which requires a class loader (you can generally
 * just hand it a class loader from an object that has already been loaded), a
 * list of interfaces (not classes or abstract classes) that you wish the proxy
 * to implement, and an implementation of the interface InvocationHandler. The
 * dynamic proxy will redirect all calls to the invocation handler, so the
 * constructor for the invocation handler is usually given the reference to the
 * "real" object so that it can forward requests once it performs its
 * intermediary task.
 * 
 * - The invoke( ) method is handed the proxy object, in case you need to
 * distinguish where the request came from�but in many cases you won�t care.
 * However, be careful when calling methods on the proxy inside invoke( ),
 * because calls through the interface are redirected through the proxy.
 */