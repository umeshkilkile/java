package com_9.classesandobjects;

/**
 * The following example, LocalClassExample, validates two phone numbers. It
 * defines the local class PhoneNumber in the method validatePhoneNumber:
 * 
 */

public class LocalClassExample_DEMO_8 {
	static String regularExpression = "[^0-9]";

	public static void validatePhoneNumber(final String phoneNumber1,
			final String phoneNumber2) {

		final int numberLength = 10;

		// Valid in JDK 8 and later:

		// int numberLength = 10;

		class PhoneNumber {

			String formattedPhoneNumber = null;

			PhoneNumber(String phoneNumber) {
				// numberLength = 7;
				String currentNumber = phoneNumber.replaceAll(
						regularExpression, "");// A local class has access to
												// the members of its enclosing
												// class (regularExpression)
				if (currentNumber.length() == numberLength) // A local class can
															// only access local
															// variables that
															// are declared
															// final
															// (numberLength)
					formattedPhoneNumber = currentNumber;
				else
					formattedPhoneNumber = null;
			}

			public String getNumber() {
				return formattedPhoneNumber;
			}

			// Valid in JDK 8 and later:

			public void printOriginalNumbers() {
				System.out.println("Original numbers are " + phoneNumber1
						+ " and " + phoneNumber2);
			}
		}

		PhoneNumber myNumber1 = new PhoneNumber(phoneNumber1);
		PhoneNumber myNumber2 = new PhoneNumber(phoneNumber2);

		// Valid in JDK 8 and later:

		// myNumber1.printOriginalNumbers();

		if (myNumber1.getNumber() == null)
			System.out.println("First number is invalid");
		else
			System.out.println("First number is " + myNumber1.getNumber());
		if (myNumber2.getNumber() == null)
			System.out.println("Second number is invalid");
		else
			System.out.println("Second number is " + myNumber2.getNumber());

	}

	public static void main(String... args) {
		validatePhoneNumber("123-456-7890", "456-7890");
	}
}
