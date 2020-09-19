package lab1;
/* 
 * This example illustrates "concatenation" of strings, and
 * shows how Java automatically converts values into strings  
 *
 */

public class Concatenation {
	public static void main(String[] args) {
		int secondsPerMinute = 60;
		int minutesPerLecture = 50;
		int secondsPerLecture = secondsPerMinute * minutesPerLecture;
		
		System.out.println("My " + "name " + "is " + "Fred.");
		System.out.println("There are " + secondsPerLecture + " seconds in a lecture.");
	}
}
