package com_27.collections.MAP;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MAP_HashMap_Ex_2 {
	public static void main(String[] args) {
		Map<String,String> capitalCountry = new HashMap<String, String>();
		capitalCountry.put("France", "Paris");
		capitalCountry.put("India", "Delhi");
		capitalCountry.put("India", "Delhi");
		capitalCountry.put("Germany", "Berlin");
		capitalCountry.put("Finland", "Helsinki");
		capitalCountry.put("Russia", "Mascow");
		capitalCountry.put(null, null);//Not added
		capitalCountry.put(null, "nullvalue");//Added
		capitalCountry.put("null-1", "nullvalue");//Not Added
		capitalCountry.put("null-1", null);//Added
		
		System.out.println(capitalCountry);
		
		/*
		 *  Snippet-1 : Print only keys
		 */
		System.out.println("\nOnly Keys using for each : ");
		for(String keys : capitalCountry.keySet()){
			System.out.println(keys);
		}
		
		/*
		 *  Snippet-2 : Print only values
		 */
		System.out.println("\nOnly Values using for each : ");
		for(String values : capitalCountry.values()){
			System.out.println(values);
		}
		
		/*
		 *  Snippet-3 : Iterate over map using Iterator
		 */
		System.out.println("\nKeys Using Iterator : ");
		for(Iterator<String> iterator = capitalCountry.keySet().iterator(); iterator.hasNext();){
			System.out.println(iterator.next());
			
		}
		
		/*
		 *  Snippet-4 : Iterate over map using Iterator
		 */
		System.out.println("\nValues Using Iterator : ");
		for(Iterator<String> iterator = capitalCountry.values().iterator(); iterator.hasNext();){
			System.out.println(iterator.next());
			
		}
		
		/*
		 *  Snippet-5 : Iterate over map using Iterator
		 */
		System.out.println("\nKey/Values using for each : ");
		for(Map.Entry<String, String> keyValue : capitalCountry.entrySet()){
			System.out.println("Key : " + keyValue.getKey() + ", Value : " + keyValue.getValue());
		}
	}
}
