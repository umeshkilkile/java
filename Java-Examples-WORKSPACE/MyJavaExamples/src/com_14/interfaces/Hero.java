package com_14.interfaces;

class Hero extends ActionCharacter implements CanFight, CanSwim, CanFly {
	public void swim() {
		System.out.println("Hero.swim()");
	}

	public void fly() {
		System.out.println("Hero.fly()");
	}
}
