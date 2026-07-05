public class kadansSubArraySum {
    public static void main(String[] args) {
        int arrry[] = { -2, 3, -4, 5, 8, 9, -5, -3 };
        int sum = 0;
        int maxSum = arrry[0];
        int neMax = arrry[0];

        for (int i = 0; i < arrry.length; i++) {
            sum += arrry[i];

            if(arrry[i] > neMax){
                neMax = arrry[i];
            }

            if (sum < 0) {
                sum = 0;
            }
            
            maxSum = Math.max(maxSum, sum);
        }

        if (maxSum == 0) {
            System.out.println("Max Sum is: " + neMax);
        } else {
            System.out.println("Max Sum is: " + maxSum);
        }

    }
}
