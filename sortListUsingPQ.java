import java.util.*;
import java.util.LinkedList;;

public class sortListUsingPQ {

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static void main(String[] args) {

        // Q5
        Node head1 = new Node(1);
        head1.next = new Node(3);
        head1.next.next = new Node(7);

        PriorityQueue<Integer> p = new PriorityQueue<>();

        Node temp = head1;
        while (temp != null) {
            p.add(temp.data);
            temp = temp.next;
        }

        Node head2 = new Node(2);
        head2.next = new Node(8);
        head2.next.next = new Node(4);

        temp = head2;
        while (temp != null) {
            p.add(temp.data);
            temp = temp.next;
        }

        Node head3 = new Node(5);
        head3.next = new Node(9);
        head3.next.next = new Node(6);

        temp = head3;
        while (temp != null) {
            p.add(temp.data);
            temp = temp.next;
        }

        // while (!p.isEmpty()) {
        // System.out.print(p.remove() + " ");
        // }

        // Q4
        int arr[] = { 1, 5, 8, 19 };

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.reverseOrder());

        int sum = 0;
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            pq.add(arr[i]);
            sum += arr[i];
        }

        int newSum = 0;
        while (newSum < sum / 2) {
            int ele = pq.remove();
            newSum += ele / 2;
            count++;
            pq.add(ele / 2);

        }

        // System.out.println(count);

        // Q1 one way with O(n logn)
        Integer nums[] = { 2, 4, 1, 5, 3 };
        Arrays.sort(nums, Collections.reverseOrder());
        int k = 2;
        // System.out.println(nums[k - 1]);

        // second way

        PriorityQueue<Integer> ps = new PriorityQueue<>(); //O(n logk)
        for (int i = 0; i < nums.length; i++) {
            ps.add(nums[i]);

            if (ps.size() > k) {
                ps.remove();
            }
        }

        System.out.println(ps.peek());
    }
}
