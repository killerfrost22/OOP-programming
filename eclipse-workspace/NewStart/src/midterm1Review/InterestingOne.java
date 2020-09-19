package midterm1Review;

import java.util.Scanner;

public class InterestingOne {

	public static void main(String[] args) {
		Scanner type = new Scanner(System.in);
		System.out.print("Enter Size:");
		int size = type.nextInt();
		System.out.print("Enter Character: ");
		char symbol = type.next().charAt(0);
		for (int i = 0; i< size; i ++) {
			System.out.print("*");
		}
			System.out.print("\n");
			
		for(int i = 0; i < size-2;i++) {
			System.out.print("*");		
		for(int k = 0; k < size-2; k++) {
			System.out.print(symbol);
			}
			
			System.out.print("\n");
		}
		for(int i = 0; i<size; i++) {
			System.out.print("*");
		}
	
	
	}

	}


