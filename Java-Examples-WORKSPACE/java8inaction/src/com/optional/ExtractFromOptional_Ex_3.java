package com.optional;

import java.util.Optional;

public class ExtractFromOptional_Ex_3 {
	public static void main(String[] args) {
		// Before optional
		Insurance insurance = new Insurance();
		String name = null;
		if (insurance != null) {
			name = insurance.getName();
		}
		System.out.println("name = " + name);

		/*
		 * Optional supports a map method for above pattern
		 */
		Optional<Insurance> optInsurance = Optional.ofNullable(insurance);
		Optional<String> name2 = optInsurance.map(Insurance::getName);
		System.out.println("name2 = " + name2);

		Insurance insurance2 = new Insurance();
		insurance2.setName("Appolo Munich");

		Car car = new Car();
		car.setInsurance(insurance2);

		Person person = new Person();
		person.setCar(car);
		String iname = getCarInsuranceName(person);
		System.out.println("iname = " + iname);

		// Person/Car/Insurance dereferencing chain using optionals
		Optional<Person1> optional = Optional.empty();
		String name3 = getCarInsuranceName2(optional);
		System.out.println("name3 = " + name3);
	}

	public static String getCarInsuranceName(Person person) {
		return person.getCar().getInsurance().getName();
	}

	public static String getCarInsuranceName2(Optional<Person1> person) {
		return person.flatMap(Person1::getCar).flatMap(Car1::getInsurance).map(Insurance1::getName).orElse("Unknown");
	}
}
