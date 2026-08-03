import java.util.*;
import java.util.LinkedList;

public class RotOranBFS {

    static class Triplate {

        int x;
        int y;
        int time;

        public Triplate(int x, int y, int time) {
            this.x = x;
            this.y = y;
            this.time = time;
        }
    }

    public static void main(String[] args) {
        int grid[][] = { { 2, 1, 1 }, { 0, 1, 1 }, { 1, 0, 1 } };

        
        // int n = grid.length;
        // int m = grid[0].length;

        // int fresh = 0;
        // int empty = 0;
        // Queue<Triplate> q = new LinkedList<>();

        // for (int i = 0; i < n; i++) {
        //     for (int j = 0; j < m; j++) {
        //         if (grid[i][j] == 1) {
        //             fresh++;
        //         } else if (grid[i][j] == 2) {
        //             q.add(new Triplate(i, j, 0));
        //         } else {
        //             empty++;
        //         }
        //     }
        // }

        // if (empty == n * m) {
        //     System.out.println(0);
        // }

        // int ans = -1;
        // while (!q.isEmpty()) {
        //     Triplate e = q.remove();
        //     int x = e.x;
        //     int y = e.y;
        //     int time = e.time;

        //     ans = time;

        //     if (x > 0 && grid[x - 1][y] == 1) {
        //         grid[x - 1][y] = 2;
        //         q.add(new Triplate(x - 1, y, time + 1));
        //         fresh--;
        //     }

        //     if (y > 0 && grid[x][y - 1] == 1) {
        //         grid[x][y - 1] = 2;
        //         q.add(new Triplate(x, y - 1, time + 1));
        //         fresh--;
        //     }

        //     if (x < n - 1 && grid[x + 1][y] == 1) {
        //         grid[x + 1][y] = 2;
        //         q.add(new Triplate(x + 1, y, time + 1));
        //         fresh--;
        //     }

        //     if (y < m - 1 && grid[x][y + 1] == 1) {
        //         grid[x][y + 1] = 2;
        //         q.add(new Triplate(x, y + 1, time + 1));
        //         fresh--;
        //     }
        // }

        // if (fresh == 0) {
        //     System.out.println(ans);
        // } else {
        //     System.out.println(-1);
        // }

    }
}
