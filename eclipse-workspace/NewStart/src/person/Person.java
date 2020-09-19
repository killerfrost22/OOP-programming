package person;

public class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public Person(String name) {
		this(name, 18);
	}

	public Person() {
		this("NONAME", 18);
	}

	public Person increaseAge(int delta) {
		age += delta;

		System.out.print("this:"+this);
		return this;
		
	}

	public boolean equals(Object obj) {
		if (obj == this) {
			System.out.println("hi");
			return true;
		}
			
		if ((obj == null) || getClass() != obj.getClass()) {
			
			System.out.println("I am wrong");
			return false;
		}
		/* We cast obj so we can access the Person's instance variables */
		Person person = (Person) obj;
		boolean a = this.equals(person.name);
		System.out.print("this:"+this);
		return a;
	}

	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}