package com.reusing.classes;

/*
 * Guaranteeing proper cleanup
 */
public class CADSystem_Demo extends Shape {
	private Circle c;
	private Triangle t;
	private Line[] lines = new Line[3];

	public CADSystem_Demo(int i) {
		super(i + 1);
		for (int j = 0; j < lines.length; j++)
			lines[j] = new Line(j, j * j);
		c = new Circle(1);
		t = new Triangle(1);
		System.out.println("Combined constructor");
	}

	public void dispose() {
		System.out.println("CADSystem.dispose()");
		// The order of cleanup is the reverse
		// of the order of initialization:
		t.dispose();
		c.dispose();
		for (int i = lines.length - 1; i >= 0; i--)
			lines[i].dispose();
		super.dispose();
	}

	public static void main(String[] args) {
		CADSystem_Demo x = new CADSystem_Demo(47);
		try {
			// Code and exception handling...
		} finally {
			x.dispose();
		}
	}
}
