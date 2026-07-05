
import java.util.*;

public class CoinsProblem {

    public static void MinCoins(Integer coins[], int amount) {

        ArrayList<Integer> list = new ArrayList<>();

        Arrays.sort(coins, Comparator.reverseOrder());
        int MinCoin = 0;

        for (int i = 0; i < coins.length; i++) {
            while (amount >= coins[i]) {
                MinCoin++;
                amount -= coins[i];
                list.add(coins[i]);
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println("\nMinimum Coins: " + MinCoin);

    }

    public static void main(String[] args) {
        Integer coins[] = { 1, 2, 5, 10, 20, 50, 100, 500, 2000 };
        int amount = 3456;
        MinCoins(coins, amount);
    }
}
