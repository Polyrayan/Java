package graph;

public abstract class Edge {
	Vertex v1;
	Vertex v2;
	
	public abstract Vertex[] getVertices();
	
	public abstract Vertex getStart();
	
	public abstract Vertex getEnd();
	
}
