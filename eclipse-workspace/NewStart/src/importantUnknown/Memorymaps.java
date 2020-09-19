package importantUnknown;

public class Memorymaps {
	public static void task(StringBuffer dessert, int calories) {
		dessert.append("cherry");
		calories += 100;
		System.out.println("Dessert"+ dessert + "Calories:" + calories);
	}
	public static void main(String[] args) {
		StringBuffer cheeseCake = new StringBuffer("cheeseCake");
		int cal = 800;
		task(cheeseCake,cal);
	}

}
