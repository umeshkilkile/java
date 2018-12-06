public class TestStringBuffer {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer(
				"insert into T0000243 ( ORG_NAME, EFFECTIVE_DATE, ISO_CURR_CD, HP_CURR_CD, PRICING_RATE, RATE_FLAG, CURRENCY_DN, TENANT) values (?, to_date(?,'RRMM'), ?, ?, ?, ?, ?, ? )");

		String str = sb.toString();
		int index = str.lastIndexOf("?");
		str = new StringBuilder(str).replace(index, index + 1, "\'HPE\'").toString();
		System.out.println(str);
		
		sb = new StringBuffer(str.toString());
		System.out.println("Hi : " + sb);

		/*String s = sb.toString();

		int lastIndex = s.lastIndexOf("?");

		System.out.println(lastIndex);

		s.replace(s.charAt(lastIndex), "HPE");

		System.out.println(sb);*/

		/*
		 * StringBuffer sb = new StringBuffer(
		 * "insert into T0000243 ( ORG_NAME, EFFECTIVE_DATE, ISO_CURR_CD, HP_CURR_CD, PRICING_RATE, RATE_FLAG, CURRENCY_DN"
		 * ); StringBuffer tmp = new
		 * StringBuffer(") values (?, to_date(?,'RRMM'), ?, ?, ?, ?, ?");
		 * 
		 * 
		 * sb.append(", TENANT"); tmp.append(", "+ "'HPI'" + ")");
		 * 
		 * 
		 * sb.append(tmp.toString());
		 * 
		 * 
		 * System.out.println(sb);
		 */

		/*
		 * sb.append(", TENANT"); tmp.append(", "+ "'HPI'" + " )"); // For the
		 * time being. Later need to replace with actual value
		 * 
		 * System.out.println(sb); System.out.println(tmp);
		 * 
		 * sb.append(tmp.toString());
		 * 
		 * System.out.println("FINAL : " + sb.toString());
		 */
	}
}
