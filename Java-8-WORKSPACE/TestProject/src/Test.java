import java.util.Calendar;

public class Test {
	public static void main(String[] args) {

		Calendar today = Calendar.getInstance();

		System.out.println(today);
		Calendar effectiveDate = Calendar.getInstance();
		effectiveDate.set(2017, 10 - 1, 27);

		System.out.println(effectiveDate);
		System.out.println("After : " + effectiveDate.before(today));

		
		System.out.println(T7744_PRC_RCM_RVW_STS_TYP.AMEND.getPrcRcmRvwStsTyp());
	}
}
