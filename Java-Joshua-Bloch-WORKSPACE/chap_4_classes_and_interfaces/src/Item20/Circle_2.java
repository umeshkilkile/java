package Item20;

public class Circle_2 extends Figure_1 {

	final double radius;

	Circle_2(double radius) {
		this.radius = radius;
	}

	@Override
	double area() {
		return Math.PI * (radius * radius);
	}

}
