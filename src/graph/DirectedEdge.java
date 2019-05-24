package graph;

public class DirectedEdge extends Edge {
	
	/**
	 * Constructor
	 * @param start
	 * @param end
	 */
	public DirectedEdge(Vertex start, Vertex end) {
		super.v1 = start;
		super.v2 = end;
	}
	
	/**
	 *@return Vertex[]
	 */
	@Override
	public Vertex[] getVertices() {
		return new Vertex [] {super.v1, super.v2};
	}
	/**
	 *@return Vertex 
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
