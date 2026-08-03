import java.util.*;
import java.util.LinkedList;

public class GraphBfsTopological {
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

        graph[2].add(new edge(2, 3));
        graph[3].add(new edge(3, 1));
        graph[4].add(new edge(4, 0));
        graph[4].add(new edge(4, 1));
        graph[5].add(new edge(5, 0));
        graph[5].add(new edge(5, 2));

    }

    public static void inDegCal(ArrayList<edge> graph[], int inDegree[]) {
       
        for (int i = 0; i < graph.length; i++) {
            int v = i;
            for (int j = 0; j < graph[v].size(); j++) {
                edge e = graph[v].get(j);
                inDegree[e.dest]++;
            }
        }
    }

    public static void topSort(ArrayList<edge> graph[]){
        int inDegree[] = new int [graph.length];
        inDegCal(graph, inDegree);
        Queue<Integer> q = new LinkedList<>();

        for(int i=0; i<inDegree.length; i++){
            if(inDegree[i] == 0){
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            int curr = q.remove();
            System.out.print(curr + " ");
            for(int i=0; i<graph[curr].size(); i++){
                edge e = graph[curr].get(i);
                inDegree[e.dest]--;

                if(inDegree[e.dest] == 0){
                    q.add(e.dest);
                }
            }
        }
    }

    public static void main(String[] args) {

        int v = 6;
        ArrayList<edge> graph[] = new ArrayList[v];
        createGraph(graph);
        topSort(graph);
    }
}
