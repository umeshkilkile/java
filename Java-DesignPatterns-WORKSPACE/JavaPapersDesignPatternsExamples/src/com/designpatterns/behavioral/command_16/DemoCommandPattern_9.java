package com.designpatterns.behavioral.command_16;

import java.util.ArrayList;
import java.util.List;

public class DemoCommandPattern_9 {
	public static void main(String args[]) {
		// OnCommand is instantiated based on active device supplied by Remote
		ConsumerElectronics_2 ce = UniversalRemote_8.getActiveDevice();
		OnCommand_3 onCommand = new OnCommand_3(ce);
		Button_7 onButton = new Button_7(onCommand);
		onButton.click();

		Television_5 tv = new Television_5();
		SoundSystem_6 ss = new SoundSystem_6();
		List all = new ArrayList();
		all.add(tv);
		all.add(ss);
		MuteAllCommand_4 muteAll = new MuteAllCommand_4(all);
		Button_7 muteAllButton = new Button_7(muteAll);
		muteAllButton.click();
	}

}
