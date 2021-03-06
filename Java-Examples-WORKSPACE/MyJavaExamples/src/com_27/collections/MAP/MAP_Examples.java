package com_27.collections.MAP;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MAP_Examples {
	public static void main(String[] args) {

		Employee2 employee1 = new Employee2("Umesh", "Kilkile", new Department(10, "Merch"), 10000);
		Employee2 employee2 = new Employee2("Ramesh", "Qatar", new Department(10, "Marketing"), 20000);
		Employee2 employee3 = new Employee2("Mahesh", "Hyd", new Department(10, "Finance"), 25000);
		Employee2 employee4 = new Employee2("Rakesh", "Pmc", new Department(10, "Digital"), 12000);
		Employee2 employee5 = new Employee2("Rakesh2", "Pmc2", new Department(10, "Digital"), 12300);

		List<Employee2> employees = new ArrayList<>();
		employees.add(employee1);
		employees.add(employee2);
		employees.add(employee3);
		employees.add(employee4);
		employees.add(employee5);

		System.out.println("employees = " + employees);

		Map<Department, List<Employee2>> byDept = employees.stream()
				.collect(Collectors.groupingBy(Employee2::getDepartment));
		System.out.println("byDept = " + byDept);

		// Compute sum of salaries by department
		Map<Department, Integer> totalByDept = employees.stream()
				.collect(Collectors.groupingBy(Employee2::getDepartment, Collectors.summingInt(Employee2::getSalary)));
		System.out.println("totalByDept = " + totalByDept);
	}
}
