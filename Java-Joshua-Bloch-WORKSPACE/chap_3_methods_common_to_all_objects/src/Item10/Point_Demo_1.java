package Item10;

public class Point_Demo_1 {
	public static void main(String[] args) {
		
		Point p1 = new Point(10, 200);
		Point p2 = new Point(10, 200);
		
		System.out.println("p1 : " + p1.hashCode() + ", p2 : " + p2.hashCode());
		System.out.println("After overriding equals() : p1 and p2 : " + p1.equals(p2));
		
		Point p3 = new Point(10, 200);
		Point p4 = null;
		
		//System.out.println("p3 : " + p3.hashCode() + ", p4 : " + p4.hashCode());
		System.out.println("After overriding equals() : p3 and p4 : " + p3.equals(p4));
		
	}
}
