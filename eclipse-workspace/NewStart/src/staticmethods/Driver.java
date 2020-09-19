package staticmethods;

public class Driver {
	public static void main(String[] args) {
		System.out.println("Triangle with 6 rows");
		Triangle.printTriangle(6);
		
		System.out.println("Triangle with 10 rows");	
		Triangle.printTriangle(10);
		
		System.out.println("Upside Down Triable with 15 rows");
		Triangle.printUpsideDownTriangle(15);
		/* try calling Triangle.printStars */
	}
}