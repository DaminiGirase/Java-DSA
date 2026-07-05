public class searchin2D {

    public static boolean search(int matrix[][], int key) {
        int col = 0;
        int row = matrix.length - 1;

        while (col < matrix.length && row >= 0) {
            if (matrix[row][col] == key) {
                System.out.println("Key Found!");
                return true;
            } else if (key < matrix[row][col]) {
                row--;
            } else {
                col++;
            }
        }

        System.out.println("Ket Not Found!");
        return false;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 10, 20, 30, 40 },
                { 15, 25, 35, 45 },
                { 27, 29, 37, 48 },
                { 32, 33, 39, 50 } };

        search(matrix, 37);
    }
}
