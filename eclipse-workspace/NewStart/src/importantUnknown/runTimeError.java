package importantUnknown;

public class runTimeError {

	public static void main(String[] args) {
		int number = 6;
		double price = 2.5; //int no more decimal points
		double total;
		
		total = number * price ;
		System.out.println("Total is $ "+ total	);
		System.out.println(1 / 0);
		
	}

}
