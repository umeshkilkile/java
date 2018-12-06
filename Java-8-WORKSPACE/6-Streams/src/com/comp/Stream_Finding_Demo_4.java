package com.comp;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Stream_Finding_Demo_4 {
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
		 * findAny
		 */
		Optional<Invoice> invoices = listInvoices.stream().filter(inv -> inv.getCustomer().equalsIgnoreCase("Amazon"))
				.findAny();
		System.out.println(invoices);
		
		/*
		 * findFirst
		 */
		Optional<Invoice> invoices2 = listInvoices.stream().filter(inv -> inv.getCustomer().equalsIgnoreCase("Lowe's"))
				.findFirst();
		System.out.println(invoices2);
	}
}
