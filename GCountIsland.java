public class GCountIsland {

    public static int countIsland(int grid[][]) {
        int n = grid.length;
        int m = grid[0].length;

        int totalI = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    dfs(i, j, n, m, grid);
                    totalI++;
                }
            }
        }
        return totalI;
    }

    public static void dfs(int i, int j, int n, int m, int grid[][]) {
        if (i < 0 || j < 0 || i == n || j == m || grid[i][j] == 0) {
            return;
        }

        grid[i][j] = 0;
        dfs(i - 1, j, n, m, grid);
        dfs(i, j - 1, n, m, grid);
        dfs(i + 1, j, n, m, grid);
        dfs(i, j + 1, n, m, grid);
    }

    public static void main(String[] args) {
        int grid[][] = { { 1, 1, 1 }, { 0, 1, 1 }, { 1, 0, 1 } };

        System.out.println(countIsland(grid));
    }
}
