package Item10;

/**
 * 
 * @author kilkile
 *
 *         Item 8: Obey the general contract when overriding equals. Overriding
 *         a equals method
 */
public class Point {
	private int x;
	private int y;

	public Point() {

	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	/**
	 * If you not override equals, than the Object class's equals method gets
	 * called
	 */
	@Override
	public boolean equals(Object o) {
		System.out.println("equals from Point");

		// This test is unnecessary
		/*
		 * if(null == o){ return false; }
		 */

		/**
		 * instanceof operator is specified to return false if its first operand
		 * is null, regardless of what type appears in the second operand.
		 * Therefore the type check will return false if null is passed in, so
		 * you don’t need a separate null check.
		 */
		if (!(o instanceof Point)) {
			return false;
		}

		Point point = (Point) o;
		return (point.x == this.x && point.y == this.y);
	}
}
