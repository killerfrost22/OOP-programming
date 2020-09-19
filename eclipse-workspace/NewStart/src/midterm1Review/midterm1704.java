package midterm1Review;
import java.util.Random;
import java.util.Scanner;
public class midterm1704 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Random random = new Random();
		int endOfRange = 10;
		/* Generates random value between 1 and endOfRange */
		int valueToGuess = random.nextInt(endOfRange) + 1;
		
		int maximum = 5;
		int attempt = 0;
		do {
			attempt++;
			int try1 = scanner.nextInt();
				if(try1< valueToGuess) {
					System.out.print("too low");
				}else if(try1>valueToGuess){
					System.out.print("too high");
				}else {
					System.out.println("You won");
				}
		}while(attempt<maximum);
	}

}
