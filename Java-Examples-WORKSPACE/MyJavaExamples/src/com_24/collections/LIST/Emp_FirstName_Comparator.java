package com_24.collections.LIST;

import java.util.Comparator;

public class Emp_FirstName_Comparator implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		return emp1.getFirstName().compareTo(emp2.getFirstName());
	}

}
