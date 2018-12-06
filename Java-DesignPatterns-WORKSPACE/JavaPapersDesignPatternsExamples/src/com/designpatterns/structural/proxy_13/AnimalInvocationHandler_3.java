package com.designpatterns.structural.proxy_13;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AnimalInvocationHandler_3 implements InvocationHandler {

	private Object realSubject = null;

	public AnimalInvocationHandler_3(Object realSubject) {
		this.realSubject = realSubject;
	}

	@Override
	public Object invoke(Object proxy, Method m, Object[] args) {
		Object result = null;
		try {
			result = m.invoke(realSubject, args);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return result;
	}
}
