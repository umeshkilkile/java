import java.util.Arrays;
import java.util.List;

public class CopyOfAlternateToIfElse {
	public static void main(String[] args) {

		String countryCode = "US";
		String businessOperationModel = "HS";

		final String TURKEY_COUNTRY_CODE = "TR", ITALY_COUNTRY_CODE = "IT", PERU_COUNTRY_CODE = "PE", ECUADOR_COUNTRY_CODE = "EC", INDONESIA_COUNTRY_CODE = "ID", RUSSIA_COUNTRY_CODE = "RU";
		final String DM_BOM = "VDO", EURONICS_BOM = "CO", PL91_BOM = "PL91", HS_BOM = "HS", QAD_BOM = "INDIGO";

		final String[] IS_SKIP_COUNTRY_CODES = { TURKEY_COUNTRY_CODE,
				ITALY_COUNTRY_CODE, RUSSIA_COUNTRY_CODE,
				INDONESIA_COUNTRY_CODE, PERU_COUNTRY_CODE, ECUADOR_COUNTRY_CODE };
		final String[] IS_SKIP_BOMS = { HS_BOM, PL91_BOM, QAD_BOM };

		boolean COR_FLAG = false, GLN_FLAG = false, GTIN_FLAG = false, PREPARE_EDM_FLAG = false, UPDATE_EDM_FLAG = false;

		System.out.println("BEFORE --> COR_FLAG : " + COR_FLAG
				+ " , GLN_FLAG : " + GLN_FLAG + ", GTIN_FLAG : " + GTIN_FLAG
				+ ", PREPARE_EDM_FLAG : " + PREPARE_EDM_FLAG
				+ " , UPDATE_EDM_FLAG : " + UPDATE_EDM_FLAG);

		List<String> skipListCountryCodes = Arrays.asList(IS_SKIP_COUNTRY_CODES);
		List<String> skipListBoms = Arrays.asList(IS_SKIP_BOMS);

		if ((!skipListCountryCodes.contains(countryCode) && !skipListBoms.contains(businessOperationModel))) {
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
