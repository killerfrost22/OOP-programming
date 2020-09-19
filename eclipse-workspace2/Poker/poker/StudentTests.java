package poker;

import static org.junit.Assert.*;
import org.junit.Test;

public class StudentTests {

	
//	@Test
//	public void testDeck() {
//		Deck test1 = new Deck();
//		System.out.println(test1);
//		
//		test1.cut(4);
//	    System.out.println(test1);
//	}
	
	@Test
	public void testExampleTest_SinglePairTest() {
		Card[] testHand = new Card[5];
		testHand[0] = new Card(1,1);
		testHand[1] = new Card(2,1);
		testHand[2] = new Card(3,1);
		testHand[3] = new Card(4,1);
		testHand[4] = new Card(5,1);
		assertFalse(PokerHandEvaluator.hasPair(testHand));
	}
	
	
//	@Test
//	public void testExampleTest_twoPairTest() {
//		Card[] testHand = new Card[5];
//		testHand[0] = new Card(1,0);
//		testHand[1] = new Card(5,2);
//		testHand[2] = new Card(1,3);
//		testHand[3] = new Card(5,3);
//		testHand[4] = new Card(2,2);
//		assertFalse(PokerHandEvaluator.hasTwoPair(testHand));
//	}
//	@Test
//	public void testExampleTest_hasThreeOfAKindTest() {
//		Card[] testHand = new Card[5];
//		testHand[0] = new Card(1,1);
//		testHand[1] = new Card(1,2);
//		testHand[2] = new Card(1,3);
//		testHand[3] = new Card(2,1);
//		testHand[4] = new Card(3,1);
//		assertFalse(PokerHandEvaluator.hasThreeOfAKind(testHand));
//	}

	@Test
	public void testExampleTest_TestStraight() {
		Card [] testHand= new Card[5];
		
		testHand[0] = new Card(10,0);
		testHand[1] = new Card(11,3);
		testHand[2] = new Card(12,2);
		testHand[3] = new Card(13,3);
		testHand[4] = new Card(1,3);
	
		System.out.println(PokerHandEvaluator.hasStraight(testHand));
		assertTrue(PokerHandEvaluator.hasStraight(testHand));
	}

	
	@Test
	public void testExampleTest_PokerStraight4() {
		Card [] testHand= new Card[5];
		
		testHand[0] = new Card(13,0);
		testHand[1] = new Card(13,1);
		testHand[2] = new Card(13,2);
		testHand[3] = new Card(13,3);
		testHand[4] = new Card(11,0);
	
		System.out.println(PokerHandEvaluator.hasStraight(testHand));
	}
	
//	@Test
//	public void testExampleTest_PokerStraight2() {
//		Card [] testHand= new Card[5];
//		
//		testHand[0] = new Card(3,0);
//		testHand[1] = new Card(4,3);
//		testHand[2] = new Card(1,2);
//		testHand[3] = new Card(2,3);
//		testHand[4] = new Card(13,3);
//	
//		System.out.println(PokerHandEvaluator.hasStraight(testHand));
//		assertTrue(PokerHandEvaluator.hasStraight(testHand));
//		
//	} (deliberately wrong)
	@Test
	public void testExampleTest_TestStraight1() {
		Card [] testHand= new Card[5];
		
		testHand[0] = new Card(10,0);
		testHand[1] = new Card(11,3);
		testHand[2] = new Card(12,2);
		testHand[3] = new Card(13,3);
		testHand[4] = new Card(1,3);
	
		System.out.println(PokerHandEvaluator.hasStraight(testHand));
		assertTrue(PokerHandEvaluator.hasStraight(testHand));
	}
	
	public void testExampleTest_PokerStraight3() {
		Card [] testHand= new Card[5];
		
		testHand[0] = new Card(13,0);
		testHand[1] = new Card(9,1);
		testHand[2] = new Card(12,2);
		testHand[3] = new Card(11 ,3);
		testHand[4] = new Card(10,0);
	
		System.out.println(PokerHandEvaluator.hasStraight(testHand));
		
		
	}
	
	
	@Test
	public void testExampleTest_fullhouse() {
		Card testHand[] = new Card[5];
		testHand[0] = new Card(7,1);
		testHand[1] = new Card(12,0);
		testHand[2] = new Card(7,2);
		testHand[3] = new Card(12,3);
		testHand[4] = new Card(7,3);
		assertTrue(PokerHandEvaluator.hasFullHouse(testHand));
	}

}