package studentCode;

import java.util.Scanner;

public class MaxOfTwoV1 {

	public static void main(String[] args) {
		//YOUR CODE IN HERE
		
		Scanner myScanner1 = new Scanner(System.in);

		int x;
		x = myScanner1.nextInt();
		int y;
		y = myScanner1.nextInt();
		
		
		if (x> y){
			System.out.println(x + " is greater than " + y);
			}
		else 
			{
				System.out.println(y + " is greater than or equal to " + x);
				}
		
		//YOUR CODE IN HERE
		
		
		myScanner1.close();

	}
	
	
	
	
}
