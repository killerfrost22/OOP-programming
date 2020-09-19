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

		return this;
	}

	public boolean equals(Object obj) {
		if (obj == this)
			return true;
		if (obj == null || getClass() != obj.getClass())
			return false;
		
		/* We cast obj so we can access the Person's instance variables */
		Person person = (Person) obj;

		return name.equals(person.name);
	}

	public String toString() {
		return "Person [name=" + name + ", age=" + age + "]";
	}
}