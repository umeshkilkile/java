package micellaneous;

import java.util.Date;

/**
 * 
 * Note 1: In this version of the class, all the members can be changed after instances of the class have been created. 
 */
public class BillMutable {

	private int amount;
	private Date date;

	public BillMutable(int amount, Date date) {
		this.amount = amount;
		this.date = date;
	}

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}