public class Graph < Vertex > {
	
	protected Vertices < Vertex > V;
	protected Edges < Vertex > E;
	
	public Graph ( ) {
		V = new Vertices < Vertex > ( );
		E = new Edges < Vertex > ( );
	}
	
	public Graph ( Vertices < Vertex > V, Edges < Vertex > E ) {
		this.V = V;
		this.E = E;
	}
	
	public void addVertex ( Vertex vertex ) {
		// makes sure to check that vertex doesnt already exist
		if ( ! V.contains ( vertex ) ) {
			V.add ( vertex );
		}
	}
	
	public void addEdge ( Edge < Vertex > edge ) {
		// makes sure to check that edge doesnt already exist
		if ( ! E.contains ( edge ) ) {
			E.add ( edge );
		}
	}
	
	public boolean isConnected ( ) {
		// go through all the vertices
		for ( int i = 0; i < V.size ( ); i++ ) {
			// get vertex
			Vertex vertex = V.get ( i );
			
			// if any vertex doesnt exist within E, 
			// that means its not connected
			if ( ! E.containsVertex ( vertex ) ) {
				return false;
			}
		}
		// gets here if went through all vertexes and they all exist within E
		return true;
	}
	
	public int numConnComponents ( ) {
		// counter
		int counter = 0;
		
		// true unless already have a reverse/ is a loop
		boolean isValid = true;
		
		// two edges to check
		Edge < Vertex > edge1;
		Edge < Vertex > edge2;
		
		// iterate through array
		for ( int i = 0; i < E.size ( ); i++ ) {
			// get first edge
			edge1 = E.get ( i );
			
			// this for loop is to check previous nodes 
			// if it was already cehcked
			for ( int j = 0; j < i; j++ ) {
				// get second edge
				edge2 = E.get ( j );
				
				// if any edge was already checked
				if ( edge2.isReverse ( edge1 ) ) {
					// flip boolean
					isValid = false;
				}
			}
			// makes sure that its not a loop node
			if ( edge1.isLoop ( ) ) {
				isValid = false;
			}
			
			// if the edge is new
			if ( isValid ) {
				// increment
				counter++;
			}
			
			// default true
			isValid = true;
		}
		return counter;
	}
	
	/**
	public Graph < Vertex > [ ] connectedComponents ( ) {
		
	}
	
	public void printBFS ( ) {
		
	}
	
	public void printDFS ( ) {
		
	}
	*/
	public String toString ( ) {
		String str = "Nodes: " + V.toString ( ) + "\n";
		str += "Edges: " + E.toString ( );
		return str;
	}
	
	
	public void display ( ) {
		System.out.println ( toString ( ) );
	}
}
