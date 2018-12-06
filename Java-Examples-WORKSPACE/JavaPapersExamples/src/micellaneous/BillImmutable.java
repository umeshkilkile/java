package micellaneous;

import java.util.Date;

public final class BillImmutable {
	private final int amount;
	private final Date dateTime;

	public BillImmutable(int amount, Date dateTime) {
		this.amount = amount;
		this.dateTime = dateTime;
	}

	public int getAmount() {
		return amount;
	}

	public Date getDateTime() {
		return dateTime;
	}
	
	public BillImmutable addAmount(int amount) {
	       return new BillImmutable(this.amount + amount, dateTime);
	}

}
