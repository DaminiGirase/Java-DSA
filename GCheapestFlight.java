import java.util.*;
import java.util.LinkedList;

public class GCheapestFlight {

    static class edge {
        int sour;
        int dest;
        int wt;

        public edge(int sour, int dest, int wt) {
            this.sour = sour;
            this.dest = dest;
            this.wt = wt;
        }
    }

    public static void createGraph(int flight[][], ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < flight.length; i++) {
            int s = flight[i][0];
            int d = flight[i][1];
            int w = flight[i][2];

            graph[s].add(new edge(s, d, w));
        }
    }

    static class Info {

        int n;
        int cost;
        int stop;

        public Info(int n, int cost, int stop) {
            this.n = n;
            this.cost = cost;
            this.stop = stop;
        }
    }

    public static int ChpeapestPath(int flight[][], int src, int des, int node, int k) {

        ArrayList<edge> graph[] = new ArrayList[node];
        createGraph(flight, graph);

        Queue<Info> q = new LinkedList<>();
        q.add(new Info(src, 0, 0));

        int dist[] = new int[node];
        for (int i = 0; i < node; i++) {
            if (i != src) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        while (!q.isEmpty()) {
            Info curr = q.remove();
            if (curr.stop > k) {
                break;
            }

            for (int i = 0; i < graph[curr.n].size(); i++) {
                edge e = graph[curr.n].get(i);
                int u = e.sour;
                int v = e.dest;
                int w = e.wt;

                if (dist[u] != Integer.MAX_VALUE && curr.cost + w < dist[v]) {
                    dist[v] = curr.cost + w;
                    q.add(new Info(v, dist[v], curr.cost + 1));
                }

            }
        }

        if (dist[des] != Integer.MAX_VALUE) {
            return dist[des];
        } else {
            return -1;
        }

    }

    public static void main(String[] args) {
        int flight[][] = { { 0, 1, 100 }, { 0, 2, 400 }, { 1, 2, 100 } };
        System.out.println(ChpeapestPath(flight, 0, 2, 3, 2));
    }
}
