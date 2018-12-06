package com.designpatterns.structural.proxy_13;

import java.lang.reflect.Proxy;

public class ProxyExampleDemo {
	public static void main(String[] args) {
		Animal_1 realSubject = new Lion_2();
		Animal_1 proxy = (Animal_1) Proxy.newProxyInstance(realSubject.getClass().getClassLoader(),
				realSubject.getClass().getInterfaces(), new AnimalInvocationHandler_3(realSubject));
		proxy.getSound();
	}

}
