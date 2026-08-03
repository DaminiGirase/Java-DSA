import java.util.*;

public class GraphConEdgeToAdja {

    static class edge {

        int sour;
        int dest;

        public edge(int sour, int dest) {
            this.sour = sour;
            this.dest = dest;
        }
    }

    public static void main(String[] args) {

        int v = 4;
        int edges[][] = {
                { 0, 1 },
                { 0, 2 },
                { 1, 2 },
                { 2, 3 }
        };

        // BY LIST OF LIST

        List<List<Integer>> adj = new ArrayList<>();

        for (int i = 0; i < v; i++) {
            adj.add(new ArrayList<>());
        }

        for (int e[] : edges) {
            int u = e[0];
            int w = e[1];

            adj.get(u).add(w); // for directed only this
            // adj.get(w).add(u); // for undirected this also required

        }

        for (int i = 0; i < v; i++) {
            System.out.print(i + " -> ");
            for (int j = 0; j < adj.get(i).size(); j++) {
                System.out.print(adj.get(i).get(j) + " ");
            }
            System.out.println();
        }

        // BY ARRAY OF ARRAYLIST

        // ArrayList<edge> graph[] = new ArrayList[v];

        // for (int i = 0; i < v; i++) {
        // graph[i] = new ArrayList<>();
        // }

        // one way

        // for (int i = 0; i < edges.length; i++) {
        // int u = edges[i][0];
        // int w = edges[i][1];
        // graph[u].add(new edge(u, w));
        // // graph[w].add(new edge(w, u));
        // }

        // another way

        // for (int[] e : edges) {
        // int u = e[0], w = e[1];

        // graph[u].add(new edge(u, w));
        // // graph[w].add(new edge(w, u));
        // }

        // for (int i = 0; i < graph.length; i++) {
        // System.out.print(i + " -> ");
        // for (int j = 0; j < graph[i].size(); j++) {
        // System.out.print(graph[i].get(j).dest + " ");
        // }
        // System.out.println();
        // }
    }
}