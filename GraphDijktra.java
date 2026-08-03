import java.util.*;

public class GraphDijktra {

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

    public static void createGraph(ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new edge(0, 1, 2));
        graph[0].add(new edge(0, 2, 4));

        graph[1].add(new edge(1, 2, 1));
        graph[1].add(new edge(1, 3, 7));

        graph[2].add(new edge(2, 4, 3));

        graph[3].add(new edge(3, 5, 1));

        graph[4].add(new edge(4, 3, 2));
        graph[4].add(new edge(4, 5, 5));

    }

    static class Pair implements Comparable<Pair> {

        int n;
        int path;

        public Pair(int n, int path) {
            this.n = n;
            this.path = path;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.path - p2.path;
        }
    }

    public static void Dijktra(ArrayList<edge> graph[], int s) {
        int dist[] = new int[graph.length];
        for (int i = 0; i < dist.length; i++) {
            if (i != s) {
                dist[i] = Integer.MAX_VALUE;
            }
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean vis[] = new boolean[graph.length];
        pq.add(new Pair(s, 0));

        while (!pq.isEmpty()) {
            Pair curr = pq.remove();
            if (!vis[curr.n]) {
                vis[curr.n] = true;

                for (int i = 0; i < graph[curr.n].size(); i++) {
                    edge e = graph[curr.n].get(i);
                    int u = e.sour;
                    int v = e.dest;
                    int wt = e.wt;

                    if (dist[u] + wt < dist[v]) {
                        dist[v] = dist[u] + wt;
                        pq.add(new Pair(v, dist[v]));
                    }

                }
            }

        }

        for(int i=0; i<dist.length; i++){
            System.out.println("0 -> " + i + " Distance = " + dist[i]);
        }
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<edge> graph[] = new ArrayList[v];
        createGraph(graph);
        Dijktra(graph, 0);
    }
}
