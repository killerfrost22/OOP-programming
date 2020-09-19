package quuly;

public class que implements Comparable<que> {
	String newStudentName;
	int newStudentID;

	public que(String newStudentName, int newStudentID) {
		this.newStudentName = newStudentName;
		this.newStudentID = newStudentID;
			
	}
	public String toString() {
	    return "Name: " + newStudentName + ", ID: " + newStudentID ;
	}
	
	public String getnewStudentName() {
		return this.newStudentName;
	}
	public int getnewStudentID() {
		return this.newStudentID;
	}
	@Override
	public int compareTo(que other) {
	    if (newStudentID < other.newStudentID) {
		      return -1;
	    }else if (newStudentID == other.newStudentID) {
	    	return 0;
	    }
		 else return 1;
	}
}
