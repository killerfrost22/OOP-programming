package bst;

public class NonemptyPolyTree<K extends Comparable<K>, V> implements PolyTree<K, V> {

	// init the key and value;
	K key;
	V value;
	// init the fields of tree
	PolyTree<K, V> leftNode;
	PolyTree<K, V> rightNode;
	NonemptyPolyTree<K, V> root;
	EmptyPolyTree<K, V> leaf;

	// Constructor
	public NonemptyPolyTree(K key, V value, PolyTree<K, V> leftNode, PolyTree<K, V> rightNode) {
		this.key = key;
		this.value = value;
		this.leftNode = leftNode;
		this.rightNode = rightNode;
	}

	// Constructor
	public NonemptyPolyTree(K key, V value, PolyTree<K, V> leftNode, PolyTree<K, V> rightNode,
			NonemptyPolyTree<K, V> root, EmptyPolyTree<K, V> leaf) {
		this.key = key;
		this.value = value;
		this.leftNode = leftNode;
		this.rightNode = rightNode;
		this.root = root;
		this.leaf = leaf;
	}

	@Override
	public NonemptyPolyTree<K, V> addKeyValuePair(K aKey, V aValue) {
		if ((aKey == null) || (aValue == null)) {
			throw new IllegalArgumentException();
		} else {
			if (this.key.compareTo(aKey) == 0) {
				// replace current
				this.value = aValue;
			} else if (this.key.compareTo(aKey) > 0) {
				// insert in the left side
				if (this.leftNode instanceof EmptyPolyTree) {
					// reach the leaf
					this.leftNode = new NonemptyPolyTree<K, V>(aKey, aValue, this.leaf, this.leaf, this.root,
							this.leaf);
				} else {
					this.leftNode.addKeyValuePair(aKey, aValue);
				}
			} else {
				if (this.rightNode instanceof EmptyPolyTree) {
					// reach the leaf
					this.rightNode = new NonemptyPolyTree<K, V>(aKey, aValue, this.leaf, this.leaf, this.root,
							this.leaf);
				} else {
					this.rightNode.addKeyValuePair(aKey, aValue);
				}
			}

		}
		return this.root;
	}

//delete value thr pair
	@Override
	public PolyTree<K, V> deleteKeyValuePair(K aKey) {
		if (aKey == null) {
			throw new IllegalArgumentException();
		} else {
			if (this.key.compareTo(aKey) > 0) {
				leftNode = leftNode.deleteKeyValuePair(aKey);
			} else if (this.key.compareTo(aKey) < 0) {
				rightNode = rightNode.deleteKeyValuePair(aKey);
			} else if (this.key.compareTo(aKey) == 0) {
				try {//found at left side
					this.key = rightNode.min();
					value = rightNode.lookupValueByKey(this.key);
					rightNode = rightNode.deleteKeyValuePair(this.key);
				} catch (EmptyPolyTreeException e) {
					try {//right side of node 
						this.key = leftNode.max();
						value = leftNode.lookupValueByKey(this.key);
						leftNode = leftNode.deleteKeyValuePair(aKey);
					}catch(EmptyPolyTreeException x){
						e.printStackTrace();	
					}
				}
			}
			return this;
		}
	}

	@Override
	public int distanceFromRoot(K aKey) {
		if (aKey == null) {
			throw new IllegalArgumentException();
		} else {
			if (this.key.compareTo(aKey) == 0) {
				// empty
				return 0;
			} else if (this.key.compareTo(aKey) < 0) {
				// in the left sub tree
				if (rightNode.distanceFromRoot(aKey) == -1) {
					return -1;
				}
				return rightNode.distanceFromRoot(aKey) + 1;
			} else {
				if (leftNode.distanceFromRoot(aKey) == -1) {
					return -1;
				}
				return leftNode.distanceFromRoot(aKey) + 1;
			}
		}
	}

	@Override
	public V lookupValueByKey(K aKey) {
		if (aKey == null) {
			throw new IllegalArgumentException();
		} else {
			// search through the tree
			// use the pre-order method
			if (this.key.compareTo(aKey) == 0) {
				// current
				return this.value;
			} else if (this.key.compareTo(aKey) > 0) {
				// in the left sub tree
				return this.leftNode.lookupValueByKey(aKey);
			} else {
				// in the right sub tree
				return this.rightNode.lookupValueByKey(aKey);
			}
		}
	}

	@Override
	public K max() throws EmptyPolyTreeException {
		try {
			// reach the last node on the right
			return this.rightNode.max();
		} catch (EmptyPolyTreeException e) {
			// get the key of the node
			// before the EmptyTree node
			return this.key;
		}
	}

	@Override
	public K min() throws EmptyPolyTreeException {
		try {
			// reach the last node on the left
			return this.leftNode.min();
		} catch (EmptyPolyTreeException e) {
			// get the key of the node
			// before the EmptyTree node
			return this.key;
		}
	}

	@Override
	public String toString() {
		return this.leftNode.toString() + this.key + "+" + this.value + " " + this.rightNode.toString();
	}

	@Override
	public int treeSize() {
		return 1 + this.leftNode.treeSize() + this.rightNode.treeSize();
	}

}
