package com.arraysclass;

import java.util.Comparator;

public class Employee2SalComparatorImpl implements Comparator<Employee2> {

	@Override
	public int compare(Employee2 o1, Employee2 o2) {
		int val = 0;
		if (o1.getSalary() == o2.getSalary()) {
			val = 0;
		} else if (o1.getSalary() < o2.getSalary()) {
			val = -1;
		} else if (o1.getSalary() > o2.getSalary()) {
			val = 1;
		}
		return val;
	}

}
