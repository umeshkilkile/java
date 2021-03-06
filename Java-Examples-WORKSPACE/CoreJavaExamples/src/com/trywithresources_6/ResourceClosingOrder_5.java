package com.trywithresources_6;

public class ResourceClosingOrder_5 {
	public static void main(String[] args) {
		try (AutoCloseableResourcesFirst af = new AutoCloseableResourcesFirst();
				AutoCloseableResourcesSecond as = new AutoCloseableResourcesSecond()) {

			af.doSomething();
			as.doSomething();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}

/*
 * Notes
 * 
 * Resources that were defined/acquired first will be closed last
 * 
 * A try-with-resources block can still have the catch and finally blocks �
 * which will work in the same way as with a traditional try block.
 */