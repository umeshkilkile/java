package com_33.collections.LEGACY_COLLECTION;

import java.util.Hashtable;
import java.util.Map;

public class HashTableDemo_2 {
	public static void main(String[] args) {
		/*
		 * Snippet-1: HashTable with Stings
		 */
		Map<String,String> mapComp = new Hashtable<String, String>();
		mapComp.put("Infosys","Bangalore");
		mapComp.put("Wipro","Pune");
		mapComp.put("KPIT","Chennai");
		mapComp.put("HCL","Mumbai");
		mapComp.put("Tech Mahindra","Delhi");
		mapComp.put("KPIT","Chennai");
		//mapComp.put(null, "HP"); //You can't add null as a key
		//mapComp.put("HP", null); //You can't add null as a value
		System.out.println(mapComp);
		
		
	}
}
