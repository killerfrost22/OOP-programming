package ReviewWK1;
import java.util.Scanner;
public class dad {

	public static void main(String[] args) {
		Scanner type = new Scanner(System.in);
		System.out.println("Enter cost per credit: ");
		int credit = type.nextInt();
		
		int cost = type.nextInt();
		int costPerCredit = type.nextInt();
		if(credit>=18) {
			cost = costPerCredit*credit/2;	
		}else if( credit<18 &&credit>=0) {
			cost = costPerCredit*credit;
		}
	}

}
