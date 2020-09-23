package wordFrequencyCounter;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeMap;

public class WordFrequencyCounter {

	WordFrequencyCounter target;
	String fileName;

	TreeMap<String, Integer> wordList;

	// constructor
	public WordFrequencyCounter() {
		wordList = new TreeMap<String, Integer>();
	}

	@SuppressWarnings("unused")
	public void addWordOccurrence(String word) {
		String newWord = word.toLowerCase();
		newWord = newWord.replace(" ", "");
		if (word == null) {// word is null
			throw new IllegalArgumentException("null");
		}if (word.isEmpty()||(newWord == null) || newWord.isEmpty()) {
			// when the input is empty or newword doesnt qualify
			return;
		}while (!Character.isLetterOrDigit(newWord.charAt(newWord.length() - 1))) {
			newWord = newWord.substring(0, newWord.length() - 1);
		}if (wordList.containsKey(newWord)) {// contains the key word
			wordList.put(newWord, wordList.get(newWord) + 1);
		} else {// add to the treemap
			wordList.put(newWord, 1);
		}

	}

	@SuppressWarnings("unused")
	private boolean findName(String name) {
		// find the name
		for (String next : wordList.keySet()) {
			if (next.equals(name)) {
				// found
				return true;
			}
		}
		// not exist
		return false;
	}

	public int getOccurrences(String word) {
		if (word == null) {
			// word not exist
			throw new IllegalArgumentException();
		} else { // return the int of occurances of the word
			return wordList.containsKey(word) ? wordList.get(word) : 0;
		}
	}

	public int numWords() {
		return this.wordList.size();//list size
	}

	public void readWords(List<String> fileNames) {
		if (fileNames == null) {
			throw new IllegalArgumentException("null");
		} else {
			Thread[] threads = new Thread[fileNames.size()];// create a thread
			// read the file when a thread is opened
			for (int i = 0; i < fileNames.size(); i++) {
				threads[i] = new Thread(new ReadWords(this, fileNames.get(i)));
			}
			// ruun threads
			for (int index = 0; index < threads.length; index++) {
				threads[index].start();
			}
			// loop through the threads
			for (int j = 0; j < threads.length; j++) {
				try {
					threads[j].join();
				} catch (InterruptedException e) {//exception occured when no thread
					System.err.println(e.getMessage());
				}
			}
		}
	}

	public boolean removeWordOccurrence(String word) {
		if ((word == null) || word.equals("")) {// word is null
			throw new IllegalArgumentException();
		}
		if (!wordList.containsKey(word)) {// not contains the word
			return false;
		}
		if (wordList.get(word) > 1) {// when there is more than one input has shown
			wordList.put(word, wordList.get(word) - 1);
		} else {
			wordList.remove(word);
		}
		return true;
	}

	// store elements set result
	public Set<String> wordsWithOccurrences(int occurrences) {
		Set<String> result = new HashSet<String>();
		if (wordList.isEmpty() || !wordList.containsValue(occurrences)) {
			return result; // make sure it has the occurances we want to find
		} else {
			for (String word : wordList.keySet()) {// search through the keyset
				if (wordList.get(word) == occurrences) {
					result.add(word);
				}
			}
		}
		return result;
	}

}
