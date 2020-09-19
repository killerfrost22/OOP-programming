package thisref;

public class CD {
	private String author;
	private int duration;
	private static final String ANONYMOUS = "No author";
	private static final int STANDARD_DURATION = 80;

	/* this Use #1: tell parameters from instance variables */
	public CD(String author, int duration) {
		this.author = author;
		this.duration = duration;
	}

	/* this Use #2: to call constructors */
	public CD(String author) {
		// int x = 10; What happens if we declare this variable?
		this(author, STANDARD_DURATION);
	}

	/* this Use #2: to call constructors */
	public CD(CD cd) {
		this(cd.author, cd.duration);
	}

	/* this Use #2: to call constructors */
	public CD() {
		this(ANONYMOUS, STANDARD_DURATION);
	}

	/* this Use #3: to identify self comparison */
	boolean sameOne(CD cd) {
		if (cd == this) {
			return true;
		}
		// If the next comparison where to be extremely
		// expensive (for example, if the class had several
		// fields) then we save a lot by using the previous comparison
		return author.equals(cd.author);
	}

	public String toString() {
		String answer = "";

		answer += "Author: " + "\"" + author + "\"";
		answer += ", Duration: " + duration;

		return answer;
	}

	/* this Use #4: to return a reference to current object */
	public CD increaseDuration(int delta) {
		duration += delta;

		return this;
	}

	public static void resetDuration(CD cd) {
		cd.duration = 80;
	}

	/* this Use #5: to define a non-static method based on static ones */
	/* Non-static version of resetDuration for previous method */
	public void resetDuration() {
		resetDuration(this);
	}

	public void print() {
		System.out.println(this);
	}
}