package com.designpatterns.creational.doubleton;

/*
 * DoubleTon design pattern.
 * The same can be converted to triple with replacing all 2 with 3 and so on...
 */
public class DoubleTon {
	private static DoubleTon[] doubleTon;
	private static int index;

	public static DoubleTon getInstance() {
		if (doubleTon == null) {
			synchronized (DoubleTon.class) {
				doubleTon = new DoubleTon[2];
				doubleTon[0] = new DoubleTon();
				doubleTon[1] = new DoubleTon();
			}
		}
		return doubleTon[index++ % 2];
	}
}
