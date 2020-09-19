package employeeManager;

public class commissioned extends Employee {

	double hourlySalary;
	int workLimit = 20;

	// constructor
	public commissioned(String firstName, String lastName, double hourlySalary) {
		super(firstName, lastName);
		super.hire = "commissioned";
		this.hourlySalary = hourlySalary;
	}

	// private method to get he time taken to grade exam
	@Override
	public double workH(int input) {
		double count;
		count = input;
		return count;
	}

	@Override
	public double getSalary() {
		double count;
		count = this.hourlySalary * super.workCount;
		return count;
	}

}
