package com_32.aggregate_operations;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ReductionExamples_2 {

	public static void main(String... args) {

		// Create sample data

		List<Person> roster = Person.createRoster();

		System.out.println("Contents of roster:");

		roster.stream().forEach(p -> p.printPerson());

		// 1. Average age of male members, average operation

		double average = roster.stream().filter(p -> p.getGender() == Person.Sex.MALE).mapToInt(Person::getSalary).average().getAsDouble();

		System.out.println("\nAverage salary (bulk data operations): " + average);

		// 2. Sum of ages with sum operation

		Integer totalSal = roster.stream().mapToInt(Person::getSalary).sum();

		System.out.println("\nSum of Salary (sum operation): " + totalSal);

		// 3. Sum of ages with reduce(identity, accumulator)

		Integer totalSalReduce = roster.stream().map(Person::getSalary).reduce(0, (a, b) -> a + b);

		System.out.println("\nSum of ages with reduce(identity, accumulator): " + totalSalReduce);

		// 4. Average of male members with collect operation

		Averager averageCollect = roster.stream().filter(p -> p.getGender() == Person.Sex.MALE).map(Person::getSalary).collect(Averager::new, Averager::accept, Averager::combine);

		System.out.println("\nAverage Salary of male members: " + averageCollect.average());

		// 5. Names of male members with collect operation

		System.out.println("\nNames of male members with collect operation: ");
		List<String> namesOfMaleMembersCollect = roster.stream().filter(p -> p.getGender() == Person.Sex.MALE).map(p -> p.getName()).collect(Collectors.toList());

		namesOfMaleMembersCollect.stream().forEach(p -> System.out.println(p));

		// 6. Group members by gender

		System.out.println("\nMembers by gender:");
		Map<Person.Sex, List<Person>> byGender = roster.stream().collect(Collectors.groupingBy(Person::getGender));

		List<Map.Entry<Person.Sex, List<Person>>> byGenderList = new ArrayList<>(byGender.entrySet());

		byGenderList.stream().forEach(
				e -> {
					System.out.println("Gender: " + e.getKey());
					e.getValue().stream().map(Person::getName).forEach(f -> System.out.println(f));
				});

		// 7. Group names by gender

		System.out.println("\nNames by gender:");
		Map<Person.Sex, List<String>> namesByGender = roster.stream().collect(
				Collectors.groupingBy(Person::getGender, Collectors.mapping(
						Person::getName, Collectors.toList())));

		List<Map.Entry<Person.Sex, List<String>>> namesByGenderList = new ArrayList<>(
				namesByGender.entrySet());

		namesByGenderList.stream().forEach(e -> {
			System.out.println("Gender: " + e.getKey());
			e.getValue().stream().forEach(f -> System.out.println(f));
		});

		// 8. Total Salary by gender

		System.out.println("\nTotal Salary by gender:");
		Map<Person.Sex, Integer> totalAgeByGender = roster.stream().collect(
				Collectors.groupingBy(Person::getGender,
						Collectors.reducing(0, Person::getSalary, Integer::sum)));

		List<Map.Entry<Person.Sex, Integer>> totalAgeByGenderList = new ArrayList<>(totalAgeByGender.entrySet());

		totalAgeByGenderList.stream().forEach(
				e -> System.out.println("Gender: " + e.getKey() + ", Total Salary: " + e.getValue()));

		// 9. Average Salary by gender

		System.out.println("\nAverage Salary by gender:");
		Map<Person.Sex, Double> averageAgeByGender = roster.stream().collect(
				Collectors.groupingBy(Person::getGender,
						Collectors.averagingInt(Person::getSalary)));

		for (Map.Entry<Person.Sex, Double> e : averageAgeByGender.entrySet()) {
			System.out.println(e.getKey() + ": " + e.getValue());
		}
	}
}
