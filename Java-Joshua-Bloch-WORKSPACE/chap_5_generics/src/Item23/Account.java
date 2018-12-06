package Item23;

public class Account {
	private String accountName;
	private int accountNumber;

	public Account() {
	}

	public Account(String accountName, int accountNumber) {
		this.accountName = accountName;
		this.accountNumber = accountNumber;
	}

	public String getAccountName() {
		return accountName;
	}

	public void setAccountName(String accountName) {
		this.accountName = accountName;
	}

	public int getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("Account name : " + accountName + ",");
		sb.append("Account number : " + accountNumber);
		return sb.toString();
	}
}
