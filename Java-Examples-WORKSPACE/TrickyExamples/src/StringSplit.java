
public class StringSplit {
	public static void main(String[] args) {
		String blobrecord = "A0X37UT          ABA N U.S. - English localization              20140331   HPI";
		
		
		String PRD_CODE    = blobrecord.substring(0,17).trim();
		String OPTION_CODE = blobrecord.substring(17,21).trim();
		String OPTION_DESC = blobrecord.substring(23,64).trim();
		String OBS_DATE    = blobrecord.substring(64,72).trim();
		String tenant      = blobrecord.substring(73,blobrecord.length()).trim();
		
		System.out.println("PRD_CODE : " + PRD_CODE);
		System.out.println("OPTION_CODE : " + OPTION_CODE);
		System.out.println("OPTION_DESC : " + OPTION_DESC);
		System.out.println("OBS_DATE : " + OBS_DATE);
		
		System.out.println("TENANT : " + tenant);
		
	}
}
