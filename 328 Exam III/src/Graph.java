import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class Graph < Vertex > {
	
	private Vertices < Vertex > V;
	private Edges < Vertex > E;
	
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
			V.addOrder ( vertex );
		}
	}
	
	public void addEdge ( Edge < Vertex > edge ) {
		Vertex start = edge.getStart ( );
		Vertex end = edge.getEnd ( );
		
		// makes sure that the new edge doesnt have new vertices
		if ( V.contains ( start ) && V.contains ( end ) ) {
			// makes sure to check that edge doesnt already exist
			if ( ! E.contains ( edge ) ) {
				E.addOrder ( edge );
			}
		} else {
			System.out.println ( "At least one of the vertices of the given edge do not exist." );
		}
	}
	
	public boolean isConnected ( ) {
		if ( DFS ( ).size ( ) == 1 ) {
			return true;
		}
		return false;
	}
	
	public int numConnComponents ( ) {
		return connectedComponents ( ).size ( );
	}
	
	public List < Graph < Vertex > > connectedComponents ( ) {
		// list to keep track of all graphs
		List < Graph < Vertex > > graphs = new LinkedList < Graph < Vertex > > ( );
		
		// graph that represents a connected component
		Graph < Vertex > graph = new Graph < Vertex > ( );
		
		Vertices < Vertex > markedVertices = new Vertices < Vertex > ( );
		Queue < Vertex > queue = new LinkedList < Vertex > ( );
		
		// edge to use to see if 
		Edge < Vertex > edge;
		
		// used to check in order which vertexes havent been checked
		int index = 0;
		Vertex markedVertex = V.get ( index );
		
		Vertex vertex;
		
		// while not all vertices are marked
		while ( ! markedVertices.equals ( V ) ) {
			// get the next unmarked vertex
			while ( markedVertices.contains ( markedVertex ) ) {
				index += 1;
				markedVertex = V.get ( index );
			}

			// mark and queue it up to check
			markedVertices.addOrder ( markedVertex );
			queue.add ( markedVertex );
			
			graph = new Graph < Vertex > ( ) ;
			graph.addVertex ( markedVertex );
		
			// while queue isnt empty
			while ( ! queue.isEmpty ( ) ) {
				// get the next vertex to check
				markedVertex = queue.remove ( );
				
				// iterate through all edges
				for ( int i = 0; i < E.size ( ); i++ ) {
					// get next edge
					edge = E.get ( i );
					// if this edge has the vertex
					if ( edge.contains ( markedVertex ) ) {
						
						// if the edge starts at the current vertex
						// then that means the new vertex is the end
						if ( edge.startsAt ( markedVertex ) ) {
							vertex = edge.getEnd ( );
						} else {
							vertex = edge.getStart ( );
						}
						
						// makes sure that a dupe isnt being added
						if ( ! markedVertices.contains ( vertex ) ) {
							// mark it, and add it to be checked next
							markedVertices.addOrder ( vertex );
							queue.add ( vertex );
							graph.addVertex ( vertex );
						}
						graph.addEdge ( edge );
					}
				}
			}
			graphs.add ( graph );
		}
		return graphs;
	}
	
	public void printBFS ( ) {
		System.out.println ( "BFS: " + BFS ( ) );
	}

	public void printDFS ( ) {
		System.out.println ( "DFS: " + DFS ( ) );
	}
	
	public List < List < Vertex > > BFS ( ) {
		List < List < Vertex > > bfs = new LinkedList < List < Vertex > > ( );
		
		List < Vertex > list;
		
		Vertices < Vertex > markedVertices = new Vertices < Vertex > ( );
		Queue < Vertex > queue = new LinkedList < Vertex > ( );
		
		// edge to use to see if 
		Edge < Vertex > edge;
		
		// used to check in order which vertexes havent been checked
		int index = 0;
		Vertex markedVertex = V.get ( index );
		
		Vertex vertex;
		
		// while not all vertices are marked
		while ( ! markedVertices.equals ( V ) ) {
			// get the next unmarked vertex
			while ( markedVertices.contains ( markedVertex ) ) {
				index += 1;
				markedVertex = V.get ( index );
			}

			// mark and queue it up to check
			markedVertices.addOrder ( markedVertex );
			queue.add ( markedVertex );
			
			list = new LinkedList < Vertex > ( );
			list.add ( markedVertex );
		
			// while queue isnt empty
			while ( ! queue.isEmpty ( ) ) {
				// get the next vertex to check
				markedVertex = queue.remove ( );
				
				// iterate through all edges
				for ( int i = 0; i < E.size ( ); i++ ) {
					// get next edge
					edge = E.get ( i );
					// if this edge has the vertex
					if ( edge.contains ( markedVertex ) ) {
						
						// if the edge starts at the current vertex
						// then that means the new vertex is the end
						if ( edge.startsAt ( markedVertex ) ) {
							vertex = edge.getEnd ( );
						} else {
							vertex = edge.getStart ( );
						}
						
						// makes sure that a dupe isnt being added
						if ( ! markedVertices.contains ( vertex ) ) {
							// mark it, and add it to be checked next
							markedVertices.addOrder ( vertex );
							queue.add ( vertex );
							list.add ( vertex );
						}
					}
				}
			}
			bfs.add ( list );
		}
		return bfs;
	}
	
	public List < List < Vertex > > DFS ( ) {
		List < List < Vertex > > dfs = new LinkedList < List < Vertex > > ( );
		
		List < Vertex > list;
		
		Vertices < Vertex > markedVertices = new Vertices < Vertex > ( );
		Stack < Vertex > stack = new Stack < Vertex > ( );
		
		// used to check if markedvertex has a neighbor
		boolean added = false;
		
		// edge to use to see if 
		Edge < Vertex > edge;
		
		// used to check in order which vertexes havent been checked
		int index = 0;
		Vertex markedVertex = V.get ( index );
		
		Vertex vertex;
		
		Vertex front;
		
		// while not all vertices are marked
		while ( ! markedVertices.equals ( V ) ) {
			// get the next unmarked vertex
			while ( markedVertices.contains ( markedVertex ) ) {
				index += 1;
				markedVertex = V.get ( index );
			}
	
			// mark and queue it up to check
			markedVertices.addOrder ( markedVertex );
			stack.push ( markedVertex );
			
			list = new LinkedList < Vertex > ( );
			list.add ( markedVertex );
			
			while ( ! stack.isEmpty ( ) ) {
				front = stack.peek ( );
				// iterate through list to look for next vertex to cross
				for ( int i = 0; i < E.size ( ); i++ ) {
					// get next edge
					edge = E.get ( i );
					
					// if a vertex hasnt been added yet, look for one
					if ( ! added ) {
						// if this edge has the vertex
						if ( edge.contains ( front ) ) {
							
							// if the edge starts at the current vertex
							// then that means the new vertex is the end
							if ( edge.startsAt ( front ) ) {
								vertex = edge.getEnd ( );
							} else {
								vertex = edge.getStart ( );
							}
							
							// makes sure that a dupe isnt being added
							if ( ! markedVertices.contains ( vertex ) ) {
								// mark it, and add it to be checked next
								markedVertices.addOrder ( vertex );
								stack.push ( vertex );
								
								// flip 
								added = true;
								
								list.add ( vertex );
							}
						}
					}
				}
				
				// if a neighbor was never found, go to next in line
				if ( ! added ) {
					stack.pop ( );
				} else { 
					front = stack.peek ( );
				}
				added = false;
				// flip to default
			}
			dfs.add ( list );
		}
		return dfs;
	}
	
	public String toString ( ) {
		String str = "Nodes: " + V.toString ( ) + "\n";
		str += "Edges: " + E.toString ( ) + "\n";
		return str;
	}
	
	public void display ( ) {
		System.out.println ( toString ( ) );
	}

	public boolean equals ( Graph < Vertex > graph ) {
		if ( this.V.equals ( graph.V ) ) {
			if ( this.E.equals ( graph.E ) ) {
				return true;
			}
		}
		return false;
	}
}
