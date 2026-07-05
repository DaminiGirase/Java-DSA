public class stocks {
    public static void main(String[] args) {
        int price[] = { 7, 1, 5, 3, 6, 4 };

        int cosPrice = price[0];
        int maxProfit = 0;

        for (int i = 1; i < price.length; i++) {
            if (cosPrice < price[i]) {
                int profit = price[i] - cosPrice;
                maxProfit = Math.max(maxProfit, profit);
            } else {
                cosPrice = price[i];
            }

        }

        System.out.println(maxProfit);
    }
}
