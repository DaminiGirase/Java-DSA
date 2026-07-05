
public class array2DExcercise {

    // Q1 count number in 2D Array

    // public static int countF(int matrix[][], int key) {

    // int count = 0;

    // for (int i = 0; i < matrix.length; i++) {
    // for (int j = 0; j < matrix[i].length; j++) {
    // if (key == matrix[i][j]) {
    // count++;
    // }
    // }
    // }
    // return count;
    // }

    // Q2 find sum of specific row

    // public static int SumOfRow(int matrix[][]) {

    // int sum = 0;
    // for(int i=0; i<matrix[0].length; i++){
    // sum += matrix[1][i];
    // }

    // return sum;
    // }

    // Q3 transpose

    // public static void transpose(int matrix[][]) {
    // int trans[][] = new int[matrix[0].length][matrix.length];

    // for (int i = 0; i < matrix.length; i++) {
    // for (int j = 0; j < matrix[i].length; j++) {
    // trans[j][i] = matrix[i][j];
    // }
    // }

    // for (int i = 0; i < trans.length; i++) {
    // for (int j = 0; j < trans[i].length; j++) {
    // System.out.print(trans[i][j] + " ");
    // }
    // System.out.println();
    // }

    // }

    // Q4 Rotate matrix

    public static void rotate(int matrix[][]) {

        // right but my solution not leetcode

        // for (int i = 0; i < matrix.length; i++) {
        // for(int j=matrix.length-1; j>=0; j--){
        // System.out.print(matrix[j][i] + " ");
        // }
        // System.out.println();
        // }

        // Transpose

        // for (int i = 0; i < matrix.length; i++) {
        // for(int j=0; j<matrix.length; j++){
        // System.out.print(matrix[j][i] + " ");
        // }
        // System.out.println();
        // }

        // anticlockwise rotation leetcode has clockwise only change is [i][left]
        // swapping in step 2

        for (int i = 0; i < matrix.length; i++) {
            for (int j = i; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            int top = 0;
            int botttom = matrix.length - 1;
            while (top <= botttom) {
                int temp = matrix[i][top];
                matrix[i][top] = matrix[i][botttom];
                matrix[i][botttom] = temp;

                top++;
                botttom--;
            }
        }

    }

    public static void main(String[] args) {

        // int matrix[][] = { { 4, 7, 8 }, { 8, 8, 7 } };
        // int count = countF(matrix, 7);
        // System.out.println("Count is: " + count);

        // int matrix[][] = { { 1, 4, 9 }, { 11, 4, 3 }, { 2, 2, 3 } };
        // int sum = SumOfRow(matrix);
        // System.out.println(sum);

        // transpose(matrix);

        int matrix[][] = { { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 } };

        rotate(matrix);

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
