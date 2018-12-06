package com.designpatterns.behavioral.command_16;

public class Button_7 {
	Command_1 c;

	public Button_7(Command_1 c) {
		this.c = c;
	}

	public void click() {
		c.execute();
	}

}
