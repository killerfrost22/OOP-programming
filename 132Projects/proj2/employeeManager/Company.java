package employeeManager;

//Author Yizhan Ao
public class Company {
	
	String name, firstName, lastName;
	int maxEmployee;
	int EmCount = 0;
	int EmCapacity;
	Employee[] EmList = new Employee[10];
	boolean testAccount = false;
	Company company;
//Company constructor use param name as in put free
	public Company(String name) {
		this.name = name;
		this.testAccount = true; // free of max
	}
//Company constructor use name and maxE as input paid
	public Company(String name, int maxEmployees) {
		this.name = name;
		this.maxEmployee = maxEmployees;
		testAccount = false;
	}
//getter of get CompName
	public String getCompanyName() {
		return this.name;
	}
	
//addmethod should return output as the boolean test if the comm requirement
	public boolean hireCommissionedEmployee(String firstName, String lastName
			, double commissionRate) {
		if ((firstName == "") || (firstName == "") || (commissionRate <= 0)
				|| (commissionRate >= 100)) {
			return false;
		}
		if (findEm(firstName, lastName) != null) {
			return false;
		} else {
			final Employee a = new commissioned(firstName, lastName, 
					commissionRate);
			if ((EmCount < maxEmployee) || (testAccount == true)) {
				// store to TA array
				// TA count ++
				EmList[EmCount++] = a;
				return true;
			}
		}
		return false;
	}
//add method for adding a Salaried E into Employee array
	public boolean hireSalariedEmployee(String firstName, String lastName, 
			double yearlySalary) {
//	boolean test = false;
		if ((firstName == "") || (firstName == "") || (yearlySalary <= 0)) {
			return false;
		}
		if (findEm(firstName, lastName) != null) {
			return false;
		} else {
			final Employee a = new salaried(firstName, lastName, yearlySalary);
			if ((EmCount < maxEmployee) || (testAccount == true)) {
				EmList[EmCount++] = a;
//				System.out.println(EmCount);
				return true;
			} else {
				return false;
			}
		}

	}
//Auxilary method of first and last to find the object of the array exist
	private Employee findEm(String firstName, String lastName) {
		if (EmCount == 0) {
			// no Employee
			return null;
		} else {
			for (int i = 0; i < EmCount; i++) {
				if (firstName.equals(EmList[i].firstName) && lastName.
						equals(EmList[i].lastName)) {
					// name found
					return EmList[i];
				}
			}
		}
		return null;
		// name not found
	}
//return number of Employees
	public int numEmployees() {
//	int number = EmList.length;	 
		return this.EmCount;
	}
// return the maximum number of employee can be contained in Employee
	public int employeeCapacity() {
		if (testAccount = false) { 
			return Integer.MAX_VALUE;
		} else {
			return this.maxEmployee;
		}
	}
//return a string array of the employee's name
	public String[] getEmployeeNames() {
		for (int i = 0; i < this.EmCount; i++) {
			for (int j = 0; j < (this.EmCount - 1 - i); j++) {
				if (EmList[j].compare(EmList[j + 1]) < 0) {
					// need to exchange
					final Employee temp = EmList[j];
					EmList[j] = EmList[j + 1];
					EmList[j + 1] = temp;
				}
			}
		}
		// create a new String[]
		final String[] result = new String[EmCount];
		// pass the value of name in new form into Sting[]
		for (int i = 0; i < this.EmCount; i++) {
			result[i] = EmList[i].firstName + " " + EmList[i].lastName;
//			System.out.println(result[i]);
		}

		return result;
	}
//test the requirements to see work hours return boolean
	public boolean workHours(String firstName, String lastName, int numHours) {
		if ((firstName == "") || (firstName == null)) {
			return false;
		}
		if ((lastName == "") || (lastName == null)) {
			return false;
		}
		if (numHours <= 0) {
			return false;
		}

		// find the Employee
		final Employee a = findEm(firstName, lastName);
		// Distinguish the type of Employee

		if (a == null) {
			// not existing for the employeee
			return false;
		} else {
			if (a.workLimit < (a.workCount + numHours)) {
				return false;
			} else {
					// if not update the offCount and workCount
					a.workCount += numHours;
					// return true
					return true;
				}

			}
	}
//to see how many hours have been counted as hours worked
	public int numHours(String firstName, String lastName) {
		if ((firstName == "") || (firstName == null)) {
			return -1;
		}
		if ((lastName == "") || (lastName == null)) {
			return -1;
		}
		//create an employee based on first and last Name
		Employee a = findEm(firstName, lastName);

		if (a == null) {
			return -1;// not exist
		} else {
			return (int) a.workCount;
		}
	}
//employee had made sale
	public boolean makeSale(String firstName, String lastName, double saleAmt){
		if ((firstName == "") || (firstName == null)) {
			return false;
		}
		if ((lastName == "") || (lastName == null)) {
			return false;
		}
		if ((saleAmt <= 0) ) {
			return false;
		}
//find Employee with firstName and lastName
		Employee b = findEm(firstName, lastName);
		if (b == null) {//not exist E
			return false;
		} else {
//			if ((b.workHour) > b.workLimit) {
//				return false;//check if it is paid account or not
					b.salary += saleAmt;
					// return true
					return true;
				}
	} 

		
	
//sales are only based on what the employee had sold
	public double amtSalesMade(String firstName, String lastName) {
		if ((firstName == "") || (firstName == null)) {
			return -1.0;
		}
		if ((lastName == "") || (lastName == null)) {
			return -1.0;
		}

		final Employee a = findEm(firstName, lastName);

		if (a == null) {
			// Employee Not existing
			return -1.0;
		} else {
			return a.salary;
		}
	}
// return a double
	public double getPaycheckAmount(String firstName, String lastName) {
		if ((firstName == "") || (firstName == null)) {
			return -1.0;
		}
		if ((lastName == "") || (lastName == null)) {
			return -1.0;
		}
		if (findEm(firstName, lastName) == null) {
			return -1.0;
		}

		Employee a = findEm(firstName, lastName);

		if (a == null) {
			return -1.0;
		} else {
			
				return a.getSalary();
			}
		
	}
//returna double which is the salary of all employee
	public double getPayroll() {
		double totalPay = 0.0;
		for (int i = 0; i < numEmployees(); i++) {
			Employee temp = EmList[i];
			totalPay += temp.getSalary();
		}
		return totalPay;

	}
// start a new cycle erase the previous data of count and hour
	public void newPayPeriod() {
		for (int i = 0; i < numEmployees(); i++) {
			Employee temp = EmList[i];
			temp.workCount = 0;
			temp.workHour = 0;
		}
	}
// $10 for each billed employee for paid account only
	public double billAmount() {
		double billed = 0.0;
		if (EmCount == 0) {
			billed = 0.0;
		} // when there is no Employee
		else if (maxEmployee != 0) {
			billed = 0.0;
		} else {
			for (int i = 0; i < numEmployees(); i++) {
				billed += 10;
			}
		}
		return billed;
	}

}
