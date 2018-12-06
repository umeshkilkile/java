package com.optional;

import java.util.Optional;

public class Optional_Ex_5 {
	public static void main(String[] args) {
		// Old way. Checking is insurance is of type ICICI
		Insurance insurance = new Insurance();
		if (insurance != null && "ICICI".equals(insurance.getName())) {
			System.out.println("ok");
		}

		// This pattern can be rewritten using the filter method on an Optional
		// object, as follows:
		Insurance insurance2 = new Insurance();
		Optional<Insurance> optInsurance = Optional.empty();
	/*	optInsurance.filter(insurance -> "CambridgeInsurance".equals(insurance.getName()))
				.ifPresent(x -> System.out.println("ok"));*/
	}

}
