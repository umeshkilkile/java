package Item5_1_badway;

import java.util.List;

/*
 * Many classes depend on one or more underlying resources. For example, a spell
checker depends on a dictionary. It is not uncommon to see such classes
implemented as static utility classes
 */

//Inappropriate use of static utility - inflexible & untestable!
public class SpellChecker {
	private static final Lexicon dictionary = new Lexicon();

	private SpellChecker() {
	} // Noninstantiable

	public static boolean isValid(String word) {
		return false;
	}

	public static List<String> suggestions(String typo) {
		return null;
	}
}

/*
 * Static utility classes and singletons are inappropriate for classes whose
 * behavior is parameterized by an underlying resource.
 */