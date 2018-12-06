package com.designpatterns.behavioral.command_16;

public class SoundSystem_6 implements ConsumerElectronics_2 {
	public void on() {
		System.out.println("Sound system is on!");
	}

	@Override
	public void mute() {
		System.out.println("Sound system is muted!");
	}

}
