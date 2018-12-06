package micellaneous;

import java.util.Arrays;
import java.util.List;

public class ArrayAsList_6 {
	public static void main(String[] args) {
		final String[] SalesInvoiceCategoryTypeCodeES = {"ZEF2","ZEG2","ZEL2","ZES1","ZES2"};
		
		List<String> list = Arrays.asList(SalesInvoiceCategoryTypeCodeES);
		
		System.out.println(list);
	}
}
