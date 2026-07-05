import java.util.*;

public class ConnectropeWithPQ {
    public static void main(String[] args) {
        int arr[] = { 4, 3, 3, 2, 6};
        PriorityQueue<Integer> p = new PriorityQueue<>();

        for (int i = 0; i < arr.length; i++) {
            p.add(arr[i]);
        }

        int minCost = 0;

        while (p.size() > 1) {

            int prev = p.remove();
            int curr = p.remove();

            int cost = prev + curr;
            minCost += cost;

            p.add(cost);
        }
System.out.println(minCost);
    }
}
