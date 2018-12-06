public class OnltTest {
	public static void main(String[] args) {
		
		String CST_DATA_SEPARATOR = "\\|";
		String tenant = "HPE";
		
		String data = "0957-2166| |1N|Printer Supplies|Inkjet Supplies|Inkjet printer maintenance & option|243O|246M|270O|270Y|Printing & Multifunction||||WW";
		
		StringBuffer sb = new StringBuffer(data);
		sb.append("|" + tenant);
		
		data = sb.toString();
		
		System.out.println(data);

		String[] input = data.split(CST_DATA_SEPARATOR);


		for (int i = 0; i < input.length; i++) {
			System.out.println("DATA at : " + i + " is : " + input[i]);
		}
	}
}
