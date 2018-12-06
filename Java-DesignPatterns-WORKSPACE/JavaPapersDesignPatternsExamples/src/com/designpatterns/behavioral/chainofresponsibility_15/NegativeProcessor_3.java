package com.designpatterns.behavioral.chainofresponsibility_15;

public class NegativeProcessor_3 implements Chain_1 {

	private Chain_1 nextInChain;

	@Override
	public void setNext(Chain_1 nextInChain) {
		this.nextInChain = nextInChain;
	}

	@Override
	public void process(Number_2 request) {
		if (request.getNumber() < 0) {
			System.out.println("NegativeProcessor : " + request.getNumber());
		} else {
			System.out.println("Passing from NegativeProcessor to next");
			nextInChain.process(request);
		}
	}

}
