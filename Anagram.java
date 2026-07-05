import java.util.HashMap;
import java.util.HashSet;

public class Anagram {

    public static boolean isAnagram(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            if (map.containsKey(t.charAt(i)) == true) {
                if (map.get(t.charAt(i)) == 1) {
                    map.remove(t.charAt(i));
                } else {
                    map.put(t.charAt(i), map.get(t.charAt(i)) - 1);
                }
            } else {
                return false;
            }
        }

        return map.isEmpty();
    }

    public static int DupliSize(int arr[]) {
        HashSet<Integer> hs = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            hs.add(arr[i]);
        }

        return hs.size();
    }

    public static int union(int arr1[], int arr2[]){
        HashSet<Integer> hs = new HashSet<>();

        for(int i=0; i<arr1.length; i++){
            hs.add(arr1[i]);
        }

         for(int i=0; i<arr2.length; i++){
            hs.add(arr2[i]);
        }

        System.out.println("Union");
        for(Integer key: hs){
            System.out.print(key + " ");
        }
        System.out.println();

        return hs.size();
    }

    public static int interSection(int arr1[], int arr2[]){
        HashSet<Integer> hs = new HashSet<>();
        int count = 0;

        for(int i=0; i<arr1.length; i++){
            hs.add(arr1[i]);
        }

         System.out.println("Inter Section");
        for(int i=0; i<arr2.length; i++){
            if(hs.contains(arr2[i])){
                count++;
                System.out.print(arr2[i] + " ");
                hs.remove(arr2[i]);
            }
        }
        System.out.println();

        return count;
    }

    public static void main(String[] args) {

        // Anagram

        String s = "tulip";
        String t = "lipid";

        // System.out.println(isAnagram(s, t));

        // Duplicate elements

        int arr[] = { 1, 2, 3, 4, 1, 2, 6, 7 };
        // System.out.println(DupliSize(arr));

        // union and intersection

        int arr1[] = {1, 2, 3, 4, 5};
        int arr2[] = {4, 5, 6, 7};

        System.out.println(union(arr1, arr2));
        System.out.println(interSection(arr1, arr2));


    }
}
