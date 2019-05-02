
public class Main {
	public static void main ( String [ ] args ) {
		DirectedGraph < String > graph = new DirectedGraph < String > ( );

		graph.addVertex ( "F" );
		graph.addVertex ( "A" );
		graph.addVertex ( "E" );
		graph.addVertex ( "B" );
		graph.addVertex ( "D" );
		graph.addVertex ( "C" );
		graph.addVertex ( "H" );
		graph.addVertex ( "W" );
		graph.addVertex ( "X" );
		graph.addVertex ( "Y" );
		graph.addVertex ( "Z" );
		graph.addVertex ( "Q" );
		
		graph.addEdge ( new Edge < String > ( "A", "B" ) );
		graph.addEdge ( new Edge < String > ( "A", "E" ) );
		graph.addEdge ( new Edge < String > ( "A", "H" ) );
		graph.addEdge ( new Edge < String > ( "B", "D" ) );
		graph.addEdge ( new Edge < String > ( "B", "C" ) );
		graph.addEdge ( new Edge < String > ( "C", "E" ) );
		graph.addEdge ( new Edge < String > ( "F", "A" ) );
		graph.addEdge ( new Edge < String > ( "W", "X" ) );
		graph.addEdge ( new Edge < String > ( "X", "Z" ) );
		graph.addEdge ( new Edge < String > ( "Z", "Y" ) );
		
		graph.display ( );
		
		System.out.println ( "stronglyConnected: " + graph.isStronglyConnected ( ) );
		System.out.println ( "Num of Conn Comps: " + graph.numConnComponents ( ) );
		
		graph.printBFS ( );
		graph.printDFS ( );
		
		System.out.print ( "isConnected: " + graph.isConnected ( ) );
	}
}
