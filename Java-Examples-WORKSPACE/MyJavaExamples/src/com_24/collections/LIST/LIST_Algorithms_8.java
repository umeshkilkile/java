package com_24.collections.LIST;

import java.util.ArrayList;
import java.util.List;

public class LIST_Algorithms_8 {
	public static void main(String[] args) {
		List<Employee> employeeArrayList = new ArrayList<Employee>();
		employeeArrayList.add(new Employee("Umesh", "Kilkile"));
		employeeArrayList.add(new Employee("Anand", "Navale"));
		employeeArrayList.add(new Employee("Pradeep", "Kshirsagar"));
		employeeArrayList.add(new Employee("Mahesh", "Kilkile"));
		employeeArrayList.add(new Employee("Sachin", "Sakhare"));
		employeeArrayList.add(new Employee("Umesh", "Kilkile"));
		
		System.out.println("Before sort : " + employeeArrayList);
		employeeArrayList.sort(new Emp_FirstName_Comparator());
		System.out.println("After sort : " + employeeArrayList);

	}
}
