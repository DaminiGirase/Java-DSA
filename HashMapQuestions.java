import java.util.*;

public class HashMapQuestions {
    public static void main(String[] args) {

        // frequency greater than n/3 my aproach

        HashMap<Integer, Integer> map = new HashMap<>();

        int arr[] = { 1, 2 };
        int limit = arr.length / 3;

        for (int i = 0; i < arr.length; i++) {

            // one way

            // if (map.containsKey(arr[i]) == false) {
            // map.put(arr[i], 1);
            // } else {
            // map.put(arr[i], map.get(arr[i]) + 1);
            // }

            // another way

            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        // one way

        // for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
        // if (entry.getValue() > limit) {
        // System.out.print(entry.getKey() + " ");
        // }
        // }

        // another way

        for (Integer key : map.keySet()) {
            if (map.get(key) > limit) {
                System.out.print(key + " ");
            }
        }

    }
}
