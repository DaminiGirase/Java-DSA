import java.util.*;
import java.util.LinkedList;

public class DecimalToBinary {

    public static void reverseFirstK(Queue<Integer> q, int k) {

        Stack<Integer> s = new Stack<>();
        while (s.size() != k) {
            s.push(q.remove());
        }

        Queue<Integer> extra = new LinkedList<>();
        while (!s.isEmpty()) {
            extra.add(s.pop());
        }

        while (!q.isEmpty()) {
            extra.add(q.remove());
        }

        System.out.println(extra);

    }

   
    public static void main(String[] args) {

        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        // reverseFirstK(q, 4);


    }
}