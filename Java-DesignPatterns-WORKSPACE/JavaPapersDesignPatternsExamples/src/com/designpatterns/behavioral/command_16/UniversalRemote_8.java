package com.designpatterns.behavioral.command_16;

public class UniversalRemote_8 {
	public static ConsumerElectronics_2 getActiveDevice() {
		// here we will have a complex electronic circuit :-)
		// that will maintain current device
		Television_5 tv = new Television_5();
		return tv;
	}

}
