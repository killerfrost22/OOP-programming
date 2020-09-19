import java.util.Scanner;

public class CharMatches {


	public static int countMatches(String first, String second) {
		//Implement this so that it returns how many characters
		//  in corresponding positions of each string are the
		//  same as each other.  For example "abc" and "cba" 
		//  would return 1.
		
		
		
		
		
		
		
		return 0; //You'll need to have this return the actual count.
	}
	
	
	
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		String s1 = myScanner.next();
		String s2 = myScanner.next();
		
		System.out.println(
			s1 + " and " + s2 + " have " + countMatches(s1,s2) + " matches"
		);
	
		myScanner.close();
	}
	

}
