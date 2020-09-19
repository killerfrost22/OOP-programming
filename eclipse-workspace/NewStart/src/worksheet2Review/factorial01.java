package worksheet2Review;
import java.util.Scanner;
public class factorial01 {

	public static void main(String[] args) {
		Scanner type = new Scanner(System.in);
		System.out.println("Enter a number to do factorial: ");
		int a = type.nextInt();
		int fact = 1;
//		int b = factorial(a);
		for (int num = 1; num <= a; num++) {
			fact = num*fact;
		}
			System.out.print(fact);
		}
	

// or use a different method 
	public static void task() {
		Scanner type = new Scanner(System.in);
		System.out.println("Enter a number to do factorial: ");
		int b = type.nextInt();
		int c = factorial(b);
	}


private static int factorial(int c) {
	
	
	if(c == 0) {
		return 1;
	}else {
		return(c *(factorial(c-1)));
	}
	}

}
	