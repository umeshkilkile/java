package micellaneous;

import java.util.Date;

public class ImmutableClass_Bill_10 {
	public static void main(String[] args) {
		BillImmutable billImmutable = new BillImmutable(100, new Date());
		System.out.println("Before : " + billImmutable.getAmount());
		System.out.println("Before : " + billImmutable.getDateTime());
		
		BillImmutable billImmutable2 = billImmutable.addAmount(200);
		System.out.println("After : " + billImmutable2.getAmount());
		System.out.println("After : " + billImmutable.getDateTime());
	}
}
