package Item15;

public class Immutable_Demo_2 {
	public static void main(String[] args) {
		Complex2 complex = Complex2.valueOf(100, 200);
		System.out.println(complex);

		Complex2 complex2 = Complex2.valueOfPolar(0.001, 0.02);
		System.out.println(complex2);

	}
}
