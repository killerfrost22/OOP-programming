package copyconsexample;

public class HighDefTV {
	private String make;
	private int cost;

	public HighDefTV(String make, int cost) {
		this.make = make;
		this.cost = cost;
	}

	public HighDefTV(HighDefTV tv) {
		make = new String(tv.make); // Do we really need to make a copy?
		cost = tv.cost;
	}

	public String toString() {
		return "Make: " + make + ", Cost: " + cost;
	}

	public static void main(String[] args) {
		HighDefTV tv = new HighDefTV("Poly", 100);
		System.out.println("Original--> " + tv);

		HighDefTV copy = new HighDefTV(tv);
		System.out.println("Copy--> " + copy);
	}
}