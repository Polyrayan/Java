package graph;

public class TestGraph {

	public static void main(String[] args) {
		Vertex v1 = new Vertex(args);
		Vertex v2 = new Vertex(args);
		
		UndirectedEdge ue = new UndirectedEdge(v1,v2);
		
		DirectedEdge de = new DirectedEdge(v1,v2);
		
		
	}

}
