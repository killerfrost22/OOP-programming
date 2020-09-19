package worksheet2Review;
import java.util.Scanner;
public class whileReview {

	public static void main(String[] args) {
		Scanner type = new Scanner(System.in);
		int a = type.nextInt();
		int b = type.nextInt();
		
		
		if (a%b ==1) {
			a++;
			
		}
		
		while(a<=b) {
			System.out.println(a);
			a= a+2;
		}
//		while(b>=a) {
//			System.out.println(a);
//			a=a + 2;
//			System.out.println(a);
//		}
//			

	}

}
