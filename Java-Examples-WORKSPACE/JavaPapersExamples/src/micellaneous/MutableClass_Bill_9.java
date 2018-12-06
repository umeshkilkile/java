package micellaneous;

import java.util.Date;

public class MutableClass_Bill_9 {
	public static void main(String[] args) {
		BillMutable bill = new BillMutable(100, new Date());
		
		System.out.println("Before : " + bill.getAmount());
		bill.setAmount(200);
		System.out.println("After : " + bill.getAmount());

	}
}
