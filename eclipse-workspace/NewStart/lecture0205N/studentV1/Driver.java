package studentV1;

public class Driver {

	public static void main(String[] args) {
		Student s1 = new Student(); /* Creating an object (class instance) */

		/* Accessing variables */
		s1.name = "Mary"; /* Instance variables must be accessed using object */
		System.out.println("Name: " + s1.name);
		
		/* Static variables must be accessed using class name */
		System.out.println("MAX_GPA: " + Student.MAX_GPA);
		
		/* Try accessing name using class name */
		/* Try accessing MAX_GPA using class instance */
	}

}
