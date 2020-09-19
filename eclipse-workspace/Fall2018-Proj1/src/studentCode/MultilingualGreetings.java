package studentCode;

import java.util.Scanner;

public class MultilingualGreetings {
	private static String greetingString;
	

	//CODE ABOVE HERE IS GIVEN TO YOU - DO NOT ALTER IT
	//YOUR CODE SHOULD USE THE ABOVE VARIABLE 

	
	
	
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		
				
		//YOUR CODE IN HERE - THE COMMENTS ARE THERE TO HELP GUIDE YOU
		System.out.println("1) English   2) Espanol   3) Francais:");
		int value = myScanner.nextInt();
		String greetingString =(null);
		if (value == 1) {
		greetingString = "Hello World!";
		}
		else if (value == 2) {
		greetingString = "Hola Mundo!";
		}
		else if (value == 3) {
		greetingString = "Bonjour le Monde!";
		}
		else {
		greetingString ="###########";
		}
		
		
			
		//Ask what language they would like to use.

		
		//Based on the language selected above, set the greetingString 
		//  variable in that language.
	
		
		
		//YOUR CODE IN HERE
		
		
	
		//Now, we'll print out the greeting...
		System.out.println(greetingString);
		
		myScanner.close();
		}
	
	}
