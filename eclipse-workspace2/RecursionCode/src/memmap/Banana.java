package memmap;

public class Banana {
	private String type;
	private int size;
	private static int totalInstances = 0;

	public Banana(String type, int size) {
		this.type = type;
		this.size = size;
		totalInstances++;
	}

	@Override
	public String toString() {
		return type + " " + size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public static int getTotalInstances() {
		return totalInstances;
	}
}
