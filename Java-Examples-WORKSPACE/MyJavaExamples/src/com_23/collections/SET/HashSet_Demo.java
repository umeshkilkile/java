package com_23.collections.SET;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Map;
import java.util.Set;

public class HashSet_Demo {
	public static void main(String[] args) {
		
		System.out.println("Set operations----------------------------------------------------------------------------------------------------------------");
		
		Set<Employee2> empSet = new HashSet<Employee2>();
		
		Employee2 emp1 = new Employee2("Umesh");
		empSet.add(emp1);
		System.out.println("emp1 hashcode : " + emp1.hashCode());
		
		Employee2 emp2 = new Employee2("Umesh");
		empSet.add(emp2);
		System.out.println("emp2 hashcode : " + emp2.hashCode());
		
		System.out.println("is emp1.equals(emp2) : " + emp1.equals(emp2));
		
		System.out.println("empSet contains : " + empSet.size());

		System.out.println("Map operations----------------------------------------------------------------------------------------------------------------");
		
		Map<Employee2, String> map = new HashMap<Employee2, String>();
		map.put(emp1, "Umesh");
		map.put(emp2, "Ileana");
		System.out.println("map contains : " + map);
		System.out.println("map : " + map.get(emp1));
		System.out.println("map : " + map.get(emp2));

		
		System.out.println("HashTable operations----------------------------------------------------------------------------------------------------------------");
		
		Hashtable<Employee2, String> hashtable = new Hashtable<>();
		hashtable.put(emp2, "Umesh");
		//hashtable.put(null, null); //You can't put not even a single null key or value in HashTable
		
		System.out.println("hashtable : " + hashtable);
		
	}
}

