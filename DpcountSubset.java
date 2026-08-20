public class DpcountSubset {

    public static int countSet(int arr[], int target) {

        int dp[][] = new int[arr.length + 1][target + 1];
        for (int i = 0; i <= arr.length; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                int v = arr[i - 1];
                if (v <= j) {
                    int in = dp[i - 1][j - v];
                    int ex = dp[i - 1][j];
                    int count = in + ex;
                    dp[i][j] = count;
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        return dp[arr.length][target];
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 5, 6, 8, 10 };
        int target = 10;
        System.out.println(countSet(arr, target));
    }
}
