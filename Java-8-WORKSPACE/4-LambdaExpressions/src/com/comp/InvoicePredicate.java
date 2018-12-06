package com.comp;

@FunctionalInterface
public interface InvoicePredicate {
	boolean test(Invoice inv);
}
