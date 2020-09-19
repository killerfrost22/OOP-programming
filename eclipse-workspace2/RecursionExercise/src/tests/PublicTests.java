package tests;
import junit.framework.TestCase;

import exercise.Utilities;

public class PublicTests extends TestCase {
	
	public void testCount() {
		int result = Utilities.countChar("abaaac", 'a');
	
		assertTrue(result == 4);
	}
	
	public void testRemoveChar() {
		String result = Utilities.removeChar("abaaac", 'a');
	
		assertTrue(result.equals("bc"));
	}
	
	public void testReverse() {
		String result = Utilities.reverse("abc");
	
		assertTrue(result.equals("cba"));
	}
}
