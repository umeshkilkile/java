package com_14.interfaces;

public class Implement_Simple_Interface_DEMO_4 implements Relatable {

	public int width = 0;
	public int height = 0;
	public Point origin;

	// four constructors
	public Implement_Simple_Interface_DEMO_4() {
		origin = new Point(0, 0);
	}

	public Implement_Simple_Interface_DEMO_4(Point p) {
		origin = p;
	}

	public Implement_Simple_Interface_DEMO_4(int w, int h) {
		origin = new Point(0, 0);
		width = w;
		height = h;
	}

	public Implement_Simple_Interface_DEMO_4(Point p, int w, int h) {
		origin = p;
		width = w;
		height = h;
	}

	// a method for moving the rectangle
	public void move(int x, int y) {
		origin.x = x;
		origin.y = y;
	}

	// a method for computing the area of the rectangle
	public int getArea() {
		return width * height;
	}

	// a method required to implement the Relatable interface
	@Override
	public int isLargerThan(Relatable other) {
		Implement_Simple_Interface_DEMO_4 otherRect = (Implement_Simple_Interface_DEMO_4) other;
		if (this.getArea() < otherRect.getArea())
			return -1;
		else if (this.getArea() > otherRect.getArea())
			return 1;
		else
			return 0;
	}

	@Override
	public Object findLargest(Object obj1, Object obj2) {
		Relatable object1 = (Relatable) obj1;
		Relatable object2 = (Relatable) obj2;
		if ((object1).isLargerThan(object2) > 0)
			return object1;
		else
			return object2;
	}

	@Override
	public Object findSmallest(Object obj1, Object obj2) {
		Relatable object1 = (Relatable) obj1;
		Relatable object2 = (Relatable) obj2;
		if ((object1).isLargerThan(object2) < 0)
			return object1;
		else
			return object2;
	}

	@Override
	public boolean isEqual(Object obj1, Object obj2) {
		Relatable object1 = (Relatable) obj1;
		Relatable object2 = (Relatable) obj2;
		if ((object1).isLargerThan(object2) == 0)
			return true;
		else
			return false;
	}

	public static void main(String[] args) {
		Relatable relatable = new Implement_Simple_Interface_DEMO_4();
		Relatable relatable2 = new Implement_Simple_Interface_DEMO_4(10, 20);

		System.out.println(relatable.isLargerThan(relatable2));

		System.out.println(relatable.findLargest(relatable, relatable2));

		System.out.println(relatable.findSmallest(relatable, relatable2));

		System.out.println(relatable.isEqual(relatable, relatable2));
	}
}
