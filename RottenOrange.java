public class RottenOrange {
    public static void main(String[] args) {
        int grid[][] = { { 2, 1, 1 }, { 0, 1, 1 }, { 0, 0, 1 } };

        // Check wether all oranges rotten or not

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) {

                    if (i > 0 && grid[i - 1][j] == 1) {
                        grid[i - 1][j] = 2;
                    }
                    if (j > 0 && grid[i][j - 1] == 1) {
                        grid[i][j - 1] = 2;
                    }
                    if (j < grid[i].length - 1 && grid[i][j + 1] == 1) {
                        grid[i][j + 1] = 2;
                    }
                    if (i < grid.length - 1 && grid[i + 1][j] == 1) {
                        grid[i + 1][j] = 2;
                    }

                }
            }
        }

        boolean flag = true;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) {
                    flag = false;
                    break;
                }  
            }

        }

        System.out.println(flag);
    }
}
