package com.streams;

import java.util.Spliterator;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class WordCount_Ex_23 {
	public static void main(String[] args) {
		/*
		 * Iterative way
		 */
		final String SENTENCE = " Nel mezzo del cammin di nostra vita " + "mi ritrovai in una selva oscura"
				+ " ché la dritta via era smarrita ";

		Spliterator<Character> spliterator = new WordCounterSpliterator(SENTENCE);
		Stream<Character> stream = StreamSupport.stream(spliterator, true);

		System.out.println("Found " + countWords(stream) + " words");
	}

	private static int countWords(Stream<Character> stream) {
		WordCounter wordCounter = stream.reduce(new WordCounter(0, true), WordCounter::accumulate,
				WordCounter::combine);
		return wordCounter.getCounter();
	}
}
