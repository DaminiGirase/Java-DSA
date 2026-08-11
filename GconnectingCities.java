import java.util.*;
import java.util.LinkedList;

public class GconnectingCities {
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

    public static void createGraph(int cities[][], ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < cities.length; i++) {
            for (int j = 0; j < cities[i].length; j++) {
                if (cities[i][j] != 0) {
                    graph[i].add(new edge(i, j, cities[i][j]));
                }
            }
        }
    }

    static class Info implements Comparable<Info> {

        int n;
        int cost;

        public Info(int n, int cost) {
            this.n = n;
            this.cost = cost;
        }

        @Override
        public int compareTo(Info i2) {
            return this.cost - i2.cost;
        }
    }

    public static int ConnectingCity(ArrayList<edge> graph[], int v) {

        PriorityQueue<Info> pq = new PriorityQueue<>();
        boolean vis[] = new boolean[v];
        pq.add(new Info(0, 0));
        int finalCost = 0;

        while (!pq.isEmpty()) {
            Info curr = pq.remove();
            if (!vis[curr.n]) {
                vis[curr.n] = true;
                finalCost += curr.cost;

                for (int i = 0; i < graph[curr.n].size(); i++) {
                    edge e = graph[curr.n].get(i);
                    pq.add(new Info(e.dest, e.wt));
                }
            }
        }
        return finalCost;

    }

    public static void main(String[] args) {

        int cities[][] = { { 0, 1, 2, 3, 4 },
                { 1, 0, 5, 0, 7 },
                { 2, 5, 0, 6, 0 },
                { 3, 0, 6, 0, 0 },
                { 4, 7, 0, 0, 0 } };

        int v = 5;
        ArrayList<edge> graph[] = new ArrayList[v];
        createGraph(cities, graph);
        System.out.println(ConnectingCity(graph, v));
    }
}
