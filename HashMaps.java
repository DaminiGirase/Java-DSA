import java.util.HashMap;

public class HashMaps {
    public static void main(String[] args) {

        // frequency-----------------------

        // int arr[] = { 2, 4, 6, 7, 2 };
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for (int i = 0; i < arr.length; i++) {
        // map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        // }

        // for (int key : map.keySet()) {
        // System.out.println(key + " -> " + map.get(key));
        // }

        // first occurance-------------------------

        // int arr[] = { 2, 4, 4, 6, 9, 6, 7, 2 };
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for (int i = 0; i < arr.length; i++) {
        // map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        // }

        // for (int i = 0; i < arr.length; i++) {
        // if(map.get(arr[i]) == 1){
        // System.out.println(arr[i]);
        // break;
        // }
        // }

        // anagram-----------------------------

        // int arr1[] = { 2, 3, 4, 5 };
        // int arr2[] = { 3, 4, 2, 8 };

        // HashMap<Integer, Integer> map1 = new HashMap<>();
        // HashMap<Integer, Integer> map2 = new HashMap<>();

        // for (int i = 0; i < arr1.length; i++) {
        // map1.put(arr1[i], map1.getOrDefault(arr1[i], 0) + 1);
        // map2.put(arr2[i], map2.getOrDefault(arr2[i], 0) + 1);
        // }

        // System.out.println(map1.equals(map2));

        // pair sum-----------------------------------

        // int arr[] = { 2, 9, 11, 15 };
        // int target = 11;

        // HashMap<Integer, Integer> map = new HashMap<>();

        // for (int i = 0; i < arr.length; i++) {
        // int currrent = target - arr[i];
        // if (map.containsKey(currrent)) {
        // System.out.println("true");
        // break;
        // }
        // map.put(arr[i], i);
        // }

        // find duplicate-----------------------------

        // int arr[] = {1, 3, 4, 5, 1};
        // HashMap<Integer, Integer> map = new HashMap<>();
        // int dup = 0;

        // for(int i=0; i<arr.length; i++){
        // map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        // }
        // for(int key: map.keySet()){
        // if(map.get(key) >= 2){
        // dup = key;
        // break;
        // }
        // }

        // second logic-------------------

        // int arr[] = { 1, 2, 3, 3, 4, 5, 5};
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for (int i = 0; i < arr.length; i++) {
        // if (map.containsKey(arr[i])) {
        // System.out.println(arr[i]);
        // break;
        // }
        // map.put(arr[i], i);
        // }

        // System.out.println(dup);

        // group by frequency----------------------------------

        // int arr[] = {1, 1, 2, 2, 2, 3};
        // HashMap<Integer, Integer> map = new HashMap<>();
        // for(int i=0; i<arr.length; i++){
        // map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        // }

        // for(int key: map.keySet()){
        // System.out.println(key + " -> " + map.get(key));
        // }

        // MaxLength arraySum

        // int arr[] = { 1, -1, 3, 2, -2, -3, 3 };
        // int sum = 0;
        // int maxLength = 0;
        // HashMap<Integer, Integer> map = new HashMap<>();

        // for (int i = 0; i < arr.length; i++) {
        // sum += arr[i];

        // we can do both this one and commented one
        // map.put(0, -1);

        // if (sum == 0) {
        // maxLength = i + 1;
        // }

        // if (map.containsKey(sum)) {
        // maxLength = Math.max(maxLength, i - map.get(sum));
        // } else {
        // map.put(sum, i);
        // }
        // }
        // System.out.println(maxLength);

        // first occurance of non repeating charactor

        // String str = "swwiss";

        // HashMap<Character, Integer> map = new HashMap<>();

        // for (int i = 0; i < str.length(); i++) {
        // map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        // }

        // for (int i = 0; i < str.length(); i++) {

        // if (map.get(str.charAt(i)) == 1) {
        // System.out.println(str.charAt(i));
        // break;
        // }
        // }

        // Longest array whose sum is 6

        // int arr[] = { 1, 2, 3, -2, 5 };
        // int k = 6;
        // HashMap<Integer, Integer> map = new HashMap<>();
        // int sum = 0;
        // int maxLength = 0;

        // we can do both this one and commented one
        // map.put(0, -1);
        // or//
        // if (sum == k) {
        // maxLength = i + 1;
        // }

        // for (int i = 0; i < arr.length; i++) {
        // sum += arr[i];
        // if (map.containsKey(sum - k)) {
        // int length = i - map.get(sum-k);
        // maxLength = Math.max(maxLength, length);
        // }
        // if(!map.containsKey(sum)) {
        // map.put(sum, i);
        // }

        // }
        // System.out.println(maxLength);

        // smallest length

        // int arr[] = { 1, 2, 3, -2, 5 };
        // int k = 6;
        // HashMap<Integer, Integer> map = new HashMap<>();
        // int sum = 0;
        // int minLength = Integer.MAX_VALUE;

        // map.put(0, -1);

        // for (int i = 0; i < arr.length; i++) {
        // sum += arr[i];
        // if (map.containsKey(sum - k)) {
        // int length = i - map.get(sum - k);
        // minLength = Math.min(minLength, length);
        // }
        // map.put(sum, i);
        // }
        // System.out.println(minLength);

        // count how many times target appear

        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int count = 0;
        int k = 6;
        int arr[] = { 1, 2, 3, -2, 5 };

        map.put(0, 1);
        
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (map.containsKey(sum - k)) {
                count += map.get(sum - k);
            }
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        System.out.println(count);
    }
}
