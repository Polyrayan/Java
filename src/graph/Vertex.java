package graph;

public class Vertex {
	private Object object;
	
	/**
	 * 
	 * @param object
	 */
	public Vertex(Object object) {
		this.setObject(object);
	}
	
	//getters and setters
	
	/**
	 * 
	 * @return Object
	 */
	public Object getObject() {
		return object;
	}
	
	/**
	 * 	
	 * @param object
	 */
	public void setObject(Object object) {
		this.object = object;
	}
	
}
