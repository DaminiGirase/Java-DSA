import java.util.ArrayList;

public class GDSUcycle {

    static class Edge {

        int sour;
        int dest;
       
        public Edge(int sour, int dest) {
            this.sour = sour;
            this.dest = dest;
          
        }
    }

    public static void createGraph(ArrayList<Edge> edges) {

        edges.add(new Edge(0, 1));
        // edges.add(new Edge(0, 2));
        // edges.add(new Edge(0, 3));
        edges.add(new Edge(1, 3));
        edges.add(new Edge(2, 3));
    }

    static int n = 7;
    static int parent[] = new int[n];
    static int rank[] = new int[n];

    public static void init() {
        for (int i = 0; i < n; i++) {
            parent[i] = i;
        }
    }

    public static int find(int x) {
        if (x == parent[x]) {
            return x;
        }

        return parent[x] = find(parent[x]);
    }

    public static void union(int a, int b) {
        int parA = find(a);
        int parB = find(b);

        if (rank[parA] == rank[parB]) {
            parent[parB] = parA;
            rank[parA]++;
        } else if (rank[parA] < rank[parB]) {
            parent[parA] = parB;
        } else {
            parent[parB] = parA;
        }
    }

    public static boolean detectCycle(ArrayList<Edge> edges) {
        init();
        for (int i = 0; i < edges.size(); i++) {
            Edge e = edges.get(i);
            int parA = find(e.sour);
            int parB = find(e.dest);

            if (parA == parB) {
                return true;
            }

            union(parA, parB);
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Edge> edges = new ArrayList<>();
        createGraph(edges);
        System.out.println(detectCycle(edges));
    }
}
