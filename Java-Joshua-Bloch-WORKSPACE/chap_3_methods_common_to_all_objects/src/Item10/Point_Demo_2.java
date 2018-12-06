package Item10;

public class Point_Demo_2 {
	public static void main(String[] args) {
		
		ColorPoint cp1 = new ColorPoint(10, 200, new Color("Red"));
		ColorPoint cp2 = new ColorPoint(10, 200, new Color("Red"));
		
		System.out.println("cp1 : " + cp1.hashCode() + ", cp2 : " + cp2.hashCode());
		System.out.println("After overriding equals() : cp1 and cp2 : " + cp1.equals(cp2));
	}
}
