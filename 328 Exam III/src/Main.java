
public class Main {
	public static void main ( String [ ] args ) {
		Graph < String > graph = new Graph < String > ( );
		graph.addVertex ( "F" );
		graph.addVertex ( "A" );
		graph.addVertex ( "E" );
		graph.addVertex ( "B" );
		graph.addVertex ( "D" );
		graph.addVertex ( "C" );
		
		graph.addEdge ( new Edge < String > ( "A", "B" ) );
		graph.addEdge ( new Edge < String > ( "B", "A" ) );
		graph.addEdge ( new Edge < String > ( "B", "C" ) );
		graph.addEdge ( new Edge < String > ( "D", "E" ) );
		graph.addEdge ( new Edge < String > ( "F", "A" ) );
		graph.addEdge ( new Edge < String > ( "E", "S" ) );
		graph.addEdge ( new Edge < String > ( "C", "C" ) );
		
		graph.display ( );
		System.out.println ( "Num of Conn Comps: " + graph.numConnComponents ( ) + "\n" );
		
		Graph < Double > graph1 = new Graph < Double > ( );
		graph1.addVertex ( (double) 1 );
		graph1.addVertex ( (double) 2 );
		graph1.addVertex ( (double) 5 );
		graph1.addVertex ( .4 );
		graph1.addVertex ( 9.0 );
		graph1.addVertex ( 1.2 );
		
		graph1.addEdge ( new Edge < Double > ( 1.2, 1.3 ) );
		graph1.addEdge ( new Edge < Double > ( 1.2, 1.1 ) );
		graph1.addEdge ( new Edge < Double > ( 1.2, 1.9 ) );
		graph1.addEdge ( new Edge < Double > ( 2.1, 2.1 ) );
		graph1.addEdge ( new Edge < Double > ( 2.0, 2.1 ) );
		graph1.addEdge ( new Edge < Double > ( 2.0, 2.1 ) );
		graph1.addEdge ( new Edge < Double > ( 2.0, 2.1 ) );
		
		graph1.display ( );
	}
}
