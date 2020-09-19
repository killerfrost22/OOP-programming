package poker;
import static org.junit.Assert.*;

import org.junit.Test;
public class test {
//	@Test
//	public void testExampleTest_TestStraight() {
//		Card [] testHand= new Card[5];
//		
//		testHand[0] = new Card(10,0);
//		testHand[1] = new Card(11,3);
//		testHand[2] = new Card(12,2);
//		testHand[3] = new Card(13,3);
//		testHand[4] = new Card(1,3);
//	
//		System.out.println(PokerHandEvaluator.hasStraight(testHand));
//		assertTrue(PokerHandEvaluator.hasStraight(testHand));
//	}
//	correct @Test
//	public void testExampleTest_PokerStraight2() {
//		Card [] testHand= new Card[5];
//		
//		testHand[0] = new Card(13,0);
//		testHand[1] = new Card(9,1);
//		testHand[2] = new Card(12,2);
//		testHand[3] = new Card(11 ,3);
//		testHand[4] = new Card(10,0);
//	
//		System.out.println(PokerHandEvaluator.hasStraight(testHand));
//		
//		
//	}
	// wrong @Test
//	public void testExampleTest_PokerStraight3() {
//		Card [] testHand= new Card[5];
//		
//		testHand[0] = new Card(1,0);
//		testHand[1] = new Card(2,1);
//		testHand[2] = new Card(2,2);
//		testHand[3] = new Card(2,3);
//		testHand[4] = new Card(2,0);
//	
//		System.out.println(PokerHandEvaluator.hasStraight(testHand));
//		
//		
//	}
	@Test
	public void testExampleTest_PokerStraight4() {
		Card [] testHand= new Card[5];
		
		testHand[0] = new Card(5,0);
		testHand[1] = new Card(4,3);
		testHand[2] = new Card(1,1);
		testHand[3] = new Card(2,2);
		testHand[4] = new Card(3,3);
	
		System.out.println(PokerHandEvaluator.hasStraight(testHand));
		assertTrue(PokerHandEvaluator.hasStraight(testHand));
		
	}
	
}

