package com.comp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Stream_PutAllTogether_NonJava8_Demo_8 {
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

		List<Invoice> oracleAndTrainingInvoices = new ArrayList<>();
		List<Integer> ids = new ArrayList<>();
		List<Integer> firstFiveIds = new ArrayList<>();

		for (Invoice inv : listInvoices) {
			if (inv.getCustomer().equalsIgnoreCase("Oracle")) {
				if (inv.getTitle().contains("Training")) {
					oracleAndTrainingInvoices.add(inv);
				}
			}
		}
		System.out.println("Oracle Training invoices : " + oracleAndTrainingInvoices);

		Collections.sort(oracleAndTrainingInvoices, new Comparator<Invoice>() {
			@Override
			public int compare(Invoice inv1, Invoice inv2) {
				return Double.compare(inv1.getAmount(), inv2.getAmount());
			}
		});

		for (Invoice inv : oracleAndTrainingInvoices) {
			ids.add(inv.getId());
		}
		System.out.println("Oracle Training invoices Id's : " + ids);

		for (int i = 0; i < 2; i++) {
			firstFiveIds.add(ids.get(i));
		}
		System.out.println("Oracle Training invoices first 2 Id's : " + firstFiveIds);
	}
}
