package com.designpatterns.behavioral.chainofresponsibility_15;

public class PositiveProcessor_5 implements Chain_1 {

	private Chain_1 nextInChain;

	@Override
	public void setNext(Chain_1 nextInChain) {
		this.nextInChain = nextInChain;

	}

	@Override
	public void process(Number_2 request) {
		if (request.getNumber() > 0) {
			System.out.println("PositiveProcessor : " + request.getNumber());
		} else {
			System.out.println("Passing from PositiveProcessor to next");
			nextInChain.process(request);
		}

	}

}
