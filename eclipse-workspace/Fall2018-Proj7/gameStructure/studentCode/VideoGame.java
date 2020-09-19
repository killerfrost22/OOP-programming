package studentCode;


/** 
 * A mutable class that represents a VideoGame item that might be subject
 * to critique in our game.  As such, it implements the Critiqueable interface.
 * <br><br>
 * A VideoGame object has a title (String) and a number of fans (int) as well as 
 * an internal hype level (int) that will be used as part of the item's overall 
 * "Media Hype" computation, and an internal counter for how many victories it 
 * has had (int) since the last time internal hype level increased.
 */
public class VideoGame implements Critiqueable {
	
	private String title;
	private int numberOfFans;
	private int hype;
	private int winsSinceHypeBump;

	/**
	 * Standard constructor.  
	 * 
	 * @param titleIn desired title for this VideoGame
	 * @param numberOfFansIn starting number of fans for this VideoGame
	 */
	public VideoGame(String titleIn, int numberOfFansIn) {
		throw new RuntimeException("You must implement this!");
	}

	
	/**
	 * Copy constructor.  
	 * 
	 * @param other reference to the existing object which is the basis of the new one
	 */
	public VideoGame(VideoGame other) {
		throw new RuntimeException("You must implement this!");
	}
	
	
	/**
	 * Getter for media hype of the VideoGame, which is always one less than
	 * the internal media hype level.
	 * 
	 * @return media hype level of the VideoGame
	 */
	@Override
	public int getMediaHype() {
		throw new RuntimeException("You must implement this!");
	}
	
	
	/**
	 * Getter for name of the VideoGame.
	 * 
	 * @return reference to the title of the VideoGame
	 */
	@Override
	public String getTitle() {
		throw new RuntimeException("You must implement this!");
	}


	
	/**
	 * Getter for the number of fans of the VideoGame.
	 * 
	 * @return number of fans of the VideoGame
	 */
	@Override
	public int getFans() {
		throw new RuntimeException("You must implement this!");
	}

	
	/**
	 * Setter for the number of fans of the VideoGame.
	 * @param newNumberOfFans the new number of fans value for the VideoGame
	 */
	@Override
	public void setFans(int newNumberOfFans) {
		throw new RuntimeException("You must implement this!");
	}

	
	
	/**
	 * This method is sent the "outcome" of a critique "battle" that takes place in
	 * the game being written by our theoretical other GUI team.  There are several
	 * possible Outcomes defined in the Universe.  Based on that outcome, this method
	 * need to increment internal hype level if and only if the number of critique 
	 * victories since the last time the internal hype was increased has reached the 
	 * Universe's THRESHOLD.  A critique victory is defined as an outcome of FRESH.
	 *    
	 * However, it reduces the numberOfFans by 1 if the outcome was a loss.
	 *   
	 * A critique victory is defined as an outcome of FRESH.
	 * A critique lose is defined as an outcome of ROTTEN.  
	 *   
	 *   
	 * @param outcome the outcome of the critique in which this VideoGame was involved
	 * @return true if the outcome conveyed caused the internal hype level to go up
	 */
	@Override
	public boolean inform(Universe.Outcomes outcome) {
		throw new RuntimeException("You must implement this!");
	}

	
	
	
	/**
	 * Method to create an independent copy of the VideoGame.
	 * @return independent copy of the VideoGame
	 */
	@Override
	public Critiqueable returnClone() {
		throw new RuntimeException("You must implement this!");
	}
	
	
	/**
	 * The "usual suspect" toString method.
	 * @return a String describing the VideoGame
	 */
	@Override
	public String toString() {
		return "VideoGame<Title: " + getTitle() + 
				"  Fans: " + getFans() +
				"  Hype: " + getMediaHype() +
				">";
	}
	
	
	
	/**
	 * The "usual suspect" equals method.
	 */
	@Override
	public boolean equals(Object other) {
		if (other == null) {
			return false;
		}
		else if (this.getClass()!=other.getClass()) {
			return false;
		}
		else {
			VideoGame casted = (VideoGame)other;
			return 
					this.getTitle().equals(casted.getTitle()) 
					&& 
					this.getFans() == casted.getFans() 
					&& 
					this.getMediaHype() == casted.getMediaHype();
		}
	}
	
}