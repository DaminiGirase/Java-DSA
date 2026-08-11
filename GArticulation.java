import java.util.ArrayList;

public class GArticulation {
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

    public static int countCompo(ArrayList<edge> graph[], int v, int remove) {
        int count = 0;
        boolean vis[] = new boolean[v];
        for (int i = 0; i < graph.length; i++) {

            if (i == remove) {
                continue;
            }
            if (!vis[i]) {
                count++;
                dfs(graph, vis, i, remove);
            }
        }
        return count;
    }

    public static void Ariculate(ArrayList<edge> graph[]) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int remove = 0; remove < graph.length; remove++) {
            int count = 0;
            count = countCompo(graph, graph.length, remove);
            if (count > 1) {
                list.add(remove);
            }
        }
        System.out.println(list);
    }

    public static void dfs(ArrayList<edge> graph[], boolean vis[], int curr, int remove) {
        vis[curr] = true;
        for (int i = 0; i < graph[curr].size(); i++) {
            edge e = graph[curr].get(i);

            if (e.dest == remove) {
                continue;
            }
            if (!vis[e.dest]) {
                dfs(graph, vis, e.dest, remove);
            }
        }

    }

    public static void main(String[] args) {

        int v = 5;
        ArrayList<edge> graph[] = new ArrayList[v];
        createGrapg(graph);
        Ariculate(graph);
    }
}