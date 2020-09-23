package employeeManager;

//Author Yizhan Ao
public class Employee {
	String lastName, firstName, hire;
	double salary = 0;
	double workCount, workHour;
	double saleC = 0;
	int workLimit = 80;
	double paycheck;
	
	
	public Employee(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;
	}

//	public double work(double saleAmt) {
//		return workCount;
//	}

	public double sales(double saleAmt) {
		return saleC;
	}

	public double getSalary() {
		return salary;
	}

	public int compare(Employee emList) {
		if (this.lastName.compareTo(emList.lastName) > 0) {
			// this lastname is after the param's
			return -1;
		} else if (this.lastName.compareTo(emList.lastName) < 0) {
			// this lastname is before the param's
			return 1;
		} else {
			// same 1st char of lastname
			// compare the first name
			if (this.firstName.compareTo
					(emList.firstName) > 0) {
				// this first name is after the param's
				return -1;
			} else if (this.firstName.
					compareTo(emList.firstName) < 0) {
				// this first name is before the param's
				return 1;
			} else {
				return 0;
				// same
			}
		}
	}

	

}
