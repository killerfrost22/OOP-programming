package exercise;

/**
 * For this exercise you will implement the functions that
 * are part of the Utilities class. You may not add any instance
 * nor static variables. If you do, you will not be learning the
 * material that will be covered in the final exam. This is a closed
 * exercise.
 * 
 * Due Date: Friday, May 10, 11:30 pm
 * @author cmsc131 Yizhan Ao
 *
 */
public class Utilities {
	/**
	 * Prints a string recursively
	 * @param str
	 */
	public static void printString(String str) {
		if (str.length() == 0) {
			System.out.print("");
		} else {
			System.out.print(str.charAt(0));
			printString(str.substring(1));
		}

	}
	
	/**
	 * Returns the number of instances of target in the string
	 * @param str
	 * @param target
	 * @return
	 */
	public static int countChar(String str, char target) {
		
		int b = 0;
		int c = str.length();
		
		if(c==0) {
			return 0;
		}else {
			if(str.charAt(0) == target){
				b++;
			}
			str = str.substring(1);
			System.out.println(str);
			return countChar(str,target)+b;
		}
	}

	/**
	 * Returns a String without the specified target character.
	 * @param str
	 * @param target
	 * @return
	 */
	
	public static String removeChar(String str, char target) {
		
		String a ="";
		String b ="";
		if(str.length()==0) {
			return b ;
		}
		if(str.charAt(str.length()-1) == target){
			str = str.substring(0, str.length()-1);
			}else if(str.charAt(str.length()-1) != target) {
			b+= str.charAt(str.length()-1);
			str = str.substring(0, str.length()-1);
		}
			
			System.out.println(b);
			//System.out.println(str);
			return removeChar(str,target)+b;
		}
	
	
	

	/**
	 * Returns a string that corresponds to reversing the str parameter
	 * @param str
	 * @return
	 */
	
	public static String reverse(String str) {
		
		String a ="";
		int c = str.length();
		if(c == 0) {
			return a;
		}else if(c!=0) {
			 a += str.charAt(0);
			 str = str.substring(1);
		
			System.out.println(a);
			return reverse(str)+a;
		}
		return a;
		}
		
	
	
	public static void main(String [] args) {

		//String result2 = Utilities.reverse("abc");
		String result3 = Utilities.removeChar("abaaac", 'a');
		String a = "a";
		String b = "b";
		String c = "dasdadac";
		//System.out.println(c.length());
		String d = c.charAt(c.length()-1)+"";
		
	
		System.out.println(result3);
	}
}
