public class Graph {
    
    // Data Members

    // This stores the total number of vertices in the graph.
    private final int total_vertices;

    // This is a bag of integers which keeps track of all the adjacent vertices of all the vertices in the graph.
    private Bag<Integer>[] adjacent_vertices;

    // Methods

    // Constructor: Constructs the graph of number of vertices as required.
    public Graph(int vertices_required)
    {

        this.total_vertices = vertices_required;
        // Constructs the Bags of integers equals to the number of vertices required.
        adjacent_vertices = (Bag<Integer>) new Bag[v];
        for(int i=0; i < v; i++) adjacent_vertices[i] = new Bag<Integer>();

    }

    // This connects the two vertices as required.
    public void addEdge(int vertice1, int vertice2)
    {

        adjacent_vertices[vertice1].add(vertice2);
        adjacent_vertices[vertice2].add(vertice1);

    }

    // This returns all the adjacent vertices of a given vertex in an iterable form.
    public Iterable<Integer> adjacent_vertices(int v){ return adjacent_vertices[v]; }

}
