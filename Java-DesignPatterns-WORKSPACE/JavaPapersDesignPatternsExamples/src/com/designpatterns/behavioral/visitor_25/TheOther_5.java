package com.designpatterns.behavioral.visitor_25;

public class TheOther_5 implements Element_1 {
	public void accept(Visitor_2 v) {
		v.visit(this);
	}

	public String theOther() {
		return "TheOther";
	}
}
