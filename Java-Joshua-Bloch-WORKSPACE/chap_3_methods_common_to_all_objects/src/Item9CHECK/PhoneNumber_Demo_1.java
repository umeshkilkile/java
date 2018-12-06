package Item9CHECK;

import java.util.HashMap;
import java.util.Map;

public class PhoneNumber_Demo_1 {
	public static void main(String[] args) {
		Map<PhoneNumber_1, String> m = new HashMap<PhoneNumber_1, String>();
		
		m.put(new PhoneNumber_1(707, 867, 5309), "Umesh");
		
		System.out.println(m.get(new PhoneNumber_1(707, 867, 5309))); // Returns null if you don't override hashcode()
	}
}
