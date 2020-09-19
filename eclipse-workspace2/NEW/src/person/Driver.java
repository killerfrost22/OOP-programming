package person;

public class Driver {

	public static void main(String[] args) {
		Person joey = new Person("Joey"), monica = new Person("Monica", 30);
		Person mon = monica;

		/* Cascading */
		joey.increaseAge(10).increaseAge(20);
		System.out.println("After increasing Joey's age");
		System.out.println(joey);
		
		/* Correct approach to check for equality (do not use ==) */
		if (joey.equals(monica)) {
			System.out.println("joey same monica");
		}
		if (monica.equals(mon)) {
			System.out.println("monica same mon");
		}
	}
}