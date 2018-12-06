/**
 * 
 */
package com.comp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.Comparator.comparingDouble;

/**
 * @author ukilkil
 *
 */
public class Stream_Demo_1 {
	public static void main(String[] args) {
		List<Invoice> listInvoices = new ArrayList<>();
		listInvoices.add(new Invoice(100.78, "TV", 5001, "Lowe's"));
		listInvoices.add(new Invoice(100.34, "Fridge", 5003, "Lowe's"));
		listInvoices.add(new Invoice(100.2, "Cooler", 5002, "Lowe's"));
		listInvoices.add(new Invoice(1001.78, "AC", 5004, "Menards"));
		listInvoices.add(new Invoice(1001.78, "JavaTraining", 3001, "Home Depot"));
		listInvoices.add(new Invoice(1001.78, "NodeTraining", 4001, "Amazon"));
		listInvoices.add(new Invoice(1001.78, "Angular2Training", 2001, "Amazon"));

		/*
		 * Prior to Java 8, you'd write code that looks like this
		 */

		List<Invoice> trainingInvoices = new ArrayList<>();
		for (Invoice inv : listInvoices) {
			if (inv.getTitle().contains("Training")) {
				trainingInvoices.add(inv);
			}
		}

		Collections.sort(trainingInvoices, new Comparator<Invoice>() {
			@Override
			public int compare(Invoice inv1, Invoice inv2) {
				return inv2.getAmount().compareTo(inv1.getAmount());
			}
		});

		List<Integer> invoiceIds = new ArrayList<>();
		for (Invoice inv : trainingInvoices) {
			invoiceIds.add(inv.getId());
		}
		System.out.println("Invoice Id's with Training title : " + invoiceIds);

		/*
		 * In Java 8, you'd write code that looks like this to sort
		 */
		List<Integer> invoiceIds2 = listInvoices.stream().filter(inv -> inv.getTitle().contains("Training"))
				.map(Invoice::getId).collect(Collectors.toList());
		System.out.println("Invoice Id's with Training title 2 : " + invoiceIds2);

		List<Integer> ids = listInvoices.stream().filter(inv -> inv.getCustomer().equalsIgnoreCase("Lowe's"))
				.sorted(comparingDouble(Invoice::getAmount)).map(Invoice::getId).collect(Collectors.toList());
		System.out.println("Invoice Id's Home Depot : " + ids);
	}
}

/*
 * A stream is a sequence of elements from a source that supports aggregate
 * operations.
 */