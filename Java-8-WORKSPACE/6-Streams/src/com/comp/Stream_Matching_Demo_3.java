package com.comp;

import java.util.ArrayList;
import java.util.List;

public class Stream_Matching_Demo_3 {
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
		 * allMatch
		 */
		boolean expensive = listInvoices.stream().allMatch(inv -> inv.getAmount() > 1_000);
		System.out.println("expensive : " + expensive);

		/*
		 * anyMatch
		 */
		boolean expensive2 = listInvoices.stream().anyMatch(inv -> inv.getAmount() > 1_000);
		System.out.println("expensive : " + expensive2);
		
		/*
		 * noneMatch
		 */
		boolean expensive3 = listInvoices.stream().noneMatch(inv -> inv.getAmount() > 1_000);
		System.out.println("expensive : " + expensive3);
		
		
	}
}
