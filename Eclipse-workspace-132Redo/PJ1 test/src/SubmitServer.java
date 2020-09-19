

//Haoyu Cheng

import java.util.ArrayList;

public class SubmitServer {

	public final int maxSubmissions;
	ArrayList<Student> nameList;

	public SubmitServer(int maxSubmissions) {
		// Constructor
		this.maxSubmissions = maxSubmissions;
		nameList = new ArrayList<Student>();
	}

	// add a student to the server
	public boolean addStudent(String newStudent) {
		if (newStudent == null || newStudent.equals("")) {
			// empty string
			return false;
		} else {
			// exist or not
			if (findName(newStudent) == null) {
				// not exist
				nameList.add(new Student(newStudent));
				return true;
			} else {
				// exist
				return false;
			}
		}
	}
	
	private Student findName(String name) {
		// find the name
		for (Student nextStudent : this.nameList) {
			if (nextStudent.name.equals(name)) {
				// found
				return nextStudent;
			}

		}
		// not exist
		return null;
	}

	// get the number of the students in the server
	public int numStudents() {
		return this.nameList.size();
	}

	// update the submission of a student
	// return
	// true for success
	// false for failed
	public boolean addSubmission(String name, int[] testResults) {
		// test case 3 a/b/d
		if (testResults == null || testResults.length == 0 || findName(name) == null) {
			return false;
		}
		// test case 3 c
		for (int i : testResults) {
			if (i < 0) {
				// cannot be negative
				return false;
			}
		}

		Student thisStudent = findName(name);

		// case 4
		if (thisStudent.NO_submit == maxSubmissions) {
			// reach max submission
			return false;
		}

		int score = getScore(testResults);
		if (score > thisStudent.score) {
			// case 1 : higher score
			thisStudent.addSubmission(testResults);
			thisStudent.NO_submit++;
			thisStudent.score = score;
			thisStudent.bestSubmit = testResults;
			return true;
		} else {
			// case 2 : lower/equal score
			thisStudent.addSubmission(testResults);
			thisStudent.NO_submit++;
			return true;
		}

	}

	// get the best score of a student
	// return -1 if this student not exist
	public int score(String name) {
		// find the student
		Student thisStudent = findName(name);
		if (thisStudent == null) {
			// student not exist
			return -1;
		} else {
			// student found
			return thisStudent.score;
		}

	}

	// get the number of submissions of a student
	// -1 for not exist
	public int numSubmissions(String name) {
		// find the student
		Student thisStudent = findName(name);

		if (thisStudent == null) {
			// student not exist
			return -1;
		} else {
			return thisStudent.NO_submit;
		}

	}

	// get the total number of submissions of
	// all the students in the server
	public int numSubmissions() {
		int sum = 0;
		for (Student nextStudent : nameList) {
			// add the NO of submit student by student
			sum += nextStudent.testResult.size();
		}
		return sum;
	}

	// find is the student pass half of the tests or not
	public boolean satisfactory(String name) {
		// find the student
		Student thisStudent = findName(name);

		if (thisStudent == null) {
			// not exist
			return false;
		} else {
			return thisStudent.satisfactory();
		}

	}

	// check the student has the quality for the extra credit or not
	public boolean gotExtraCredit(String name) {
		Student thisStudent = findName(name);
		if (thisStudent == null) {
			// student not exist
			return false;
		} else if (thisStudent.NO_submit == 1) {
			// only submit once
			for (int i : thisStudent.bestSubmit) {
				// find for test not pass
				if (i <= 0) {
					// fail exist
					return false;
				}
			}
			// all passed
			return true;
		}
		// for other conditions
		return false;
	}

	// private method to get certain value

	// used to find the Student object by name
	

	// get the total score of a valid submission
	private int getScore(int[] list) {
		int sum = 0;
		for (int i : list) {
			sum += i;
		}
		return sum;
	}

}
