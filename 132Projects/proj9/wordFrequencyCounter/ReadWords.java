package wordFrequencyCounter;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Scanner;


public class ReadWords implements Runnable{
	
	WordFrequencyCounter target;
	String fileName;
	
	public ReadWords(WordFrequencyCounter target, String file) {
		this.target = target;
		this.fileName = file;
	}
	@SuppressWarnings("unused")
	private String findWord(String name) {
		// find the name
		for (String next : target.wordList.keySet()) {
			if (next.equals(name)) {
				// found
				return next;
			}
		}
		// not exist
		return null;
	}
	
	@Override
	public void run() {
		Object lock = new Object();
		synchronized (lock) {
		try {
			File file = new File(fileName);
			// get the file
			
			Scanner sc = new Scanner(file);
			String line = sc.nextLine();
			BufferedReader getLine = new BufferedReader(new FileReader(file));
			
			line = getLine.readLine();
			while (line != null) {
				for(String str : (line.split("\\s+"))) {
					target.addWordOccurrence(str);
				}
				getLine.close();
				//get through each line
				try {
					line = sc.nextLine();
				} catch (NoSuchElementException e) {
					// last line has been processed
					line = null;
				}
			}

		}  catch (IOException e1) {
			// TODO Auto-generated catch block 
			e1.printStackTrace();
		}

	}
	
	}	
}
