package sortingExamples;

public class Car implements Comparable<Car> {
	private String make;
	private int year;
	
	public Car(String make, int year) {
		this.make = make;
		this.year = year;
	}
	
	public String toString() {
		return "(Make " + make + "/Year " + year + ")";
	}
	
	public int compareTo(Car car) {
		/* What is a shorter way to implement this method? */
		if (year < car.year) {
			return -1;
		} else if (year > car.year) {
			return 1;
		} else {
			return 0;
		}
	}	
}