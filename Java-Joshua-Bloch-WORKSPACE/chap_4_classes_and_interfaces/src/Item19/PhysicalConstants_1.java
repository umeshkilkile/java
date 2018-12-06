package Item19;

/*
 * Item 19: Use interfaces only to define types
 */

// Constant interface antipattern - do not use!
public interface PhysicalConstants_1 {
	// Avogadro's number (1/mol)
	static final double AVOGADROS_NUMBER = 6.02214199e23;
	// Boltzmann constant (J/K)
	static final double BOLTZMANN_CONSTANT = 1.3806503e-23;
	// Mass of the electron (kg)
	static final double ELECTRON_MASS = 9.10938188e-31;
}

/*
 * NOTES :
 *
 * 1. The constant interface pattern is a poor use of interfaces.
 */
