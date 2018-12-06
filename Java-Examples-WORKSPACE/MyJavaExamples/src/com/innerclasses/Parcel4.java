package com.innerclasses;

class Parcel4 {
	/*
	 * The inner class PContents is private, so nothing but Parcel4 can access
	 * it. Normal (non-inner) classes cannot be made private or protected; they
	 * may only be given public or package access.
	 */
	private class PContents implements Contents {
		private int i = 11;

		@Override
		public int value() {
			return i;
		}
	}

	/*
	 * PDestination is protected, so nothing but Parcel4, classes in the same
	 * package (since protected also gives package access), and the inheritors
	 * of Parcel4 can access PDestination. This means that the client programmer
	 * has restricted knowledge and access to these members.
	 */
	protected class PDestination implements Destination {
		private String label;

		private PDestination(String whereTo) {
			label = whereTo;
		}

		@Override
		public String readLabel() {
			return label;
		}
	}

	public Destination destination(String s) {
		return new PDestination(s);
	}

	public Contents contents() {
		return new PContents();
	}
}
