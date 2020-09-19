package mediaRentalManager;
public class Albums extends Medias {
	private String artist;
	private String songs;
	//getters and setters
	
	/**
	 * Gets the artist
	 * @return artist
	 */
	public String getArtist() {
		return this.artist;
	}
	/**
	 * sets the artist
	 * @param artist
	 * @return artist
	 */
	public void setartist(String artist) {
		this.artist= artist;
	}

	/**
	 * gets the song
	 * @return song
	 */
	public String getSongs() {
		return songs;
	}

	/**
	 * sets the song
	 * @param songs
	 * @return songs
	 */
	public void setSongs(String songs) {
		this.songs = songs;
	}
	/**
	 * Constructor inherits title and copiesAvailable and initializes 
	 * artist and songs
	 * @param title
	 * @param copiesAvailable
	 * @param artist
	 * @param songs
	 * 
	 */
	
	public Albums(String title, int copiesAvailable, String artist, String songs) {
		super (title, copiesAvailable);
		this.artist = artist;
		this.songs = songs;
	}
	/**
	 * Copy constructor
	 * @param album
	 */
	
	public Albums(Albums album){
		this(album.getTitle(),album.getCopiesAvailable(),album.getArtist(),album.getSongs());
	}

	//toString method
	/**
	 * to string
	 * @return combination string required 
	 */
	
	public String toString(){
		return "Title: " + super.getTitle() + ", Copies Available: " + super.getCopiesAvailable()+", Artist: " + artist + ", Songs: " + songs;
	}
	

//

}