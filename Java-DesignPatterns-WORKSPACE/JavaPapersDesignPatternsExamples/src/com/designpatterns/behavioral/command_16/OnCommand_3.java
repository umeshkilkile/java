package com.designpatterns.behavioral.command_16;

public class OnCommand_3 implements Command_1 {

	private ConsumerElectronics_2 ce;

	@Override
	public void execute() {
		ce.on();

	}

	public OnCommand_3(ConsumerElectronics_2 ce) {
		this.ce = ce;
	}

}
