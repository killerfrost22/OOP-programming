package worksheet2Review;

import java.util.Scanner;

public class TriangleRevesed01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner type = new Scanner(System.in);
		System.out.print("Enter Size:");
		int size = type.nextInt();
		System.out.print("Enter Character: ");
		char symbol = type.next().charAt(0);
		
		for(int row = 0; row < size; row++) {
			for(int col = 0 ;col<=row ; col ++) {
				System.out.print("*");
			}
//			for(int cha =(size-row); cha>0; cha--) {
//				System.out.print(symbol);
//			}
			System.out.print("\n");
			}
		type.close();	
		}

		
	}



//}
//
//for(int row1 = size; row1 > 0; row1--) {
//for(int col1 = row1 ; col1 >0; col1 --) {
//	
//	System.out.print(symbol);
