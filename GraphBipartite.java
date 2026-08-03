import java.util.*;
import java.util.LinkedList;

public class GraphBipartite {
    static class edge {

        int sour;
        int dest;

        public edge(int sour, int dest) {
            this.sour = sour;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new edge(0, 1));
        graph[0].add(new edge(0, 2));

        graph[1].add(new edge(1, 0));
        graph[1].add(new edge(1, 3));

        graph[2].add(new edge(2, 0));
        graph[2].add(new edge(2, 4));

        graph[3].add(new edge(3, 1));
        graph[3].add(new edge(3, 4));

        graph[4].add(new edge(4, 2));
        graph[4].add(new edge(4, 3));
    }

    public static boolean isBipattite(ArrayList<edge> graph[]) {

        int col[] = new int[graph.length];
        for (int i = 0; i < col.length; i++) {
            col[i] = -1;
        }

        for (int i = 0; i < graph.length; i++) {
            if (col[i] == -1) {
                if (!isBipartiteUtil(graph, i, col)) {
                    return false;
                }
            }
        }

        return true;
    }

    public static boolean isBipartiteUtil(ArrayList<edge> graph[], int i, int col[]) {

        Queue<Integer> q = new LinkedList<>();

        if (col[i] == -1) {
            q.add(i);
            col[i] = 0;
        }

        while (!q.isEmpty()) {
            int curr = q.remove();

            for (int j = 0; j < graph[curr].size(); j++) {
                edge e = graph[curr].get(j);
                if (col[e.dest] == -1) {
                    int nextcol = col[curr] == 0 ? 1 : 0;
                    col[e.dest] = nextcol;
                    q.add(e.dest);
                } else if (col[e.dest] == col[curr]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int v = 5;
        ArrayList<edge> graph[] = new ArrayList[v];
        createGraph(graph);

        System.out.println(isBipattite(graph));
    }
}