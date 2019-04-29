
public class DirectedGraph < Vertex > extends Graph < Vertex > {

	public boolean isConnected ( ) {
		
	}
	
	public boolean isStronglyConnected ( ) {
		
	}
	public int numConnComponents ( ) {
		// counter
		int counter = 0;
		
		// checks to see edges point both ways
		// is only valid if points both ways, any other case is false
		boolean isValid = false;
		
		// two edges to check
		Edge < Vertex > edge1;
		Edge < Vertex > edge2;
		
		
		// iterate through array
		for ( int i = 0; i < E.size ( ); i++ ) {
			// get first edge
			edge1 = E.get ( i );
			
			// this for loop is to check future nodes for reverses
			for ( int j = i; j < E.size ( ); j++ ) {
				// get second edge
				edge2 = E.get ( j );
				
				// if any edge was already checked
				if ( edge1.isReverse ( edge2 ) ) {
					// flip boolean
					isValid = true;
				}
			}
			
			// if the edge is new
			if ( isValid ) {
				// increment
				counter++;
			}
			
			// default false
			isValid = false;
		}
		return counter;
	}
	
	public DirectedGraph < Vertex > [ ] connectedComponents ( ) {
		
	}
}
