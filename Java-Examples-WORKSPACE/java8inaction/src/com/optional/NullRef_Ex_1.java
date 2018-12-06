package com.optional;

public class NullRef_Ex_1 {
	public static void main(String[] args) {
		/*
		 * The call to getInsurance will return the insurance of a null
		 * reference, which will result in a NullPointerException at run-time
		 * and stop your program from running further.
		 */
		/*
		 * String insuranceName = getCarInsuranceName(new Person());
		 * System.out.println("insuranceName = " + insuranceName);
		 */

		/*
		 * Null-safe attempt 1: deep doubts
		 */
		String insuranceName2 = getCarInsuranceName_v2(new Person());
		System.out.println("insuranceName2 = " + insuranceName2);

		/*
		 * Null-safe attempt 2: too many exits
		 */
		String insuranceName3 = getCarInsuranceName_v3(new Person());
		System.out.println("insuranceName3 = " + insuranceName3);
	}

	public static String getCarInsuranceName(Person person) {
		return person.getCar().getInsurance().getName();
	}

	/*
	 * Null-safe attempt 1: deep doubts
	 */
	public static String getCarInsuranceName_v2(Person person) {
		/*
		 * Each null check increases the nesting level of the remaining part of
		 * the invocation chain
		 */
		if (person != null) {
			Car car = person.getCar();
			if (car != null) {
				Insurance insurance = car.getInsurance();
				if (insurance != null) {
					return insurance.getName();
				}
			}
		}
		return "Unknown";
	}

	/*
	 * Null-safe attempt 2: too many exits
	 */
	public static String getCarInsuranceName_v3(Person person) {
		/*
		 * Each null check adds a further exit point
		 */
		if (person == null) {
			return "Unknown";
		}

		Car car = person.getCar();
		if (car != null) {
			return "Unknown";
		}

		Insurance insurance = car.getInsurance();
		if (insurance != null) {
			return "Unknown";
		}
		return insurance.getName();
	}

}
