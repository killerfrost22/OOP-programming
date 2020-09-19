package mediaRentalManager;

import java.util.*;
/**
 * Class that defines the functionality for Costumers.Costumer has a name
 * address,plan. Costumer has 2 array lists-rented and queue.
 * @author raghavgupta
 */

public class Costumer implements Comparable<Costumer> 
{
	String name, address, plan;
	ArrayList<Media> queue = new ArrayList<Media>();
	ArrayList<Media> rented = new ArrayList<Media>();
	
	

	public Costumer(String name, String address, String plan) 
	{
		this.name = name;
		this.address = address;
		this.plan = plan;
	}
	public Costumer(Costumer Costumer) 
	{
		this(Costumer.getName(), Costumer.getAddress(), Costumer.getPlan());
	}

	public boolean equals(Object obj) 
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Costumer Costumer = (Costumer) obj;
		return name.equals(Costumer.name) && address.equals(Costumer.address)&&
			   plan.equals(Costumer.plan);

	}
	
	public String toString() 
	{
		StringBuffer queuedMediaList = new StringBuffer("");
		StringBuffer rentedMediaList = new StringBuffer("");
		for (int i = 0; i < this.rented.size(); i++) 
		{
			if (i == (this.rented.size() - 1)) 
			{
				rentedMediaList.append(this.rented.get(i).getTitle());
			} else {
				rentedMediaList.append(this.rented.get(i).getTitle() + ", ");
			}
		}
		for (int i = 0; i < this.queue.size(); i++) 
		{
			if (i == (this.queue.size() - 1)) 
			{
				queuedMediaList.append(this.queue.get(i).getTitle());
			} else 
			{
				queuedMediaList.append(this.queue.get(i).getTitle() + ", ");
			}
		}
		return "Name: " + name + " , Address: " + address + ", Plan: " + plan +
				"\n" + "Rented: ["+ rentedMediaList.toString() + "]" + 
		        "\nQueue: [" + queuedMediaList.toString() + "]";
	}
	
	public String getName() 
	{
		return name;
	}
	
	
	public String getAddress() 
	{
		return address;
	}
	
	
	public String getPlan() 
	{
		return plan;
	}
	
	
	public int compareTo(Costumer Costumer) 
	{
		return this.getName().compareTo(Costumer.getName());

	}
}