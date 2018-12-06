package com.comp;

public class InvoicePredicateGreaterThanAmountImpl implements InvoicePredicate {

	Double amount = null;

	InvoicePredicateGreaterThanAmountImpl(Double amount) {
		this.amount = amount;
	}

	@Override
	public boolean test(Invoice inv) {
		return inv.getAmount() > amount;
	}

}
