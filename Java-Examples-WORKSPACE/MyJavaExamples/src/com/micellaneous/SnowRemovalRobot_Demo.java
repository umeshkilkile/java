package com.micellaneous;

import java.util.Arrays;
import java.util.List;

public class SnowRemovalRobot_Demo implements Robot {
	private String name;

	public SnowRemovalRobot_Demo(String name) {
		this.name = name;
	}

	public String name() {
		return name;
	}

	public String model() {
		return "SnowBot Series 11";
	}

	public List<Operation> operations() {
		return Arrays.asList(new Operation() {
			public String description() {
				return name + " can shovel snow";
			}

			public void command() {
				System.out.println(name + " shoveling snow");
			}
		}, new Operation() {
			public String description() {
				return name + " can chip ice";
			}

			public void command() {
				System.out.println(name + " chipping ice");
			}
		}, new Operation() {
			public String description() {
				return name + " can clear the roof";
			}

			public void command() {
				System.out.println(name + " clearing roof");
			}
		});
	}

	public static void main(String[] args) {
		Robot.Test.test(new SnowRemovalRobot_Demo("Slusher"));
	}
}