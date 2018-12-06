package Item16;

/**
 * 
 * @author kilkile
 *
 *         Item 16: Favor composition over inheritance
 */

public class Account {
	public String accHolderName;

	public String getAccHolderName() {
		return accHolderName;
	}

	public void setAccHolderName(String accHolderName) {
		this.accHolderName = accHolderName;
	}

	public String getAccType() {
		return accType;
	}

	public void setAccType(String accType) {
		this.accType = accType;
	}

	public long getAccNo() {
		return accNo;
	}

	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}

	public String accType;
	public long accNo;

	public Account() {
	}

	public Account(String accHolderName, String accType, long accNo) {
		this.accHolderName = accHolderName;
		this.accType = accType;
		this.accNo = accNo;

		displayAccount(accNo, accHolderName, accType);
	}

	public void displayAccount(long accNo, String... details) {
		System.out.println("Acc No. : " + accNo);
		for (String s : details) {
			System.out.println(s);
		}
		System.out.println();
	}
}
