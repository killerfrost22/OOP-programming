package employeeManager;

//Author Yizhan Ao
public class Manager {

	public static Company createAccount(String name) {
		final Company test = new Company(name);

		if ((name == null) || (name == "")) {
			return null;
		} else {
			test.name = name;
		}
		return test;
	}

	public static Company createAccount(String name, int maxEmployees) {
		final Company test = new Company(name, maxEmployees);
		if ((name == null) || (name == "") || (maxEmployees <= 0)) {
			return null;
		} else {
			test.name = name;
			test.maxEmployee = maxEmployees;
		}
		return test;
	}

}