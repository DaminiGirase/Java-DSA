import java.util.Arrays;

public class DPClimbingStairs {

    public static int ClimbingStairsRec(int n) {
        if (n == 0) {
            return 1;
        }

        if (n < 0) {
            return 0;
        }

        return ClimbingStairsRec(n - 1) + ClimbingStairsRec(n - 2);
    }

    public static int ClimbingStairMemo(int n, int dp[]) {
        if (n == 0) {
            return 1;
        }
        if (n < 0) {
            return 0;
        }
        if (dp[n] != -1) {
            return dp[n];
        }

        dp[n] = ClimbingStairMemo(n - 1, dp) + ClimbingStairMemo(n - 2, dp);
        return dp[n];
    }

    public static int ClimbingStairTabu(int n) {

        int dp[] = new int[n + 1];
        dp[0] = 1;

        for (int i = 1; i <= n; i++) {
            if (i == 1) {
                dp[i] = dp[i - 1];
            } else {
                dp[i] = dp[i - 1] + dp[i - 2];
            }
        }

        return dp[n];

    }

    public static void main(String[] args) {
        int n = 1;
        int dp[] = new int[n + 1];
        Arrays.fill(dp, -1);
        System.out.println(ClimbingStairTabu(n));
    }
}