
package graph;

import java.util.List;

public interface Graph {
	List<Vertex> listOfVertex();
	List<Edge> listOfEdge();
	
	/**
	 * return an array of Vertices
	 * @param Vertex v1
	 * @return Vertex[]
	 */
	public Vertex[] neighbours(Vertex v1);
	
	/**
	 * return Vertices of the graph
	 * @return String
	 */
	public String toStringVertices();
	
	/**
	 * return Edges of the graph
	 * @return String
	 */
	public String toStringEdges();
	
	/**
	 * add a vertex to the graph 
	 * @param Vertex v
	 */
	void addVertex(Vertex v);
	
	/**
	 * remove a Vertex of the graph
	 * @param Vertex v
	 */
	void removeVertex(Vertex v);
	
	/**
	 * return the number of Vertices of this graph
	 * @return Integer
	 */
	int nbVertex();
	
	/**
	 * add an edge to the graph
	 * @param start
	 * @param end
	 */
	void addEdge(Vertex start,Vertex end);
		
	/**
	 * remove an edge to the graph
	 * @param edge
	 */
	void removeEdge(Edge edge);
		
	/**
	 * add an undirectedEdge to the graph 
	 * @param UndirectedEdge UE
	 */
	void addUndirectedEdge(UndirectedEdge UE);
	
	/**
	 * remove an undirectedEdge of the graph
	 * @param UndirectedEdge UE
	 */
	void removeUndirectedEdge(UndirectedEdge UE);
	
	/**
	 * add a DirectedEdge to the graph
	 * @param DirectedEdge DE
	 */
	void addDirectedEdge(DirectedEdge DE);
	
	/**
	 * remove a DirectedEdge of the graph
	 * @param DirectedEdge DE
	 */
	void removeDirectedEdge(DirectedEdge DE);
	
	/**
	 * return the number of Edge of the graph
	 * @return Integer
	 */
	int nbEdge();
	
}
