import java.util.*;
import java.util.LinkedList;

public class QueueJC {

    static class Queue {

        static ArrayList<Integer> list = new ArrayList<>();

        public static boolean isEmpty() {
            return list.size() == 0;
        }

        public static void add(int data) {
            list.add(data);
        }

        public static int remove() {

            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }

            int front = list.getFirst();
            list.removeFirst();
            return front;

        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return list.getFirst();
        }
    }

    public static void main(String[] args) {

        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }

        // Queue<Integer> q = new LinkedList<>();

        // q.add(3);
        // q.add(4);
        // q.add(5);
        // q.add(6);

        // while (!q.isEmpty()) {
        // System.out.println(q.peek());
        // q.remove();
        // }

    }
}
