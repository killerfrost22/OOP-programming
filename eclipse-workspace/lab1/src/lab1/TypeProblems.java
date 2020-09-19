package lab1;
/* 
 * Demo of trying to combine types.
 * Some are OK, others are not!!
 *  
 */

public class TypeProblems {
	public static void main(String[] args) {
		int x = 7, y = 12;
		double d = 72.33;
		boolean b = true;
		char c;
		String s;
		
		x = y + 24;
		 //y = (int)17.3; // WRONG
		d = x;
		// b = 17;	  WRONG
	    // c = "cow"; WRONG		
	    s = "Here is something weird " + x + y;
		System.out.println(s);
	}
}