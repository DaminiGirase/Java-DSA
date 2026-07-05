import java.util.*;
import java.util.LinkedList;

public class StackAndQueueWithDeque {

    static class Stack {

        static Deque<Integer> dq = new LinkedList<>();

        public static boolean isEmpty() {
            return dq.size() == 0;
        }

        public static void push(int data) {
            dq.addLast(data);
        }

        public static int pop() {
            return dq.removeLast();
        }

        public static int peek() {
            return dq.getLast();
        }

    }

    static class Queue {

        static Deque<Integer> dq = new LinkedList<>();

        public static boolean isEmpty() {
            return dq.size() == 0;
        }

        public static void add(int data) {
            dq.addLast(data);
        }

        public static int remove() {
            return dq.removeFirst();
        }

        public static int peek() {
            return dq.getFirst();
        }
    }

    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);

        // while (!s.isEmpty()) {
        //     System.out.println(s.pop());
        // }

        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);

        while (!q.isEmpty()) {
            System.out.println(q.remove());
        }
    }
}
