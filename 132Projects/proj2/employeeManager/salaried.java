package employeeManager;

//Author Yizhan Ao
public class salaried extends Employee {

	double yearlySalary;
	int workLimit = 80;

	public salaried(String firstName, String lastName, double yearlySalary) {
		super(firstName, lastName);
		this.yearlySalary = yearlySalary;

	}

	// To tell how many work Hours has been made
	public double work(double saleAmt) {
		workCount += saleAmt ;
		return workCount;
	}

	@Override
	public double getSalary() {
		double output;
		 output= this.yearlySalary / 26;
		return output;
	}
}
