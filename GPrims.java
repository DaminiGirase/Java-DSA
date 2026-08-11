import java.util.*;

public class GPrims {

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

        graph[0].add(new edge(0, 1, 10));
        graph[0].add(new edge(0, 2, 15));
        graph[0].add(new edge(0, 3, 30));

        graph[1].add(new edge(1, 0, 10));
        graph[1].add(new edge(1, 3, 40));

        graph[2].add(new edge(2, 0, 15));
        graph[2].add(new edge(2, 3, 50));

        graph[3].add(new edge(3, 0, 30));
        graph[3].add(new edge(3, 1, 40));
        graph[3].add(new edge(3, 2, 50));

    }

    static class Pair implements Comparable<Pair> {

        int par;
        int n;
        int cost;

        public Pair(int par, int n, int cost) {
            this.par = par;
            this.n = n;
            this.cost = cost;
        }

        @Override
        public int compareTo(Pair p2) {
            return this.cost - p2.cost;
        }
    }

    public static void main(String[] args) {

        int v = 4;
        ArrayList<edge> graph[] = new ArrayList[v];
        createGraph(graph);

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        boolean vis[] = new boolean[v];
        pq.add(new Pair(-1, 0, 0));

        int FinalCost = 0;
        ArrayList<edge> list = new ArrayList<>();

        while (!pq.isEmpty()) {

            Pair curr = pq.remove();
            if (!vis[curr.n]) {
                vis[curr.n] = true;
                FinalCost += curr.cost;

                if (curr.par != -1) {
                    list.add(new edge(curr.par, curr.n, curr.cost));
                }

                for (int i = 0; i < graph[curr.n].size(); i++) {
                    edge e = graph[curr.n].get(i);
                    if (!vis[e.dest]) {
                        pq.add(new Pair(e.sour, e.dest, e.wt));
                    }
                }
            }
        }

        for (edge e : list) {
            System.out.print(e.sour + " " + e.dest + " " + e.wt + "\n");
        }
        System.out.println(FinalCost);
    }
}
