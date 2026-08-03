import java.util.*;

public class GraphTopologicalSort {
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

        graph[2].add(new edge(2, 3));
        graph[3].add(new edge(3, 1));
        graph[4].add(new edge(4, 0));
        graph[4].add(new edge(4, 1));
        graph[5].add(new edge(5, 0));
        graph[5].add(new edge(5, 2));

    }

    public static void topology(ArrayList<edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        Stack<Integer> s = new Stack<>();

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                topologyUtil(graph, i, vis, s);
            }
        }

        while (!s.isEmpty()) {
            System.out.print(s.pop() + " ");
        }
    }

    public static void topologyUtil(ArrayList<edge> graph[], int curr, boolean vis[], Stack<Integer> s) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                topologyUtil(graph, e.dest, vis, s);
            }
        }

        s.push(curr);
    }

    public static void main(String[] args) {

        int v = 6;
        ArrayList<edge> graph[] = new ArrayList[v];
        createGraph(graph);
        topology(graph);
    }
}
