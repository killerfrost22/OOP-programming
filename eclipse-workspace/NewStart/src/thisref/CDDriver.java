package thisref;

public class CDDriver {
	public static void main(String[] args) {
		CD cd1 = new CD();
		System.out.println("Default: " + cd1);
		
		CD cd2 = new CD("Billy Joel");
		System.out.println("Author only: " + cd2);

		CD cd3 = new CD("Alicia Keys", 45);
		System.out.println("Author and Duration only: " + cd3);

		CD cd4 = new CD(cd3);
		System.out.println("Copy: " + cd4);
		
		cd4.increaseDuration(10).increaseDuration(20);
		System.out.println("After increasing duration: " + cd4);
		
		System.out.println("After second increase:");
		cd4.increaseDuration(10).print();
		
		CD.resetDuration(cd4);
		System.out.println("After setting basic duration: " + cd4);
	}
}