package worksheet2Review;
import java.util.Scanner;

public class labHourglass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner type = new Scanner(System.in);
		System.out.print("Enter Size:");
		int size = type.nextInt();
		System.out.print("Enter Character: ");
		char symbol = type.next().charAt(0);
		
		
		for(int row =  0; row<size;row++) {
			for(int space = 0; space < row; space ++ ) {
				System.out.print(" ");
			}
			for(int cha = 2*(size-row); cha>0;cha--) {
				System.out.print(symbol);
		}
		System.out.print("\n");
		// upper half 
		
		
		
		
		
		
		
	}
		type.close();
	}
}
		
		
		
		
		//String s = " ";
//		for(int row = 0; row<size; row ++) 
//			s += " " + symbol ;
//			String w = " ";
//		for (int row = 0; row < size; row ++)
//			w+= " ";
//			for (int row = size; row > 0; row--) {
//		            System.out.print(w.substring(row));
//		            System.out.println(s.substring((size - row) * 2));
//		        }
//		        for (int row = 2; row <= size; row++) {
//		            System.out.print(w.substring(row));
//		            System.out.println(s.substring((size - row) * 2));
//			
		
		
