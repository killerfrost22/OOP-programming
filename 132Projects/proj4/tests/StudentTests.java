package tests;

import org.junit.*;

import recursionPractice.ListyList;
import recursionPractice.RecursionPracticeMethods;

import static org.junit.Assert.*;

import java.util.Arrays;

public class StudentTests {

	 @Test public void studentTest1() {
		    ListyList<String> list1=
		      MakeListyList.makeList(Arrays.asList("1", "2", "3"));
		    ListyList<String> list2=
		      MakeListyList.makeList(Arrays.asList("0", "2", "1", "2","3", "4"));
		    RecursionPracticeMethods.foundInOrder(list1, list2);
		    assertTrue(RecursionPracticeMethods.foundInOrder(list1, list2));
	 }
	 @Test public void studentTest2() {
		 ListyList<Integer> list=
			      MakeListyList.makeList(Arrays.asList(9, 1, 4, 3, 6, 2, 8));
		 RecursionPracticeMethods.firstBetween(list, 5, 7);
		 assertEquals(Integer.valueOf(6),
			                 RecursionPracticeMethods.firstBetween(list, 5, 7));
	 }
	@Test public void studentTest3() {
	    ListyList<Character> list1=
	      MakeListyList.makeList(Arrays.asList('b', 'o' ));
	    ListyList<Character> list2=
	      MakeListyList.makeList(Arrays.asList('c', 'a'));
	    RecursionPracticeMethods.largerOf(list1, list2);
	    System.out.print(list1.toString());
//	    assertEquals("c o w s", list1.toString());
	  }
	@Test
	public void studentTest4() {
	    ListyList<Character> list1=
	      MakeListyList.makeList(Arrays.asList('b', 'o' ));
	    ListyList<Character> list2=
	      MakeListyList.makeList(Arrays.asList('c', 'a'));
	   
	    RecursionPracticeMethods.foundInOrder(list1, list2);
	    assertFalse(RecursionPracticeMethods.foundInOrder(list1, list2));
//	    assertEquals("c o w s", list1.toString());
	}
	@Test
	public void studentTest5() {//test method 2
	    ListyList<Character> list1=
	      MakeListyList.makeList(Arrays.asList('b', 'o' ));
	    ListyList<Character> list2=
	      MakeListyList.makeList(Arrays.asList('c', 'a'));
	   
	    RecursionPracticeMethods.foundInOrder(list1, list2);
	    assertFalse(RecursionPracticeMethods.foundInOrder(list1, list2));
//	    assertEquals("c o w s", list1.toString());
	}
}
