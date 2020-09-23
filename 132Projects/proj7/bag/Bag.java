package bag;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Bag {

	Map<Integer, Integer> elements = new HashMap<>();

	public void add(int elt) {
		boolean test = contains(elt);
		if (test) {
			Integer x = elements.get(elt);
			elements.put(elt, x + 1);
		} else {
			elements.put(elt, 1);
		}

	}

	public boolean contains(int elt) {
		return elements.containsKey(elt);
	}

	public int getCount(int elt) {
		if (elements.containsKey(elt)) {
			return elements.get(elt);
		} else {
			return 0;
		}
	}

	public void remove(int elt) {
		Integer happen = getCount(elt);
		if (happen == 1) {
			// duplicates
			elements.remove(elt);
		} else if (happen > 1) {
			// remove one occurrence
			Integer occurance = elements.get(elt);
			elements.put(elt, occurance - 1);
		}
	}

	public int size() {
		Set<Integer> keySet = elements.keySet();
		int sum = 0;
		Iterator<Integer> iter = keySet.iterator();
		while (iter.hasNext()) {
			sum += elements.get(iter.next());
		}
		return sum;
	}

	public Set<Integer> uniqueElements() {
		Set<Integer> keys = elements.keySet();
		Set<Integer> re = new HashSet<Integer>();
		Iterator<Integer> iter = keys.iterator();
		while (iter.hasNext()) {
			re.add(iter.next());
		}

		return re;
	}

}
