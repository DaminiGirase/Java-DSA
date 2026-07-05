public class diagonalSum {

    // brut force approach

    public static void Diagonal(int matrix[][]) {

        int primaryD = 0;
        int secondaryD = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (i == j) {
                    primaryD += matrix[i][j];
                }

                else if ((i + j) == (matrix.length - 1)) {
                    secondaryD += matrix[i][j];
                }
            }
        }

        int total = primaryD+secondaryD;
        System.out.println("Primary Sum: " + primaryD);
        System.out.println("Secondary Sum: " + secondaryD);
        System.out.println("Total Sum: " + total);
    }

    // optimized approach

    public static int optiSum(int matrix[][]){

        int sum = 0;
        for(int i=0; i<matrix.length; i++){
           sum += matrix[i][i];

           if(i != matrix.length-1-i)
           sum += matrix[i][matrix.length-i-1];
        }
        return sum;
    }

    public static void main(String[] args) {
        int matrix[][] = { { 1, 2, 3},
                           { 4, 5, 6},
                           { 7, 8, 9} };

        Diagonal(matrix);

        int sum = optiSum(matrix);
        System.out.println(sum);
    }
}
