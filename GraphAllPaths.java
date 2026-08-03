import java.util.ArrayList;

public class GraphAllPaths {

    static class edge {

        int sour;
        int dest;

        public edge(int sour, int dest) {
            this.sour = sour;
            this.dest = dest;
        }
    }

    public static void createGraph(ArrayList<edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new edge(0, 3));
        graph[2].add(new edge(2, 3));
        graph[3].add(new edge(3, 1));
        graph[4].add(new edge(4, 0));
        graph[4].add(new edge(4, 1));
        graph[5].add(new edge(5, 0));
        graph[5].add(new edge(5, 2));

    }

    public static void allPaths(ArrayList<edge> graph[]) {
        ArrayList<Integer> list = new ArrayList<>();
        allPathUtil(graph, list, 5, 1);

    }

    static ArrayList<ArrayList<Integer>> l = new ArrayList<>();

    public static void allPathUtil(ArrayList<edge> graph[], ArrayList<Integer> list,
            int s, int d) {

        list.add(s);
        if (s == d) {
            l.add(new ArrayList<>(list));
            list.remove(list.size() - 1); // remove destination
            return;
        }

        for (int i = 0; i < graph[s].size(); i++) {
            edge e = graph[s].get(i);
            allPathUtil(graph, list, e.dest, d);
        }

        list.remove(list.size() - 1); // remove if destination not found after visiting all nodes
    }

    public static void allPathMam(ArrayList<edge> graph[], int s, int d, String path) {
        if (s == d) {
            System.out.println(path + d);
            return;
        }

        for (int i = 0; i < graph[s].size(); i++) {
            edge e = graph[s].get(i);
            allPathMam(graph, e.dest, d, path + s);
        }
    }

    public static void main(String[] args) {
        int v = 6;
        ArrayList<edge> graph[] = new ArrayList[v];
        createGraph(graph);

        allPaths(graph);
        System.out.println(l);

        // allPathMam(graph, 5, 1, "");

    }
}