package worksheet2Review;
import java.util.Scanner;
public class twoDdimensional {

	public static void main(String[] args) {
	Scanner type = new Scanner(System.in);
		int row = type.nextInt();
		int col = type.nextInt();
//		for(int i=0;i< row;i++) {
//			for(int j=0;j<col;j++) {
//				System.out.print("*");
//			}
//			System.out.print("\n");
		int i = 0;
		while(i<col) {
			int j =0;
			while(j<row) {
		System.out.print("*");
		j++;
		}
			i++;
			System.out.print("\n");
		}
		
	}
}
	
		
	


