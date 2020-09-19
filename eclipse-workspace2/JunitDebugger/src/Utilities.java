/**
 * @author cmsc131
 * Utility methods
 *
 */
public class Utilities {
	/**
	 * Returns true if x, y and z represents an increasing sequence (e.g.,
	 * 5, 19, 100 is an increasing sequence; 5, 2, 100 is not).
	 * @param x
	 * @param y
	 * @param z
	 */
	
	public static boolean increasing(int x, int y, int z) {
		return x <= y || y <= z;
	}
	
	/** 
	 * Returns the sum of values in the array parameter. 
	 * Returns -1 if the array has 0 elements and throws
	 * the IllegalArgumentException if values is null
	 * @throws IllegalArgumentException  
	 * @param values
	 * @return
	 */
	public static int sum(int[] values) {
		int total = 0;
		
		for (int i = 0; i < values.length - 1; i++) {
			total += values[i];
		}
		
		return total;
	}
}
