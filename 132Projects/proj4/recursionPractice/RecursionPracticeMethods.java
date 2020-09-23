package recursionPractice;

public class RecursionPracticeMethods {

//method 2
	public static <T extends Comparable<T>> T firstBetween(
			ListyList<T> list, T elt1, T elt2) {
		if ((list == null) || (elt1 == null) || (elt2 == null)) {
			throw new IllegalArgumentException("List is null");
		} else {
			return firstBetweenAux(list, elt1, elt2, 0);
		}
	}

	private static <T extends Comparable<T>> T firstBetweenAux(
			ListyList<T> list, T elt1, T elt2, int index) {
		if (index >= list.size()) {
			return null;
		}

		if (elt1.compareTo(list.get(index)) < 0) {
			if (elt2.compareTo(list.get(index)) > 0) {
				// first occurrence element found
				return list.get(index);
			} else {
				return firstBetweenAux(list, elt1, elt2, index + 1);
			}
		} else {
			return firstBetweenAux(list, elt1, elt2, index + 1);
		}
	}

//method 1
	public static <T> boolean foundInOrder(ListyList<T> list1, ListyList<T> list2) {
		if ((list1 == null) || (list2 == null)) {
			throw new IllegalArgumentException("List is null");
		} else {
			return foundInOrderAux(list1, list2, 0, 0, 0);
		}
	}

	private static <T> boolean foundInOrderAux(ListyList<T> list1, 
			ListyList<T> list2, int index1, int index2,int count) {
		if (count == list1.size()) {
			return true;
		} if(index2 >= list2.size()&&count!=list1.size() ) {
			return false;
		}
		else {
			if (list1.get(index1).equals(list2.get(index2))) {
				return foundInOrderAux(list1, list2, index1 + 1,
						index2 + 1, count + 1);
			} else {
				return foundInOrderAux(list1, list2, index1, index2 + 1, count);
			}
		}
	}

//method 3
	public static <T extends Comparable<T>> void largerOf(ListyList<T> list1, 
			ListyList<T> list2) {

		if ((list1 == null) || (list2 == null)) {
			throw new IllegalArgumentException("List is null");
		} else {
			largerOfAux(list1, list2, 0, 0);
		}

	}

	public static <T extends Comparable<T>> void largerOfAux(ListyList<T> list1, 
			ListyList<T> list2, int index1,
			int index2) {
		if (index1 >= list2.size()) {
			return;
		}
		if (index2 >= list1.size()) {
			// otherList runs out
			list1.add(list2.get(index2));
		}
		if (list1.get(index1).compareTo(list2.get(index2)) <= 0) {
			list1.set(index1, list2.get(index2));
		}
		// move on
		largerOfAux(list1, list2, index1 + 1, index2 + 1);

	}

//method 4
	public static <T> ListyList<T> removeDuplicates(ListyList<T> list) {
		if (list == null) {
			throw new IllegalArgumentException("List is null");
		} else {
			ListyList<T> newList = new ListyList<T>();
			newList.add(list.get(0));
			return removeDuplicatesAux(list, 0, 0, newList);
		}
	}

	private static <T> ListyList<T> removeDuplicatesAux(
			ListyList<T> list, int i, int j, ListyList<T> newList) {
		if (list.size() == j) {
			return newList;
		} else {
			if (newList.get(i) != list.get(j)) {
				newList.add(list.get(j));
				return removeDuplicatesAux(list, i + 1, j + 1, newList);
			} else {
				return removeDuplicatesAux(list, i, j + 1, newList);
			}
		}
	}

}
