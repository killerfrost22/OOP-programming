import java.util.Scanner;

public class OnTheMoney {

	public static void main(String[] args) {
		
		Scanner type = new Scanner(System.in);
		System.out.print("Type 1 to enter a denomination, 2 to enter a last name: ");
		int number01 = type.nextInt();
		
		
		
		if(number01 == 1 ) {
			System.out.print("Choose a denomination: ");
			int number02 = type.nextInt();
			//the number of 1 
				if (number02 ==1) {
					System.out.print("Which person appears on the 1 dollar bill? ");
					String name01 = type.next();
						if (name01.equals("Washington") ) {
							System.out.println("Correct!");
						}else {
							System.out.println("Incorrect!");
						}
				}else if (number02 ==10) {
					System.out.print("Which person appears on the 10 dollar bill? ");
					String name01 = type.next();
						if (name01.equals("Hamilton")) {
							System.out.println("Correct!");
						}else {
							System.out.println("Incorrect!");
					
						}
				}else if (number02 ==100) {
					System.out.print("Which person appears on the 100 dollar bill? ");
					String name01 = type.next();
						if (name01.equals("Franklin")) {
							System.out.println("Correct!");
						}else {
							System.out.println("Incorrect!");
				}
					
				}else {
					System.out.println("Invalid choice!");
				}
					
			
		}else if (number01 ==2) {
			System.out.print("Choose a name: ");
			String name02 = type.next();
			
			//the number of 2 
				if (name02.equals("Washington")) {
					System.out.print("Which denomination does Washington appear on? ");
					int name01 = type.nextInt();
						if (name01 == 1) {
							System.out.println("Correct!");
						}else {
							System.out.println("Incorrect!");
						}
				}else if (name02.equals("Hamilton")) {
					System.out.print("Which denomination does Hamilton appear on? ");
					int name01 = type.nextInt();
						if (name01 == 10) {
							System.out.println("Correct!");
						}else {
							System.out.println("Incorrect!");
						}
				}else if (name02.equals("Franklin")) {
					System.out.print("Which denomination does Franklin appear on? ");
					int name01 = type.nextInt();
						if (name01 == 100) {
							System.out.println("Correct!");
						}else {
							System.out.println("Incorrect!");
						}
				}else {
					System.out.println("Invalid choice!");
						
						}
					
		}else {
			System.out.println("Invalid Menu Option");
				}
	
		
		type.close();
	}
}
