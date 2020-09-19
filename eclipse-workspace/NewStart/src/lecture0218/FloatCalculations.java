package lecture0218;

public class FloatCalculations {
	private final static double EPSILON = 0.0000000001;
	
	public static void main(String[] args) {
		double difference = 3.9 - 3.8;
		
		System.out.println("3.9 - 3.8 = " + difference);
		if ((Math.abs(difference) - 0.10) < EPSILON) {
			System.out.println("Not exactly .10, but we will accept it as .10");
		} else {
			System.out.println("They are different.");
		}
	}
}
