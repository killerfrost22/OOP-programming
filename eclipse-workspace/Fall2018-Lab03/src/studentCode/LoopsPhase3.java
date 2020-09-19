package studentCode;
import java.util.Scanner;

public class LoopsPhase3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Triangle Size? ");
		int size = sc.nextInt();


		//YOUR CODE HERE
		for(int row = 0; row < size; row++) {
			for(int col = 0; col <= row; col++) {
			System.out.print("*");
			}
				
			System.out.println();
		
		}
		
		//YOUR CODE HERE
		

		sc.close();
	}

	}
