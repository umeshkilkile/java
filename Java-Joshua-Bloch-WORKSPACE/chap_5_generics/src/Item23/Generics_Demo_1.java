package Item23;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Generics_Demo_1 {
	public static void main(String[] args) {
		List<Account> accountList = new ArrayList<Account>();
		Account ac1 = new Account("Umesh", 12345);
		Account ac2 = new Account("Ramesh", 23456);
		Account ac3 = new Account("Anand", 34567);
		Account ac4 = new Account("Mahesh", 45678);

		accountList.add(ac1);
		accountList.add(ac2);
		accountList.add(ac3);
		accountList.add(ac4);
		
		// for-each loop over a parameterized collection - typesafe
		for (Account ac : accountList) { // No cast
			System.out.println(ac);
		}
		System.out.println();
		
		for(Iterator<Account> iterator = accountList.iterator(); iterator.hasNext();){
			Account acc = iterator.next();
			System.out.println(acc);
		}
	}
}
