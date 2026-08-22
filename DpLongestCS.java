public class DpLongestCS {

    public static int LCSRec(String str1, String str2, int n, int m) {
        if (n == 0 || m == 0) {
            return 0;
        }

        if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
            return 1 + LCSRec(str1, str2, n - 1, m - 1);
        } else {
            int ans1 = LCSRec(str1, str2, n - 1, m);
            int ans2 = LCSRec(str1, str2, n, m - 1);
            return Math.max(ans1, ans2);
        }

    }

    public static int LCSMemo(String str1, String str2, int n, int m, int dp[][]) {
        if (n == 0 || m == 0) {
            return 0;
        }

        if (dp[n][m] != -1) {
            return dp[n][m];
        }

        if (str1.charAt(n - 1) == str2.charAt(m - 1)) {
            return dp[n][m] = 1 + LCSMemo(str1, str2, n - 1, m - 1, dp);
        } else {
            int ans1 = LCSMemo(str1, str2, n - 1, m, dp);
            int ans2 = LCSMemo(str1, str2, n, m - 1, dp);
            return dp[n][m] = Math.max(ans1, ans2);
        }
    }

    public static int LCMTabulation(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        int dp[][] = new int[n + 1][m + 1];
        String s = "";

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {
                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
                    s += str1.charAt(i - 1);
                    dp[i][j] = 1 + dp[i - 1][j - 1];
                } else {
                    int ans1 = dp[i - 1][j];
                    int ans2 = dp[i][j - 1];
                    dp[i][j] = Math.max(ans1, ans2);
                }
            }
        }
        System.out.println(s);
        return dp[n][m];
    }

    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "ace";
        // System.out.println(LCSRec(str1, str2, str1.length(), str2.length()));

        int n = str1.length();
        int m = str2.length();
        int dp[][] = new int[n + 1][m + 1];
        for (int i = 0; i < dp.length; i++) {
            for (int j = 0; j < dp[0].length; j++) {
                dp[i][j] = -1;
            }
        }
        // System.out.println(LCSMemo(str1, str2, n, m, dp));
        System.out.println(LCMTabulation(str1, str2));
    }
}