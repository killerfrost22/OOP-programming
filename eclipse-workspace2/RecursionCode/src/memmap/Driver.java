package memmap;

public class Driver {
	public static void process(Banana p) {
		p.setSize(20);
	}

	public static void main(String[] args) {
		String type = "green";
		int bananaSize = 10;

		Banana b1 = new Banana(type, bananaSize);
		process(b1);
		System.out.println(b1);
		System.out.println("Total Instances: " + Banana.getTotalInstances());
	}
}
