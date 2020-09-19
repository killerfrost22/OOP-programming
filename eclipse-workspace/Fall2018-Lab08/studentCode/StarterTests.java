package studentCode;

import static org.junit.Assert.*;

import java.util.ArrayList;
import org.junit.Test;
import studentCode.AnotherExamplePerson;
import studentCode.MyPersonList;
import studentCode.Person;
import studentCode.ExamplePerson;



public class StarterTests  {

	@Test
	public void testConstructor() {
		MyPersonList localList = new MyPersonList();
		assertTrue(localList != null);
		assertTrue(localList.people != null);
		assertTrue(localList.people.size() == 0);
	}

	
	/*
	@Test
	public void testAdd() {
		Person p1 = new ExamplePerson("Sam");
		Person p2 = new AnotherExamplePerson("Pat");
		Person p3 = new ExamplePerson("Sasha");

		MyPersonList localPersonList = new MyPersonList();
		localPersonList.add(p1);
		localPersonList.add(p2);
		localPersonList.add(p3);

		assertEquals(p1, localPersonList.people.get(0));
		assertEquals(p2, localPersonList.people.get(1));
		assertEquals(p3, localPersonList.people.get(2));

	}

	@Test
	public void testAddUsingGiveRaisesAndTotalSalaries()  {
		MyPersonList localList = new MyPersonList();
		Person p1 = new ExamplePerson("Sam");
		Person p2 = new AnotherExamplePerson("Pat");
		Person p3 = new ExamplePerson("Sasha");
		localList.add(p1);
		localList.add(p2);
		localList.add(p3);

		localList.giveRaises();
		localList.giveRaises();
		assertEquals(31000, localList.getTotalOfSalaries());

		assertEquals(10000, p1.getSalary());
		assertEquals( 5000, p2.getSalary());
		assertEquals(10000, p3.getSalary());
	}
	
	
	
	@Test
	public void testSize() {
		MyPersonList localList = new MyPersonList();
		Person p1 = new ExamplePerson("Sam");
		Person p2 = new AnotherExamplePerson("Pat");
		Person p3 = new ExamplePerson("Sasha");
		localList.add(p1);
		localList.add(p2);
		localList.add(p3);

		assertEquals(3, localList.size());
		localList.add(new ExamplePerson("Sam"));
		localList.add(new AnotherExamplePerson("Sam"));
		localList.add(new ExamplePerson("Sasha"));
		assertEquals(6, localList.size());
	}
	
	@Test
	public void testClearL8() {
		MyPersonList localList = new MyPersonList();
		Person p1 = new ExamplePerson("Sam");
		Person p2 = new AnotherExamplePerson("Pat");
		Person p3 = new ExamplePerson("Sasha");
		localList.add(p1);
		localList.add(p2);
		localList.add(p3);
		assertEquals(3, localList.size());
		localList.add(new ExamplePerson("Sam"));
		localList.add(new AnotherExamplePerson("Sam"));
		localList.add(new ExamplePerson("Sasha"));
		assertEquals(6, localList.size());
		localList.clear();
		assertEquals(0, localList.size());
	}
	

	@Test
	public void testPrinting() {
		MyPersonList localList = new MyPersonList();
		Person p1 = new ExamplePerson("Sam");
		Person p2 = new AnotherExamplePerson("Pat");
		Person p3 = new ExamplePerson("Sasha");
		localList.add(p1);
		localList.add(p2);
		localList.add(p3);
		assertEquals(
				"EP:Sam(10000)AEP:Pat(5000)EP:Sasha(10000)", 
				localList.toString().replace(" ","")
		);
	}
	*/

}
