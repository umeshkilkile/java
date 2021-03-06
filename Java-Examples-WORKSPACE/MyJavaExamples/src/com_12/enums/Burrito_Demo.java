package com_12.enums;

/*
 * An especially nice feature is the way that enums can be used inside switch statements:
 */
public class Burrito_Demo {
	Spiciness degree;

	public Burrito_Demo(Spiciness degree) {
		this.degree = degree;
	}

	public void describe() {
		System.out.print("This burrito is ");
		switch (degree) {
		case NOT:
			System.out.println("not spicy at all.");
			break;
		case MILD:
		case MEDIUM:
			System.out.println("a little hot.");
			break;
		case HOT:
		case FLAMING:
		default:
			System.out.println("maybe too hot.");
		}
	}

	public static void main(String[] args) {
		Burrito_Demo plain = new Burrito_Demo(Spiciness.NOT), greenChile = new Burrito_Demo(Spiciness.MEDIUM),
				jalapeno = new Burrito_Demo(Spiciness.HOT);
		plain.describe();
		greenChile.describe();
		jalapeno.describe();
	}
}
