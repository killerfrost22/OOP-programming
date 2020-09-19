package sortingExamples;
import java.util.*;

public class Sorting {
	public static void main(String[] args) {
		System.out.println("**** Sorting Strings ****");
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("Barbara");
		stringList.add("Albert");
		stringList.add("Carlos");
		System.out.println("Before sorting: " + stringList);
		Collections.sort(stringList);  // requires java.util.*;
		System.out.println("After sorting: " + stringList);

		System.out.println("\n**** Sorting Integers ****");
		ArrayList<Integer> integerList = new ArrayList<Integer>();
		integerList.add(5);
		integerList.add(3);
		integerList.add(10);
		System.out.println("Before sorting: " + integerList);
		Collections.sort(integerList);  // requires java.util.*;
		System.out.println("After sorting: " + integerList);
		
		/* String and Integer are considered Comparable */
		Comparable<String> hello = new String("Hello");
		System.out.println(hello);

		Comparable<Integer> number = new Integer(100);
		System.out.println(number);
	}
}