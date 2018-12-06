package com_24.collections.LIST;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 
 * @author kilkile Iterating over a ArrayList
 */

public class LIST_Swap_Index_Values_3 {
	public static void main(String[] args) {
		List<String> listCountries = new ArrayList<String>();

		listCountries.add("India");
		listCountries.add("Finland");
		listCountries.add("Ireland");
		listCountries.add("America");
		listCountries.add("France");

		System.out.println("Before : " + listCountries);

		swap(listCountries,0,4);
		
		System.out.println("After : " + listCountries);
		
		shuffle(listCountries, new Random());

		System.out.println("After shuffle : " + listCountries);
		
	}

	/*
	 * The generic method to swap
	 */
	public static <E> void swap(List<E> a, int i, int j) {
		E tmp = a.get(i);
		a.set(i, a.get(j));
		a.set(j, tmp);
	}
	
	public static void shuffle(List<?> list, Random rnd) {
	    for (int i = list.size(); i > 1; i--)
	        swap(list, i - 1, rnd.nextInt(i));
	}
}
