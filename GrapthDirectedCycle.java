import java.util.*;

public class GrapthDirectedCycle {
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

        graph[0].add(new edge(0, 3));
        graph[1].add(new edge(1, 0));
        graph[2].add(new edge(2, 0));
        graph[3].add(new edge(3, 2));

    }

    public static boolean isCycle(ArrayList<edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        boolean stack[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (isCycleUtil(graph, i, vis, stack)) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean isCycleUtil(ArrayList<edge> graph[], int curr, boolean vis[], boolean stack[]) {
        vis[curr] = true;
        stack[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);
            if (stack[e.dest]) {
                return true;
            }
            if (!vis[e.dest] && isCycleUtil(graph, e.dest, vis, stack)) {
                return true;
            }
        }
        stack[curr] = false;
        return false;
    }

    public static void main(String[] args) {

        int v = 4;
        ArrayList<edge> graph[] = new ArrayList[v];
        createGraph(graph);
        System.out.println(isCycle(graph));
    }
}