package studentCode;
import java.util.Scanner;

public class LoopsPhase1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Length? ");
		int length = sc.nextInt();

		System.out.print("Interval? ");
		int interval = sc.nextInt();
		
		//YOUR CODE HERE
		//HINT: if you have an iterator in a for loop, and that
		//      iterator%interval is 0, you should print a *
		for (int n = 0; n < length; n++) {
			if(n%interval == 0) {
			System.out.print("*");
		}else{
			System.out.print("|");}
		
		}
		System.out.println();
		
		
		
		

		sc.close();
	}

}
