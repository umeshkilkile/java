package com_30.collections.OBJECT_ORDERING.COMPARATOR_INTERFACE;

import java.util.Comparator;

public class EmpLastNameFirstNameComp implements Comparator<Employee_3> {

	@Override
	public int compare(Employee_3 emp1, Employee_3 emp2) {

		int nameComp = emp1.getLastName().compareTo(emp2.getLastName());
		return nameComp == 0 ? emp1.getFirstName().compareTo(emp2.getFirstName()) : nameComp;
	}

}
