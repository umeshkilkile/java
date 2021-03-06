package com_27.collections.MAP;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class MAP_Examples_6 {
	public static void main(String[] args) {
		/*
		 * HashMap
		 */
		/*Map<Employee, String> map = new HashMap<Employee, String>();

		Employee emp1 = new Employee("Umesh", "Kilkile");
		Employee emp2 = new Employee("Anand", "Navale");
		String s = map.put(emp1, "IBM");
		String s1 = map.put(emp2, "Biacon");

		Employee emp3 = new Employee("Umesh", "Kilkile");
		String s2 = map.put(emp3, "IBM2");

		System.out.println(s + " : " + s1 + " : " + s2);
		System.out.println(map);

		System.out.println(emp1.hashCode() + " : " + emp2.hashCode() + " : " + emp3.hashCode());
		System.out.println(map.get(emp1));
		System.out.println(map.get(emp2));
		System.out.println(map.get(emp3));

		System.out.println("emp1 == emp3 : " + (emp1 == emp3));
		System.out.println("emp1.equals(emp3) : " + (emp1.equals(emp3)));
		
		System.out.println("emp1 == emp2 : " + (emp1 == emp2));
		System.out.println("emp1.equals(emp2) : " + (emp1.equals(emp2)));*/
		
		/*
		 * HashTable
		 
		Map<Employee, String> map = new Hashtable<Employee, String>();

		Employee emp1 = new Employee("Umesh", "Kilkile");
		Employee emp2 = new Employee("Anand", "Navale");
		String s = map.put(emp1, "IBM");
		String s1 = map.put(emp2, "Biacon");

		Employee emp3 = new Employee("Umesh", "Kilkile");
		String s2 = map.put(emp3, "IBM2");

		System.out.println(s + " : " + s1 + " : " + s2);
		System.out.println(map);

		System.out.println(emp1.hashCode() + " : " + emp2.hashCode() + " : " + emp3.hashCode());
		System.out.println(map.get(emp1));
		System.out.println(map.get(emp2));
		System.out.println(map.get(emp3));

		System.out.println("emp1 == emp3 : " + (emp1 == emp3));
		System.out.println("emp1.equals(emp3) : " + (emp1.equals(emp3)));
		
		System.out.println("emp1 == emp2 : " + (emp1 == emp2));
		System.out.println("emp1.equals(emp2) : " + (emp1.equals(emp2)));*/
		
		/*
		 * LinkedHashMap
		 */
		/*Map<Employee, String> map = new LinkedHashMap<Employee, String>();

		Employee emp1 = new Employee("Umesh", "Kilkile");
		Employee emp2 = new Employee("Anand", "Navale");
		String s = map.put(emp1, "IBM");
		String s1 = map.put(emp2, "Biacon");

		Employee emp3 = new Employee("Umesh", "Kilkile");
		String s2 = map.put(emp3, "IBM2");

		System.out.println(s + " : " + s1 + " : " + s2);
		System.out.println(map);

		System.out.println(emp1.hashCode() + " : " + emp2.hashCode() + " : " + emp3.hashCode());
		System.out.println(map.get(emp1));
		System.out.println(map.get(emp2));
		System.out.println(map.get(emp3));

		System.out.println("emp1 == emp3 : " + (emp1 == emp3));
		System.out.println("emp1.equals(emp3) : " + (emp1.equals(emp3)));
		
		System.out.println("emp1 == emp2 : " + (emp1 == emp2));
		System.out.println("emp1.equals(emp2) : " + (emp1.equals(emp2)));*/
		
		/*
		 * TreeMap
		 */
		Map<Employee, String> map = new TreeMap<Employee, String>();

		Employee emp1 = new Employee("Umesh", "Kilkile");
		Employee emp2 = new Employee("Anand", "Navale");
		String s = map.put(emp1, "IBM");
		String s1 = map.put(emp2, "Biacon");

		Employee emp3 = new Employee("Umesh", "Kilkile");
		String s2 = map.put(emp3, "IBM2");

		System.out.println(s + " : " + s1 + " : " + s2);
		System.out.println(map);

		System.out.println(emp1.hashCode() + " : " + emp2.hashCode() + " : " + emp3.hashCode());
		System.out.println(map.get(emp1));
		System.out.println(map.get(emp2));
		System.out.println(map.get(emp3));

		System.out.println("emp1 == emp3 : " + (emp1 == emp3));
		System.out.println("emp1.equals(emp3) : " + (emp1.equals(emp3)));
		
		System.out.println("emp1 == emp2 : " + (emp1 == emp2));
		System.out.println("emp1.equals(emp2) : " + (emp1.equals(emp2)));

	}
}
