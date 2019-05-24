package graph;

public class UndirectedEdge extends Edge {
	
	/**
	 * Constructor
	 * @param v1
	 * @param v2
	 */
	public UndirectedEdge(Vertex v1, Vertex v2) {
		super.v1 = v1;
		super.v2 = v2;	
	}
	
	/**
	 *@return Vertex[]
	 */
	public Vertex[] getVertices() {
		return new Vertex[] {super.v1,super.v2};
	}
	
	/**
	 * @return Vertex
	 */
	@Override
	public Vertex getStart() {
		return super.v1;
	}
	
	/**
	 * @return Vertex
	 */
	@Override
	public Vertex getEnd() {
		return super.v2;
	}

}
