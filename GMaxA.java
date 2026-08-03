import java.util.*;
import java.util.LinkedList;

public class GMaxA {

    static class Triplate {

        int x;
        int y;

        public Triplate(int x, int y) {
            this.x = x;
            this.y = y;

        }
    }

    static int count = 0;

    public static int MaxArea(int grid[][]) {

        int n = grid.length;
        int m = grid[0].length;

        int ans = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                count = 0;
                dfs(i, j, n, m, grid);

                if (count > ans) {
                    ans = count;
                }
            }
        }
        return ans;
    }

    public static void dfs(int i, int j, int n, int m, int grid[][]) {
        if (i < 0 || j < 0 | i == n || j == m || grid[i][j] == 0) {
            return;
        }

        count++;
        grid[i][j] = 0;

        dfs(i - 1, j, n, m, grid);
        dfs(i, j - 1, n, m, grid);
        dfs(i + 1, j, n, m, grid);
        dfs(i, j + 1, n, m, grid);
    }

    public static void main(String[] args) {
        int grid[][] = { { 1, 1, 1 }, { 0, 1, 1 }, { 1, 0, 1 } };

        // System.out.println(MaxArea(grid));

        // WITHOUT COSTUM CLASS

        // WITH COSTUM CLASS

        // ONE WAY USING CONSTUM CLASS
        // int n = grid.length;
        // int m = grid[0].length;

        // boolean vis[][] = new boolean[n][m];
        // Queue<Triplate> q = new LinkedList<>();
        // int maxArea = 0;

        // for (int i = 0; i < n; i++) {
        // for (int j = 0; j < m; j++) {
        // if (grid[i][j] == 1 && !vis[i][j]) {
        // q.add(new Triplate(i, j));
        // vis[i][j] = true;

        // int area = 1;
        // while (!q.isEmpty()) {
        // Triplate e = q.remove();
        // int x = e.x;
        // int y = e.y;

        // if (x > 0 && grid[x - 1][y] == 1 && !vis[x - 1][y]) {
        // vis[x - 1][y] = true;
        // q.add(new Triplate(x - 1, y));
        // area++;
        // }

        // if (y > 0 && grid[x][y - 1] == 1 && !vis[x][y - 1]) {
        // vis[x][y - 1] = true;
        // q.add(new Triplate(x, y - 1));
        // area++;
        // }

        // if (x < n - 1 && grid[x + 1][y] == 1 && !vis[x + 1][y]) {
        // vis[x + 1][y] = true;
        // q.add(new Triplate(x + 1, y));
        // area++;
        // }

        // if (y < m - 1 && grid[x][y + 1] == 1 && !vis[x][y + 1]) {
        // vis[x][y + 1] = true;
        // q.add(new Triplate(x, y + 1));
        // area++;
        // }
        // }
        // maxArea = Math.max(maxArea, area);

        // }
        // }
        // }

        // System.out.println(maxArea);
    }
}
