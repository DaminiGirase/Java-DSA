import java.util.*;

public class GreedyExcercise {

    public static void CountEqual(String str) {

        int totalC = 0;
        int Lcount = 0;
        int Rcount = 0;

        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'L') {
                Lcount++;
            } else {
                Rcount++;
            }
            if (Lcount == Rcount) {
                totalC++;
                Lcount = 0;
                Rcount = 0;
            }
        }

        System.out.println(totalC);
    }

    public static void StringSum(int K) {
        int num[] = new int[26];
        char word[] = new char[26];

        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
            word[i] = (char) (i + 'a');
        }

        ArrayList<Character> list = new ArrayList<>();

        for (int i = num.length - 1; i >= 0; i--) {

            while (num[i] <= K) {
                list.add(word[i]);
                K = K - num[i];
            }
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
        }
    }

    // correct solution

    public static String Lexografic(int N, int K) {
        char str[] = new char[N];
        for (int i = 0; i < str.length; i++) {
            str[i] = 'a';
        }

        K -= N;
        int i = N - 1;
        while (K > 0) {
            int add = Math.min(25, K);
            str[i] = (char) (str[i] + add);
            K -= add;
            i--;
        }

        return new String(str);
    }

    public static int secondL(int left, int right, int K) {
        int LargestOdd;
        if (right % 2 == 1) {
            LargestOdd = right;
        } else {
            LargestOdd = right - 1;
        }

        int KthLargest = LargestOdd - 2 * (K - 1);

        if (KthLargest < left) {
            return -1;
        }

        return KthLargest;

    }

    public static void main(String[] args) {
        // String str = "RLRRLLRLRL";
        // CountEqual(str);

        // int K = 27;
        // StringSum(K);

        // int N = 5;
        // int K = 42;
        // System.out.println(Lexografic(N, K));

        // System.out.println(secondL(-3, 3, 2));

      
 
    }
}
