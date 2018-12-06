package com_32.aggregate_operations;

import java.util.List;

public class Demo_1 {
	public static void main(String[] args) {
		List<Person> roster = Person.createRoster();

		/*
		 * Ex-1 : The following example prints the name of all members contained
		 * in the collection roster with a for-each loop:
		 */

		/*
		 * for (Person p : roster) { System.out.println(p.getName()); }
		 */

		/*
		 * Ex-2 : The following example prints all members contained in the
		 * collection roster but with the aggregate operation forEach:
		 */
		// roster.stream().forEach(e -> System.out.println(e.getName()));

		/*
		 * Ex-3 : The following example prints the male members contained in the
		 * collection roster with a pipeline that consists of the aggregate
		 * operations filter and forEach:
		 */
		// roster.stream().filter(e -> e.getGender() ==
		// Person.Sex.MALE).forEach(e -> System.out.println(e.getName()));

		/*
		 * for (Person p : roster) { if (p.getGender() == Person.Sex.MALE) {
		 * System.out.println(p.getName()); } }
		 */

		/**
		 * Reduction operations Java 8
		 */
		/*
		 * The following example calculates the average age of all male members
		 * contained in the collection roster with a pipeline that consists of
		 * the aggregate operations filter, mapToInt, and average:
		 */
		double average = roster.stream().filter(p -> p.getGender() == Person.Sex.MALE).mapToInt(Person::getSalary).average().getAsDouble();
		System.out.println("Average : " + average);
		
		long sum = roster.stream().filter(p -> p.getGender() == Person.Sex.MALE).mapToLong(Person::getSalary).sum();
		System.out.println("Sum : " + sum);
		
		int min = roster.stream().filter(p -> p.getGender() == Person.Sex.MALE).mapToInt(Person::getSalary).min().getAsInt();
		System.out.println("Min : " + min);
		
		int max = roster.stream().filter(p -> p.getGender() == Person.Sex.MALE).mapToInt(Person::getSalary).max().getAsInt();
		System.out.println("Max : " + max);
		
		long count = roster.stream().filter(p -> p.getGender() == Person.Sex.MALE).mapToInt(Person::getSalary).count();
		System.out.println("Count : " + count);

	}
}
