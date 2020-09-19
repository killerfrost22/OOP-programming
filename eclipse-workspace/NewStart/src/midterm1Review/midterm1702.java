package midterm1Review;

import java.util.Scanner;

public class midterm1702 {

	public static void main(String[] args) {
		
		Scanner type = new Scanner(System.in);
		System.out.print("Enter Size:");
		int size = type.nextInt();
		double answer=0;
		for(double i = 1; i <= size; i++) {
			
			answer += 1/i;
		}
		
		
	}

}
