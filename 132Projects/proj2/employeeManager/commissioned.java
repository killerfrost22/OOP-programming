		package employeeManager;

//Author Yizhan Ao
public class commissioned extends Employee {

	double commisionRate;

	// constructor
	public commissioned(String firstName, String lastName, double commisionRate) {
		super(firstName, lastName);
		this.commisionRate = commisionRate;
	}

//	public double work(double saleAmt) {
//		workCount += saleAmt;
//		return workCount;
//	}

	public double saleC(double saleAmt) {
		double count = 0;
		count+= saleAmt;
		return count;
	}
	
	public double getSalary() {
		double count;
		count= this.commisionRate * 0.01*salary;
		return count;
	}

}
