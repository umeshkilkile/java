package com.designpatterns.behavioral.visitor_25;

public class UpVisitor_6 implements Visitor_2 {
	public void visit(This_3 e) {
		System.out.println("do Up on " + e.thiss());
	}

	public void visit(That_4 e) {
		System.out.println("do Up on " + e.that());
	}

	public void visit(TheOther_5 e) {
		System.out.println("do Up on " + e.theOther());
	}
}
