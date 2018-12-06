package Item15;

public class Immutable_Demo_1 {
	public static void main(String[] args) {
		Complex complex = new Complex(100, 200);
		System.out.println(complex);

		Complex complex2 = complex.add(complex);
		System.out.println(complex2);

		Complex complex3 = complex2.subtract(complex);
		System.out.println(complex3);

		Complex complex4 = complex2.divide(complex3);
		System.out.println(complex4);

		Complex complex5 = complex.add(Complex.ONE);
		System.out.println(complex5);
	}
}
