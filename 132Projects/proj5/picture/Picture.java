package picture;

// (c) Larry Herman, 2020.  You are allowed to use this code yourself, but
// not to provide it to anyone else.

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Picture {

  private static class Node {
    private Shape data;
    private Node next;
    private Node prev;
  }

  private Node head;
  private Node tail;
  private int numShapes;

  public Picture() {
    head= tail= null;
    numShapes= 0;
  }

  // prepend newShape to the doubly-linked list of shapes being stored, but
  // just do nothing if newSape is null
  public void addShape(Shape newShape) {
    Node newNode;

    if (newShape != null) {
      newNode= new Node();
      newNode.data= newShape;

      newNode.next= head;
      if (head != null)
        head.prev= newNode;
      else tail= newNode;  // if the list is currently empty

      head= newNode;

      numShapes++;
    }
  }

  // for use in debugging
  @Override
  public String toString() {
    String result= "";
    Node current= head;

    while (current != null) {
      result += (current != head ? " " : "") + current.data;
      current= current.next;
    }

    return result;
  }

public Iterator<Shape> iterator() {
	return new MyIterator();
}
public class MyIterator implements Iterator<Shape> {
	//use pointer to keep track of the iterator
	 Node curr = head;
	 Node preNode = null;
	 boolean test = false;
	@Override
	public boolean hasNext() {
		return curr!= null;
	}
	@Override
	public Shape next()	throws NoSuchElementException{
		if (hasNext()) {
			// not empty
			Shape shape = curr.data;
			//to record that next is called
			preNode = curr;
			curr = curr.next;
			return shape;
		} else {
			// empty
			throw new NoSuchElementException();
		}
	}
	@Override
	public void remove() throws IllegalStateException{
		if (preNode == null) {
			// reach here if remove has called
			// or
			// next has not been called	
			throw new IllegalStateException();
		} else {
			// we have a node that has been called
			// remove double link
			if(preNode == head) {
				head = preNode.next;
			}else if (preNode.next != null) {
				preNode.prev.next = preNode.next;
				curr.prev = preNode.prev;
			}else {
				tail = preNode.prev;
				preNode.prev.next = curr;
			}
			preNode = null;
		}
	}
}



}
