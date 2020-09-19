package studentV3;

public class Student {
	private String name; /* private, we only want methods to access it */
	public int recycledCans; /* can be access by anyone */
	
	public void initName(String nameIn) { /* public so it can be called by everyone */
		assignName(nameIn);
		
		/* Try calling static methods in this method after you study the class */
	}

	public void printName() {
		System.out.println("Name: " + name);
	}
	
	/* Private method that can only be used by other methods of the class */
	private void assignName(String nameIn) {
		if (nameIn.equals("Mary") || nameIn.equals("Peter")) {
			name = nameIn;
		} else {
			System.out.println("Invalid name");
		}
	}
	
	/* Static method */
	public static void printSchoolName() {
		System.out.println("Infinite Loop High School");
		
		/* Calling static method */
		schoolMotto();
		
		/* Try calling assignName */
	}
	
	/* Private static method */
	private static void schoolMotto() {
		System.out.println("Learning never stops");
	}
}
