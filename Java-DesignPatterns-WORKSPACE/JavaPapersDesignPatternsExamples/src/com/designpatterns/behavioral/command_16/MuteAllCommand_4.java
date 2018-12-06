package com.designpatterns.behavioral.command_16;

import java.util.List;

public class MuteAllCommand_4 implements Command_1 {

	List<ConsumerElectronics_2> ceList;

	public MuteAllCommand_4(List ceList) {
		this.ceList = ceList;
	}

	@Override
	public void execute() {
		for (ConsumerElectronics_2 ce : ceList) {
			ce.mute();
		}

	}

}
