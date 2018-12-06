package Item30;

public class EnumDemo_5 {
	public static void main(String[] args) {
		PayrollDay day = PayrollDay.MONDAY;
		double d = day.pay(8, 200);
		System.out.println(d);
	}
}
