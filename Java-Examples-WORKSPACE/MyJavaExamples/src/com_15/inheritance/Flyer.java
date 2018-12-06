package com_15.inheritance;

public interface Flyer {
	default public String identifyMyself() {
		return "I am able to fly.";
	}
}
