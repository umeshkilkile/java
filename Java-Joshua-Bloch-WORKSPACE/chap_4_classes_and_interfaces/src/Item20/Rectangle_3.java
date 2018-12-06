package Item20;

public class Rectangle_3 extends Figure_1 {

	final double length;
	final double width;

	Rectangle_3(double length, double width) {
		this.length = length;
		this.width = width;
	}

	@Override
	double area() {
		return length * width;
	}

}
