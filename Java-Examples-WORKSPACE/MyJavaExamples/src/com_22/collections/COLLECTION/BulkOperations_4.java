package com_22.collections.COLLECTION;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Set;

public class BulkOperations_4 {
	public static void main(String[] args) {

		Collection<Employee> collection1 = new ArrayList<Employee>();
		Employee emp1 = new Employee("Umesh", "Kilkile", 1000);
		Employee emp2 = new Employee("Ramesh", "KTG", 2000);
		Employee emp5 = new Employee("Umesh", "Kilkile", 1000);
		collection1.add(emp1);
		collection1.add(emp2);
		collection1.add(emp5);

		collection1.add(null);
		collection1.add(null);
		System.out.println("Colletion-1 = " + collection1);

		Collection<Employee> collection2 = new ArrayList<Employee>();
		Employee emp3 = new Employee("Umesh", "Kilkile", 1000);
		Employee emp4 = new Employee("Vijay", "H", 1000);
		collection2.add(emp3);
		collection2.add(emp4);
		System.out.println("Colletion-2 = " + collection2);
		/*
		 * 1. addAll
		 */
		/*collection1.addAll(collection2);
		System.out.println("addAll : " + collection1);*/

		/*
		 * 2. containsAll
		 */
		/*System.out.println("Colletion1 contains collection2 : " + (collection1.containsAll(collection2)));
		System.out.println("Colletion2 contains collection1 : " + (collection2.containsAll(collection1)));*/
		
		/*
		 * 3. removeAll
		 */
		/*System.out.println("removeAll : " + (collection1.removeAll(collection2)));
		System.out.println("Colletion-1 : " + collection1);
		System.out.println("Colletion-2 : " + collection2);*/
		
		/*
		 * 4. retainAll
		 */
		/*System.out.println("Retain collection2 in 1 : " + (collection1.retainAll(collection2)));
		System.out.println("Colletion-1 : " + collection1);
		System.out.println("Colletion-2 : " + collection2);*/
		
		/*
		 * To remove all instances of a specified element, e, from a Collection, c
		 */
		boolean b = collection1.removeAll(Collections.singleton(new Employee("Umesh", "Kilkile", 1000)));
		System.out.println(b);
		System.out.println("Colletion-1 : " + collection1);
		System.out.println("Colletion-2 : " + collection2);
		
		/*
		 * To remove all of the null elements from a Collection
		 */
		/*boolean b = collection1.removeAll(Collections.singleton(null));
		System.out.println(b);
		System.out.println("Colletion-1 : " + collection1);
		System.out.println("Colletion-2 : " + collection2);*/
		
		/*
		 * Collection Interface Array Operations
		 */
		Object[] obj = collection1.toArray();
		System.out.println(obj.length + " : " + collection1.size());
		Employee emp = (Employee) obj[0];
		System.out.println(emp);
	}
}
