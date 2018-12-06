package Item30;

/*
 * Item 30: Use enums instead of int constants
 */

public class EnumDemo_1 {
	public static void main(String[] args) {
		Apple apple = Apple.FUJI;
		System.out.println(apple);
		System.out.println(apple.ordinal());
		System.out.println(apple.toString());
		System.out.println(apple.valueOf("FUJI"));
	}
}
