package Item9CHECK;

import java.util.HashMap;
import java.util.Map;

public class PhoneNumber_Demo_3 {
	public static void main(String[] args) {
		Map<PhoneNumber_3, String> m = new HashMap<PhoneNumber_3, String>();

		PhoneNumber_3 phone_1 = new PhoneNumber_3(707, 867, 5309);
		PhoneNumber_3 phone_2 = new PhoneNumber_3(707, 867, 5309);
		
		m.put(phone_1, "Umesh");
		m.put(phone_2, "Paris");

		System.out.println(m.size());
		System.out.println(m.get(phone_1));
		System.out.println(m.get(phone_2));
	}
}
