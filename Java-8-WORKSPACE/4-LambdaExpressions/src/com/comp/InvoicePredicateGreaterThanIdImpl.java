package com.comp;

public class InvoicePredicateGreaterThanIdImpl implements InvoicePredicate {
	int id;

	InvoicePredicateGreaterThanIdImpl(int id) {
		this.id = id;
	}

	@Override
	public boolean test(Invoice inv) {
		return inv.getId() > id;
	}

}
