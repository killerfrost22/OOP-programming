package lab1;
/* 
 * Using == with Strings is usually a mistake!
 * Use equals to compare the contents of two Strings
 * for equality.
 * 
 */

public class ComparingStrings {
	public static void main(String[] args) {
		String s1 = "dog", s2 = "antelope", s3 = "dog";
		
		System.out.println(s1.equals("dog"));
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		System.out.println("Length of s2 is: " + s2.length());
	}
}
