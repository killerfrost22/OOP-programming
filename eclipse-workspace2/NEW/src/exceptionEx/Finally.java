package exceptionEx;
import java.util.*;
public class Finally {
	public static void A() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number of miles: ");
		int miles = scanner.nextInt();
		
		System.out.println("Enter number of gallons: ");
		int gallons = scanner.nextInt();

		try {
			int milesPerGallon = miles/gallons;
			System.out.println("Miles per gallon is: " + milesPerGallon);
		} finally {
			System.out.println("Before leaving method A (finally message)");
		} 
		
		scanner.close();
	}
		
	public static void main(String[] args) {
		try {
			System.out.println("Before calling method A");
			A();
			System.out.println("After calling method A");
		} catch(ArithmeticException e) {
			System.out.println("Invalid value provided");
			System.out.println("Default Message: " + e.getMessage());
		}
		System.out.println("Thank you for using our system");
	}
}