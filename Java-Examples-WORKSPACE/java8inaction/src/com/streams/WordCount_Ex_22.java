package com.streams;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class WordCount_Ex_22 {
	public static void main(String[] args) {
		/*
		 * Iterative way
		 */
		final String SENTENCE = " Nel mezzo del cammin di nostra vita " + "mi ritrovai in una selva oscura"
				+ " ch� la dritta via era smarrita ";
		System.out.println("Found " + countWordsIteratively(SENTENCE) + " words");

		/*
		 * Rewriting the WordCounter in functional style
		 */
		Stream<Character> stream = IntStream.range(0, SENTENCE.length()).mapToObj(SENTENCE::charAt);
		System.out.println("Found " + countWords(stream) + " words");

		/*
		 * Making the WordCounter work in parallel
		 */
		Stream<Character> stream2 = IntStream.range(0, SENTENCE.length()).mapToObj(SENTENCE::charAt);
		System.out.println("Found " + countWords(stream2.parallel()) + " words");
	}

	public static int countWordsIteratively(String s) {
		int counter = 0;
		boolean lastSpace = true;
		// Traverse all the characters in the String one by one
		for (char c : s.toCharArray()) {
			if (Character.isWhitespace(c)) {
				lastSpace = true;
			} else {
				if (lastSpace) {
					// increase the word counter when the last character is a
					// space and the currently traversed one isn't
					counter++;
				} else {
					lastSpace = false;
				}

			}
		}
		return counter;
	}

	private static int countWords(Stream<Character> stream) {
		WordCounter wordCounter = stream.reduce(new WordCounter(0, true), WordCounter::accumulate,
				WordCounter::combine);
		return wordCounter.getCounter();
	}
}
