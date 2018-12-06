package Item9CHECK;

import java.util.HashMap;
import java.util.Map;

public class PhoneNumber_Demo_2 {
	public static void main(String[] args) {
		Map<PhoneNumber_2, String> m = new HashMap<PhoneNumber_2, String>();

		m.put(new PhoneNumber_2(707, 867, 5309), "Umesh");
		
		m.put(new PhoneNumber_2(707, 867, 5309), "Kilkile");
		
		System.out.println(m.size());

		System.out.println(m.get(new PhoneNumber_2(707, 867, 5309))); // Returns
																		// null
																		// if
																		// you
																		// don't
																		// override
																		// hashcode()
	}
}
