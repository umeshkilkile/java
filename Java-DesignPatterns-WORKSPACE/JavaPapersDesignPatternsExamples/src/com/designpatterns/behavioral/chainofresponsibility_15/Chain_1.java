package com.designpatterns.behavioral.chainofresponsibility_15;

public interface Chain_1 {
	public abstract void setNext(Chain_1 nextInChain);

	public abstract void process(Number_2 request);
}
