package mediaRentalManager;

import java.util.ArrayList;
import java.util.Collections;

public class MediaRentalManager implements MediaRentalManagerInt {

	//fields
	private int planLimit;
	public ArrayList<Customer> costumerlist = new ArrayList<Customer>();
	private ArrayList<Media> medialist = new ArrayList<Media>();

	public void addCustomer(String name, String address, String plan) {
		Customer customer = new Customer(name,address, plan );
		costumerlist.add(customer);
		if (customer.getPlan().equals("LIMITED")) {
			setLimitedPlanLimit(2);
		}
	}

	public void addMovie(String title, int copiesAvailable, String rating) {
		
		Movie movie = new Movie(title,copiesAvailable , rating);
		medialist.add(movie);
	}

	public void addAlbum(String title, int copiesAvailable, String artist, String songs) {
		Album album = new Album (title,copiesAvailable,artist,songs);
		medialist.add(album);
	}

	public void setLimitedPlanLimit(int value) {
		planLimit = value;
	}

	// order the list please
	public String getAllCustomersInfo() {
		StringBuffer info = new StringBuffer();

		Collections.sort(costumerlist); //sorts customers list
		info.append("***** Customers' Information *****\n");

		for (int i = 0; i < costumerlist.size(); i++) {//goes through all customers
			info.append(costumerlist.get(i).toString() + "\n");
			info.append("Rented: " + costumerlist.get(i).rented.toString() + "\n");
			info.append("Queue: " + costumerlist.get(i).queue.toString() + "\n");
		}

		String infoString = info.toString(); //changes buffer to string to save space

		return infoString;
	}

	// adding everything twice, no commas, not sorted by title
	public String getAllMediaInfo() {
		StringBuffer info = new StringBuffer();
		Collections.sort(medialist);//sorts media
		info.append("***** Media Information *****\n");

		for (int i = 0; i < medialist.size(); i++) {//goes through all customers
			info.append(medialist.get(i).toString() + "\n");
		}

		String infoString = info.toString();

		return infoString;
	}

	//returns true if media can be added to queue
	public boolean addToQueue(String customerName, String mediaTitle) {
		boolean add = false;
		for (int i = 0; i < costumerlist.size(); i++) { //goes through all the customers
			if (costumerlist.get(i).getName().equals(customerName)) {//checks for the right customer
				if (costumerlist.get(i).queue.contains(mediaTitle)) {//checks if that customer has the media
					add = false;
				} else {
					costumerlist.get(i).queue.add(mediaTitle);
					add = true;
				}
			}
		}

		return add;

	}

	// return true if customer has a title and removes it from the queue
	public boolean removeFromQueue(String customerName, String mediaTitle) {
		boolean remove = false;
		for (int i = 0; i < costumerlist.size(); i++) {//checks all customers
			if (costumerlist.get(i).getName().equals(customerName)) {//checks if customer has title
				if (costumerlist.get(i).queue.contains(mediaTitle)) {
					costumerlist.get(i).queue.remove(mediaTitle);
					remove = true;
				} else {
					costumerlist.get(i).queue.add(mediaTitle);
					remove = false;
				}
			}
		}

		return remove;

	}

	//processes customers media requests
	public String processRequests() {
		Collections.sort(costumerlist);
		String message = "";
		
		int check = 0;

		for (int i = 0; i < costumerlist.size(); i++) {
			ArrayList<String> copy = new ArrayList<String>();
			for(int m = 0;m< costumerlist.get(i).queue.size();m++){
				copy.add(costumerlist.get(i).queue.get(m));
			}
			if (costumerlist.get(i).queue.size() > 0) {//goes through all customers
				if (costumerlist.get(i).getPlan().equals("UNLIMITED")) { //checks plans
					String mediaTitle = "";
					mediaTitle = costumerlist.get(i).queue.get(0);
					int size = costumerlist.get(i).queue.size();

					for (int j = 0; j < size; j++) {//goes through cutomers whole queue
						int test = costumerlist.get(i).queue.indexOf(copy.get(j));
						mediaTitle = copy.get(test);

						System.out.println(test);
						mediaTitle = costumerlist.get(i).queue.get(test);
						
						System.out.println(mediaTitle);
						int spot = -1;
						for (int k = 0; k < medialist.size(); k++) {//checks if the title is there and there are enough copies
							if (medialist.get(k).getTitle().equals(mediaTitle)
									&& medialist.get(k).getCopiesAvailable() > 0) {

								spot = k;
								int copiesAv = medialist.get(k).getCopiesAvailable() - 1;
								medialist.get(k).setCopiesAvailable(copiesAv);

							}
						}

						if (spot >= 0 ) {
							System.out.println(mediaTitle+":"+costumerlist.get(i).rented+":"+costumerlist.get(i).queue);
							costumerlist.get(i).rented.add(mediaTitle);
							int pos = costumerlist.get(i).queue.indexOf(mediaTitle);
							costumerlist.get(i).queue.remove(pos);
							message = message + "Sending " + mediaTitle + " to " + costumerlist.get(i).getName()
									+ "\n";
							check = costumerlist.get(i).queue.indexOf(mediaTitle);
						} else {
							check = costumerlist.get(i).queue.indexOf(mediaTitle);
						}
					}

				} else if (costumerlist.get(i).getPlan().equals("LIMITED")) { ///checks plan
					String mediaTitle = "";
					mediaTitle = costumerlist.get(i).queue.get(0);
					int size = costumerlist.get(i).queue.size();
					for (int l = 0; l < size; l++) {//checks the whole queue
						mediaTitle = costumerlist.get(i).queue.get(0);
						
						int test = costumerlist.get(i).queue.indexOf(copy.get(l));
						mediaTitle = copy.get(test);

						System.out.println(test);
						mediaTitle = costumerlist.get(i).queue.get(test);
						
						System.out.println(mediaTitle);

						if (costumerlist.get(i).rented.size() < this.planLimit) {//makes sure rented is not larger than plan limit
							int spot = -1;
							for (int k = 0; k < medialist.size(); k++) {
								if (medialist.get(k).getTitle().equals(mediaTitle)
										&& medialist.get(k).getCopiesAvailable() > 0) {
									spot = k;
									int copiesAv = medialist.get(k).getCopiesAvailable() - 1;
									medialist.get(k).setCopiesAvailable(copiesAv);
								}
							}
							if (spot >= 0) { //makes sure title and copies available is appropriate 
								costumerlist.get(i).rented.add(mediaTitle);
								int pos = costumerlist.get(i).queue.indexOf(mediaTitle);
								costumerlist.get(i).queue.remove(pos);
								message = message + "Sending " + mediaTitle + " to " + costumerlist.get(i).getName() + "\n";
								check = costumerlist.get(i).queue.indexOf(mediaTitle);

							} else {
								check = costumerlist.get(i).queue.indexOf(mediaTitle);
							}

						} else {
							break;
						}
					}

				}

			}
		}

		return message;

	}

	// returns true if customer has mediaTitle and it is returned
	public boolean returnMedia(String customerName, String mediaTitle) {
		boolean ret = false;
		for (int i = 0; i < costumerlist.size(); i++) { //goes through customers
			if (costumerlist.get(i).getName().equals(customerName)) {//checks if customer has title
				for (int j = 0; j < costumerlist.get(i).rented.size(); j++) {
					if (costumerlist.get(i).rented.get(j).equals(mediaTitle)) {
						for (int k = 0; k < medialist.size(); k++) {
							if (medialist.get(k).getTitle().equals(mediaTitle)) {
								int copiesAv = medialist.get(k).getCopiesAvailable() + 1;
								medialist.get(k).setCopiesAvailable(copiesAv);
							}
						}
						costumerlist.get(i).rented.remove(j);
						ret = true;
						break;
					}
				}

			}

		}
		return ret;
	}

	//return arraylist with media titles that have any of the parameters
	public ArrayList<String> searchMedia(String title, String rating, String artist, String songs) {
		ArrayList<String> AllMedia = new ArrayList<String>();
		if (title == null && rating == null && artist == null && songs == null){
			for (int i = 0; i < medialist.size(); i++) {
				AllMedia.add(medialist.get(i).getTitle());
			}

		} else if (title != null) {
			for (int i = 0; i < medialist.size(); i++) {
				if (medialist.get(i).getTitle().equals(title)) {
					AllMedia.add(medialist.get(i).getTitle());

				}
			}
		} else if (rating != null) {
			for (int i = 0; i < medialist.size(); i++) {
				if (medialist.get(i).getClass() == Movie.class) {
					if (((Movie) medialist.get(i)).getRating().equals
							(rating)) {
						AllMedia.add(medialist.get(i).getTitle());
					}
				}
			}
		} else if (artist != null) {
			for (int i = 0; i < medialist.size(); i++) {
				if (medialist.get(i).getClass() == Album.class) {
					if (((Album) medialist.get(i)).getArtist().equals(artist)){
						AllMedia.add(medialist.get(i).getTitle());
					}
				}
			}
		} else {
			for (int i = 0; i < medialist.size(); i++) {
				if (medialist.get(i).getClass() == Album.class) {

					if (((Album) medialist.get(i)).getSongs().contains(songs)){
						AllMedia.add(medialist.get(i).getTitle());
					}
				}
			}
		}
		Collections.sort(AllMedia);
		return AllMedia;
	}

}