package dirGraph;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

public class DirGraph<V> {

	protected class Vertex<V> {
		protected Map<V, Integer> edge;

		protected Vertex() {
			edge = new HashMap<>();
		}

		protected Map<V, Integer> getEdge() {
			return this.edge;
		}

		protected Set<V> keySet() {
			return edge.keySet();
		}
	}
	//create instance
	private Map<V, TreeMap<V, Integer>> graph 
		= new TreeMap<V, TreeMap<V, Integer>>();

	public boolean changeEdge(V sourceVertex, V destVertex, int newWeight) {
		if ((sourceVertex == null) || (destVertex == null)) {
			throw new IllegalArgumentException();// if doesnt exist source or dest 
		}
		if (!isVertex(destVertex) || !isVertex(sourceVertex)) {
			return false;
		}// doesnt come off when destV or sourceV is false
		for (V e : graph.get(sourceVertex).keySet()) {//recursion thru ketSet
			if (e.equals(destVertex) && (newWeight < 0)) {
				graph.get(sourceVertex).remove(destVertex);
			} else {
				graph.get(sourceVertex).put(destVertex, (newWeight));
			}
			return true;
		}
		return false;
	}

	public boolean createEdge(V sourceVertex, V destVertex, int weight) {
		if ((sourceVertex == null) || (destVertex == null)) {
			throw new IllegalArgumentException();
		}if (weight < 0 || graph.get(sourceVertex).containsKey(destVertex)) {
			// check for negative weight and doesn't contain
			return false;
		}

		if (sourceVertex.equals(destVertex)) {
			// check for non-zero edge
			// that point to itself
			if (weight != 0) {
				return false;
			}
		}
		createVertex(sourceVertex);
		createVertex(destVertex);

		graph.get(sourceVertex).put(destVertex, (weight));

		return true;
	}

	public boolean createVertex(V vertexData) {// finished
		if (vertexData == null) {
			throw new IllegalArgumentException();
		}

		// check for occurrence
		if (graph.containsKey(vertexData)) {
			// this vertex exist
			return false;
		} else {
			// this vertex is new
			graph.put(vertexData, new TreeMap<V, Integer>());
			return true;
		}
	}

	public boolean deleteVertexWithEdges(V vertexData) {
		if (vertexData == null) {
			throw new IllegalArgumentException();
		} else {
			if (!isVertex(vertexData)) {
				return false;
			}
			graph.remove(vertexData);
			// we need to remove all related edges with vertex.
			for (TreeMap<V, Integer> edge : graph.values()) {
				if (edge.containsKey(vertexData)) {
					edge.remove(vertexData);
				}
			}
			return true;
		}
	}

	public DirGraph<V> divideGraph(Collection<V> verticesOfNewGraph) {
		DirGraph<V> divide = new DirGraph<V>();

		if (verticesOfNewGraph == null) {
			throw new IllegalArgumentException();
		} else {
			for (V v : verticesOfNewGraph) {
				if (isVertex(v)) {
					divide.createVertex(v);
					for (V d : graph.get(v).keySet()) {
						if (verticesOfNewGraph.contains(d)) {
							divide.createEdge(v, d, graph.get(v).get(d));
						}
					}
				}
			}
			//when the vertex is already added 
			for (V vertex : verticesOfNewGraph) {
				deleteVertexWithEdges(vertex);
			}
			//delet edges when t is finsihed change divide
			return divide;
		}
	}

	public int getEdge(V sourceVertex, V destVertex) {
		if ((sourceVertex == null) || (destVertex == null)) {
			throw new IllegalArgumentException();
		}
		// vertex does not exist
		if (!graph.containsKey(destVertex) || !graph.containsKey(sourceVertex)) {
			// either does not exist
			return -1;
		} else {
			// both exist
			if (graph.get(sourceVertex).containsKey(destVertex)) {
				// edge exist
				return graph.get(sourceVertex).get(destVertex);
			} else {
				// edge not exist
				return -1;
			}
		}
	}

	public Collection<V> getVertices() {// finished
		// return collectuion of key Set
		return graph.keySet();
	}

	public boolean isVertex(V vertexData) {// finished
		if (vertexData == null) {
			throw new IllegalArgumentException();
		}
		return graph.containsKey(vertexData);
	}

	public Collection<V> neighborsOfVertex(V vertexData) {
		Collection<V> test = new TreeSet<V>();
		if (vertexData == null) {
			throw new IllegalArgumentException();
		}if (!isVertex(vertexData)) {// when Vertex data isfalse
			return null;
		}if (graph.get(vertexData).isEmpty()) {// when there is no vertexData
			return test;
		}
		for (V e : graph.get(vertexData).keySet()) {// add each neightbor into collec
			test.add(e);
		}
		return test;

	}
}
