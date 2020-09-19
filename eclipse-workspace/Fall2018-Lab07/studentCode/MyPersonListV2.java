package studentCode;


public class MyPersonListV2 {
	//DO NOT CHANGE THIS LINE OF CODE
	Person[] people;

	
	
	/**
	 * Instantiates the "people" variable as a new (0-length) array of
	 * references to Person objects.
	 */
	public MyPersonListV2(){
		people=new Person[0];
		
	}
	
	/**
	 * A copy constructor which makes the right kind of copy considering
	 * a Person is mutable.
	 */
	public MyPersonListV2(MyPersonListV2 other) {
		people=new Person[other.people.length];
		
		for(int i=0; i<people.length; i++){
			people[i]=new Person(other.people[i]);
		
		}
	}
	
	
	/** Adds the parameter to the end of the list.  You'll need to
	 *  create a new array that's one space longer and you'll need
	 *  to copy everything from the old array into the new one, and
	 *  then add the new one of course.  
	 *  
	 *  Note that you want to make sure that you don't just do a reference
	 *  copy of the Person since it is mutable.
	 */
	public void addItem(Person newMember){	
		Person[] newPeople=new Person[people.length];
		
		for(int i=0; i<people.length; i++) {
			newPeople[i]=people[i];
		}
		
		people=new Person[people.length+1];
		
		for(int i=0; i<newPeople.length;i++) {
			people[i]=newPeople[i];
		}
		
		people[people.length-1]=new Person(newMember);
	}
	
	/** Gives each person in the list a raise of $1000
	 */
	public void giveRaises(){
		for(Person p: people) {
			p.acceptRaise(1000);
		}
	}
	
	/** Returns the sum of the salaries of all people in the list.
	 */
	public int getTotalOfSalaries(){
		int totalSalaries=0;
		
		for(Person p: people) {
			totalSalaries+=p.getSalary();
		}
		
		return totalSalaries;
	}

	/** Returns the number of people in the list with a name
	 *  that matches the parameter (possibly 0).
	 */
	/**
	 * @param searchName
	 * @return
	 */
	public int count(String searchName){
		int counter=0;
		
		for(Person p: people) {
			if(p.getName().equals(searchName)) {
				counter+=1;
			}
		}
		return counter;
	}
	
	/** Removes ALL people from the list whose names match the parameter
	 *  (possibly more than one person).  This should "shrink" the array 
	 *  if anyone is removed.  That means you need to first find out how
	 *  many times the name appears, then allocate a new smaller array
	 *  of the right size, and then only copy the things that don't match
	 *  the name from the old array into the new one.
	 */
	public void remove(String name){
		int counter=count(name);
		
		Person[] newPeople=new Person[people.length-counter];
		int x=0;
		for(int i=0; i<people.length; i++) {
			if(!people[i].getName().equals(name)) {
				newPeople[x]=people[i];
				x++;
			}
		}
		people=new Person[newPeople.length];
		
		for(int i=0; i<newPeople.length; i++) {
			people[i]=newPeople[i];
		}
	}
	
}




