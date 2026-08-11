public class GDSUoperToNetwork {

    public static int find(int x, int par[]) {
        if (x == par[x]) {
            return x;
        }

        return par[x] = find(par[x], par);
    }

    public static boolean Union(int a, int b, int par[], int rank[]) {
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

    public static int Operations(int connections[][], int n, int par[], int rank[]) {
        for (int i = 0; i < connections.length; i++) {
            int a = connections[i][0];
            int b = connections[i][1];
            Union(a, b, par, rank);
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (par[i] == i) {
                count++;
            }
        }
        return count - 1;
    }

    public static void main(String[] args) {
        int n = 6;
        int connections[][] = { { 0, 1 }, { 0, 2 }, { 0, 3 }, { 1, 2 }, { 1, 3 } };
        int par[] = new int[n];
        for (int i = 0; i < n; i++) {
            par[i] = i;
        }
        int rank[] = new int[n];
        System.out.println(Operations(connections, n, par, rank));
    }
}