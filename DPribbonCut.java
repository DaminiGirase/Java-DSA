public class DPribbonCut {

    public static int ribbonCut(int ribbon[], int length) {

        int dp[][] = new int[ribbon.length + 1][length + 1];

        for (int j = 0; j < dp[0].length; j++) {
            dp[0][j] = -1;
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (ribbon[i - 1] <= j) {
                    
                    int include = -1;

                    if (dp[i][j - ribbon[i - 1]] != -1) {
                        include = 1 + dp[i][j - ribbon[i - 1]];
                    }

                    int exclude = dp[i - 1][j];

                    dp[i][j] = Math.max(include, exclude);
                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }
        return dp[ribbon.length][length];
    }

    public static void main(String[] args) {
        int ribbon[] = { 2, 2, 5 };
        int length = 9;
        System.out.println(ribbonCut(ribbon, length));
    }
}
