import java.util.*;
import java.util.LinkedList;

public class SlidingWindowQueue {

    public static void sliding(int arr[], int k) {

        for (int i = 0; i < arr.length - k + 1; i++) {
            int Max = 0;
            for (int j = i; j < i + k; j++) {
                Max = Math.max(Max, arr[j]);
            }

            System.out.print(Max + " ");
        }

    }

    public static int[] SlidingW(int arr[], int k) {

        Deque<Integer> dq = new LinkedList<>();
        int ans[] = new int[arr.length - k + 1];
        int curr_window = 0;

        for (int i = 0; i < k; i++) {

            while (!dq.isEmpty() && arr[dq.getLast()] < arr[i]) {
                dq.removeLast();
            }

            dq.addLast(i);
        }
        ans[curr_window++] = arr[dq.getFirst()];

        for (int i = k; i < arr.length; i++) {
            while (!dq.isEmpty() && arr[dq.getLast()] < arr[i]) {
                dq.removeLast();
            }

            while (!dq.isEmpty() && dq.getFirst() < i - k + 1) {
                dq.removeFirst();
            }

            dq.addLast(i);
            ans[curr_window++] = arr[dq.getFirst()];

        }

        return ans;
    }

    public static void GenrateBinary(int n) {
        Queue<String> q = new LinkedList<>();

        q.add("1");

        for (int i = 1; i <= n; i++) {

            String curr = q.remove();
            System.out.print(curr + " ");

            q.add(curr + "0");
            q.add(curr + "1");

        }
    }

    public static void RopeConect(int arr[]) {

        ArrayList<Integer> li = new ArrayList<>();
        int cost = 0;

        for (int i = 0; i < arr.length; i++) {
            li.add(arr[i]);
        }

        while (li.size() > 1) {
            Collections.sort(li);
            int first = li.remove(0);
            int second = li.remove(0);

            int sum = first + second;
            cost += sum;

            li.add(sum);
        }
        System.out.println(cost);
    }

    public static void main(String[] args) {

        // int arr[] = { 1, 2, 3, 2, 3, 6 };
        // int k = 3;

        // int result[] = SlidingW(arr, k);
        // for (int i = 0; i < result.length; i++) {
        // System.out.print(result[i] + " ");
        // }

        // GenrateBinary(10);

        int arr[] = { 4, 3, 2, 6 };
        RopeConect(arr);
    }
}
