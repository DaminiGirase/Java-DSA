public class GFlaydWarshall {
    public static void main(String[] args) {

        int v = 4;
        int INF = 99999;
        int dist[][] = { { 0, 4, 11, INF }, { INF, 0, 2, 8 }, { INF, INF, 0, 3 }, { INF, INF, INF, 0 } };

        for (int k = 0; k < v; k++) {
            for (int i = 0; i < v; i++) {
                for (int j = 0; j < v; j++) {
                    dist[i][j] = Math.min(dist[i][j], dist[i][k] + dist[k][j]);
                }
            }
        }

        for (int i = 0; i < dist.length; i++) {
            for (int j = 0; j < dist[0].length; j++) {
                if (dist[i][j] == INF) {
                    System.out.print(-1 + " ");
                } else {
                    System.out.print(dist[i][j] + " ");
                }

            }
            System.out.println();
        }
    }
}
