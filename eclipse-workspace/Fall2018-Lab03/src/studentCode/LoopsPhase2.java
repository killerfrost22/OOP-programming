package studentCode;
import java.util.Scanner;

public class LoopsPhase2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Shape? ");
		String shape = sc.next();

		if (shape.equals("square")) {
			System.out.print("Size? ");
			int size = sc.nextInt();

			//YOUR CODE HERE
			for(int row = 0; row<size; row++) {
				for(int col =0; col < size; col++) {
				System.out.print("*");
				}
				
				System.out.println();
			
			}
			
			//YOUR CODE HERE

		} 
		else { //assume rectangle
			System.out.print("Width? ");
			int width = sc.nextInt();
			System.out.print("Height? ");
			int height = sc.nextInt();

			//YOUR CODE HERE
			for (int row = 0; row < height; row ++) {
				for(int col = 0; col < width; col ++) {
					System.out.print("*");
				}
				
				System.out.println();
				
			}
			
			
			
			//YOUR CODE HERE
			
			
		}

		sc.close();
	}

}
