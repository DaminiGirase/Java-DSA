import java.util.*;
import java.util.LinkedList;

public class NonRepeating {

    public static void nonRepeatingString(String str) {
        Queue<Character> q = new LinkedList<>();
        int freq[] = new int[26];

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            q.add(ch);
            freq[ch - 'a']++;

            while (!q.isEmpty() && freq[q.peek() - 'a'] > 1) {
                q.remove();
            }

            if (q.isEmpty()) {
                System.out.print("-1 ");
            } else {
                System.out.print(q.peek() + " ");
            }

        }
    }

    public static void interLive(Queue<Integer> q) {
        int size = q.size();
        Queue<Integer> q2 = new LinkedList<>();

        while (q2.size() != size/2) {
            q2.add(q.remove());
        }

        // Queue<Integer> q3 = new LinkedList<>();
        // while (!q.isEmpty() && !q2.isEmpty()) {
        // q3.add(q2.remove());
        // q3.add(q.remove());
        // }

        // while (!q3.isEmpty()) {
        // System.out.print(q3.peek() + " ");
        // q3.remove();
        // }

        // Mam aproach without q3

        while (!q2.isEmpty()) {
            q.add(q2.remove());
            q.add(q.remove());
        }

        while (!q.isEmpty()) {
            System.out.print(q.peek() + " ");
            q.remove();
        }

    }

    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        q.add(6);

        interLive(q);

        // nonRepeatingString("aabccxb");
    }
}
