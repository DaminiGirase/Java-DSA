import java.util.*;
import java.util.LinkedList;

public class GraphBFS {
    static class edge {

        int s;
        int d;
        int w;

        public edge(int s, int d, int w) {
            this.s = s;
            this.d = d;
            this.w = w;
        }
    }

    public static void createGrapg(ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new edge(0, 1, 1));
        graph[0].add(new edge(0, 2, 1));

        graph[1].add(new edge(1, 0, 1));
        graph[1].add(new edge(1, 3, 1));

        graph[2].add(new edge(2, 0, 1));
        graph[2].add(new edge(2, 4, 1));

        graph[3].add(new edge(3, 1, 1));
        graph[3].add(new edge(3, 4, 1));
        graph[3].add(new edge(3, 5, 1));

        graph[4].add(new edge(4, 2, 1));
        graph[4].add(new edge(4, 3, 1));
        graph[4].add(new edge(4, 5, 1));

        graph[5].add(new edge(5, 3, 1));
        graph[5].add(new edge(5, 4, 1));
        graph[5].add(new edge(5, 6, 1));

        graph[6].add(new edge(6, 5, 1));

    }

    // bfs and bfsUtil are separate beacuse some time draph are not connected to
    // traverse unconnected part we use both functions

    public static void bfs(ArrayList<edge> graph[]) {
        boolean vis[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                bfsUtil(graph, vis);
            }
        }

    }

    public static void bfsUtil(ArrayList<edge> graph[], boolean vis[]) {
        Queue<Integer> q = new LinkedList<>();

        q.add(0);
        while (!q.isEmpty()) {
            int curr = q.remove();

            if (!vis[curr]) {
                System.out.print(curr + " ");
                vis[curr] = true;

                for (int i = 0; i < graph[curr].size(); i++) {
                    edge e = graph[curr].get(i);
                    q.add(e.d);
                }
            }
        }
    }

    // using this count we can find number of components
    // we can slove leetcode number of operations to connect network

    public static void dfs(ArrayList<edge> graph[]) {
        int count = 0;
        boolean vis[] = new boolean[graph.length];
        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                count++;
                dfsUtil(graph, i, vis);
            }
        }
        System.out.println(count);
    }

    public static void dfsUtil(ArrayList<edge> graph[], int curr, boolean vis[]) {
        // System.out.print(curr + " ");
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);
            if (!vis[e.d]) {
                dfsUtil(graph, e.d, vis);
            }
        }
    }

    public static boolean hasPath(ArrayList<edge> graph[], int sour, int dest, boolean vis[]) {
        if (sour == dest) {
            return true;
        }

        vis[sour] = true;
        for (int i = 0; i < graph[sour].size(); i++) {
            edge e = graph[sour].get(i);
            if (!vis[e.d] && hasPath(graph, e.d, dest, vis)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        int v = 7;
        ArrayList<edge> graph[] = new ArrayList[v];
        createGrapg(graph);

        // bfs(graph);

        dfs(graph);
        // System.out.println(hasPath(graph, 0, 6, new boolean[v]));
    }
}
