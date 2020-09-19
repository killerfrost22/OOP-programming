package sysutilities;

/**
 * Example of using the Name class.
 * 
 * @author cmsc131 Yizhan Ao
 *
 */
public class Driver {

	public static void main(String[] args) {
		Name name1 = new Name("Claudia", "I.", "Smith");
		System.out.println(name1);

		Name name2 = new Name("Rachel", "I.", "Green", '#');
		System.out.println(name2);

		Name name3 = new Name("Joseph", "K", "Falk");
		name3.setNickname("Joe");
		System.out.println(name3);

		Name name4 = new Name();
		System.out.println(name4);
			
		System.out.println("Same: " + name1.equals(name2));

		System.out.println(name1.compareTo(name2));

		Name name5 = Name.normalize(name3, true);
		System.out.println("Normalized: " + name5);

		Name name6 = new Name("KillerFrost" , "ada");
		Name name7 = Name.normalize(name6, true);
		System.out.println("Normalized: " + name7);
		System.out.println("Total number of name objects: " + Name.getNumberOfNameObjects());
		
	}
}
