import java.util.ArrayList;

public class Edges < Vertex > {
	// list of edges 
	ArrayList < Edge < Vertex > > edges;
	
	// defualt constructor
	public Edges ( ) {
		edges = new ArrayList < Edge < Vertex > > ( );
	}
	
	// overloaded constructor
	public Edges ( ArrayList < Edge < Vertex > > edges ) {
		this.edges = edges;
	}
	
	// adds the edge to the list
	public void add ( Edge < Vertex > edge ) {
		edges.add ( edge );
	}
	
	// gets the edge at the given index
	public Edge < Vertex > get ( int index ) {
		return edges.get ( index );
	}
	
	// returns the size of the list of edges
	public int size ( ) {
		return edges.size ( );
	}
	
	// cehcks if the given edge exists within the list
	public boolean contains ( Edge < Vertex > edge ) {
		return edges.contains ( edge );
	}
	
	// checks if any edges inside the list contains the given vertex
	public boolean containsVertex ( Vertex vertex ) {
		// go through all edges
		for ( int i = 0; i < edges.size ( ); i++ ) {
			// get current edge
			Edge < Vertex > edge = edges.get ( i );
			
			// if the edge has the vertex at the start or end
			if ( edge.contains ( vertex ) ) {
				// then that means the list contains the vertex
				return true;
			}
		}
		// gets here if went through the entire list and doesn't contain the vertex
		return false;
	}
}