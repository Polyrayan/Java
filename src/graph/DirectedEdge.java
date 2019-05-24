package graph;

public class DirectedEdge extends Edge {
	
	
	public DirectedEdge(Vertex start, Vertex end) {
		super.v1 = start;
		super.v2 = end;
	}

	@Override
	public Vertex[] getVertices() {
		return new Vertex [] {super.v1, super.v2};
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
