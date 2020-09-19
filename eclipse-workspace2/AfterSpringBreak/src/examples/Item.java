package examples;

public class Item {
	private int id;
	private String name;
	
	public Item(int id, String name) { this.id = id; this.name = name; }
	public String toString() { return " (" + id + " " + name + ") "; } 
}
