import java.util.*;

public class GraphBipartiteAnother {

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
        // graph[3].add(new edge(3, 4));

        graph[4].add(new edge(4, 2));
        // graph[4].add(new edge(4, 3));
    }

    public static boolean isBipartite(ArrayList<edge> graph[]) {
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                if (!isCycle(graph, i, -1, vis)) {
                    return true;
                }
                int count = countV(graph, i, vis);
                return count % 2 == 0 ? true : false;
            }
        }
        return false;
    }

    public static int countV(ArrayList<edge> graph[], int curr, boolean vis[]) {
        int count = 0;
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                count += countV(graph, e.dest, vis);
            }
        }

        return count + 1;
    }

    public static boolean isCycle(ArrayList<edge> graph[], int curr, int par, boolean vis[]) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                if (isCycle(graph, e.dest, curr, vis)) {
                    return true;
                }
            } else if (vis[e.dest] && e.dest != par) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int v = 5;
        ArrayList<edge> graph[] = new ArrayList[v];
        createGraph(graph);
        System.out.println(isBipartite(graph));
    }
}
