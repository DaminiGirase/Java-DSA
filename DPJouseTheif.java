public class DPJouseTheif {

    public static int HouseThif(int money[]) {
        int dp[] = new int[money.length + 1];

        dp[0] = 0;
        dp[1] = money[0];

        for (int i = 2; i < dp.length; i++) {
            int include = money[i-1] + dp[i - 2];
            int exclude = dp[i - 1];
            dp[i] = Math.max(include, exclude);
        }
        return dp[money.length];
    }

    public static void main(String[] args) {
        int money[] = { 2, 7, 9, 3, 1 };
        System.out.println(HouseThif(money));
    }
}
