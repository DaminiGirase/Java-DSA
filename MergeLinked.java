public class MergeLinked {

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    public static Node head;
    public static Node tail;

    public void addLast(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;

    }

    public static void print(Node head) {

        if (head == null) {
            System.out.println("Empty");
            return;
        }
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static Node merger(Node head1, Node head2) {
        Node merge = new Node(-1);
        Node temp = merge;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                temp = temp.next;
                head1 = head1.next;
            } else {
                temp.next = head2;
                temp = temp.next;
                head2 = head2.next;
            }

        }

        while (head1 != null) {
            temp.next = head1;
            temp = temp.next;
            head1 = head1.next;
        }

        while (head2 != null) {
            temp.next = head2;
            temp = temp.next;
            head2 = head2.next;
        }
        return merge.next;
    }

    public static Node swap(Node head, int key1, int key2) {
        Node curr1 = head;
        Node prev1 = null;
        while (curr1.data != key1) {
            prev1 = curr1;
            curr1 = curr1.next;
        }
        Node curr2 = head;
        Node prev2 = null;
        while (curr2.data != key2) {
            prev2 = curr2;
            curr2 = curr2.next;
        }

        Node key1Next = curr1.next;
        Node key2Next = curr2.next;

        prev1.next = curr2;
        curr2.next = key1Next;
        prev2.next = curr1;
        curr1.next = key2Next;

        return head;
    }

    public static Node swapAllCase(Node head, int key1, int key2) {
        if (key1 == key2) {
            return head;
        }
        Node prev1 = null;
        Node curr1 = head;
        while (curr1 != null && curr1.data != key1) {
            prev1 = curr1;
            curr1 = curr1.next;
        }

        Node prev2 = null;
        Node curr2 = head;
        while (curr2 != null && curr2.data != key2) {
            prev2 = curr2;
            curr2 = curr2.next;
        }

        if (curr1 == null || curr2 == null) {
            return head;
        }

        // Case 1: curr1 is immediately before curr2
        if (curr1.next == curr2) {
            if (prev1 != null) {
                prev1.next = curr2;
            } else {
                head = curr2;
            }

            curr1.next = curr2.next;
            curr2.next = curr1;

            return head;
        }

        // Case 2: curr2 is immediately before curr1
        if (curr2.next == curr1) {
            if (prev2 != null) {
                prev2.next = curr1;
            } else {
                head = curr1;
            }

            curr2.next = curr1.next;
            curr1.next = curr2;

            return head;
        }

        if (prev1 != null) {
            prev1.next = curr2;
        } else {
            head = curr2;
        }

        if (prev2 != null) {
            prev2.next = curr1;
        } else {
            head = curr1;
        }

        Node temp = curr1.next;
        curr1.next = curr2.next;
        curr2.next = temp;

        return head;
    }

    public static Node remove(Node head, int key) {
        Node prev = null;
        Node curr = head;
        if (curr.data == key) {
            return head.next;
        }
        while (curr != null && curr.data != key) {
            prev = curr;
            curr = curr.next;
        }

        if (curr == null) {
            return head;
        }
        prev.next = curr.next;
        return head;
    }

    public static Node removeDuplicate(Node head) {
        Node curr = head;
        while (curr != null && curr.next != null) {
            if (curr.data == curr.next.data) {
                curr.next = curr.next.next;
            } else {
                curr = curr.next;
            }
        }

        return head;
    }

    public static Node reverseK(Node head, int k) {
        for (int i = 0; i < k; i++) {
            Node curr = head;
            while (curr.next != tail) {
                curr = curr.next;
            }
            Node last = tail;
            curr.next = null;
            tail = curr;
            last.next = head;
            head = last;
        }

        return head;
    }

    public static Node shiftZero(Node head) {
        Node curr = head;
        Node orginalTail = tail;
        while (curr != null && curr.data < 0) {
            Node zero = curr;
            head = curr.next;
            curr = curr.next;
            tail.next = zero;
            zero.next = null;
            tail = zero;
        }
        while (curr != null && curr != orginalTail && curr.next != null) {
            if (curr.next.data < 0) {
                Node zero = curr.next;
                curr.next = curr.next.next;
                tail.next = zero;
                zero.next = null;
                tail = zero;
            } else {
                curr = curr.next;
            }

        }
        return head;
    }

    public static int firstOcurance(Node head) {
        Node curr = head;
        int fount = -1;
        while (curr != null) {
            boolean isUnique = true;
            Node unique = head;
            while (unique != null) {
                if (curr != unique && curr.data == unique.data) {
                    isUnique = false;
                    break;
                }
                unique = unique.next;
            }
            if (isUnique) {
                fount = curr.data;
                break;
            }
            curr = curr.next;
        }
        return fount;
    }

    public static void main(String[] args) {
        MergeLinked li1 = new MergeLinked();
        // MergeLinked li2 = new MergeLinked();

        li1.addLast(3);
        li1.addLast(3);
        li1.addLast(3);
        li1.addLast(4);
        li1.addLast(4);
        li1.addLast(6);

        // Node head = li1.swapAllCase(li1.head, 2, 4);
        // Node head = li1.remove(li1.head, 6);
        // Node head = li1.removeDuplicate(li1.head);
        // Node head = li1.shiftZero(li1.head);
        int head = li1.firstOcurance(li1.head);
        System.out.println(head);

        // li2.addLast(1);
        // li2.addLast(2);
        // li2.addLast(3);
        // li2.addLast(4);

        // Node head = merger(li1.head, li2.head);
        // print(head);
    }
}
