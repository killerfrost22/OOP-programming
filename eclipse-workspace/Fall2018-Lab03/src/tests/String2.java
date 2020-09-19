package tests;
import java.util.Scanner;

public class String2 {

	public static void main(String[] args) {
		Scanner keyboardInput = new Scanner (System.in);
	
		String answer = keyboardInput.next();
		System.out.println("The answer is : " + answer);
		keyboardInput.close();
		
	}
}