package com_10.lambdaexpressions;

import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class RosterTest_DEMO_1 {

	interface CheckPerson {
		boolean test(Person p);
	}

	/**
	 * Approach 1: Create Methods that Search for Persons that Match One
	 * Characteristic
	 * 
	 * @param roster
	 * @param age
	 */
	public static void printPersonsOlderThan(List<Person> roster, int age) {
		for (Person p : roster) {
			if (p.getAge() >= age) {
				p.printPerson();
			}
		}
	}

	/**
	 * Approach 2: Create More Generalized Search Methods
	 * 
	 * @param roster
	 * @param low
	 * @param high
	 */

	public static void printPersonsWithinAgeRange(List<Person> roster, int low, int high) {
		for (Person p : roster) {
			if (low <= p.getAge() && p.getAge() < high) {
				p.printPerson();
			}
		}
	}

	/**
	 * Approach 3: Specify Search Criteria Code in a Local Class
	 * 
	 * Approach 4: Specify Search Criteria Code in an Anonymous Class Approach
	 * 5: Specify Search Criteria Code with a Lambda Expression
	 * 
	 * @param roster
	 * @param tester
	 */
	public static void printPersons(List<Person> roster, CheckPerson tester) {
		for (Person p : roster) {
			if (tester.test(p)) {
				p.printPerson();
			}
		}
	}

	/**
	 * Approach 6: Use Standard Functional Interfaces with Lambda Expressions
	 * 
	 * @param roster
	 * @param tester
	 */

	public static void printPersonsWithPredicate(List<Person> roster, Predicate<Person> tester) {
		for (Person p : roster) {
			if (tester.test(p)) {
				p.printPerson();
			}
		}
	}

	/**
	 * Approach 7: Use Lambda Expressions Throughout Your Application
	 * 
	 * @param roster
	 * @param tester
	 * @param block
	 */

	public static void processPersons(List<Person> roster, Predicate<Person> tester, Consumer<Person> block) {
		for (Person p : roster) {
			if (tester.test(p)) {
				block.accept(p);
			}
		}
	}

	/**
	 * Approach 7, second example
	 * 
	 * @param roster
	 * @param tester
	 * @param mapper
	 * @param block
	 */

	public static void processPersonsWithFunction(List<Person> roster, Predicate<Person> tester,
			Function<Person, String> mapper, Consumer<String> block) {
		for (Person p : roster) {
			if (tester.test(p)) {
				String data = mapper.apply(p);
				block.accept(data);
			}
		}
	}

	/**
	 * Approach 8: Use Generics More Extensively
	 * 
	 * @param source
	 * @param tester
	 * @param mapper
	 * @param block
	 */

	public static <X, Y> void processElements(Iterable<X> source, Predicate<X> tester, Function<X, Y> mapper,
			Consumer<Y> block) {
		for (X p : source) {
			if (tester.test(p)) {
				Y data = mapper.apply(p);
				block.accept(data);
			}
		}
	}

	public static void main(String... args) {

		List<Person> roster = Person.createRoster();

		System.out.println("All persons :");
		for (Person p : roster) {
			p.printPerson();
		}

		/**
		 * Approach 1: Create Methods that Search for Persons that Match One
		 * Characteristic
		 */
		System.out.println("\nPersons older than 20:");
		printPersonsOlderThan(roster, 20);
		System.out.println();

		/**
		 * Approach 2: Create More Generalized Search Methods
		 */
		System.out.println("Persons between the ages of 14 and 30:");
		printPersonsWithinAgeRange(roster, 14, 30);
		System.out.println();

		/**
		 * Approach 3: Specify Search Criteria Code in a Local Class
		 */
		System.out.println("Persons who are eligible for Selective Service (Local Class)");
		class CheckPersonEligibleForSelectiveService implements CheckPerson {
			public boolean test(Person p) {
				return p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25;
			}
		}
		printPersons(roster, new CheckPersonEligibleForSelectiveService());
		System.out.println();

		/**
		 * Approach 4: Specify Search Criteria Code in an Anonymous Class
		 */
		System.out.println("Persons who are eligible for Selective Service (anonymous class):");
		printPersons(roster, new CheckPerson() {
			public boolean test(Person p) {
				return p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25;
			}
		});
		System.out.println();

		/**
		 * Approach 5: Specify Search Criteria Code with a Lambda Expression
		 */
		System.out.println("Persons who are eligible for Selective Service (lambda expression):");
		printPersons(roster, (Person p) -> p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25);
		System.out.println();

		/**
		 * Approach 6: Use Standard Functional Interfaces with Lambda
		 * Expressions
		 */
		System.out.println("Persons who are eligible for Selective Service (with Predicate parameter):");
		printPersonsWithPredicate(roster,
				p -> p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25);
		System.out.println();

		/**
		 * Approach 7: Use Lambda Expressions Throughout Your Application
		 */
		System.out.println("Persons who are eligible for Selective Service (with Predicate and Consumer parameters):");
		processPersons(roster, p -> p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25,
				p -> p.printPerson());
		System.out.println();

		/**
		 * Approach 7, second example
		 */
		System.out.println(
				"Persons who are eligible for Selective Service (with Predicate, Function, and Consumer parameters):");
		processPersonsWithFunction(roster,
				p -> p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25, p -> p.getEmailAddress(),
				email -> System.out.println(email));
		System.out.println();

		/**
		 * Approach 8: Use Generics More Extensively
		 */
		System.out.println("Persons who are eligible for Selective Service (generic version):");
		processElements(roster, p -> p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25,
				p -> p.getEmailAddress(), email -> System.out.println(email));
		System.out.println();

		/**
		 * Approach 9: Use Bulk Data Operations That Accept Lambda Expressions
		 * as Parameters
		 */
		System.out.println("Persons who are eligible for Selective Service (with bulk data operations):");
		roster.stream().filter(p -> p.getGender() == Person.Sex.MALE && p.getAge() >= 18 && p.getAge() <= 25)
				.map(p -> p.getEmailAddress()).forEach(email -> System.out.println(email));

		System.out.println("----------");
		// Approach 10:The following example prints all members contained in the
		// collection roster but with the aggregate operation forEach:
		roster.stream().forEach(e -> System.out.println(e.getName()));

	}
}

/*
 * Note 1 : The CheckPerson interface is a functional interface. A functional
 * interface is any interface that contains only one abstract method. (A
 * functional interface may contain one or more default methods or static
 * methods.) Because a functional interface contains only one abstract method,
 * you can omit the name of that method when you implement it.
 * 
 * Note 2 : A stream is a sequence of elements. Unlike a collection, it is not a
 * data structure that stores elements. Instead, a stream carries values from a
 * source, such as collection, through a pipeline. A pipeline is a sequence of
 * stream operations, which in this example is filter- map-forEach. In addition,
 * aggregate operations typically accept lambda expressions as parameters,
 * enabling you to customize how they behave.
 */
