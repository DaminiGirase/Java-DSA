public class GFloodFillAlgo {

    public static void fill(int grid[][], int sr, int sc, int color) {
        int n = grid.length;
        int m = grid[0].length;

        int originalColor = grid[sr][sc];
        dfs(sr, sc, n, m, grid, color, originalColor);
    }

    public static void dfs(int i, int j, int n, int m, int grid[][], int color, int originalColor) {
        if (i < 0 || j < 0 || i == n || j == m || grid[i][j] != originalColor) {
            return;
        }

        grid[i][j] = color;
        dfs(i - 1, j, n, m, grid, color, originalColor);
        dfs(i, j - 1, n, m, grid, color, originalColor);
        dfs(i + 1, j, n, m, grid, color, originalColor);
        dfs(i, j + 1, n, m, grid, color, originalColor);
    }

    public static void main(String[] args) {
        int grid[][] = { { 1, 1, 1 }, { 1, 1, 0 }, { 1, 0, 1 } };
        int sr = 1;
        int sc = 1;
        int color = 2;
        fill(grid, sr, sc, color);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                System.out.print(grid[i][j] + " ");
            }
            System.out.println();
        }
    }
}
