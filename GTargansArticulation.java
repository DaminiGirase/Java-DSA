import java.util.*;

public class GTargansArticulation {

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

    public static void dfs(ArrayList<edge> graph[], int curr, int par, int time, int dt[], int low[],
            boolean vis[], boolean ap[]) {

        vis[curr] = true;
        dt[curr] = low[curr] = ++time;
        int children = 0;

        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);
            int neigh = e.dest;

            if (neigh == par) {
                continue;
            } else if (!vis[neigh]) {
                dfs(graph, neigh, curr, time, dt, low, vis, ap);
                low[curr] = Math.min(low[curr], low[neigh]);
                if (par != -1 && dt[curr] <= low[neigh]) {
                    ap[curr] = true;
                }
                children++;
            } else {
                low[curr] = Math.min(low[curr], dt[neigh]);
            }
        }

        if (par == -1 && children > 1) {
            ap[curr] = true;
        }

    }

    public static void Ariticulation(ArrayList<edge> graph[], int v) {
        int dt[] = new int[v];
        int low[] = new int[v];
        int time = 0;
        boolean vis[] = new boolean[v];
        boolean ap[] = new boolean[v];

        for (int i = 0; i < v; i++) {
            if (!vis[i]) {
                dfs(graph, i, -1, time, dt, low, vis, ap);
            }
        }

        for (int i = 0; i < v; i++) {
            if (ap[i]) {
                System.out.println("AP: " + i);
            }
        }
    }

    public static void main(String[] args) {
        int v = 5;
        ArrayList<edge> graph[] = new ArrayList[v];
        createGrapg(graph);
        Ariticulation(graph, v);
    }
}