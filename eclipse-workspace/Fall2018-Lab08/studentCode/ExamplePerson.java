package studentCode;
/** Here we provide a concrete implementation of the Person interface so 
 * that we can do some tests with it.
 */
public class ExamplePerson implements Person {
	private String name;
	private int salary;
	
	public ExamplePerson(String nameIn) {
		name = nameIn;
		salary = 10000;
	}
	
	@Override
	public Person copyMe() {
		ExamplePerson newOne = new ExamplePerson(name);
		newOne.salary = this.salary;
		return newOne;
	}
	
	@Override
	public String getName() {
		return name;
	}
	
	@Override
	public int getSalary() {
		return salary;
	}
	
	@Override
	public void acceptRaise(int amount) {
		salary += amount;
	}
	
	@Override
	public String toString() {
		return "EP: " + name + "(" + salary +")";
	}
	
	@Override
	public boolean equals(Object other) {
		if (other==null) {
			return false;
		}
		try {
			ExamplePerson local = (ExamplePerson)other;
			return this.name.equals(local.name);
		}
		catch (Exception e) {
			return false;
		}
	}
	
}