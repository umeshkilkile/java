package Item5_1_goodway;

import java.util.List;
import java.util.Objects;

//Dependency injection provides flexibility and testability
public class SpellChecker {
	private final Lexicon dictionary;

	public SpellChecker(Lexicon dictionary) {
		this.dictionary = Objects.requireNonNull(dictionary);
	}

	public boolean isValid(String word) {
		return false;
	}

	public List<String> suggestions(String typo) {
		return null;
	}
}

/*
 * A simple pattern that satisfies this requirement is to pass the resource into
 * the constructor when creating a new instance. This is one form of dependency
 * injection.
 * 
 * The dictionary is a dependency of the spell checker and is injected into the
 * spell checker when it is created.
 */