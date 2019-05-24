package graph;

import java.util.List;

public interface Graph {
	List<Vertex> listOfVertex();
	List<Edge> listOfEdge();
	
	
	public Vertex[] neighbours(Vertex v1);
	
	public String toStringVertices();
	
	public String toStringEdges();
	
	
	void addVertex(Vertex v);
	
	
	void removeVertex(Vertex v);
	
	
	int nbVertex();
	
	
	void addEdge(Vertex start,Vertex end);
		
	
	void removeEdge(Edge edge);
		
	
	void addUndirectedEdge(UndirectedEdge UE);
	
	
	void removeUndirectedEdge(UndirectedEdge UE);
	
	
	void addDirectedEdge(DirectedEdge UE);
	
	
	void removeDirectedEdge(DirectedEdge UE);
	
	
	int nbEdge();
	
	
	
	
}
