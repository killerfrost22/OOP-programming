package staticmethods;

public class ReturningValues {
	
	/* Returning a string.*/
	public static String createsMessage(String name) {
		String fullMessage, greeting;
		
		if (name.equals("Raquel")) {
			greeting = " BFF";
		} else {
			greeting = " Friend";
		}
		
		/* Can we make the above code shorter? */
		fullMessage = "Hi " + name + greeting;

		return fullMessage; /* Return always ends a method */
	}
	
	/* Returning an integer. */
	public static int maximum(int x, int y) {
		int max;
		
		if (x >= y) {
			max = x;
		} else {
			max = y;
		}
		return max;
	}
	
	/* Rewriting previous method. */
	public static int maximumVersion2(int x, int y) {
		if (x >= y) {
			return x; /* Always ends method */
		} else {
			return y;
		}
	}
	
	/* Rewriting previous method. */
	public static int maximumVersion3(int x, int y) {
		if (x >= y) {
			return x;
		} 
		return y;
	}
	
	public static void main(String[] args) {
		String myMessage = createsMessage("Raquel");
		System.out.println(myMessage);
		
		myMessage = createsMessage("Sterling");
		System.out.println(myMessage);
		
		int a = 10, b = 20;
		int result = maximum(a, b);
		System.out.println(result);
		
		result = maximumVersion2(a, b);
		System.out.println(result);
		
		result = maximumVersion3(a, b);
		System.out.println(result);
		
		/* Nesting of calls */
		result = maximum(10, maximum(30, 20));
		System.out.println(result);
	}
}