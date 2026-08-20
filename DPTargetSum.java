public class DPTargetSum {

    public static boolean targetSumRec(int val[], int n, int sum) {
        if (sum == 0) {
            return true;
        }

        if (n == 0) {
            return false;
        }

        if (val[n - 1] <= sum) {
            return targetSumRec(val, n - 1, sum - val[n - 1]) || targetSumRec(val, n - 1, sum);
        } else {
            return targetSumRec(val, n - 1, sum);
        }
    }

    public static boolean targetSumMemo(int val[], int n, boolean dp[][], int sum) {
        if (sum == 0) {
            return true;
        }

        if (n == 0) {
            return false;
        }

        if (dp[n][sum] != false) {
            return true;
        }

        if (val[n - 1] <= sum) {
            boolean in = targetSumMemo(val, n - 1, dp, sum - val[n - 1]);
            boolean out = targetSumMemo(val, n - 1, dp, sum);
            dp[n][sum] = (in || out);
            return dp[n][sum];
        } else {
            dp[n][sum] = targetSumMemo(val, n - 1, dp, sum);
            return dp[n][sum];
        }
    }

    public static boolean targetSum(int val[], int sum) {

        int n = val.length;
        boolean dp[][] = new boolean[n + 1][sum + 1];

        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = true;
        }

        
        for (int i = 1; i < n + 1; i++) {
            for (int j = 1; j < sum + 1; j++) {
                int v = val[i - 1];
                if (v <= j && dp[i - 1][j - v] == true) {
                    dp[i][j] = true;
                } else if (dp[i - 1][j] == true) {

                    dp[i][j] = true;
                }
            }
        }
        return dp[n][sum];
    }

    public static void main(String[] args) {
        int val[] = { 2, 4, 5, 6, 1, 5 };
        int sum = 10;
        System.out.println(targetSum(val, sum));

        // boolean dp[][] = new boolean[val.length + 1][sum + 1];
        // System.out.println(targetSumMemo(val, val.length, dp, sum));
    }
}
