package com_24.collections.LIST;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class LIST_Implementations_6 {
	public static void main(String[] args) {
		
		/*
		 * ArrayList
		 */
		/*List<Employee> list = new ArrayList<Employee>();

		list.add(new Employee("Umesh", "Kilkile"));
		list.add(new Employee("Mahesh", "Kilkile"));
		list.add(new Employee("Umesh1", "Kilkile"));
		list.add(new Employee("Mahesh1", "Kilkile"));
		
		System.out.println(list);*/
		
		/*
		 * LinkedList
		 */
		/*List<Employee> list2 = new LinkedList<Employee>();

		list2.add(new Employee("Umesh2", "Kilkile"));
		list2.add(new Employee("Mahesh2", "Kilkile"));
		list2.add(new Employee("Umesh3", "Kilkile"));
		list2.add(new Employee("Mahesh3", "Kilkile"));
		
		System.out.println(list2);*/
		
		/*
		 * Stack
		 */
		/*List<Employee> list3 = new Stack<Employee>();

		list3.add(new Employee("Umesh2", "Kilkile"));
		list3.add(new Employee("Mahesh2", "Kilkile"));
		list3.add(new Employee("Umesh3", "Kilkile"));
		list3.add(new Employee("Mahesh3", "Kilkile"));
		
		System.out.println(list3);*/

		/*
		 * Stack
		 */
		Stack<Employee> stack = new Stack<Employee>();

		stack.push(new Employee("Umesh2", "Kilkile"));
		stack.push(new Employee("Mahesh2", "Kilkile"));
		stack.add(new Employee("Umesh3", "Kilkile"));
		stack.addElement(new Employee("Mahesh3", "Kilkile"));
		System.out.println(stack);
		stack.pop();
		System.out.println(stack);
		Employee emp = stack.peek();
		System.out.println(emp);
		System.out.println(stack);
		
		/*
		 * Vector
		 * 
		 * 1. Vector is synchronized and ArrayList is not.
		 */
		/*List<Employee> list4 = new Vector<Employee>();

		list4.add(new Employee("Umesh2", "Kilkile"));
		list4.add(new Employee("Mahesh2", "Kilkile"));
		list4.add(new Employee("Umesh3", "Kilkile"));
		list4.add(new Employee("Mahesh3", "Kilkile"));
		
		System.out.println(list4);*/

	}
}
