package mediaRentalManager;

import java.util.ArrayList;

public class Costumer implements Comparable<Costumer>{
	private String name;
	private String address;
	private String plan;
	private int value;
	//initiate all variables
	 protected ArrayList<String> rented = new ArrayList<>();
	 protected ArrayList<String> queue = new ArrayList<>();
	
	 
	 
	 //getters and setters
	 public String getName() {
			return this.name;
	}
	 public String getAddress() {
			return this.address;
	}
	public String getPlan() {
			return this.plan;
	}
	
	/**
	 *\setter
	 * @param name
	 * @param 
	 * @returns Costumer object with that title
	 */
		public void setName(String name) {
			this.name = name;
		}
		/**
		 *\setter
		 * @param address
		 * @param 
		 * @returns Media object with that title
		 */
		public void setAddress(String address) {
			this.address = address;
		}
		/**
		 *\setter
		 * @param plan
		 * @param 
		 * @returns Media object with that title
		 */
		public void setPlan(String plan) {
			this.plan = plan;
		}
		
		
	
	 //constructor 
		/**
		 *constructor 
		 * @param name
		 * @param address
		 * @param plan
		 * @returns constructor and chekcer
		 */
		public Costumer(String name, String address, String plan){
			this.name = name;
			this.address = address;
			this.plan = plan;
			rented = new ArrayList<String>();
			queue = new ArrayList<String>();
			
			if(plan.equals("LIMITED")){
				MediaRentalManager lim = new MediaRentalManager();
				lim.setLimitedPlanLimit(2);
			}
		}
	 //toString
		/**
		 *\tostring
		 * @param 
		 * @param 
		 * @returns a string combination
		 */
	public String toString() {
			return "Name: "+this.getName()+", Address: "+this.address+", Plan: "+this.plan;
	}
	@Override
	/**
	 *\check value
	 * @param o
	 * @param 
	 * @returns a string combination
	 */
	public int compareTo(Costumer copy) {
		return this.name.compareTo(copy.name);
	}

	/*Name: Albert, Mike, Address: 11 Apple Mount VA, Plan: LIMITED
	  Rented: []
	  Queue: []
	*/
	
}
