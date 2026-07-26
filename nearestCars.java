import java.util.*;

public class nearestCars {

    static class Cars implements Comparable<Cars> {

        String name;
        int x;
        int y;
        int dist;

        Cars(String name, int x, int y) {
            this.name = name;
            this.x = x;
            this.y = y;
            this.dist = x * x + y * y;
        }

        @Override
        public int compareTo(Cars c2) {
            return this.dist - c2.dist;
        }
    }

    static class Num implements Comparable<Num> {

        int x;
        int freq;

        Num(int x, int freq) {

            this.x = x;
            this.freq = freq;
        }

        @Override
        public int compareTo(Num c2) {
            return c2.freq - this.freq;
        }
    }

    public static int[] KthFrequent(int nums[], int k) {

        Arrays.sort(nums);

        if (nums.length == 1) {
            return nums;
        }

        PriorityQueue<Num> pn = new PriorityQueue<>();
        int c = 1;

        for (int f = 0; f < nums.length - 1; f++) {
            if (nums[f] == nums[f + 1]) {
                c++;
            }
            if (nums[f] != nums[f + 1]) {
                pn.add(new Num(nums[f], c));
                c = 1;
            }
        }
        pn.add(new Num(nums[nums.length - 1], c));
        int arr[] = new int[k];

        for (int j = 0; j < k; j++) {
            arr[j] = pn.remove().x;
        }

        return arr;
    }

    public int[] topKFrequent(int[] nums, int k) {

        if (nums.length == 1) {
            return nums;
        }

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) == false) {
                map.put(nums[i], 1);
            } else {
                map.put(nums[i], map.get(nums[i]) + 1);
            }
        }

        PriorityQueue<Num> pn = new PriorityQueue<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            pn.add(new Num(entry.getKey(), entry.getValue()));
        }
        int arr[] = new int[k];

        for (int j = 0; j < k; j++) {
            arr[j] = pn.remove().x;
        }

        return arr;
    }

    public static void main(String[] args) {

        PriorityQueue<Cars> pq = new PriorityQueue<>();

        pq.add(new Cars("C0", 3, 3));
        pq.add(new Cars("C1", 5, -1));
        pq.add(new Cars("C2", -2, 4));

        int i = 0, k = 2;

        while (i != k) {
        System.out.println(pq.remove().name);
        i++;
        }

        // int nums[] = { 1, 2 };
        // int arr[] = KthFrequent(nums, 2);
        // for (int o = 0; o < arr.length; o++) {
        //     System.out.println(arr[o]);
        // }

    }
}
