import java.util.ArrayList;

public class GCenterNode {

    static class edge {

        int sour;
        int dest;

        public edge(int s, int d) {
            this.sour = s;
            this.dest = d;
        }
    }

    public static void createGrapg(ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new edge(0, 1));

        graph[1].add(new edge(1, 0));
        graph[1].add(new edge(1, 2));
        graph[1].add(new edge(1, 3));

        graph[2].add(new edge(2, 1));

        graph[3].add(new edge(3, 1));

    }

    public static void main(String[] args) {

        int v = 4;
        ArrayList<edge> graph[] = new ArrayList[v];
        createGrapg(graph);

        for (int i = 0; i < graph.length; i++) {
            if (graph[i].size() == graph.length - 1) {
                System.out.println(i);
            }
        }
    }
}
