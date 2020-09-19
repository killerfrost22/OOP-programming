package tests;

import org.junit.*;

import employeeManager.Company;
import employeeManager.Manager;

import static org.junit.Assert.*;

public class StudentTests {

//	  @Test public void studentTest1() {
//		    Company company1= Manager.createAccount("Gooble");
//		    Company company2= Manager.createAccount("InstaSnap", 10);
//
//		    assertEquals("Gooble", company1.getCompanyName());
//		    assertEquals("InstaSnap", company2.getCompanyName());
//		  }
//	  @Test public void testPublic2() {
////		  System.out.print(TestData.exampleCompany1().numEmployees());
//		    assertEquals(4, TestData.exampleCompany1().numEmployees());
//		  }
//	@Test
//	public void studentTest3() {
//	    Company company= Manager.createAccount("Gooble", 5);
//
//	    company.hireSalariedEmployee("Dolly", "Dolphin", 51012.0);
////	    System.out.print(company.numEmployees());
//	    company.hireSalariedEmployee("Freddy", "Frog", 68900.0);
//	    company.hireSalariedEmployee("Geri", "Giraffe", 49946.0);
//	    company.hireSalariedEmployee("Kourtney", "Koala", 59410.0);
//
//	    assertEquals("Gooble", company.getCompanyName());
////	    System.out.print(company.numEmployees());
//	}
//	@Test public void studentTest4() {
//	    Company company1= TestData.exampleCompany1();
//	    Company company2= TestData.exampleCompany3();
//	    System.out.print(company1.employeeCapacity());
//	    System.out.println(company2.employeeCapacity());
//	    assertEquals(5, company1.employeeCapacity());
//	    assertEquals(50, company2.employeeCapacity());
//	  }
//	  @Test public void testPublic4() {
////		    Company company= TestData.exampleCompany2();
////
////		    assertArrayEquals(new String[]{"Chippy Chipmunk", "Jackie Jaguar",
////		                                   "Paul Platypus", "Sally Salamander",
////		                                   "Steve Starfish", "Timmy Termite"},
////		                      company.getEmployeeNames());
//		    Company company= Manager.createAccount("Microsloth");
//
//		    company.hireCommissionedEmployee("Paul", "Platypus", 15.0);
//		    company.hireCommissionedEmployee("Steve", "Starfish", 15.25);
//		    company.hireCommissionedEmployee("Timmy", "Termite", 16.0);
//		    company.hireCommissionedEmployee("Jackie", "Jaguar", 15.75);
//		    company.hireCommissionedEmployee("Sally", "Salamander", 16.5);
//		    company.hireCommissionedEmployee("Chippy", "Chipmunk", 10.0);
//		    System.out.println( company.getEmployeeNames());
//	  }
//	@Test public void stdentTest4() {
//	    Company company= TestData.exampleCompany2();
//
////	    assertArrayEquals(new String[]{"Chippy Chipmunk", "Jackie Jaguar",
////	                                   "Paul Platypus", "Sally Salamander",
////	                                   "Steve Starfish", "Timmy Termite"},
//	                      System.out.print(company.numEmployees());
//	  }
//	  @Test public void studentTest6() {
//		    Company company= Manager.createAccount("Nvidiot", 50);
//
//		    System.out.print(company.hireSalariedEmployee("Lizzie", "Lizard", 48900.0));
//		    company.hireCommissionedEmployee("Paul", "Platypus", 5.0);
//		    company.hireCommissionedEmployee("Chippy", "Chipmunk", 10.0);
//		    company.hireSalariedEmployee("Kourtney", "Koala", 59425.0);
//		    company.hireCommissionedEmployee("Jackie", "Jaguar", 7.5);
//		    company.hireCommissionedEmployee("Steve", "Starfish", 8.0);
//		    company.hireSalariedEmployee("Ginny", "Giraffe", 79950.0);
//		    company.hireCommissionedEmployee("Sally", "Salamander", 6.5);
//		    company.hireCommissionedEmployee("Timmy", "Termite", 4.0);
//		    company.hireSalariedEmployee("Wally", "Walrus", 61000.0);
//		    
//		    company.hireSalariedEmployee("Kourtney", "Koala", 89530.0);
//		    System.out.print(company.numEmployees());
//		    assertFalse(company.hireSalariedEmployee("Kourtney", "Koala", 89530.0));
//		    assertFalse(company.hireCommissionedEmployee("Sally", "Salamander",  16.0));
//		    System.out.println(company.numEmployees());
//		    assertEquals(10, company.numEmployees());
//		  }
//	@Test public void studentTests8() {
//		Company company= Manager.createAccount("Auricle");
//
//	    company.hireSalariedEmployee("Holly", "Dolphin", 81016.0);
//	    company.hireCommissionedEmployee("Freddy", "Frog", 5.0);
//	    company.hireSalariedEmployee("Geri", "Giraffe", 49959.0);
//	    company.hireCommissionedEmployee("Kourtney", "Koala", 6.0);
//	    company.hireSalariedEmployee("Ryan", "Lion", 79950.0);
//	    company.hireCommissionedEmployee("Bruce", "Moose", 7.5);
//	    
////	    System.out.print(company.workHours("Holly", "Dolphin", 8));
////	    System.out.print(company.numHours("Holly", "Dolphin"));
//	    assertTrue(company.workHours("Holly", "Dolphin", 8));
//	    assertTrue(company.workHours("Holly", "Dolphin", 9));
//	    assertTrue(company.workHours("Holly", "Dolphin", 7));
//	    assertTrue(company.workHours("Holly", "Dolphin", 9));
//	    assertTrue(company.workHours("Geri", "Giraffe", 11));
//	    
//	    assertTrue(company.workHours("Geri", "Giraffe", 10));
//	    assertTrue(company.workHours("Geri", "Giraffe", 9));
//	    assertTrue(company.workHours("Ryan", "Lion", 8));
////
//	    assertEquals(33, company.numHours("Holly", "Dolphin"));
//	    System.out.print(company.numHours("Holly", "Dolphin"));
//	    assertEquals(0, company.numHours("Freddy", "Frog"));
//	    assertEquals(30, company.numHours("Geri", "Giraffe"));
//	    assertEquals(0, company.numHours("Kourtney", "Koala"));
//	    assertEquals(8, company.numHours("Ryan", "Lion"));
//	    assertEquals(0, company.numHours("Bruce", "Moose"));
//	  }
//	@Test public void testStudent9() {
//		Company company= Manager.createAccount("Auricle");
//
//	    company.hireSalariedEmployee("Holly", "Dolphin", 81016.0);
//	    company.hireCommissionedEmployee("Freddy", "Frog", 5.0);
//	    company.hireSalariedEmployee("Geri", "Giraffe", 49959.0);
//	    company.hireCommissionedEmployee("Kourtney", "Koala", 6.0);
//	    company.hireSalariedEmployee("Ryan", "Lion", 79950.0);
//	    company.hireCommissionedEmployee("Bruce", "Moose", 7.5);
//
////	    System.out.print(company.getPaycheckAmount("Holly", "Dolphin"));
//	    assertEquals(3116.0, company.getPaycheckAmount("Holly", "Dolphin"),
//	                 0.001);
//	  }
	
	 @Test public void studentTest10() {
		    Company company= TestData.exampleCompany4();

		    company.makeSale("Freddy", "Frog", 15000.0);
		    company.makeSale("Freddy", "Frog", 30000.0);
		    company.makeSale("Kourtney", "Koala", 27000.0);
		    company.makeSale("Kourtney", "Koala", 32000.0);

		    assertEquals(2250.0, company.getPaycheckAmount("Freddy", "Frog"),
		                 0.001);
		    assertEquals(3540.0, company.getPaycheckAmount("Kourtney", "Koala"),
		                 0.001);
		    // Bruce Moose did not make any sales
		    assertEquals(0.0, company.getPaycheckAmount("Bruce", "Moose"), 0.001);
		  }

		  // Tests nonexistent employees trying to work hours and make sales.
//		  @Test public void testPublic11() {
//		    Company company= TestData.exampleCompany4();
//
//		    assertFalse(company.workHours("Antonio", "Antelope", 1));
//		    assertFalse(company.makeSale("Quinn", "Quokka", 1000.0));
//		  }
}
