package graph;

public class UndirectedEdge extends Edge {
	
	public UndirectedEdge(Vertex v1, Vertex v2) {
		super.v1 = v1;
		super.v2 = v2;
		
	}

	public Vertex[] getVertices() {
		return new Vertex[] {super.v1,super.v2};
	}

	@Override
	public Vertex getStart() {
		return super.v1;
	}

	@Override
	public Vertex getEnd() {
		return super.v2;
	}

}
