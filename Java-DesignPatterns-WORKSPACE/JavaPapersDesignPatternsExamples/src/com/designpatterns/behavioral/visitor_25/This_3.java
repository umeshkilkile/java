package com.designpatterns.behavioral.visitor_25;

public class This_3 implements Element_1 {
	// 1. accept(Visitor) implementation
	public void accept(Visitor_2 v) {
		v.visit(this);
	}

	public String thiss() {
		return "This";
	}
}
