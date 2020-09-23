package bst;

@SuppressWarnings({"unchecked", "rawtypes"})
public class EmptyPolyTree<K extends Comparable<K>, V>
             implements PolyTree<K, V> {

  public static EmptyPolyTree getInstance() {
	  return new EmptyPolyTree();
  }

  public NonemptyPolyTree<K, V> addKeyValuePair(K aKey, V aValue) {
	  if (aKey == null || aValue == null) {
			throw new IllegalArgumentException();
		} else {
			NonemptyPolyTree<K, V> temp = new NonemptyPolyTree(aKey, aValue
															, this, this);
			temp.root = temp;
			temp.leaf = this;
			return temp;
		}
  }

  public int treeSize() {
	  return 0;
  }

  public V lookupValueByKey(K aKey) {
	  if (aKey == null) {
			throw new IllegalArgumentException();
		} else {
			return null;
		}
  }

  public K max() throws EmptyPolyTreeException {
	  throw new EmptyPolyTreeException();
  }

  public K min() throws EmptyPolyTreeException {
	  throw new EmptyPolyTreeException();
  }

  public int distanceFromRoot(K aKey) {
    return -1;
  }

  public PolyTree<K, V> deleteKeyValuePair(K aKey) {
	  if (aKey == null) {
			throw new IllegalArgumentException();
		} else {
			return this;
		}
  }

  public String toString() {
	  return "";
  }

}
