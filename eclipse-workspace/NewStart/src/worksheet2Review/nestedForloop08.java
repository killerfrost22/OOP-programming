package worksheet2Review;
import java.util.Scanner;
public class nestedForloop08 {

	public static void main(String[] args) {
		Scanner type = new Scanner(System.in);
		System.out.print("Enter Size:");
		int size = type.nextInt();
		System.out.print("Enter Character: ");
		char symbol = type.next().charAt(0);
			
		for(int row =  0; row<size;row++) {
			for(int col = 0; col <= row; col ++ ){
				System.out.print(symbol);
			}
			System.out.print("\n");

		
			}
	type.close();	
	}
	
	}
//for(int cha = 2*(size-row); cha>0;cha--) {
//System.out.print(symbol);
//}

