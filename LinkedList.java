
public class LinkedList {
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
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
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

    public void addMiddle(int index, int data) {
        if (index == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }

    public int removeFirst() {
        if (head == null) {
            System.out.println("Empty");
        } else if (head == tail) {
            int val = head.data;
            head = tail = null;
            size--;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (head == null) {
            System.out.println("Empty");
        } else if (head == tail) {
            int val = tail.data;
            head = tail = null;
            size--;
            return val;
        }

        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }

        int val = tail.data;
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    // my approach------------------

    // public int searchIterative(int key) {

    // Node temp = head;
    // for (int i = 0; i < size; i++) {
    // if (temp.data == key) {
    // return i;
    // }
    // temp = temp.next;
    // }

    // return -1;
    // }

    // mam aproaach-------------------------
    // public int searchIterative(int key) {

    // Node temp = head;
    // int i = 0;
    // while (temp != null) {
    // if (temp.data == key) {
    // return i;
    // }
    // temp = temp.next;
    // i++;
    // }
    // return -1;
    // }

    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }

        if (head.data == key) {
            return 0;
        }

        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int recursive(int key) {
        return helper(head, key);
    }

    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void removeFromLast(int n) {
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        if (n == sz) {
            head = head.next;
            return;
        }

        Node prev = head;
        for (int i = 1; i < sz - n; i++) {
            prev = prev.next;
        }

        prev.next = prev.next.next;
    }

    // My aproach-----------------------------

    // public void palindrom() {
    // Node temp = head;
    // int mid = size / 2;
    // for (int i = 0; i < mid; i++) {
    // temp = temp.next;
    // }

    // Node curr = temp.next;
    // temp.next = null;
    // Node next;
    // while (curr != null) {
    // next = curr.next;
    // curr.next = temp;
    // temp = curr;
    // curr = next;
    // }

    // Node left = head;
    // Node right = temp;
    // while (right!=null) {
    // if (left.data != right.data) {
    // System.out.println("Not Palindrom");
    // return;
    // }
    // left = left.next;
    // right = right.next;
    // }
    // System.out.println("Palindrom");
    // }

    // mam aproach

    // public void palindrom() {
    // Node slow = head;
    // Node fast = head;
    // while (fast != null && fast.next != null) {
    // slow = slow.next;
    // fast = fast.next.next;
    // }

    // Node curr = slow.next;
    // slow.next = null;
    // Node next;
    // while(curr!=null){
    // next = curr.next;
    // curr.next = slow;
    // slow = curr;
    // curr = next;
    // }

    // Node left = head;
    // Node right = slow;
    // while (right!=null) {
    // if(left.data != right.data){
    // System.out.println("Not Palindrom");
    // return;
    // }
    // left = left.next;
    // right = right.next;
    // }
    // System.out.println("Palindrom");
    // }

    public void palindrom() {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node curr = slow;
        Node prev = null;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node left = head;
        Node right = prev;
        while (right != null) {
            if (left.data != right.data) {
                System.out.println("Not Palindrom");
                return;
            }
            left = left.next;
            right = right.next;
        }
        System.out.println("Palindrom");
    }

    public static boolean isCycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    public static void removeCycle() {
        Node slow = head;
        Node fast = head;
        boolean cycle = false;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

            if (slow == fast) {
                cycle = true;
                break;
            }
        }

        if (cycle == false) {
            return;
        }

        slow = head;
        Node prev = null;
        while (slow != fast) {
            prev = fast;
            slow = slow.next;
            fast = fast.next;
        }

        prev.next = null;
    }

    public Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public Node mergSort(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

        Node mid = getMid(head);
        Node rightHead = mid.next;
        mid.next = null;
        Node newLeft = mergSort(head);
        Node newRight = mergSort(rightHead);

        return merg(newLeft, newRight);
    }

    public Node merg(Node head1, Node head2) {
        Node mergLL = new Node(-1);
        Node temp = mergLL;
        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }

        return mergLL.next;
    }

    public static Node ZigZag(Node head) {
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node prev = null;
        Node curr = slow.next;
        slow.next = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node Rh = prev;
        Node Lh = head;
        Node nextL, nextR;

        while (Lh != null && Rh != null) {
            nextL = Lh.next;
            Lh.next = Rh;
            nextR = Rh.next;
            Rh.next = nextL;

            Lh = nextL;
            Rh = nextR;
        }

        return head;
    }

    // public static Node RemoveN(Node head, int m, int n) {

    // Node mer = new Node(-1);
    // Node temp = mer;

    // while (head != null) {

    // for (int j = 0; j < m && head != null; j++) {
    // temp.next = new Node(head.data);
    // temp = temp.next;
    // head = head.next;
    // }
    // for (int k = 0; k < n && head!= null; k++) {
    // head = head.next;
    // }

    // }
    // return mer.next;
    // }

    // public static Node removeN(Node head, int m, int n){
    // Node curr = head;
    // while (curr!=null) {

    // for(int i=0; i<m-1 && curr!=null; i++){
    // curr = curr.next;
    // }

    // if(curr == null){
    // break;
    // }

    // Node temp = curr.next;
    // for(int j=0; j<n && curr!=null; j++){
    // temp = temp.next;
    // }

    // curr.next = temp;
    // curr = temp;
    // }

    // return head;
    // }

    // public static Node EvenOdd(Node head) {
    // Node even = new Node(-1);
    // Node odd = new Node(-1);

    // Node temp1 = even;
    // Node temp2 = odd;
    // Node curr = head;

    // while (curr != null) {
    // Node nextNode = curr.next;
    // if (curr.data % 2 == 0) {
    // temp1.next = curr;
    // temp1 = temp1.next;
    // }
    // else{
    // temp2.next = curr;
    // temp2 = temp2.next;
    // }
    // curr.next = null;
    // curr = nextNode;
    // }

    // temp1.next = odd.next;
    // return even.next;
    // }

    
    public static void main(String[] args) {

        LinkedList li1 = new LinkedList();
        LinkedList li2 = new LinkedList();

        // head = new Node(1);
        // Node temp = new Node(2);
        // head.next = temp;
        // head.next.next = new Node(3);
        // head.next.next.next = temp;

        // System.out.println(isCycle());
        // removeCycle();
        // System.out.println(isCycle());

        

        // li.print();
        // li.head = li.mergSort(li.head);
        // li.print();

        // Node temp = ZigZag(li.head);
        // while (temp != null) {
        // System.out.print(temp.data + " ");
        // temp = temp.next;
        // }
        // li.addLast(1);

        // li.addMiddle(2, 9);

        // li.removeFirst();
        // li.removeLast();

        // li.print();
        // li.reverse();

        // li.print();
        // li.removeFromLast(3);

        // li.print();
        // li.palindrom();

        // System.out.println(li.recursive(3));
        // System.out.println(size);

    }
}