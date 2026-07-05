import java.util.ArrayList;
import java.util.HashMap;

public class subArraySum {

    public static int SumZero(int arr[]) {

        HashMap<Integer, Integer> map = new HashMap<>();

        map.put(0, -1);
        int sum = 0;
        int len = 0;
        int n = 0, m = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum)) {
                len = Math.max(len, i - map.get(sum));
                n = map.get(sum) + 1;
                m = i;
            } else {
                map.put(sum, i);
            }
        }

        for (int i = n; i <= m; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        return len;
    }

    public static int SumK(int arr[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, -1);
        int len = 0;
        int sum = 0;

        int n = 0, m = 0;
        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];
            if (map.containsKey(sum - k)) {
                len = Math.max(len, i - map.get(sum - k));
                n = map.get(sum - k) + 1;
                m = i;
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }

        for (int i = n; i <= m; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        return len;
    }

    public static ArrayList<ArrayList<Integer>> AllSubArrayWithSumK(int arr[], int k) {

        HashMap<Integer, Integer> map = new HashMap<>();
        ArrayList<ArrayList<Integer>> ll = new ArrayList<>();

        map.put(0, -1);
        int sum = 0;

        int n = 0, m = 0;

        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum - k)) {

                n = map.get(sum - k) + 1;
                m = i;
                ArrayList<Integer> list = new ArrayList<>();
                for (int j = n; j <= m; j++) {
                    list.add(arr[j]);
                }
                ll.add(list);
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }

        }
        return ll;
    }

    public static int countSubArrayK(int nums[], int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int ans = 0;
        int sum = 0;

        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k)) {
                ans += map.get(sum - k);
            }

            map.put(sum, map.getOrDefault(sum, 0) + 1);

        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, -2, 5 };
        // System.out.println(SumZero(arr));

        System.out.println(countSubArrayK(arr, 5));

        // ArrayList<ArrayList<Integer>> ll = AllSubArrayWithSumK(arr, 5);
        // System.out.println(ll);

    }
}
