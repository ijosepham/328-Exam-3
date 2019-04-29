public class Edge < Vertex > {
	// start vertex
	private Vertex start;
	
	// end vertex
	private Vertex end;
	
	// default constructor
	public Edge ( ) {
		start = null;
		end = null;
	}

	// overloaded constructor
	public Edge ( Vertex newStart, Vertex newEnd ) {
		start = newStart;
		end = newEnd;
	}
	
	// checks if the given vertex is either the start or end
	public boolean contains ( Vertex n ) {
		if ( start == n ) {
			return true;
		}
		if ( end == n ) {
			return true;
		}
		return false;
	}
	
	// returns the start
	public Vertex getStart ( ) {
		return start;
	}
	
	// returns the end
	public Vertex getEnd ( ) {
		return end;
	}
}