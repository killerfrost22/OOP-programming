package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import wordFrequencyCounter.WordFrequencyCounter;

public class StudentTests {

	@Test
	public void studentTest1() {
		WordFrequencyCounter wfc = new WordFrequencyCounter();
		String[] words = { "abc", "ab", "cc", "ww" };

		// add the words in the array
		for (String word : words) {
			wfc.addWordOccurrence(word);
		}

		for (String word : words) {
			assertEquals(1, wfc.getOccurrences(word));
		}
		// test of the word occurance for 1
		for (String word : words) {
			assertEquals(1, wfc.getOccurrences(word));
		}

	}

	@Test
	public void studentTest2() {
		WordFrequencyCounter wfc = new WordFrequencyCounter();
		String[] words = { "Java", "loves", "you", "Java", "loves", "me", "Java",
				"loves", "for", "us", "all", "to",
				"be", "very", "very", "happy", "so", "all", "of", "us", "should",
				"join", "in", "thanking", "Java",
				"today" };

		for (String word : words) {
			wfc.addWordOccurrence(word);
		}
		assertTrue(TestUtilities.compareCollection(wfc.wordsWithOccurrences(4), 
				Arrays.asList("java")));

	}

	@Test
	public void studentTest3() {
		WordFrequencyCounter wfc = new WordFrequencyCounter();
		String[] words = { "aa", "bb", "cc", "dd", "ee", "ff", "gg", "mks" };

		wfc.readWords(Arrays.asList("public4-words"));

		assertEquals(42, wfc.numWords());

		for (String word : words) {
			assertEquals(0, wfc.getOccurrences(word));
		}
	}

	@Test
	public void testStudent4() {
		WordFrequencyCounter wfc = new WordFrequencyCounter();
		String[] words = { "Java", "loves", "you", "Java", "loves", "me", "Java",
				"loves", "for", "us", "all", "to",
				"be", "very", "very", "happy", "so", "all", "of", "us", "should", 
				"join", "in", "thanking", "Java",
				"today" };
		
		// add the words in the array
		for (String word : words) {
			wfc.addWordOccurrence(word);
		}
	}
		
}
