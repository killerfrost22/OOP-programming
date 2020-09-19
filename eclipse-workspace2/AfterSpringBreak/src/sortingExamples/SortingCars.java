package sortingExamples;

import java.util.ArrayList;
import java.util.Collections;

public class SortingCars {
	public static void main(String[] args) {
		System.out.println("**** Sorting Cars ****");
		ArrayList<Car> carList = new ArrayList<Car>();
		carList.add(new Car("Nelyota", 2010));
		carList.add(new Car("Tonya", 1999));
		carList.add(new Car("BexusI", 2011));
		System.out.println("Before sorting: " + carList);
		Collections.sort(carList);  // requires java.util.*;
		System.out.println("After sorting: " + carList);
	}
}