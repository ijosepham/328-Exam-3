import java.util.ArrayList;

public class Edges < Vertex > {
	// list of edges 
	private ArrayList < Edge < Vertex > > edges;
	
	// defualt constructor
	public Edges ( ) {
		edges = new ArrayList < Edge < Vertex > > ( );
	}
	
	// overloaded constructor
	public Edges ( ArrayList < Edge < Vertex > > edges ) {
		this.edges = edges;
	}
	
	public void add ( Edge < Vertex > edge ) {
		edges.add ( edge );
	}
	
	// adds the edge to the list in order
	public int addOrder ( Edge < Vertex > edge1 ) {
		if ( edges.contains ( edge1 ) ) {
			return -1;
		} else {
			// add it to the list if its currently empty
			if ( size ( ) == 0 ) {
				edges.add ( edge1 );
				return 0;
			} else {
				Edge < Vertex > edge;
				for ( int i = 0; i < size ( ); i++ ) {
					// get edge from list
					edge = edges.get ( i );
					
					// compare given edge to edgelist
					if ( edge1.compareTo ( edge ) < 0 ) {
						// add the given edge when its less than any item
						edges.add ( i, edge1 );
						return i;
					}
				}
			}
			// gets here if the given edge is greater than all existing edges
			// add the edge at the end of the list
			edges.add ( edge1 );
			return size ( );
		}
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
	public boolean contains ( Edge < Vertex > edge1 ) {
		Edge < Vertex > edge;
		
		// iterate through
		for ( int i = 0; i < size ( ); i++ ) {
			// get current edge
			edge = edges.get ( i );
			
			// if any edge.compareTo(edge1) == 0, they're the same 
			if ( edge.compareTo ( edge1 ) == 0 ) {
				// return true
				return true;
			}
		}
		// if given edges doesnt exist inside
		return false;
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
	
	public String toString ( ) {
		String str = edges.toString ( );
		str = str.substring ( 1, str.length ( ) - 1 );
		return str;
	}
	
	public boolean equals ( Edges < Vertex > edges ) {
		if ( size ( ) == edges.size ( ) ) {
			for ( int i = 0; i < size ( ); i++ ) {
				if ( this.edges.get ( i ) != edges.get ( i ) ) {
					return false;
				}
			}
			return true;
		} else {
			return false;
		}
	}
}