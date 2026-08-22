public class DPMinCoin {

    public static int coinMin(int coins[], int amount) {

        int dp[][] = new int[coins.length + 1][amount + 1];

        for (int j = 1; j < dp[0].length; j++) {
            dp[0][j] = amount + 1;
        }

        for (int i = 1; i < dp.length; i++) {
            for (int j = 1; j < dp[0].length; j++) {

                if (coins[i - 1] <= j) {

                    dp[i][j] = Math.min(
                            1 + dp[i][j - coins[i - 1]],
                            dp[i - 1][j]);

                } else {
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        print(dp);
        return dp[coins.length][amount] > amount
                ? -1
                : dp[coins.length][amount];
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
        int amount = 4;

        System.out.println(coinMin(coins, amount));
    }
}