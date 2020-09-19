package mediaRentalManager;

import java.util.ArrayList;
import java.util.Collections;

public class MediaRentalManager implements MediaRentalManagerInt {

	private int planLimit = -2;
	public ArrayList<Costumer> costumerlist = new ArrayList<Costumer>();
	private ArrayList<Medias> medialist = new ArrayList<Medias>();
	
	private ArrayList<String> customerTitle() {
			ArrayList<String> customerTitle = new ArrayList<String>();
			for (Costumer c : this.costumerlist)
			    customerTitle.add(c.getName());
			return customerTitle;
	}
	
		public String getAllCustomersInfo() {
		Collections.sort(costumerlist);
		StringBuffer info = new StringBuffer("***** Customers' Information *****\n");

		for (int i = 0; i < costumerlist.size(); i++) {
			info.append(costumerlist.get(i).toString() + "\n");
			info.append("Rented: " + costumerlist.get(i).rented.toString() + "\n");
			info.append("Queue: " + costumerlist.get(i).queue.toString() + "\n");
		}
		String allCustomerInfo = info.toString();
		return allCustomerInfo;
	}

	
	public String getAllMediaInfo() {
		StringBuffer info = new StringBuffer();
		Collections.sort(medialist);
		info.append("***** Media Information *****\n");
		for (int i = 0; i < medialist.size(); i++) {
			info.append(medialist.get(i).toString() + "\n");
		}
		String infoString = info.toString();
		return infoString;
	}

	public boolean addToQueue(String customerName, String mediaTitle) {
		int count = 0;
		boolean checker =false;
		for (int i = 0; i < costumerlist.size(); i++) {
			if (costumerlist.get(i).getName().equals(customerName)) {
				
					if (costumerlist.get(i).queue.contains(mediaTitle)) {
						checker = false;
						count ++;
					} else {
						checker = true;			
					}
			costumerlist.get(i).queue.add(mediaTitle);
					}
			}
		
	return checker;
		
	}	


	public boolean removeFromQueue(String customerName, String mediaTitle) {
		boolean remove = false;
		int count =0;
		for (int i = 0; i < costumerlist.size(); i++) {
			if (costumerlist.get(i).getName().equals(customerName)) {
				if (costumerlist.get(i).queue.contains(mediaTitle)) {
					costumerlist.get(i).queue.remove(mediaTitle);
					remove = true;
					count++;
				} else {
					costumerlist.get(i).queue.add(mediaTitle);
					remove = false;
				}
			}
		}

		return remove;
	}

	public String processRequests() {
		Collections.sort(costumerlist);
		Collections.sort(medialist);
		String message = "";
		
		String title ="";
		int checker =-1;
		int size ;
		int check = 0;
		ArrayList<String> copy = new ArrayList<String>();
		return message;
		
//		for (int i = 0; i < costumerlist.size(); i++) {
//			for (int j = 0; j < costumerlist.get(i).queue.size(); j++) {
//				if ((costumerlist.get(i).getPlan().equals("UNLIMITED")|| (costumerlist.get(i).rented.size() < 
//						this.planLimit))&& medialist.get(j).getCopiesAvailable()> 0) {
//					message = costumerlist + "Sending " + costumerlist.get(i).queue.get(0) + " to "+ costumerlist.get(i).getName() + "\n";
//					costumerlist.get(i).rented.add(costumerlist.get(i).queue.get(j));
//					int numberCopies = medialist.get(j).getCopiesAvailable();
//				
//					
//					
//
//				}
//			}
//		}
//		return message;
	}

	public boolean returnMedia(String customerName, String mediaTitle) {
		int index = this.customerTitle().indexOf(customerName);
		int count = 0;
		for (int i = 0; i < costumerlist.size(); i++) {
			if (costumerlist.get(i).getName().equals(customerName)) {
				for (int j = 0; j < costumerlist.get(i).rented.size(); j++) {
					if (costumerlist.get(i).rented.get(j).equals(mediaTitle)) {
						for (int k = 0; k < medialist.size(); k++) {
							if (medialist.get(k).getTitle().equals(mediaTitle)) {
								int numberOfCopies = medialist.get(k).getCopiesAvailable();
								medialist.get(k).setCopiesAvailable(numberOfCopies + 1);
						costumerlist.get(i).rented.remove(j);
						j--;
						count++;
					}
				}
			}
				}
			}
		}
		if (count > 0) {
			return false;
		} else {
			return true;
	}
			
		}


	public ArrayList<String> searchMedia(String title, String rating, String artist, String songs) {
		ArrayList<String> AllMedia = new ArrayList<String>();
		for (int i = 0; i < medialist.size(); i++) {
			if (title == null && rating == null && artist == null && songs == null){
				AllMedia.add(medialist.get(i).getTitle());
			}else if(title!=null ) {
				if (medialist.get(i).getTitle().equals(title)) {
					AllMedia.add(medialist.get(i).getTitle());
				}
			}else if (rating != null) {
				if (medialist.get(i).getClass() == Movie.class) {
					if (((Movie) medialist.get(i)).getRating().equals(rating)) {
						AllMedia.add(medialist.get(i).getTitle());
					}
				}
			}else if (artist != null) {
				if (medialist.get(i).getClass() == Albums.class) {
					if (((Albums) medialist.get(i)).getArtist().equals(artist)){
						AllMedia.add(medialist.get(i).getTitle());
					}
				}
			}else {
				if (medialist.get(i).getClass() == Albums.class) {
					if (((Albums) medialist.get(i)).getSongs().contains(songs)){
						AllMedia.add(medialist.get(i).getTitle());
					}
				}
			}
		}
		Collections.sort(AllMedia);
		return AllMedia;
	}
	
	//adders and setters
	public void addCustomer(String name, String address, String plan) {
		Costumer customer = new Costumer(name,address, plan );
		costumerlist.add(customer);
	}
	
	public void addMovie(String title, int copiesAvailable, String rating) {
		Movie movie = new Movie(title,copiesAvailable , rating);
		medialist.add(movie);
	}

	public void addAlbum(String title, int copiesAvailable, String artist, String songs) {
		Albums album = new Albums (title,copiesAvailable,artist,songs);
		medialist.add(album);
	}

	public void setLimitedPlanLimit(int value) {
		planLimit = value;
	}


}