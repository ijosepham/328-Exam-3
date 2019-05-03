import java.util.List;

public class Main {
	public static void main ( String [ ] args ) {
		tester ( );
	}
	
	public static void tester ( ) {
		tester1 ( );
		tester2 ( );
		tester3a ( );
		tester3b ( );
	}
	
	public static void tester1 ( ) {
		System.out.println ( "Tester 1: " );
		Graph < String > graph = new Graph < String > ( );
		graph.addVertex ( "a" );
		graph.addVertex ( "b" );
		graph.addVertex ( "c" );
		graph.addVertex ( "d" );
		graph.addVertex ( "e" );
		graph.addVertex ( "f" );
		graph.addVertex ( "g" );
		graph.addVertex ( "h" );
		
		graph.addEdge ( new Edge < String > ( "a", "b" ) );
		graph.addEdge ( new Edge < String > ( "a", "c" ) );
		graph.addEdge ( new Edge < String > ( "b", "c" ) );
		graph.addEdge ( new Edge < String > ( "d", "e" ) );
		graph.addEdge ( new Edge < String > ( "f", "g" ) );
		graph.addEdge ( new Edge < String > ( "g", "h" ) );
		
		graph.printDFS ( );
		
		System.out.println ( "isConnected: " + graph.isConnected ( ) );
		System.out.println ( "numComp: " + graph.numConnComponents ( ) );
	}
	
	public static void tester2 ( ) {
		System.out.println ( "\nTester 2: " );
		Vertices < String > vertices = new Vertices < String > ( );
		vertices.addOrder ( "a" );
		vertices.addOrder ( "b" );
		vertices.addOrder ( "c" );
		vertices.addOrder ( "d" );
		vertices.addOrder ( "e" );
		vertices.addOrder ( "f" );
		vertices.addOrder ( "g" );
		vertices.addOrder ( "h" );
		
		Edges < String > edges = new Edges < String > ( );
		edges.addOrder ( new Edge < String > ( "a", "b" ) );
		edges.addOrder ( new Edge < String > ( "a", "c" ) );
		edges.addOrder ( new Edge < String > ( "b", "c" ) );
		edges.addOrder ( new Edge < String > ( "d", "e" ) );
		edges.addOrder ( new Edge < String > ( "f", "g" ) );
		edges.addOrder ( new Edge < String > ( "g", "h" ) );
		
		Graph < String > graph = new Graph < String > ( vertices, edges );
		
		graph.printDFS ( );
		
		System.out.println ( "isConnected: " + graph.isConnected ( ) );
		System.out.println ( "numComp: " + graph.numConnComponents ( ) );
		System.out.println ( "\nConnComps: " );
		List < Graph < String > > list = graph.connectedComponents ( );
		for ( int i = 0; i < list.size ( ); i++ ) {
			System.out.println ( "Connected Component #" + ( i + 1 ) );
			System.out.println ( list.get ( i ) );
			System.out.println ( "" );
		}
	}
	
	public static void tester3a ( ) {
		System.out.println ( "\nDirected Graph G Tester: " );
		Vertices < String > vertices = new Vertices < String > ( );
		vertices.addOrder ( "a" );
		vertices.addOrder ( "b" );
		vertices.addOrder ( "c" );
		vertices.addOrder ( "d" );
		vertices.addOrder ( "e" );
		
		Edges < String > edges = new Edges < String > ( );
		edges.addOrder ( new Edge < String > ( "a", "b" ) );
		edges.addOrder ( new Edge < String > ( "b", "c" ) );
		edges.addOrder ( new Edge < String > ( "b", "d" ) );
		edges.addOrder ( new Edge < String > ( "c", "d" ) );
		edges.addOrder ( new Edge < String > ( "d", "e" ) );
		edges.addOrder ( new Edge < String > ( "e", "a" ) );
		
		DirectedGraph < String > G = new DirectedGraph < String > ( vertices, edges );
		
		System.out.println ( "isConnected: " + G.isConnected ( ) );
		System.out.println ( "isStronglyConnected: " + G.isStronglyConnected ( ) );
		System.out.println ( "BFS: " + G.BFS ( ) );
	}
	
	public static void tester3b ( ) {
		System.out.println ( "\nDirected Graph H Tester: " );
		Vertices < String > vertices = new Vertices < String > ( );
		vertices.addOrder ( "a" );
		vertices.addOrder ( "b" );
		vertices.addOrder ( "c" );
		vertices.addOrder ( "d" );
		vertices.addOrder ( "e" );
		
		Edges < String > edges = new Edges < String > ( );
		edges.addOrder ( new Edge < String > ( "b", "a" ) );
		edges.addOrder ( new Edge < String > ( "b", "c" ) );
		edges.addOrder ( new Edge < String > ( "c", "d" ) );
		edges.addOrder ( new Edge < String > ( "d", "b" ) );
		edges.addOrder ( new Edge < String > ( "d", "e" ) );
		edges.addOrder ( new Edge < String > ( "e", "a" ) );
		
		DirectedGraph < String > H = new DirectedGraph < String > ( vertices, edges );
		
		System.out.println ( "isConnected: " + H.isConnected ( ) );
		System.out.println ( "isStronglyConnected: " + H.isStronglyConnected ( ) );
		System.out.println ( "BFS: " + H.BFS ( ) );
		System.out.println ( "stronglyConnComps: " );
		List < DirectedGraph < String > > list = H.connectedComponents ( );
		for ( int i = 0; i < list.size ( ); i++ ) {
			System.out.println ( "Strongly Connected Component #" + ( i + 1 ) );
			System.out.println ( list.get ( i ) );
			System.out.println ( "" );
		}
	}
	
	public static void testera ( ) {
		System.out.println ( "Tester 1: " );
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
		System.out.println ( "Conn Comps: \n" + graph.connectedComponents ( ) );
		
		graph.printBFS ( );
		graph.printDFS ( );
		
		System.out.print ( "isConnected: " + graph.isConnected ( ) );
	}
	
	public static void testerb ( ) {
		System.out.println ( "\n\nTester 2: " );
		DirectedGraph < String > graph = new DirectedGraph < String > ( );
		graph.addVertex ( "F" );
		graph.addVertex ( "D" );
		graph.addVertex ( "A" );
		graph.addVertex ( "B" );
		graph.addVertex ( "E" );
		graph.addVertex ( "C" );
		graph.addVertex ( "Q" );
		graph.addVertex ( "R" );
		graph.addVertex ( "S" );
		graph.addVertex ( "T" );
		
		graph.addEdge ( new Edge < String > ( "A", "B" ) );
		graph.addEdge ( new Edge < String > ( "B", "C" ) );
		graph.addEdge ( new Edge < String > ( "C", "D" ) );
		graph.addEdge ( new Edge < String > ( "D", "E" ) );
		graph.addEdge ( new Edge < String > ( "E", "F" ) );
		graph.addEdge ( new Edge < String > ( "F", "A" ) );
		
		graph.addEdge ( new Edge < String > ( "Q", "R" ) );
		graph.addEdge ( new Edge < String > ( "R", "S" ) );
		graph.addEdge ( new Edge < String > ( "S", "T" ) );
		graph.addEdge ( new Edge < String > ( "T", "Q" ) );
		
		graph.display ( );
		
		System.out.println ( "stronglyConnected: " + graph.isStronglyConnected ( ) );
		System.out.println ( "Num of Conn Comps: " + graph.numConnComponents ( ) );
		System.out.println ( "Conn Comps: \n" + graph.connectedComponents ( ) );
		
		graph.printBFS ( );
		graph.printDFS ( );
		
		System.out.print ( "isConnected: " + graph.isConnected ( ) );
	}
	
	public static void ex3u ( ) {
		System.out.println ( "\n\nTester 3: " );
		Vertices < String > V = new Vertices < String > ( );
		V.addOrder ( "a" );
		V.addOrder ( "b" );
		V.addOrder ( "c" );
		V.addOrder ( "d" );
		V.addOrder ( "e" );
		V.addOrder ( "f" );
		V.addOrder ( "g" );
		V.addOrder ( "h" );
		V.addOrder ( "i" );
		V.addOrder ( "j" );
		V.addOrder ( "k" );
		
		Edges < String > E = new Edges < String > ( );
		E.addOrder ( new Edge < String > ( "a", "b") );
		E.addOrder ( new Edge < String > ( "a", "c") );
		E.addOrder ( new Edge < String > ( "b", "c") );
		E.addOrder ( new Edge < String > ( "b", "d") );
		E.addOrder ( new Edge < String > ( "b", "e") );
		E.addOrder ( new Edge < String > ( "b", "g") );
		E.addOrder ( new Edge < String > ( "c", "g") );
		E.addOrder ( new Edge < String > ( "c", "f") );
		E.addOrder ( new Edge < String > ( "d", "f") );
		E.addOrder ( new Edge < String > ( "f", "g") );
		E.addOrder ( new Edge < String > ( "f", "h") );
		E.addOrder ( new Edge < String > ( "g", "h") );
		E.addOrder ( new Edge < String > ( "i", "j") );
		E.addOrder ( new Edge < String > ( "i", "k") );
		E.addOrder ( new Edge < String > ( "j", "k") );
		Graph < String > graph1 = new Graph < String > ( V, E );
		graph1.printBFS ( );
		graph1.printDFS ( );
	}
	
	public static void ex3d ( ) {
		System.out.println ( "\nTester 4: " );
		Vertices < String > V1 = new Vertices < String > ( );
		V1.addOrder ( "a" );
		V1.addOrder ( "b" );
		V1.addOrder ( "c" );
		V1.addOrder ( "d" );
		V1.addOrder ( "e" );
		V1.addOrder ( "f" );
		V1.addOrder ( "g" );
		V1.addOrder ( "h" );
		V1.addOrder ( "i" );
		V1.addOrder ( "j" );
		
		Edges < String > E1 = new Edges < String > ( );
		E1.addOrder ( new Edge < String > ( "a", "c") );
		E1.addOrder ( new Edge < String > ( "b", "a") );
		E1.addOrder ( new Edge < String > ( "c", "b") );
		E1.addOrder ( new Edge < String > ( "c", "f") );
		E1.addOrder ( new Edge < String > ( "d", "a") );
		E1.addOrder ( new Edge < String > ( "d", "c") );
		E1.addOrder ( new Edge < String > ( "e", "c") );
		E1.addOrder ( new Edge < String > ( "e", "f") );
		E1.addOrder ( new Edge < String > ( "f", "b") );
		E1.addOrder ( new Edge < String > ( "f", "g") );
		E1.addOrder ( new Edge < String > ( "f", "h") );
		E1.addOrder ( new Edge < String > ( "h", "g") );
		E1.addOrder ( new Edge < String > ( "h", "i") );
		E1.addOrder ( new Edge < String > ( "i", "j") );
		E1.addOrder ( new Edge < String > ( "j", "h") );
		
		DirectedGraph < String > graph2 = new DirectedGraph < String > ( V1, E1 );
		graph2.printBFS ( );
		graph2.printDFS ( );
	}
}
