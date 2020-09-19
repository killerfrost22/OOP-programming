package tests;

import org.junit.*;

import quuly.Quuly;

import static org.junit.Assert.*;

import java.util.Arrays;

public class StudentTests {
	@Test
	public void studentTest1() { //test edge case of the  quuly adding same id but different name
	    Quuly quuly= new Quuly(5);

	    quuly.addStudent("Ginny Giraffe", 4444);
	    quuly.addStudent("Dolly Dolphin", 3333);
	    quuly.addStudent("Ellie Elephant", 2222);
	    quuly.addStudent("Freddy Frog", 3333);
	    //System.out.print(quuly.numStudents());
	    assertFalse(quuly.addStudent("Freddy Frog", 3333));
	   //System.out.print(quuly.numStudents());
	    assertEquals(3, quuly.numStudents()); // 
	  }
	  @Test//1
	  public void studentTest2() {// test if it is available to know how many students are there
		    Quuly quuly= new Quuly(5);
		    quuly.addStudent("Ginny Giraffe", 4444);
		    quuly.addStudent("Dolly Dolphin", 3333);
		    quuly.addStudent("Ellie Elephant", 2222);
		    quuly.addStudent("Freddy Frog", 3333);
		 
		    quuly.numStudents();
		    //assertFalse(quuly.addStudent("Freddy Frog", 3333));
		   // System.out.print(quuly.numStudents());
		   // assertEquals(3, quuly.numStudents());
		  }
	 @Test public void studentTest3() { // test add student into the quuly
		    Quuly quuly= new Quuly(2);// important because this test if the student has == 2 taken used  max vissit

		    assertTrue(quuly.addStudent("Dolly Dolphin", 3210));
		    assertTrue(quuly.addStudent("Laura Llama", 1234));
		    assertTrue(quuly.addStudent("Rita Cheetah", 6789));
		    quuly.addStudent("Laura Llama", 2345);
		    assertTrue(quuly.addStudent("Laura Llama", 3456));
		    //System.out.print(quuly.numStudents());
		    assertEquals(5, quuly.numStudents());
	  }	 

//	  @Test public void studentTest4() {// test student queue size
//		  Quuly quuly= new Quuly(2);
//
//		    quuly.addStudent("Dolly Dolphin", 3333);//1
//		    quuly.addStudent("Ginny Giraffe", 4444);//2
//		    quuly.addStudent("Wally Walrus", 8888);//3
//		    quuly.addStudent("Ellie Elephant", 9999);//4
//		    quuly.addStudent("Kathy Kangaroo", 1243);//5
//		    quuly.addStudent("Myrtle Turtle", 9638);//6
//		    quuly.addStudent("Squidley Squid", 9174);//7
//		    quuly.addStudent("Sally Salamander", 6513);//8
//		    quuly.addStudent("Coby Cobra", 2254);//9
//		    quuly.addStudent("Oscar Ostrich", 3232);//10
//		    quuly.addStudent("Robyn Robin", 4674);//11
//		    quuly.addStudent("Hedwig Hedgehog", 6716);//11
//		    quuly.addStudent("Amy Amoeba", 8234);//12
//
//		    quuly.addStudentToQueue(4444);//1
//		    quuly.addStudentToQueue(8888);//2
//		    quuly.addStudentToQueue(6513);//3
//		    quuly.addStudentToQueue(2254);//4
//		    quuly.addStudentToQueue(4674);//5
//		    quuly.addStudentToQueue(8234);//6
//		    quuly.addStudentToQueue(1243);//7
//		    quuly.addStudentToQueue(9638);//8
//		    quuly.addStudentToQueue(3333);//9
//		    quuly.addStudentToQueue(9174);//10
//
//		    //System.out.print(quuly.queueSize());
//		    assertEquals(10, quuly.queueSize());
//	  }
	@Test public void studentTest5() {// test if it is in queue
	    Quuly quuly= TestData.exampleQuuly();
	    quuly.isInQueue(6513);
	    assertTrue(quuly.isInQueue(6513));
	    assertTrue(quuly.isInQueue(3333));
	    assertTrue(quuly.isInQueue(8234));
	    assertTrue(quuly.isInQueue(4444));
	    assertFalse(quuly.isInQueue(2222));

	    assertFalse(quuly.isInQueue(6716));
	  }
//	@Test public void studentTest6() {
//		Quuly quuly= TestData.exampleQuuly();
//	    for (String name : Arrays.asList("Dolly Dolphin", "Ginny Giraffe",
//	                                     "Wally Walrus", "Kathy Kangaroo",
//	                                     "Myrtle Turtle", "Squidley Squid",
//	                                     "Sally Salamander", "Coby Cobra",
//	                                     "Robyn Robin", "Amy Amoeba"))
//	      assertEquals(1, quuly.isInQueue(name));
//	  }
	 @Test public void studentTest7() {//test if the isInQueue can tell how many are in the queue
		    Quuly quuly= new Quuly(8);
		    quuly.addStudent("Ginny Giraffe", 4444);//2
		    quuly.addStudent("Wally Walrus", 8888);//3
		    quuly.addStudent("Ellie Elephant", 9999);//4
		    quuly.addStudent("Kathy Kangaroo", 1243);//5
		    quuly.addStudent("Myrtle Turtle", 9638);//6
		    quuly.addStudent("Squidley Squid", 9174);//7
		    quuly.addStudent("Sally Salamander", 6513);//8
		    assertTrue(quuly.addStudent("Dolly Dolphin", 3210));
		    assertTrue(quuly.addStudent("Laura Llama", 1234));
		    assertTrue(quuly.addStudent("Laura Llama", 2345));
		    assertTrue(quuly.addStudent("Rita Cheetah", 6789));
		    assertTrue(quuly.addStudent("Laura Llama", 3456));
		    assertTrue(quuly.addStudent("Rita Cheetah", 4343));

		    for (Integer id : Arrays.asList(3210, 1234, 2345, 6789, 3456, 4343))
		      quuly.addStudentToQueue(id);

		    assertEquals(1, quuly.isInQueue("Dolly Dolphin"));
		    assertEquals(2, quuly.isInQueue("Rita Cheetah"));
		    assertEquals(3, quuly.isInQueue("Laura Llama"));
		  }
	  @Test public void studentTest8() {// help next 
		    Quuly quuly= new Quuly(10);

		    quuly.addStudent("Kathy Kangaroo", 1232);
//		    quuly.addStudent("Peggy Penguin", 9000);
//		    quuly.addStudent("Wally Walrus", 1111);
//		    quuly.addStudent("Ginny Giraffe", 2222);
//		    quuly.addStudent("Dolly Dolphin", 6543);
//		    quuly.addStudent("Ellie Elephant", 9561);
//		    quuly.addStudent("Benice Bear", 1729);
		    quuly.helpNextStudent();
		   // System.out.print(quuly.helpNextStudent());
//		    assertFalse(quuly.helpNextStudent());
		  }
//	  @Test public void studentTest9() {
//		    Quuly quuly= new Quuly(4);
//
//		    quuly.addStudent("Ginny Giraffe", 4444);
//		    quuly.addStudent("Wally Walrus", 8888);
//		    quuly.addStudent("Dolly Dolphin", 1111);
//
//		    assertEquals(0, quuly.numStudentsHelped());
//
//		    quuly.addStudentToQueue(8888);
//		    quuly.helpNextStudent();
//		    assertEquals(1, quuly.numStudentsHelped());
//
//		    quuly.addStudentToQueue(1111);
//		    quuly.helpNextStudent();
//		    assertEquals(2, quuly.numStudentsHelped());
//		  }
	  @Test public void studentTest10() {// test drop student
		    Quuly quuly= new Quuly(4);

		    quuly.addStudent("Ginny Giraffe", 4444);
		    quuly.addStudent("Wally Walrus", 8888);
		    quuly.addStudent("Dolly Dolphin", 3333);

		    quuly.dropStudent(3333);
		   // System.out.print(quuly.numTimesHelped(8888));
		    assertFalse(quuly.isInQueue(3333));
		  }
	
	
	@Test public void studentTest11() {
		    Quuly quuly= new Quuly(4);

		    quuly.addStudent("Ginny Giraffe", 4444);
		    quuly.addStudent("Wally Walrus", 8888);
		    quuly.addStudent("Dolly Dolphin", 3333);

		    quuly.addStudentToQueue(8888);
		    quuly.helpNextStudent();
		    System.out.println(quuly.numTimesHelped(8888));
		    assertEquals(1, quuly.numTimesHelped(8888));
		  }

}
