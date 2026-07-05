public class NQueens {

    public static boolean isSafe(char board[][], int row, int col) {
        // upword
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // left diagonal

        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // right diagonal

        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
        
    }

    static int count = 0;

    public static boolean NQueenss(char board[][], int row) {
        if (row == board.length) {
            // printBoard(board);
            count++;
            return true;
        }

        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (NQueenss(board, row + 1)) {
                    return true;
                }
                board[row][j] = 'X';
            }

        }
        return false;
    }

    public static void printBoard(char board[][]) {
        System.out.println("----------------- Queens ------------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 8;
        char board[][] = new char[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'X';
            }
        }

        NQueenss(board, 0);
        System.out.println("Total Count is: " + count);

        if (NQueenss(board, 0)) {
            System.out.println("Solution Exists");
            printBoard(board);
        } else {
            System.out.println("Solution not Exists");
        }
    }
}
