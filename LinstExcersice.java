public class LinstExcersice {

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

    public static void main(String[] args) {
        Node commen = new Node(6);
        commen.next = new Node(7);

        Node l1 = new Node(4);
        l1.next = new Node(5);
        l1.next.next = commen;

        Node l2 = new Node(1);
        l2.next = new Node(2);
        l2.next.next = new Node(3);
        l2.next.next.next = commen;

        Node temp1 = l1;
        Node temp2 = l2;

        while (temp1 != temp2) {
            temp1  = temp1.next;
            temp2 = temp2.next;

            if(temp1 == null && temp2 == null){
                return;
            }

            if(temp1 == null){
                temp1 = l2;
            }
            if(temp2 == null){
                temp2 = l1;
            }
        }
       System.out.println(temp1.data);

    }
}
