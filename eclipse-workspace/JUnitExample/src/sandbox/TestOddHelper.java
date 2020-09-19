package sandbox;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestOddHelper {

	@Test
	public void testWithPositiveOdd() {
		assertTrue(SimpleLibrary.isOdd(3));
		assertTrue(SimpleLibrary.isOdd(17));
	}


	@Test
	public void testWithPositiveEven() {
		assertFalse(SimpleLibrary.isOdd(2));
		assertFalse(SimpleLibrary.isOdd(18));
	}
	

	@Test
	public void testWithNegativeOdd() {
		assertTrue(SimpleLibrary.isOdd(-3));
		assertTrue(SimpleLibrary.isOdd(-17));
	}
	

	@Test
	public void testWithNegativeEven() {
		assertFalse(SimpleLibrary.isOdd(-2));
		assertFalse(SimpleLibrary.isOdd(-18));
	}
	

	@Test
	public void testWithZero() {
		assertFalse(SimpleLibrary.isOdd(0));
	}
	
}
