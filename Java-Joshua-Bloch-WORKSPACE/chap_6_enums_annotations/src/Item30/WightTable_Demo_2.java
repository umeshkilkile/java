package Item30;

public class WightTable_Demo_2 {
	public static void main(String[] args) {
		double earthWeight = Double.parseDouble("60");
		double mass = earthWeight / Planet.EARTH.surfaceGravity();
		System.out.println(Planet.EARTH.surfaceGravity());
		System.out.println(mass);
		for (Planet p : Planet.values())
			System.out.printf("Weight on %s is %f%n", p, p.surfaceWeight(mass));
	}
}
