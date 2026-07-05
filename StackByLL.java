import java.util.*;
public class StackByLL {
    // static class Node {

    //     int data;
    //     Node next;

    //     public Node(int data) {
    //         this.data = data;
    //         this.next = null;
    //     }

    // }

    // public static Node head;
    // public static Node tail;

    // static class Stack {

    //     public static boolean isEmpty() {
    //         if (head == null) {
    //             return true;
    //         }
    //         return false;
    //     }

    //     public static void push(int data) {
    //         Node newNode = new Node(data);
    //         if (isEmpty()) {
    //             head = tail = newNode;
    //             return;
    //         }

    //         newNode.next = head;
    //         head = newNode;
    //     }

    //     public static int pop() {
    //         if (isEmpty()) {
    //             return -1;
    //         }

    //         int top = head.data;
    //         head = head.next;
    //         return top;
    //     }

    //     public static int peek() {
    //         if (isEmpty()) {
    //             return -1;
    //         }

    //         return head.data;
    //     }

    // }

    public static void main(String[] args) {

        // Stack s = new Stack();
        
        Stack<Integer> s = new Stack<>();
        s.push(2);
        s.push(4);
        s.push(5);

        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }
}
