import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class TestIt {
	public static void main(String[] args) {
		String sLine = "SONNNNNNNNNNNNNNYYYY   SF OT - NO LONGER USED";
		boolean isTable25 = true;
		
		boolean skipRow = false;
		
		
		String sKey = (sLine.length()<20)?  new String(sLine) : sLine.substring(0,20);

		System.out.println(sKey);
		
		if (sKey!=null && isTable25 && !(sKey.startsWith("SO") || sKey.startsWith("F1"))){
			skipRow = true;
		}
		
		System.out.println(skipRow);
		
		
		HashMap<String, String> h2 = new HashMap<>();
		h2.put(null, "S1");
		h2.put(null, "S2");
		System.out.println(h2);
		
		Set<String> s2 = new HashSet<>();
		s2.add(null);
		System.out.println(s2);
	}
}
