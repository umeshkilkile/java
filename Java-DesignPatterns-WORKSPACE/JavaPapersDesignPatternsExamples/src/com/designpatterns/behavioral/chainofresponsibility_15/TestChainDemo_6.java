package com.designpatterns.behavioral.chainofresponsibility_15;

public class TestChainDemo_6 {
	public static void main(String[] args) {
		// configure Chain of Responsibility
		Chain_1 c1 = new NegativeProcessor_3();
		Chain_1 c2 = new ZeroProcessor_4();
		Chain_1 c3 = new PositiveProcessor_5();
		c1.setNext(c2);
		c2.setNext(c3);
		// calling chain of responsibility
		c1.process(new Number_2(99));
		c1.process(new Number_2(-30));
		c1.process(new Number_2(0));
		c1.process(new Number_2(100));

	}

}
