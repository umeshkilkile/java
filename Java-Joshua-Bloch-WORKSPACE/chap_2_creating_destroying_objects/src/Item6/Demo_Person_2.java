package Item6;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class Demo_Person_2 {
	private final Date birthDate;

	public Demo_Person_2(Date birthDate) {
		this.birthDate = birthDate;
	}

	// DON'T DO THIS!
	public boolean isBabyBoomer() {
		// Unnecessary allocation of expensive object
		Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
		gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
		Date boomStart = gmtCal.getTime();
		gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
		Date boomEnd = gmtCal.getTime();
		return birthDate.compareTo(boomStart) >= 0 && birthDate.compareTo(boomEnd) < 0;
	}

	public static void main(String[] args) {
		Demo_Person_2 umesh = new Demo_Person_2(new Date(1965,12,18));
		System.out.println(umesh.isBabyBoomer());
	}
}

/*
 * NOTE : The isBabyBoomer method unnecessarily creates a new Calendar,
 * TimeZone, and two Date instances each time it is invoked.
 */
