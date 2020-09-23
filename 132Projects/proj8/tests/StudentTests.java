package tests;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Test;

import dirGraph.DirGraph;

public class StudentTests {

	public static DirGraph<String> graph() {
		DirGraph<String> graph = new DirGraph<>();

		// add vertices to the graph
		String[] vertices = { "a", "b", "c", "d", "e", "f" };
		int i;
		for (i = 0; i < vertices.length; i++) {
			graph.createVertex(vertices[i]);
		}

		return graph;
	}

	@Test
	public void testStudent1() {
		// this is going to be a very small graph
		DirGraph<Boolean> graph = new DirGraph<>();
//
		graph.createVertex(true);
		graph.createVertex(false);
		assertTrue(graph.createEdge(true, false, 111));
		assertFalse(graph.createEdge(false, true, -1));
		assertFalse(graph.createEdge(true, false, 111));
		// test normal casses
		assertEquals(111, graph.getEdge(true, false));
	}

	@Test
	public void testStudent2() {
		DirGraph<Boolean> graph = new DirGraph<>();
		graph.createVertex(true);
		assertTrue(graph.createEdge(true, false, 111));
		assertFalse(graph.createEdge(true, false, 111));
		assertFalse(graph.createEdge(true, false, 1110));
	}

	@Test
	public void testStudent3() {
		DirGraph<Integer> graph = TestData.exampleDirGraph4();
		assertTrue(graph.deleteVertexWithEdges(8));
		assertTrue(graph.isVertex(5));

	}

	@Test
	public void testStudent4() {
		DirGraph<Integer> graph = TestData.exampleDirGraph4();

		assertTrue(graph.deleteVertexWithEdges(6));
		assertEquals(-1, graph.getEdge(8, 6));
	}

	@Test
	public void testStudent5() {
		DirGraph<Character> graph = TestData.exampleDirGraph5();
		DirGraph<Character> graph2;

		graph2 = graph.divideGraph(Arrays.asList('f', 'r', 'o', 'g', 'f', 'r', 'o', 'g'));

		assertEquals(4, graph2.getVertices().size());
		assertEquals(5, graph.getVertices().size());
	}

	@Test
	public void testStudent6() {
		DirGraph<Integer> graph = TestData.exampleDirGraph4();

		assertTrue(graph.changeEdge(2, 4, 100));
		assertTrue(graph.changeEdge(8, 4, 200));
		assertTrue(graph.changeEdge(8, 6, 300));
		assertEquals(100, graph.getEdge(2, 4));
		assertEquals(200, graph.getEdge(8, 4));
		assertEquals(300, graph.getEdge(8, 6));

		// when the source vertex doesn't exist
		assertFalse(graph.changeEdge(8, 9, 400));
		// when the destination vertex doesn't exist
		assertFalse(graph.changeEdge(9, 8, 500));
		// when neither vertex exists
		assertFalse(graph.changeEdge(9, 10, 600));
	}

	@Test
	public void testStudent7() {
		DirGraph<String> graph = graph();
		graph.createEdge("a", "c", 12);
		graph.createEdge("a", "a", 1);
		assertEquals(12, graph.getEdge("a", "c"));
//			  assertEquals(1, graph.getEdge("a", "a"));
	}

}
