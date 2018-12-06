package micellaneous;

import java.util.HashMap;
import java.util.Map;

public class PrepareMap_5 {

	public static void main(String[] args) {
		Map<String, String> test = new HashMap<>();

		test.put("", "1234");
		test.put("BCD", null);
		test.put(null, "1234");
		test.put("DEF", "");
		test.put("EFG", "1234");

		Map<String, String> result = getMetaData(test);
		
		System.out.println("Final : "  + result);
	}

	public static Map<String, String> getMetaData(Map<String, String> test) {

		Map<String, String> finalMap = new HashMap<String, String>();

		for (Map.Entry<String, String> entry : test.entrySet()) {
			
			String key = entry.getKey();
			String value = entry.getValue();
			
			if ((key != null && !key.isEmpty() && key.length() > 0) && (value != null && !value.isEmpty() && value.length() > 0)) {
				System.out.println("Hi");
				finalMap.put(key, value);
			} else {
				System.out.println("Hi2");
				continue;
			}
			
		}
		return finalMap;
	}
}
