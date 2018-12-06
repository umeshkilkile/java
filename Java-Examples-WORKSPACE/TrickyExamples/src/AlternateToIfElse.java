public class AlternateToIfElse {
	public static void main(String[] args) {

		String countryCode = "US";
		String businessOperationModel = "HS";

		boolean COR_FLAG = false, GLN_FLAG = false, GTIN_FLAG = false, PREPARE_EDM_FLAG = false, UPDATE_EDM_FLAG = false;

		System.out.println("BEFORE --> COR_FLAG : " + COR_FLAG
				+ " , GLN_FLAG : " + GLN_FLAG + ", GTIN_FLAG : " + GTIN_FLAG
				+ ", PREPARE_EDM_FLAG : " + PREPARE_EDM_FLAG
				+ " , UPDATE_EDM_FLAG : " + UPDATE_EDM_FLAG);

		final String TURKEY_COUNTRY_CODE = "TR", ITALY_COUNTRY_CODE = "IT", PERU_COUNTRY_CODE = "PE", ECUADOR_COUNTRY_CODE = "EC", INDONESIA_COUNTRY_CODE = "ID", RUSSIA_COUNTRY_CODE = "RU";

		/*
		 * This constant is to identify DM customer
		 */
		final String DM_BOM = "VDO";
		final String EURONICS_BOM = "CO";
		final String PL91_BOM = "PL91";
		final String HS_BOM = "HS";
		final String QAD_BOM = "INDIGO";

		if (((!(TURKEY_COUNTRY_CODE.equalsIgnoreCase(countryCode)))
				&& (!(ITALY_COUNTRY_CODE.equalsIgnoreCase(countryCode)))
				&& (!(HS_BOM.equalsIgnoreCase(businessOperationModel)))
				&& (!(RUSSIA_COUNTRY_CODE.equalsIgnoreCase(countryCode)))
				&& (!(PL91_BOM.equalsIgnoreCase(businessOperationModel)))
				&& (!(INDONESIA_COUNTRY_CODE.equalsIgnoreCase(countryCode)))
				&& (!(PERU_COUNTRY_CODE.equalsIgnoreCase(countryCode)))
				&& (!(ECUADOR_COUNTRY_CODE.equalsIgnoreCase(countryCode))) && (!(QAD_BOM
					.equalsIgnoreCase(businessOperationModel))))
				&& (DM_BOM.equalsIgnoreCase(businessOperationModel) || EURONICS_BOM
						.equalsIgnoreCase(businessOperationModel))) {
			COR_FLAG = true;
			GLN_FLAG = true;
			GTIN_FLAG = true;
			PREPARE_EDM_FLAG = true;
			UPDATE_EDM_FLAG = false;
		} else if (ITALY_COUNTRY_CODE.equalsIgnoreCase(countryCode)) {
			COR_FLAG = true;
			UPDATE_EDM_FLAG = true;
		}

		System.out.println("AFTER  --> COR_FLAG : " + COR_FLAG
				+ " , GLN_FLAG : " + GLN_FLAG + ", GTIN_FLAG : " + GTIN_FLAG
				+ ", PREPARE_EDM_FLAG : " + PREPARE_EDM_FLAG
				+ " , UPDATE_EDM_FLAG : " + UPDATE_EDM_FLAG);

	}
}
