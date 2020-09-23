package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import bst.EmptyPolyTree;
import bst.EmptyPolyTreeException;
import bst.PolyTree;

public class StudentTests {

	@Test
	public void studentTest1() {
		// size test and remove
		assertEquals(7, TestData.examplePolyTree1().treeSize());

	}

	@Test
	public void studentTest2() {
		// lookupvalue test
		try {
			TestData.examplePolyTree1().lookupValueByKey(null);
			assertTrue(false);
		} catch (IllegalArgumentException e) {
			assertTrue(true);
		} finally {
			TestData.examplePolyTree1().lookupValueByKey(111);
		}
	}
	@Test
	public void studentTest3() {
		PolyTree<Integer, Character> tree= TestData.examplePolyTree2();

	    tree= tree.deleteKeyValuePair(13);
	    System.out.println(tree.treeSize());
	    System.out.println(tree.toString());
	    assertEquals(8, tree.treeSize());
	    assertEquals("1+e 2+l 3+e 5+p 7+h 11+a 17+t 17+t ", tree.toString());
	}
	
	@Test public void testPublic4() {
	    assertEquals("1+d 5+o 6+l 7+p 11+h 13+i 17+n ",
	                 TestData.examplePolyTree1().toString());
	  }
	@Test public void testPublic5() {
		  System.out.print(TestData.examplePolyTree1().distanceFromRoot(17));
	    assertEquals(2, TestData.examplePolyTree1().distanceFromRoot(17));
	    assertEquals(4, TestData.examplePolyTree2().distanceFromRoot(2));
	  }
}
