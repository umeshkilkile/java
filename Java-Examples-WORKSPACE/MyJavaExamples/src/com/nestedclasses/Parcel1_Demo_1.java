package com.nestedclasses;

public class Parcel1_Demo_1 {
	private static class ParcelContents implements Contents {
		private int i = 11;

		@Override
		public int value() {
			return i;
		}
	}

	protected static class ParcelDestination implements Destination {
		private String label;

		private ParcelDestination(String whereTo) {
			label = whereTo;
		}

		@Override
		public String readLabel() {
			return label;
		}

		// Nested classes can contain other static elements:
		public static void f() {
		}

		static int x = 10;

		static class AnotherLevel {
			public static void f() {
			}

			static int x = 10;
		}
	}

	public static Destination destination(String s) {
		return new ParcelDestination(s);
	}

	public static Contents contents() {
		return new ParcelContents();
	}

	public static void main(String[] args) {
		Contents c = contents();
		int val = c.value();
		System.out.println(val);
		Destination d = destination("Tasmania");
		String dest = d.readLabel();
		System.out.println(dest);

	}
}

/*
 * - In main( ), no object of Parcel11 is necessary; instead, you use the normal
 * syntax for selecting a static member to call the methods that return
 * references to Contents and Destination.
 * 
 * - As you�ve seen earlier in this chapter, in an ordinary (non-static) inner
 * class, the link to the outer-class object is achieved with a special this
 * reference. A nested class does not have a special this reference, which makes
 * it analogous to a static method.
 */