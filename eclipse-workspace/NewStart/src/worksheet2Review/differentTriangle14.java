package worksheet2Review;
import java.util.Scanner;
public class differentTriangle14 {

	public static void main(String[] args) {
		Scanner type = new Scanner(System.in);
		
		System.out.print("Enter size: ");
		int size = type.nextInt();
		System.out.print("Enter a character: ");
		char symbol = type.next().charAt(0);
		
		for(int row = 0; row< size; row++) {
			if(row%2 ==0) {
				for(int character = 0; character <size-row ; character++) {
					System.out.print("*");
				}
				System.out.print("\n");
			}else {
				for(int character = 0; character< size-row; character++) {
					System.out.print(symbol);
				}
				System.out.print("\n");
			}
		}
		type.close();
	}
	}
				
				
				