import java.util.Scanner;
public class scanner {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("E S:");
		int size = scanner.nextInt();
		
		for(int row = 0; row < size;row++) {
			for(int col = 0; col <=size; col++) {
				System.out.println("#");
			}
			for(int cha = size; cha <= size*3;cha ++) {
				System.out.print("*");
			}
		}
		System.out.println("\n");
	}
}
