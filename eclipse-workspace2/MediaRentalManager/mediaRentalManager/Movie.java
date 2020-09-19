package mediaRentalManager;

public class Movie extends Medias {
	private String rating;
	//Rocky 3 PG
	
	//getter and setters
	/**
	 * Gets the current object's rating
	 * @return rating
	 */
	
	public String getRating() {
		return this.rating;
	}
	/**
	 * sets the current object's rating
	 * @return rating
	 */
	public void setRating(String rating) {
		this.rating = rating;
	}
	/**
	 * to string 
	 * @return string combination of various strings
	 */
	public String toString() {
		return "Title: " + super.getTitle() + ", Copies Available: " + super.getCopiesAvailable() +", Rating: " + rating;
	}
	/**
	 * Constructor 
	 * ratings
	 * @param title
	 * @param copiesAvailable
	 * @param rating2
	 */
	public Movie(String title, int copiesAvailable, String rating2) {
		super(title, copiesAvailable);
		this.rating = rating2;
	}
	/**
	 * Constructor 
	 * mov title
	 * @param mov
	 */
	public Movie(Movie mov){
		this(mov.getTitle(),mov.getCopiesAvailable(),mov.getRating());
	}
}
