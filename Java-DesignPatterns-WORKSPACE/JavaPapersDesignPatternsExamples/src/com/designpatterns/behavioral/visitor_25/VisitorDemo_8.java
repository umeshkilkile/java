package com.designpatterns.behavioral.visitor_25;

public class VisitorDemo_8 {
	public static Element_1[] list = { new This_3(), new That_4(), new TheOther_5() };

	// 4. Client creates "visitor" objects and passes each to accept() calls
	public static void main(String[] args) {
		UpVisitor_6 up = new UpVisitor_6();
		DownVisitor_7 down = new DownVisitor_7();
		for (int i = 0; i < list.length; i++) {
			list[i].accept(up);
		}
		for (int i = 0; i < list.length; i++) {
			list[i].accept(down);
		}
	}
}
