package employeeManager;

public class salaried  extends Employee {

	double yearlySalary;
	int workLimit = 80;

	public salaried(String firstName, String lastName, double yearlySalary) {
		super(firstName, lastName);
		super.hire = "salaried";
		this.yearlySalary = yearlySalary;

	}

	// private method to get he time taken to grade exam
	@Override
	public double workH(int exam) {
		double count;
		count = exam / 4;
		return count;
	}

	@Override
	public double getSalary() {
		double count;
		count = this.yearlySalary / 26;
		return count;
	}
}