package com_15.inheritance;

public interface EggLayer extends Animal_1 {
	@Override
	default public String identifyMyself() {
		return "I am able to lay eggs.";
	}
}
