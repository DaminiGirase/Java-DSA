import java.util.*;

public class GraphSevenBridg {

    static class edge {
        int sour;
        int dest;

        public edge(int sour, int dest) {
            this.sour = sour;
            this.dest = dest;
        }
    }

    public static boolean SevenBridges(ArrayList<edge> graph[]) {
        int ind[] = new int[graph.length];
        indeg(graph, ind);

        boolean flag = true;
        for (int i = 0; i < graph.length; i++) {
            if (ind[i] % 2 != 0) {
                flag = false;
                break;
            }
        }

        return flag;
    }

    public static void indeg(ArrayList<edge> graph[], int ind[]) {

        for (int i = 0; i < graph.length; i++) {
            for (int j = 0; j < graph[i].size(); j++) {
                edge e = graph[i].get(j);
                ind[e.dest]++;
            }
        }

    }

    public static void main(String[] args) {
        int lands[][] = {
                { 0, 1 },
                { 0, 2 },
                { 1, 3 },
                { 1, 2 },
                { 2, 3 },
        };

        int ed = 4;
        ArrayList<edge> graph[] = new ArrayList[ed];

        for (int i = 0; i < ed; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int[] land : lands) {

            int u = land[0];
            int v = land[1];

            graph[u].add(new edge(u, v));
            graph[v].add(new edge(v, u));
        }

        System.out.println(SevenBridges(graph));

    }
}
