package Item1;

public class Demo_1 {
	public static void main(String[] args) {

		Account newAccount = Account.createAccount("Umesh", "Savings", 12345678);
		System.out.println(newAccount);

		Account anotherAccount = Account.createAccount("Mahesh", "Current", 23456789);
		System.out.println(anotherAccount);

		Boolean b = Account.valueOf(false);
		System.out.println(b);
	}
}


