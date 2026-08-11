import java.util.*;;

public class GDSURedundantCon {

    public static int find(int x, int par[]) {
        if (x == par[x]) {
            return x;
        }

        return par[x] = find(par[x], par);
    }

    public static boolean union(int a, int b, int par[], int rank[]) {
        int parA = find(a, par);
        int parB = find(b, par);

        if (parA == parB) {
            return false;
        } else {
            if (rank[parA] == rank[parB]) {
                par[parB] = parA;
                rank[parA]++;
            } else if (rank[parA] < rank[parB]) {
                par[parA] = parB;
            } else {
                par[parB] = parA;
            }
        }

        return true;
    }

    public static void findRedundantConnection(int[][] edges) {
        int par[] = new int[edges.length + 1];
        int rank[] = new int[edges.length + 1];
        for (int i = 0; i < par.length; i++) {
            par[i] = i;
        }

        ArrayList<ArrayList<Integer>> l1 = new ArrayList();
        boolean flag = true;
      
        for (int i = 0; i < edges.length; i++) {
            ArrayList<Integer> l2 = new ArrayList<>();
            flag = union(edges[i][0], edges[i][1], par, rank);
            if (flag == false) {
                l2.add(edges[i][0]);
                l2.add(edges[i][1]);
                l1.add(l2);
            }
        }
        System.out.println(l1);
    }

    public static void main(String[] args) {
        int edges[][] = { { 0, 1 }, { 0, 2 }, { 1, 2 }, {0, 3}, {1, 3} };
        findRedundantConnection(edges);
    }
}
