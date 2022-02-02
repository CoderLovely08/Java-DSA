package Graphs;

import java.util.LinkedList;

public class Graph {
    private LinkedList<Integer> adj[];
    private int edges=0;

    public Graph(int v) {
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList<Integer>();
        }
    }

    public void addEdge(int source, int destination) {
        adj[source - 1].add(destination);
        adj[destination - 1].add(source);
        edges++;
    }

    public void printGraph() {
        System.out.println("Total number of edges are -"+edges  );
        for (int i = 0; i < adj.length; i++) {
            System.out.print("Vertex("+(i + 1)+")");
            for (int e : adj[i]) {
                System.out.print("-->"+e);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(5);
        g.addEdge(1, 2);
        g.addEdge(1, 3);
        g.addEdge(1, 5);
        g.addEdge(2, 3);
        g.addEdge(2, 4);
        g.addEdge(3, 5);
        g.addEdge(3, 4);
        g.printGraph();
    }
}
