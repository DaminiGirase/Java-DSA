import java.util.*;
import java.util.LinkedList;

public class GCourseSchedule {

    static class edge {

        int sour;
        int dest;

        public edge(int sour, int dest) {
            this.sour = sour;
            this.dest = dest;
        }
    }

    public static void main(String[] args) {
        int course[][] = { { 1, 0 }, { 2, 1 }, { 3, 2 } };

        int v = 4;
        ArrayList<edge> graph[] = new ArrayList[v];

        for (int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>();
        }

        Queue<Integer> q = new LinkedList<>();
        int courseCompl = 0;
        int indeg[] = new int[v];

        for (int i = 0; i < course.length; i++) {
            int u = course[i][0];
            int w = course[i][1];

            graph[w].add(new edge(w, u));
            indeg[u]++;
        }

        for (int i = 0; i < indeg.length; i++) {
            if (indeg[i] == 0) {
                q.add(i);
            }
        }

        while (!q.isEmpty()) {
            int curr = q.remove();
            courseCompl++;
            for (int i = 0; i < graph[curr].size(); i++) {
                edge e = graph[curr].get(i);
                indeg[e.dest]--;

                if (indeg[e.dest] == 0) {
                    q.add(e.dest);
                }
            }

        }

        if (courseCompl == v) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
