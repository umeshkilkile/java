package com.designpatterns.behavioral.visitor_25;

public class DownVisitor_7 implements Visitor_2 {
	public void visit(This_3 e) {
		System.out.println("do Down on " + e.thiss());
	}

	public void visit(That_4 e) {
		System.out.println("do Down on " + e.that());
	}

	public void visit(TheOther_5 e) {
		System.out.println("do Down on " + e.theOther());
	}
}
