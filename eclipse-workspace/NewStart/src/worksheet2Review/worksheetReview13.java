package worksheet2Review;
import java.util.Scanner;
public class worksheetReview13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner type = new Scanner(System.in);
		System.out.println("pls enter an integer between 255 and 0");
		
		int numValue = type.nextInt(); 
		String s = "";
		for(int j = 0; j <8; j++) {
			if(numValue%2 == 0) {
				s = "0"+ s;
			}else if(numValue%2 ==1){
				s = "1" +s;
			}
			numValue = numValue/2;
			System.out.println("Binary equivalent is:"+ s);
			}
		System.out.println("Binary equivalent is:"+ s);
	}
}

