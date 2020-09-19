package studentV3;

public class Driver {

	public static void main(String[] args) {
		Student s1 = new Student(); /* Creating an object (class instance) */

		s1.initName("Mary"); /* Calling non-static method */
		s1.printName(); /* Calling non-static method */
		// s1.name is invalid now System.out.println("Name: " + s1.name);

		/* Calling static method */
		Student.printSchoolName();

		/* Try accessing private methods of the Student class */
	}
}
