package codeduplication;

public class ExperimentWithCodeDup {
	private String name, address, phone;
	private double salary;

	public ExperimentWithCodeDup(String name, String address, String phone, double salary) {
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.salary = salary;
	}

	public String formatA() {
		if (name != null && address != null && phone != null && (salary > 0 && salary < 10000)) {
			String answer = "Data Collected During\n";

			answer += "Summer 2018 by Dr. Smith, \n";
			answer += "Dr. Sanders, and Dr. Peterson\n";
			answer += "Copyright 2010\n";
			answer += "Name: " + name + "\n";
			answer += "Address: " + address + "\n";
			answer += "Phone: " + phone + "\n";
			answer += "Salary: " + salary + "\n";

			return answer;
		}

		return null;
	}

	public String formatB() {
		if (name != null && address != null && phone != null && (salary > 0 && salary < 10000)) {
			String answer = "Data Collected During\n";

			answer += "Summer 2018 by Dr. Smith, \n";
			answer += "Dr. Sanders, and Dr. Peterson\n";
			answer += "Copyright 2010\n";
			answer += "[NAME]: " + name + "\n";
			answer += "[ADDRESS]: " + address + "\n";
			answer += "[PHONE]: " + phone + "\n";
			answer += "[SALARY]: " + salary + "\n";
			return answer;
		}

		return null;
	}

	public static void main(String[] args) {
		ExperimentWithCodeDup e = new ExperimentWithCodeDup("John", "DC", "555", 100);

		System.out.println(e.formatA());
		System.out.println(e.formatB());
	}
}
