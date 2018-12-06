package Item19;

import static Item19.PhysicalConstants_2.*;

public class PhysicalConstants_2_Demo {
	double atoms(double mols) {
		return AVOGADROS_NUMBER * mols;
	}

	public static void main(String[] args) {
		PhysicalConstants_2_Demo obj = new PhysicalConstants_2_Demo();
		double d = obj.atoms(12345.567);
		System.out.println(d);
	}
}

/*
 * NOTES :
 * 
 * 1. If you make heavy use of the constants exported by a utility class, you
 * can avoid the need for qualifying the constants with the class name by making
 * use of the static import facility, introduced in release 1.5:
 * 
 * 2. In summary, interfaces should be used only to define types. They should
 * not be used to export constants.
 */