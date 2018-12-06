package Item18;

public interface SingerSongwriter_3 extends Singer_1, Songwriter_2 {
	AudioClip strum();

	void actSensitive();
}

/*
 * NOTES:
 * 
 * 1. Existing classes can be easily retrofitted to implement a new interface.
 * 2. Interfaces are ideal for defining mixins.
 * 
 * 3. Interfaces allow the construction of nonhierarchical type frameworks.
 * 
 * 4. Interfaces enable safe, powerful functionality enhancements
 * 
 * 5. It is far easier to evolve an abstract class than an interface.
 * 
 * 6. Once an interface is released and widely implemented, it is almost
 * impossible to change.
 */