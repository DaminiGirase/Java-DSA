import java.util.*;

public class GStronglyKosaraju {
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

        graph[0].add(new edge(0, 2));
        graph[0].add(new edge(0, 3));

        graph[1].add(new edge(1, 0));

        graph[2].add(new edge(2, 1));

        graph[3].add(new edge(3, 4));

    }

    public static void Scomponents(ArrayList<edge> graph[]) {

        // step 1
        Stack<Integer> s = new Stack<>();
        boolean vis[] = new boolean[graph.length];

        for (int i = 0; i < graph.length; i++) {
            if (!vis[i]) {
                topsortUtil(graph, vis, s, i);
            }
        }

        // step 2
        ArrayList<edge> transGraph[] = new ArrayList[graph.length];

        for (int i = 0; i < transGraph.length; i++) {
            transGraph[i] = new ArrayList<>();
        }

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                edge e = graph[i].get(j);
                transGraph[e.dest].add(new edge(e.dest, e.sour));
            }
        }

        // step 3
        int count = 0;
        boolean vis2[] = new boolean[graph.length];

        while (!s.isEmpty()) {
            int epop = s.pop();
            if (!vis2[epop]) {
                count++;
                dfs(transGraph, vis2, epop);
                System.out.println();
            }
        }

        System.out.println("Total: " + count);
    }

    public static void dfs(ArrayList<edge> transGraph[], boolean vis2[], int curr) {
        vis2[curr] = true;
        System.out.print(curr + " ");

        for (int i = 0; i < transGraph[curr].size(); i++) {
            edge e = transGraph[curr].get(i);
            if (!vis2[e.dest]) {
                dfs(transGraph, vis2, e.dest);
            }
        }
    }

    public static void topsortUtil(ArrayList<edge> graph[], boolean vis[], Stack<Integer> s, int curr) {
        vis[curr] = true;

        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);
            if (!vis[e.dest]) {
                topsortUtil(graph, vis, s, e.dest);
            }
        }
        s.push(curr);
    }

    public static void main(String[] args) {

        int v = 5;
        ArrayList<edge> graph[] = new ArrayList[v];
        createGrapg(graph);
        Scomponents(graph);
    }
}