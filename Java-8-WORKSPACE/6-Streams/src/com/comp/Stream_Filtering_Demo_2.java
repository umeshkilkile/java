package com.comp;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Stream_Filtering_Demo_2 {
	public static void main(String[] args) {
		List<Invoice> listInvoices = new ArrayList<>();
		listInvoices.add(new Invoice(100453.78, "TV", 5001, "Lowe's"));
		listInvoices.add(new Invoice(1003.34, "Fridge", 5003, "Lowe's"));
		listInvoices.add(new Invoice(100124.2, "Cooler", 5002, "Lowe's"));
		listInvoices.add(new Invoice(10014.78, "AC", 5004, "Menards"));
		listInvoices.add(new Invoice(10014.78, "JavaTraining", 3001, "Home Depot"));
		listInvoices.add(new Invoice(10014.78, "JavaTraining", 3001, "Home Depot"));
		listInvoices.add(new Invoice(1001.78, "NodeTraining", 4001, "Amazon"));
		listInvoices.add(new Invoice(1001.78, "Angular2Training", 2001, "Amazon"));

		/*
		 * filter
		 * 
		 * Takes a Predicate object as an argument and returns a stream
		 * including all elements that match the predicate
		 */
		List<Invoice> expensiveInvoices = listInvoices.stream().filter(inv -> inv.getAmount() > 10_000)
				.collect(Collectors.toList());
		System.out.println("Expensive Invoices : ");
		for (Invoice inv : expensiveInvoices) {
			System.out.println(inv);
		}

		/*
		 * limit
		 * 
		 * Returns a stream that is no longer than a certain size
		 */
		List<Invoice> expensiveInvoices2 = listInvoices.stream().filter(inv -> inv.getAmount() > 10_000).limit(2)
				.collect(Collectors.toList());
		System.out.println("\nExpensive Invoices2 with limit set to 2 : ");
		for (Invoice inv : expensiveInvoices2) {
			System.out.println(inv);
		}

		/*
		 * distinct
		 * 
		 * Returns a stream with unique elements (according to the
		 * implementation of equals for a stream element)
		 */
		List<Invoice> expensiveInvoices3 = listInvoices.stream().filter(inv -> inv.getAmount() > 10_000).distinct()
				.collect(Collectors.toList());
		System.out.println("\nExpensive Invoices3 : ");
		for (Invoice inv : expensiveInvoices3) {
			System.out.println(inv);
		}

		/*
		 * skip
		 * 
		 * Returns a stream with the first n number of elements discarded (i.e.,
		 * 0...n)
		 */
		List<Invoice> expensiveInvoices4 = listInvoices.stream().filter(inv -> inv.getAmount() > 10_000).skip(2)
				.collect(Collectors.toList());
		System.out.println("\nExpensive Invoices4 : ");
		for (Invoice inv : expensiveInvoices4) {
			System.out.println(inv);
		}
	}
}
