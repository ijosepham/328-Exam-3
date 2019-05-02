import java.util.ArrayList;

public class Vertices < Vertex > extends ArrayList < Vertex > {
	
	public boolean addOrder ( Vertex vertex1 ) {
		// add it to the list if its currently empty
		if ( size ( ) == 0 ) {
			add ( vertex1 );
			return true;
		} else {
			Vertex vertex;
			for ( int i = 0; i < size ( ); i++ ) {
				// get vertex from list
				vertex = get ( i );
				
				// compare given edge to edgelist
				if ( compareTo ( vertex1, vertex ) < 0 ) {
					// add the given edge when its less than any item
					super.add ( i, vertex1 );
					return true;
				}
			}
		}
		// gets here if the given edge is greater than all existing edges
		// add the edge at the end of the list
		add ( vertex1 );
		return true;
	}
	
	public int compareTo ( Vertex vertex1, Vertex vertex ) {
		int difference = 0;
		
		String str1 = vertex1 + "";
		String str2 = vertex + "";
		
		difference =  str1.compareTo ( str2 );
		
		// if they have the same start, check the ends
		if ( difference == 0 ) {
			str1 = vertex1 + "";
			str2 = vertex + "";
			
			difference =  str1.compareTo ( str2 );
		}
		return difference;
	}
	
	public String toString ( ) {
		String str = super.toString ( );
		str = str.substring ( 1, str.length ( ) - 1 );
		return str;
	}
	
}