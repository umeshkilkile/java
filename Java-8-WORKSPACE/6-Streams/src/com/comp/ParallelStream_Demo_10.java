package com.comp;

import static java.util.Comparator.comparingDouble;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStream_Demo_10 {
	public static void main(String[] args) {
		List<Invoice> listInvoices = new ArrayList<>();
		listInvoices.add(new Invoice(100453.78, "TV", 5001, "Lowe's"));
		listInvoices.add(new Invoice(1003.34, "Fridge", 5003, "Lowe's"));
		listInvoices.add(new Invoice(100124.2, "Cooler", 5002, "Lowe's"));
		listInvoices.add(new Invoice(10014.78, "AC", 5004, "Menards"));
		listInvoices.add(new Invoice(10014.78, "JavaTraining", 3001, "Home Depot"));
		listInvoices.add(new Invoice(10014.78, "JavaTraining", 3001, "Home Depot"));
		listInvoices.add(new Invoice(1001.78, "NodeTraining", 4001, "Oracle"));
		listInvoices.add(new Invoice(1001.78, "Angular2Training", 2001, "Oracle"));

		System.out.println("Expensive invoices using Parallel streams demo-1 : ");
		List<Invoice> expensiveInvoices = listInvoices.parallelStream().filter(inv -> inv.getAmount() > 10_000)
				.collect(Collectors.toList());
		for (Invoice invoice : expensiveInvoices) {
			System.out.println(invoice);
		}

		System.out.println("Expensive invoices using Parallel streams demo-2 : ");
		Stream<Invoice> expensiveInvoices2 = listInvoices.stream().filter(inv -> inv.getAmount() > 10_000);
		List<Invoice> result = expensiveInvoices2.parallel().collect(Collectors.toList());
		for (Invoice invoice : result) {
			System.out.println(invoice);
		}
	}
}
