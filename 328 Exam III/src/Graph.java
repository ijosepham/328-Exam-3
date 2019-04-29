public class Graph < Vertex > {
	
	Vertices < Vertex > V;
	Edges < Vertex > E;
	
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
		int num = 0;
		
		
		return num;
	}
	
	public Graph [ ] connectedComponents ( ) {
		
	}
	
	public void printBFS ( ) {
		
	}
	
	public void printDFS ( ) {
		
	}
	
	public String toString ( ) {
		
	}
}
