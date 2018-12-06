package Item6;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

/**
 * 
 * @author kilkile
 *
 *         The improved version of the Person class creates Calendar, TimeZone,
 *         and Date instances only once, when it is initialized, instead of
 *         creating them every time isBabyBoomer is invoked. This results in
 *         significant performance gains if the method is invoked frequently.
 */
public class Demo_Improved_Person_3 {

	private final Date birthDate;

	public Demo_Improved_Person_3(Date birDate) {
		this.birthDate = birDate;
	}

	// Other fields, methods, and constructor omitted
	/**
	 * The starting and ending dates of the baby boom.
	 */
	private static final Date BOOM_START;
	private static final Date BOOM_END;
	static {
		System.out.println("Inside static block");
		Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
		BOOM_START = gmtCal.getTime();
		gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
		BOOM_END = gmtCal.getTime();
	}

	public boolean isBabyBoomer() {
		return birthDate.compareTo(BOOM_START) >= 0 && birthDate.compareTo(BOOM_END) < 0;
	}

	public static void main(String[] args) {
		Demo_Improved_Person_3 umesh = new Demo_Improved_Person_3(new Date(1965, 12, 18));
		System.out.println(umesh.isBabyBoomer());

		Demo_Improved_Person_3 anand = new Demo_Improved_Person_3(new Date(1965, 12, 18));
		System.out.println(anand.isBabyBoomer());
	}
}