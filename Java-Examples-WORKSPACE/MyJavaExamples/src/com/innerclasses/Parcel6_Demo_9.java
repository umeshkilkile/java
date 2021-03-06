package com.innerclasses;

/*
 * Below example shows how you can nest an inner class within any arbitrary scope:
 */
//Nesting a class within a scope.
public class Parcel6_Demo_9 {
	private void internalTracking(boolean b) {
		if (b) {
			class TrackingSlip {
				private String id;

				TrackingSlip(String s) {
					id = s;
				}

				String getSlip() {
					return id;
				}
			}
			TrackingSlip ts = new TrackingSlip("slip");
			String s = ts.getSlip();
		}
		// Can�t use it here! Out of scope:
		// ! TrackingSlip ts = new TrackingSlip("x");
	}

	public void track() {
		internalTracking(true);
	}

	public static void main(String[] args) {
		Parcel6_Demo_9 p = new Parcel6_Demo_9();
		p.track();
	}
}
/*
 * The class TrackingSlip is nested inside the scope of an if statement. This
 * does not mean that the class is conditionally created�it gets compiled along
 * with everything else. However, it�s not available outside the scope in which
 * it is defined. Other than that, it looks just like an ordinary class.
 */