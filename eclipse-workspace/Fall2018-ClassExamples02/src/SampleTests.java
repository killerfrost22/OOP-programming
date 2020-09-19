import static org.junit.Assert.*;

import org.junit.Test;

public class SampleTests {

	@Test
	public void testCharMatches() {
		assertEquals(0,CharMatches.countMatches("abc","xyz"));

		assertEquals(1,CharMatches.countMatches("abc","ayz"));

		assertEquals(1,CharMatches.countMatches("abc","xbz"));

		assertEquals(2,CharMatches.countMatches("abc","ayc"));

		assertEquals(3,CharMatches.countMatches("abcd","abc"));
	}

}
