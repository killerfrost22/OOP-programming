package studentCode;
import java.util.Scanner;


public class CryptoQuiz {
	//NOTE: You MUST use these named constants.  The submit server will
	//      fail you on the Task 4 tests if you do not use these named
	//      constants in your code but rather use the actual values.
	static int NUM_BITS1 = 80, NUM_BITS2 = 128, NUM_BITS3 = 168;
	static String CRYPT1 = "Skipjack", CRYPT2 = "Rijndael", CRYPT3 = "TripleDES";
		
		
	
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		
		
		//YOUR CODE IN HERE
		System.out.print("Enter 1 to guess a cryptographic system, 2 to guess how many BITs: ");
		int x;
		x = myScanner.nextInt();
	
		if (x == 1 ) {
			System.out.print("Choose number of BITs: ");
			int n;
			n = myScanner.nextInt();
				if (n == NUM_BITS1) {
					System.out.print("Which cryptographic system uses "+ n + " BITs? ");
					String c;
					c = myScanner.next();
					if (c.equals(CRYPT1)) {
							System.out.println("Correct!");
						}else {
							System.out.println("Incorrect!");
						}				
				}else if (n == NUM_BITS2) {
						System.out.print("Which cryptographic system uses "+ n + " BITs? ");
						String c;
						c = myScanner.next();
						if (c.equals(CRYPT2)) {
							System.out.println("Correct!");
						}else {
							System.out.println("Incorrect!");	
						}
				}else if (n == NUM_BITS3) {
						System.out.print("Which cryptographic system uses "+ n + " BITs? ");
						String c;
						c = myScanner.next();
						if (c.equals(CRYPT3)) {
							System.out.println("Correct!");
						}else {
							System.out.println("Incorrect!");	
						}
					}else {System.out.print("Invalid choice.");
		}}else if(x == 2 ) {
			System.out.print("Choose a cryptographic system: ");
			String b;
			b = myScanner.next();
			if (b.equals(CRYPT1)) {
				System.out.print("How many BITs used in a "+ b + " System? ");
				int n;
				n = myScanner.nextInt();
					if (n == NUM_BITS1 ) {
						System.out.println("Correct!");
					}else {
						System.out.println("Incorrect!");
					}				
			}else if (b.equals(CRYPT2)) {
					System.out.print("How many BITs used in a "+ b + " System? ");
					int n;
					n = myScanner.nextInt();
					if (n == NUM_BITS2) {
						System.out.println("Correct!");
					}else {
						System.out.println("Incorrect!");	
					}
			}else if (b.equals(CRYPT3)) {
					System.out.print("How many BITs used in a "+ b + " System? ");
					int n;
					n = myScanner.nextInt();
					if (n == NUM_BITS3) {
						System.out.println("Correct!");
					}else {
						System.out.println("Incorrect!");	
					}
				}else {System.out.println("Invalid choice.");
				}
				}
		else {System.out.print("Invalid choice.");
				
		}
		
		//YOUR CODE IN HERE		
		
		
		myScanner.close();
	

}}