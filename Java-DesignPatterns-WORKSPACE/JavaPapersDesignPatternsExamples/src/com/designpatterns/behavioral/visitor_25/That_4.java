package com.designpatterns.behavioral.visitor_25;

public class That_4 implements Element_1 {
	public void accept(Visitor_2 v) {
		v.visit(this);
	}

	public String that() {
		return "That";
	}
}
