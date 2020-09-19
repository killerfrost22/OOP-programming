package quuly;

import java.util.ArrayList;

public class Quuly {
	
	
	ArrayList<que> tsetR;//Student Class although I named it differently
	ArrayList<que> InQ; // inside of the Queue itself
	ArrayList<que> helped; // helped students' arraylist
	
	private int maxVisits;
	private int helpedStudent = 0;
	private int timesHelped = 0;
	
 //	ArrayList and initialize all variables
  public Quuly(int maxVisits) {
	  this.maxVisits = maxVisits;
	  this.tsetR = new ArrayList<que>();
	  this.InQ = new ArrayList<que>();
	  this.helped = new ArrayList<que>();
	  
	  if(maxVisits == 0 || maxVisits <= 0) {
	  this.maxVisits =1;
	  }
  }
// boolean to test each outcome to be satisfactory 
  public boolean addStudent(String newStudentName, Integer newStudentID) {
	  boolean test = false;
	  if (newStudentName == null || newStudentName.equals("")) {
			// empty string and null new studentName
			return false;
	  }if (findId(newStudentID) == false) {
			tsetR.add(new que(newStudentName, newStudentID));
			test = true;
	  }else {
		  test = false;
	  }
	  return test;                                                    
  }
  
//Auxilary method of findID to return true/false if find or not within the student class
  private boolean findId(int id) {
	  for (que nextStudent : tsetR) {//within tsetR
			if (nextStudent.newStudentID == id) {
				return true; //if exists in the 
			}
	  }
	  return false;
	  	
  }
  //Auxillary method to findId within the Queue ArrayList 
  private boolean findIdQ(int id) {
	  for (que nextStudent : InQ) {// for each elemet in the InQ ArrayList
			if (nextStudent.newStudentID == id) {
				return true; // if exists 
			}
	  }	
	  return false;// if not
  }
  // return the number of students within the tsetR ArrayList
  public int numStudents() {
	  return this.tsetR.size();
  }
  // AddSStoQue (id)
  public boolean addStudentToQueue(Integer id) {	  
	  if(id == null || this.tsetR == null|| InQ == null
	|| numTimesHelped(id) >= this.maxVisits ) { //|| dropStudent(id) == false
		  return false;// test edge cases
	  }if(findIdQ(id) == true){//add student within the maxVisit 
		  return false;//if true then we are not supposed to add element into the que
	  }if (findIdQ(id) == false) {//false means doesnt exist then we proceed
		  for(que studentName: tsetR){
			  if(studentName.getnewStudentID() == id) {
				  InQ.add(studentName);
				  return true;
			  }
		  }
	  }else {
		  return false;	  
	  }
	return false;
  }
//RETURN THE SIZE OF THE INQ ARRAYLIST
  public int queueSize() {
	  int sum = 0;
			for (int i = 0; i< InQ.size(); i++) {
				sum += 1;
			}
			return sum;
  }
// TEST IF IT IS IN q OF THE PARAMETER ID
  public boolean isInQueue(Integer id) {
 // if(InQ.findIdQ(id) == true) Question here solved how to call a method 
	  for(que studentName: InQ){
		  if(studentName.getnewStudentID() == id) {
			  InQ.add(studentName);
			  return true;
		  }
	  }
	return false;
  }
  //auxilary method test if name is inside of the qUE
private boolean findNameInQ(String name) {
  for (que nextStudent : InQ) {
		if (nextStudent.newStudentName.equals(name)) {
			return true;
		}
	
  		}
  		return false;
  		
}
//TEST IF IT IS INSIED OF THE QUEUE FOR STUDENST IN TSETr
  public int isInQueue(String name) {
	int count = 0;
    if(tsetR == null || name == null || findNameInQ(name) == false) {
    	return count;
    }else {
    	 for (que nextStudent : InQ) {
    			if (nextStudent.newStudentName.equals(name)) {
    				count++; // dont make the same mistake that dont use the local variables
    			}
    	  }
    }
    
	return count;
    
  }
//GIVE BOOLEAN RESULT OF HELPED OR NOT 
  public boolean helpNextStudent() {
	boolean test = false;
	if(InQ.size() == 0) {
		return test;
	}else {
		helped.add(InQ.get(0)); //Remeber to initialize the objects!!!!! DONT MAKE SAME MISTAKE AGAIN
		InQ.remove(0);//REMOVE THE USED ONES
		helpedStudent++;// COUNT++
		test = true;
	}
	return test;
  }
//NMBER OF THE HELPED
  public int numStudentsHelped() {
    return this.helpedStudent;
  }
  private int numTimesHelpedAux(Integer id) {
	  int howmanyhelped = 0;
	  for (que nextStudent : helped) {
			if (nextStudent.newStudentID == id) {
				howmanyhelped++;
//				this.timesHelped= (timesHelped++)/2;
			}
		
	  		}
	  		return howmanyhelped;
  }
  //HOW MANY TIMES HAS BEEN HELPED JUST FOR ONE STUDENT
  public int numTimesHelped(Integer id) {
	  int numhelp = numTimesHelpedAux(id);
	  if(numhelp >= 0 && numhelp <=maxVisits) {
		 if (findId(id) == false) {
			 numhelp=-1;
		 }if(numhelp == 0 && isInQueue(id) == false && findId(id) == true ){
			 numhelp= 0;
		 }
	  }
	  //missing edge cases for 
	return numhelp;
  }
//DROP A STUDENT FROM THE tsetR Also he couldnt register back again
// Auxilary method for dropping student
  //Auxilary for having an int to return a string relating to the int
  
//  private String idfindN(Integer id) {
//		String name;
//		  for (que nextStudent : tsetR) {
//				if (nextStudent.newStudentID == id) {
//				name = ((Object) tsetR).getnewStudentName(nextStudent);
//			}
//			}
//		return name;
//  }
//		  
//  private Object deleteStudentAux(Integer id) {
//	que nextStudent =new que(idfindN(id), id);
//	return nextStudent;
//	  
//  }
  public boolean dropStudent(Integer id) {
	  //Once Removed 
	  boolean test = false;
	  if(id == null || findId(id) == false) {
		 test =false;// id is null
	  }else if(findId(id) == true) {//tsetR find student and then peform the deleting
		 test = true;
		 tsetR.remove(id);//for all students looping deleting inStudent
		 for (que nextStudent : InQ) {//for all students looping deleting inQ
				if (nextStudent.newStudentID == id) {
					InQ.remove(nextStudent);	
				}
			  }
	  }
	return test;
  }
}