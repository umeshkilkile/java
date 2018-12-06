package com.comp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortInvoiceDemo_1 {
	public static void main(String[] args) {
		List<Invoice> listinvoices = new ArrayList<>();
		
		listinvoices.add(new Invoice(1001.34,"LG TV"));
		listinvoices.add(new Invoice(1002.34,"Sony TV"));
		listinvoices.add(new Invoice(1002.34,"Samsung TV"));
		listinvoices.add(new Invoice(10045.34,"Philips TV"));
		listinvoices.add(new Invoice(100456.34,"Onida TV"));
		
		System.out.println("Before sorting Items in List");
		for(Invoice inv : listinvoices){
			System.out.println(inv);
		}
		
		/*
		 * Prior to Java 8, you'd write code that looks like this to sort
		 */
		Collections.sort(listinvoices, new Comparator<Invoice>() {
			@Override
			public int compare(Invoice inv1, Invoice inv2) {
				return Double.compare(inv2.getAmount(), inv1.getAmount());
			}
		});
		
		//listinvoices.sort(comparing);
	}
}
