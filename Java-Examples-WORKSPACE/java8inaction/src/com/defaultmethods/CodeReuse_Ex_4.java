package com.defaultmethods;

public class CodeReuse_Ex_4 {
	public static void main(String[] args) {
		Monster m = new Monster();

		/*
		 * Calling rotateBy from Rotatable
		 */
		m.rotateBy(180);

		/*
		 * Calling moveVertically from Moveable
		 */
		m.moveVertically(10);

		System.out.println(m);
		
		Sun sun = new Sun();
		sun.rotateBy(10);
	}
}
