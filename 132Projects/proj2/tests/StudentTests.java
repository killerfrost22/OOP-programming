package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import employeeManager.Company;
import employeeManager.Manager;

public class StudentTests {

	@Test//Test the basic constructor with 1 input and 2 input Para
	public void studentTest1() {
		final Company company1 = Manager.createAccount("Gooble");
		final Company company2 = Manager.createAccount("InstaSnap", 10);
		assertEquals("Gooble", company1.getCompanyName());
		assertEquals("InstaSnap", company2.getCompanyName());
	}
//Test the number of the Employee
	@Test
	public void studentTest2() {
//		  System.out.print(TestData.exampleCompany1().numEmployees());
		assertEquals(6, TestData.exampleCompany2().numEmployees());
	}
//Test the getter
	@Test
	public void studentTest3() {
		final Company company = Manager.createAccount("Gooble", 5);

		company.hireSalariedEmployee("Dolly", "Dolphin", 51012.0);
//	    System.out.print(company.numEmployees());
		company.hireSalariedEmployee("Freddy", "Frog", 68900.0);
		company.hireSalariedEmployee("Geri", "Giraffe", 49946.0);
		company.hireSalariedEmployee("Kourtney", "Koala", 59410.0);

		assertEquals("Gooble", company.getCompanyName());
//	    System.out.print(company.numEmployees());
	}
//test the capacity
	@Test
	public void studentTest4() {
		final Company company1 = TestData.exampleCompany1();
		final Company company2 = TestData.exampleCompany3();
//		System.out.print(company1.employeeCapacity());
//		System.out.println(company2.employeeCapacity());
		assertEquals(5, company1.employeeCapacity());
		assertEquals(50, company2.employeeCapacity());
	}
//test te commission adder
	@Test
	public void studentTest5() {
//		    Company company= TestData.exampleCompany2();
//
//		    assertArrayEquals(new String[]{"Chippy Chipmunk", "Jackie Jaguar",
//		                                   "Paul Platypus", "Sally Salamander",
//		                                   "Steve Starfish", "Timmy Termite"},
//		                      company.getEmployeeNames());
		final Company company = Manager.createAccount("Microsloth");

		company.hireCommissionedEmployee("Paul", "Platypus", 15.0);
		company.hireCommissionedEmployee("Steve", "Starfish", 15.25);
		company.hireCommissionedEmployee("Timmy", "Termite", 16.0);
		company.hireCommissionedEmployee("Jackie", "Jaguar", 15.75);
		company.hireCommissionedEmployee("Sally", "Salamander", 16.5);
		company.hireCommissionedEmployee("Chippy", "Chipmunk", 10.0);
//		System.out.println(company.getEmployeeNames());
	}
//test num
	@Test
	public void stdentTest6() {
		final Company company = TestData.exampleCompany2();

//	    assertArrayEquals(new String[]{"Chippy Chipmunk", "Jackie Jaguar",
//	                                   "Paul Platypus", "Sally Salamander",
//	                                   "Steve Starfish", "Timmy Termite"},
//		System.out.print(company.numEmployees());
	}
//test for hireing and num
	@Test
	public void studentTest7() {
		final Company company = Manager.createAccount("Nvidiot", 50);

//		System.out.print(company.hireSalariedEmployee("Lizzie", "Lizard", 
//				48900.0));
		company.hireCommissionedEmployee("Paul", "Platypus", 5.0);
		company.hireCommissionedEmployee("Chippy", "Chipmunk", 10.0);
		company.hireSalariedEmployee("Kourtney", "Koala", 59425.0);
		company.hireCommissionedEmployee("Jackie", "Jaguar", 7.5);
		company.hireCommissionedEmployee("Steve", "Starfish", 8.0);
		company.hireSalariedEmployee("Ginny", "Giraffe", 79950.0);
		company.hireCommissionedEmployee("Sally", "Salamander", 6.5);
		company.hireCommissionedEmployee("Timmy", "Termite", 4.0);
		company.hireSalariedEmployee("Wally", "Walrus", 61000.0);

		company.hireSalariedEmployee("Kourtney", "Koala", 89530.0);
//		System.out.print(company.numEmployees());
		assertFalse(company.hireSalariedEmployee("Kourtney", "Koala"
				, 89530.0));
		assertFalse(company.hireCommissionedEmployee("Sally", "Salamander", 
				16.0));
//	System.out.println(company.numEmployees());
		assertEquals(9, company.numEmployees());
	}
//tested the each case of numHours specifically
	@Test
	public void studentTests8() {
		final Company company = Manager.createAccount("Auricle");

		company.hireSalariedEmployee("Holly", "Dolphin", 81016.0);
		company.hireCommissionedEmployee("Freddy", "Frog", 5.0);
		company.hireSalariedEmployee("Geri", "Giraffe", 49959.0);
		company.hireCommissionedEmployee("Kourtney", "Koala", 6.0);
		company.hireSalariedEmployee("Ryan", "Lion", 79950.0);
		company.hireCommissionedEmployee("Bruce", "Moose", 7.5);

//	    System.out.print(company.workHours("Holly", "Dolphin", 8));
//	    System.out.print(company.numHours("Holly", "Dolphin"));
		assertTrue(company.workHours("Holly", "Dolphin", 8));
		assertTrue(company.workHours("Holly", "Dolphin", 9));
		assertTrue(company.workHours("Holly", "Dolphin", 7));
		assertTrue(company.workHours("Holly", "Dolphin", 9));
		assertTrue(company.workHours("Geri", "Giraffe", 11));

		assertTrue(company.workHours("Geri", "Giraffe", 10));
		assertTrue(company.workHours("Geri", "Giraffe", 9));
		assertTrue(company.workHours("Ryan", "Lion", 8));
//
		assertEquals(33, company.numHours("Holly", "Dolphin"));
//		System.out.print(company.numHours("Holly", "Dolphin"));
		assertEquals(0, company.numHours("Freddy", "Frog"));
		assertEquals(30, company.numHours("Geri", "Giraffe"));
		assertEquals(0, company.numHours("Kourtney", "Koala"));
		assertEquals(8, company.numHours("Ryan", "Lion"));
		assertEquals(0, company.numHours("Bruce", "Moose"));
	}
	@Test public void testStudent9() {
		Company company= Manager.createAccount("Auricle");

	    assertTrue(company.hireSalariedEmployee("Holly", "Dolphin", 81016.0));
//	    company.hireCommissionedEmployee("Freddy", "Frog", 5.0);
//	    company.hireSalariedEmployee("Geri", "Giraffe", 49959.0);
//	    company.hireCommissionedEmployee("Kourtney", "Koala", 6.0);
//	    company.hireSalariedEmployee("Ryan", "Lion", 79950.0);
//	    company.hireCommissionedEmployee("Bruce", "Moose", 7.5);

	    System.out.print(company.getPaycheckAmount("Holly", "Dolphin"));
	    assertEquals(3116.0, company.getPaycheckAmount
	    		("Holly", "Dolphin"), 0.001);
	  }
///
	 @Test public void studentTest10() {
		 Company company= Manager.createAccount("Auricle");

		    company.hireSalariedEmployee("Holly", "Dolphin", 81016.0);
		    company.hireCommissionedEmployee("Freddy", "Frog", 5.0);
		    company.hireSalariedEmployee("Geri", "Giraffe", 49959.0);
		    company.hireCommissionedEmployee("Kourtney", "Koala", 6.0);
		    company.hireSalariedEmployee("Ryan", "Lion", 79950.0);
		    company.hireCommissionedEmployee("Bruce", "Moose", 7.5);
//
		    company.makeSale("Freddy", "Frog", 15000.0);
		    company.makeSale("Freddy", "Frog", 30000.0);
		    company.makeSale("Kourtney", "Koala", 27000.0);
		    company.makeSale("Kourtney", "Koala", 32000.0);
//		    System.out.println(company.getPaycheckAmount("jida", "Frog"));
		    assertEquals(-1.0, company.getPaycheckAmount("jida", "Frog"),0.001);
		    System.out.println(company.getPaycheckAmount("Freddy", "Frog"));
		    assertEquals(2250.0, company.getPaycheckAmount("Freddy", "Frog"),
		    		0.001);
//		    System.out.println(company.getPaycheckAmount("Freddy", "Frog"));
		    assertEquals(3540.0, company.getPaycheckAmount("Kourtney", "Koala"),
		                 0.001);
		    // Bruce Moose did not make any sales
		    assertEquals(0.0, company.getPaycheckAmount("Bruce", "Moose"), 
		    		0.001);
		  }

// Tests nonexistent employees trying to work hours and make sales.
		  @Test public void studentTest12() {
		    Company company= TestData.exampleCompany4();

		    assertFalse(company.workHours("Antonio", "Antelope", 1));
		    assertFalse(company.makeSale("Quinn", "Quokka", 1000.0));
		  }
//	@Test public void studentTest11() {
//		   Company company= Manager.createAccount("Nvidiot", 50);
//
//		    company.hireSalariedEmployee("Lizzie", "Lizard", 48900.0);
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
//	    int i;
//
//	    for (i= 1; i <= 12; i++) {
//	      assertTrue(company.workHours("Kourtney", "Koala", 4));
//	      assertTrue(company.workHours("Jackie", "Jaguar", 4));
//	    }
//
//	    System.out.print(company.numHours("Kourtney", "Koala"));
//	    assertEquals(48, company.numHours("Kourtney", "Koala"));
//	    assertEquals(48, company.numHours("Jackie", "Jaguar"));
//
//	  }
	@Test public void studentTets12() {
		Company company= Manager.createAccount("Microsloth");

	    company.hireCommissionedEmployee("Paul", "Platypus", 15.0);
	    company.hireCommissionedEmployee("Steve", "Starfish", 15.25);
	    company.hireCommissionedEmployee("Timmy", "Termite", 16.0);
	    company.hireCommissionedEmployee("Jackie", "Jaguar", 15.75);
	    company.hireCommissionedEmployee("Sally", "Salamander", 16.5);
	    company.hireCommissionedEmployee("Chippy", "Chipmunk", 10.0);

	    assertTrue(company.makeSale("Chippy", "Chipmunk", 1000.0));
	    assertFalse(company.makeSale("Chippy", "Chipmunk", -200.0));
	    assertTrue(company.makeSale("Chippy", "Chipmunk", 2000.0));
//	    System.out.print( company.amtSalesMade("Chippy", "Chipmunk"));
	    assertEquals(3000.0, company.amtSalesMade("Chippy", "Chipmunk"),
	    		0.001);
	  }

	   //Tests calling getPayroll().
	  @Test public void studentTest13() {
		  Company company= Manager.createAccount("Gooble", 5);

		    company.hireSalariedEmployee("Dolly", "Dolphin", 51012.0);
		    company.hireSalariedEmployee("Freddy", "Frog", 68900.0);
		    company.hireSalariedEmployee("Geri", "Giraffe", 49946.0);
		    company.hireSalariedEmployee("Kourtney", "Koala", 59410.0);

	    assertEquals(8818.0, company.getPayroll(), 0.001);

	  }
	@Test
	public void studnetTest14() {
		final Company company1 = Manager.createAccount("Applesauce", 10);
		final Company company2 = Manager.createAccount("Gooble", 5);

		company2.hireSalariedEmployee("Dolly", "Dolphin", 51012.0);
		company2.hireSalariedEmployee("Freddy", "Frog", 68900.0);
		company2.hireSalariedEmployee("Geri", "Giraffe", 49946.0);
		company2.hireSalariedEmployee("Kourtney", "Koala", 59410.0);

		assertEquals(0.0, company1.billAmount(), 0.001);
		assertEquals(0.0, company2.billAmount(), 0.001);
	}

	// Tests calling billAmount() on companies that have paid accounts.
	@Test
	public void studentTest15() {
		final Company company1 = Manager.createAccount("Instaounce");
		final Company company2 = Manager.createAccount("Sungsam");

		company1.hireSalariedEmployee("Dolly", "Dolphin", 51012.0);
		company1.hireSalariedEmployee("Freddy", "Frog", 68900.0);
		company1.hireSalariedEmployee("Geri", "Giraffe", 49946.0);
		company1.hireSalariedEmployee("Kourtney", "Koala", 59410.0);
		company1.hireSalariedEmployee("DIooq", "Ao", 49946.0);
		assertEquals(50.0, company1.billAmount(), 0.001);
		assertEquals(0.0, company2.billAmount(), 0.001);
	}

}
