package Item10CHECK;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneNumber_Demo_1 {
	public static void main(String[] args) {

		PhoneNumber_1 phoneNumber = new PhoneNumber_1(707, 867, 5309);
		System.out.println("Failed to connect : " + phoneNumber);

		PhoneNumber_1 phoneNumber2 = new PhoneNumber_1(707, 67, 5309);
		System.out.println("Failed to connect : " + phoneNumber2.toString());

		List<PhoneNumber_1> list = new ArrayList<>();
		list.add(phoneNumber);
		list.add(phoneNumber2);

		System.out.println("List of phone numbers : " + list);

		Map<String, PhoneNumber_1> map = new HashMap<>();
		map.put("Umesh", phoneNumber);
		map.put("Kilkile", phoneNumber2);
		System.out.println("Map of phone numbers : " + map);
	}
}
