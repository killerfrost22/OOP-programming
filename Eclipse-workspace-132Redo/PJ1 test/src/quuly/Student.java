package quuly;

//Haoyu Cheng
//this class is used to store the info of the student and their submission

import java.util.ArrayList;

public class Student {

	String name;
	int NO_submit;
	int[] bestSubmit;

	ArrayList<int[]> testResult = new ArrayList<int[]>();
	int score = 0;

	// constructor
	public Student(String name) {
		this.name = name;
		this.score = 0;
		this.NO_submit = 0;
	} 

	// methods

	// add submission to the student's results
	public void addSubmission(int[] testResults) {
		this.testResult.add(testResults);
	}

	// check for satisfactory(same purpose of 3.8)
	public boolean satisfactory() {
		if (bestSubmit == null) {
			return false;
		}
		int passNum = (int) ((bestSubmit.length + 1) / 2);
		// compare to the passNum
		int passCount = 0;
		for (int i : bestSubmit) {
			if (i > 0) {
				passCount++;
			}
		}
		if (passCount >= passNum) {
			return true;
		} else {
			return false;
		}
	}

}
