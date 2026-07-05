// import java.util.*;

public class StringExcercise {

    // public static int count(String str) {
    // int countV = 0;

    // for (int i = 0; i < str.length(); i++) {

    // if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' ||
    // str.charAt(i) == 'o'
    // || str.charAt(i) == 'u') {
    // countV++;
    // }
    // }

    // return countV;
    // }

    // aproach 01 using hashmap

    // public static boolean isAnagram(String s, String t) {

    //     HashMap<Character, Integer> m1 = new HashMap<>();
    //     HashMap<Character, Integer> m2 = new HashMap<>();

    //     for (int i = 0; i < s.length(); i++) {
    //         m1.put(s.charAt(i), m1.getOrDefault(s.charAt(i), 0) + 1);
    //         m2.put(t.charAt(i), m2.getOrDefault(t.charAt(i), 0) + 1);
    //     }

    //     return m1.equals(m2);
    // }

    // aproach 02 using single array

    public static boolean isAnagram(String s, String t){

        int n = 26;
        int count[] = new int[n];
        int s1 = s.length();
        int s2 = t.length();

        if(s1 != s2){
            return false;
        }

        for(int i=0; i<s1; i++){
           count[s.charAt(i) - 'a']++;
           count[t.charAt(i) - 'a']--;
        }
System.out.println('a'-96);
        for(int i=0; i<n; i++){
            if(count[i] != 0){
               return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        String s = "damini";
        String t = "minida";
        System.out.println(isAnagram(s, t));

        // Scanner sc = new Scanner(System.in);
        // String str = sc.nextLine();

        // System.out.println(count(str));
    }
}
