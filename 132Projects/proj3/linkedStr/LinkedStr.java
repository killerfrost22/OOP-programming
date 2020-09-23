package linkedStr;

public class LinkedStr implements Comparable<LinkedStr> {

	private class Node {
		private Node next;
		private String dataString;
		private char data;
		public Node pre;
//inner node calss has a data input 
		private Node(char data) {
			this.data = data;
			next = null;
		}
	}

	private Node head;
	Node currentNode = null;
	int size;
	int count = 0; // insert how many which char
//	Node pointer = head;

	public LinkedStr() {
		this.head = null;
		this.size = 0;
	}

	public LinkedStr(LinkedStr otherStr) {
		int count = 0;
		if ((otherStr == null) || (otherStr.size == 0)) {
			return;
		} else {
			while (otherStr.length() > count) {
				append(otherStr.getCharAt(count));
				count++;
			}
		}
	}

	private void addFirst(char value) {
		// create the Node and set its value
		Node newNode = new Node(value);
		newNode.data = value;
		newNode.next = head;
		head = newNode;
		currentNode = newNode;
		size++;
	}

	public LinkedStr append(char ch) {
		Node newNode = new Node(ch);
		newNode.data = ch;
		if (head == null) {
			addFirst(ch);
		} else {
			newNode.next = currentNode.next;
			currentNode.next = newNode;
			currentNode = newNode;
			size++;
		}
		return this;

	}

	@Override
	public int compareTo(LinkedStr otherStr) {
		int compare = 0;
		Node pointer1 = head.next;
		Node pointer2 = otherStr.head.next;

		while (compare == 0) {
			if (pointer1 != null) {
				// first list remains
				if (pointer2 != null) {
					// second list remains
					if (pointer1.data == pointer2.data) {
						compare = 0;
					}
				} else {
					// second list runs out
					compare = 1;
				}
			} else {
				// first list runs out
				if (pointer2 != null) {
					compare = -1;
				} else {
					break;
				}
			}
			// move the pointer to the next node
			pointer1 = pointer1.next;
			pointer2 = pointer2.next;
		}

		return compare;

	}

	public void concat(LinkedStr otherStr) {

		if ((otherStr == null) || (otherStr.size == 0)) {
			return;
		} else {
			int pos = 0;
			while (pos < otherStr.length()) {
				append(otherStr.getCharAt(pos));
				pos++;
			}
		}
	}

	public void deleteCharsAt(int position, int numChars) throws
	IndexOutOfBoundsException {
		throw new UnsupportedOperationException("You must write this method.");
	}

	public int findFirst(int position, char ch) {
		throw new UnsupportedOperationException("You must write this method.");
	}

	public Character getCharAt(int position) {
		int count = 0;
		Node current = head;
		if (position > size) {
			return null;
		} else {
			while (count != position) {
				current = current.next;
				count++;
			}
		}
		return current.data;
	}

	public void insert(int position, char ch)
			throws IndexOutOfBoundsException {
		Node curr = head;
		Node prev = null;
		Node newNode = new Node(ch);
		int count = 0;
		
		if ((position > this.length()) || (position < 0)) {
			throw new IndexOutOfBoundsException();
		} else {
			while ((curr != null) && (count < position)) {
				prev = curr;
				curr = curr.next;
				count++;
			}if (prev == null) {
				newNode.next = head;
				head = newNode;
			}else {
				newNode.next = curr;
				prev.next = newNode;
			}
			size++;
		}
	}

	// return the size of the linkedlist
	public int length() {
		return this.size;
	}

	public void reset() {
		head = null;
		head.next = null;
	}

}
