public class DPcoinProblem {

    public static int coinsP(int coins[], int change) {
        int dp[][] = new int[coins.length + 1][change + 1];

        for (int i = 0; i < dp.length; i++) {
            dp[i][0] = 1;
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {

                if (coins[i - 1] <= j) {
                    int include =  dp[i][j - coins[i - 1]];
                    int exclude = dp[i - 1][j];
                    int total = include + exclude;
                    dp[i][j] = total;
                } else {
                    dp[i][j] = dp[i - 1][j];
                }

            }
        }
        print(dp);
        return dp[coins.length][change];
    }

    public static void print(int dp[][]){
        for(int i=0; i<dp.length; i++){
            for(int j=0; j<dp[0].length; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int coins[] = { 1, 2, 3 };
        int change = 4;
        System.out.println(coinsP(coins, change));
    }
}
