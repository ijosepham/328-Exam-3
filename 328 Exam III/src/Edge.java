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
	
	// sets the start
	public void setStart ( Vertex newStart ) {
		start = newStart;
	}
	
	// sets the end
	public void setEnd ( Vertex newEnd ) {
		end = newEnd;
	}
	
	// checks to see if an edge is the reverse of this
	public boolean isReverse ( Edge < Vertex > edge ) {
		// if this.start == that.end && this.end == that.start
		if ( start == edge.end && end == edge.start ) {
			return true;
		}
		return false;
	}
	
	// checks if it points to itself
	public boolean isLoop ( ) {
		// if start and end are the same
		if ( start == end ) {
			return true;
		}
		return false;
	}
	
	// compare to function that returns a negative number if in the right order
	public int compareTo ( Edge < Vertex > edge ) {
		int difference = 0;
		
		String str1 = start + "";
		String str2 = edge.start + "";
		
		difference =  str1.compareTo ( str2 );
		
		// if they have the same start, check the ends
		if ( difference == 0 ) {
			str1 = end + "";
			str2 = edge.end + "";
			
			difference =  str1.compareTo ( str2 );
		}
		return difference;
	}
	
	public String toString ( ) {
		return "(" + start + ", " + end + ")";
	}
}