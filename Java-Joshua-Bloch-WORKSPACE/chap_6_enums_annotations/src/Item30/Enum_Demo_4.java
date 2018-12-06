package Item30;

public class Enum_Demo_4 {
	public static void main(String[] args) {
		double x = Double.parseDouble("10");
		double y = Double.parseDouble("20");
		for (Operations2 op : Operations2.values())
			System.out.printf("%f %s %f = %f%n", x, op, y, op.apply(x, y));

	}
}
