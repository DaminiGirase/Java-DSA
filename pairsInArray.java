public class pairsInArray {
    public static void main(String[] args) {

        int array[] = { 2, 3, 4, 5, 6 };

        // Total Pairs in array

        // int tp = 0;
        // for (int i = 0; i < array.length; i++) {
        // for (int j = i + 1; j < array.length; j++) {
        // System.out.print("(" + array[i] + ", " + array[j] + ")");
        // tp++;
        // }
        // System.out.println();
        // }
        // System.out.println("Toal Pairs are: " + tp);

        // Sub Array

        int sum = 0;
        int ts = 0;
        int maxSum = Integer.MIN_VALUE;
        int minSum = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                    System.out.print(array[k] + " ");
                    sum += array[k];
                }

                if (maxSum < sum) {
                    maxSum = sum;
                }
                if (minSum > sum) {
                    minSum = sum;
                }
                ts++;
                System.out.println();
            }

            System.out.println();
        }

        System.out.println("Total Sub Arrays: " + ts);
        System.out.println("Maximum Sum is: " + maxSum);
        System.out.println("Minimum Sum is: " + minSum);
    }
}
