import java.util.*;
public class GrapthCreate {

    static class edges {

        int sour;
        int dest;
        int wt;

        public edges(int s, int d, int w) {
            this.sour = s;
            this.dest = d;
            this.wt = w;
        }
    }

    public static void main(String[] args) {

        int v = 5;
        ArrayList<edges> graph[] = new ArrayList[v];

        for(int i=0; i<v; i++){
            graph[i] = new ArrayList<>();
        }

        graph[0].add(new edges(0, 1, 5));

        graph[1].add(new edges(1, 0, 5));
        graph[1].add(new edges(1, 2, 1));
        graph[1].add(new edges(1, 3, 3));

        graph[2].add(new edges(2, 1, 1));
        graph[2].add(new edges(2, 3, 1));
        graph[2].add(new edges(2, 4, 2));

        graph[3].add(new edges(3, 1, 3));
        graph[3].add(new edges(3, 2, 2));

        graph[4].add(new edges(4, 2, 2));

        for(int i=0; i<graph[2].size(); i++){
            edges e = graph[2].get(i);
            System.out.println(e.dest);
        }

    }
}
