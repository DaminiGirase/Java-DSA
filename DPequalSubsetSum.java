public class DPequalSubsetSum {

    public static boolean SumDifference(int arr[], int target, boolean dp[][]) {

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int v = arr[i - 1];
                if (v <= j) {
                    boolean include = dp[i - 1][j - v];
                    boolean exclude = dp[i - 1][j];
                    dp[i][j] = (include || exclude);

                } else {
                    dp[i][j] = dp[i - 1][j];

                }
            }
        }
        return dp[arr.length][target];
    }

    public static void main(String[] args) {

        // in equal subsset sum partition only need to check if the sum/2 is present with using subparts

        // this problem is of min subseet sum difference
        
        int arr[] = { 1, 6, 11, 5 };
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }

        int target = sum / 2;
        boolean dp[][] = new boolean[arr.length + 1][target + 1];
        for (int i = 0; i <= arr.length; i++) {
            dp[i][0] = true;
        }

        if (sum % 2 != 0) {
            SumDifference(arr, target, dp);
        } else {
            System.out.println("false");
        }

        int s1 = 0;
        for (int j = target; j >= 0; j--) {
            if (dp[arr.length][j] == true) {
                s1 = j;
                break;
            }
        }

        int s2 = sum - s1;
        int result = s2 - s1;
        System.out.println(result);

    }
}