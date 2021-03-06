package com_27.collections.MAP;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MAP_Common_Keys_Values_In_Two_Maps_5 {
	public static void main(String[] args) {
		Map<String,String> capitalCountry = new HashMap<String, String>();
		capitalCountry.put("Canada", "Ottawa");
		capitalCountry.put("India", "Delhi");
		capitalCountry.put("Germany", "Berlin");
		capitalCountry.put("Finland", "Helsinki");
		capitalCountry.put("Russia", "Mascow");
		
		System.out.println("Map-1 : " + capitalCountry);
		
		Map<String,String> capitalCountry2 = new HashMap<String, String>();
		capitalCountry2.put("France", "Paris");
		capitalCountry2.put("India", "Delhi");
		capitalCountry2.put("Germany", "Berlin");
		capitalCountry2.put("Finland", "Helsinki");
		capitalCountry2.put("Russia", "Mascow");
		System.out.println("Map-2 : " + capitalCountry2);
		
		/*
		 *  Snippet-1 : Common Keys in both maps
		 */
		Set<String> commonKeys = new HashSet<String>(capitalCountry.keySet());
		commonKeys.retainAll(capitalCountry2.keySet());
		System.out.println("Common keys : " + commonKeys);
		
		/*
		 *  Snippet-2 : Common Values in both maps
		 */
		Set<String> commonValues = new HashSet<String>(capitalCountry.values());
		commonValues.retainAll(capitalCountry2.values());
		System.out.println("Common Values : " + commonValues);
		
		
		
		/*
		 *  Snippet-3 : Remove all of the key-value pairs that one Map has in common with another.
		 */
		capitalCountry.entrySet().removeAll(capitalCountry2.entrySet());
		System.out.println("Removed map2 entries from map1 : " + capitalCountry);
		
		
		/*
		 *  Snippet-4 : Remove from one Map all of the keys that have mappings in another
		 */
		capitalCountry.keySet().removeAll(capitalCountry2.keySet());
		System.out.println("Removed map2 keys from map1 : " + capitalCountry);
		
		
		
		/*
		 *  Snippet-5 : Remove from one Map all of the values that have mappings in another
		 */
		capitalCountry.values().removeAll(capitalCountry2.values());
		System.out.println("Removed map2 values from map1 : " + capitalCountry);
		
	}
}
