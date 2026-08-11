import java.util.*;

public class GMotherVertex {
    static class edge {

        int sour;
        int dest;

        public edge(int sour, int dest) {
            this.sour = sour;
            this.dest = dest;
        }
    }

    public static void createGrapg(ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new edge(0, 1));

        graph[1].add(new edge(1, 2));

        graph[2].add(new edge(2, 4));

        graph[3].add(new edge(3, 0));
        graph[3].add(new edge(3, 2));
        graph[3].add(new edge(3, 5));

    }

    public static void dfs(ArrayList<edge> graph[], int s, boolean vis[]) {
        vis[s] = true;

        for (int i = 0; i < graph[s].size(); i++) {
            edge e = graph[s].get(i);
            if (!vis[e.dest]) {
                dfs(graph, e.dest, vis);
            }
        }
    }

    public static int MotherVer(ArrayList<edge> graph[], int v) {
        boolean vis[] = new boolean[v];

        int motherV = -1;
        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                motherV = i;
                dfs(graph, i, vis);
            }
        }

        boolean vis2[] = new boolean[v];
        dfs(graph, motherV, vis2);

        for (int i = 0; i < vis2.length; i++) {
            if (vis2[i] == false) {
                return -1;
            }
        }

        return motherV;
    }

    public static void main(String[] args) {

        int v = 6;
        ArrayList<edge> graph[] = new ArrayList[v];
        createGrapg(graph);
        System.out.println(MotherVer(graph, v));
    }
}
