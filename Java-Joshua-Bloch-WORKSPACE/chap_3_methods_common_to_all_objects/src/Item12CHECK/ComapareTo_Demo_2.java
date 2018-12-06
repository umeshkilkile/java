package Item12CHECK;

import java.util.Set;
import java.util.TreeSet;

public class ComapareTo_Demo_2 {
	public static void main(String[] args) {
		
		PhoneNumber number1 = new PhoneNumber(200, 300, 4000);
		PhoneNumber number2 = new PhoneNumber(300, 400, 5000);
		PhoneNumber number3 = new PhoneNumber(-300, 400, 5000);
		PhoneNumber number4 = new PhoneNumber(0, 400, 5000);

		Set<PhoneNumber> set = new TreeSet<PhoneNumber>();
		set.add(number1);
		set.add(number2);
		set.add(number3);
		set.add(number4);

		System.out.println(set);

	}
}
