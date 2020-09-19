import java.util.Scanner;
public class DoWhile {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int milk = 0;
		int bread = 0;
		
		System.out.println("Enter item: ");
		String item = scanner.next();
		do {
			
			if(item.equals("milk")) {
				milk++;
			}else if(item.equals("bread")) {
				bread++;
			}else {
				System.out.println("Invalid item");
			}
		}while(item.equals("done")) {
			
		
		int total = milk + bread;
		System.out.println("Item: " + total);
		double price = milk*3.0  + bread*2.0;
		System.out.println("Total: $" + price);
		}	
		

	}

}
