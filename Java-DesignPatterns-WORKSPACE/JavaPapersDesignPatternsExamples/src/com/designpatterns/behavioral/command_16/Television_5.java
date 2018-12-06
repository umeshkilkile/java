package com.designpatterns.behavioral.command_16;

public class Television_5 implements ConsumerElectronics_2 {
	public void on() {
		System.out.println("Television is on!");
	}

	@Override
	public void mute() {
		System.out.println("Television is muted!");
	}

}
