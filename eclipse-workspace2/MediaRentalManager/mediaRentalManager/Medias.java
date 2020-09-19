package mediaRentalManager;


/**
 * Class for the functionality associated with media.<br>

 */
public class Medias implements Comparable<Medias> 
{
	String title;
	int CopiesAvailable;

	/**
	 * Constructor to initialize the title and the available copies
	 * for media class or Movies or Albums class. <br>
	 * @param title
	 * @param copiesAvailable
	 */
	public Medias(String title, int CopiesAvailable) 
	{
		this.title = title;
		this.CopiesAvailable = CopiesAvailable;
	}

	/**
	 * Copy constructor.<br>
	 * @param Media
	 */
	public Medias(Medias media) 
	{
		this(media.getTitle(), media.getCopiesAvailable());
	}
	
	/**
	 * Returns the title.<br>
	 * @return
	 */
	public String getTitle() 
	{
		return title;
	}

	/**
	 * Returns the number of copies available <br>
	 * @return
	 */
	public int getCopiesAvailable() 
	{
		return CopiesAvailable;
	}

	/**
	 * Equals method to return true if 2 media class instance variable are
	 * equal, with respect to their name and copies available, otherwise return
	 * false. <br>
	 * @param obj
	 */
	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Medias media = (Medias) obj;
		return title.equals(media.title) && CopiesAvailable == 
			   (media.CopiesAvailable);

	}

	/**
	 * Returns the Title and copies available of media class  
	 * variable, in String form. <br>
	 */
	public String toString() 
	{
		return "Title: " + getTitle() + ", " + "Copies Available: " + 
	            getCopiesAvailable();
	}

	/**
	 * Compare method to return 1 if 2 media class instance variable have the 
	 * same title, else return 0.<br>
	 * @param media
	 */
	public int compareTo(Medias media) 
	{
		return this.getTitle().compareTo(media.getTitle());
	}

	/**
	 * sets the number of copies available <br>
	 * @return
	 */
	public void setCopiesAvailable(int copiesAvailable) 
	{
		this.CopiesAvailable = copiesAvailable;
	}

}