import java.util.*;
import java.util.LinkedList;

public class GraphBfsCycle {
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
        graph[0].add(new edge(0, 3));

        graph[1].add(new edge(1, 0));
        graph[1].add(new edge(1, 2));

        graph[2].add(new edge(2, 0));
        graph[2].add(new edge(2, 1));

        graph[3].add(new edge(3, 0));
        graph[3].add(new edge(3, 4));

        graph[4].add(new edge(4, 3));

    }

    static class Pair {

        int node;
        int parent;

        public Pair(int node, int parent) {
            this.node = node;
            this.parent = parent;
        }
    }

    public static boolean isCycle(ArrayList<edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (isCycleUtil(graph, vis, i)) {
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean isCycleUtil(ArrayList<edge> graph[], boolean vis[], int s) {
        Queue<Pair> q = new LinkedList<>();
        vis[s] = true;
        q.add(new Pair(s, -1));

        while (!q.isEmpty()) {
            Pair curr = q.remove();
            for (int i = 0; i < graph[curr.node].size(); i++) {
                edge e = graph[curr.node].get(i);
                if (!vis[e.dest]) {
                    vis[e.dest] = true;
                    q.add(new Pair(e.dest, curr.node));
                }

                else if (e.dest != curr.parent) {
                    return true;
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int v = 5;
        ArrayList<edge> graph[] = new ArrayList[v];
        createGraph(graph);
        System.out.println(isCycle(graph));
    }
}
