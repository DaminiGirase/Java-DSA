import java.util.*;

public class PushAtBottom {

    // my aproach

    // static class Node {

    // int data;
    // Node next;

    // public Node(int data) {
    // this.data = data;
    // this.next = null;
    // }

    // }

    // public static Node head;
    // public static Node tail;

    // static class Stack {

    // public static boolean isEmpty() {
    // if (head == null) {
    // return true;
    // }
    // return false;
    // }

    // public static void push(int data) {
    // Node newNode = new Node(data);
    // if (isEmpty()) {
    // head = tail = newNode;
    // return;
    // }

    // newNode.next = head;
    // head = newNode;
    // }

    // public static int pop() {
    // if (isEmpty()) {
    // return -1;
    // }

    // int top = head.data;
    // head = head.next;
    // return top;
    // }

    // public static int peek() {
    // if (isEmpty()) {
    // return -1;
    // }

    // return head.data;
    // }

    // public static void pushBottom(int data) {
    // Node newNode = new Node(data);
    // if (isEmpty()) {
    // head = tail = newNode;
    // return;
    // }

    // tail.next = newNode;
    // tail = newNode;
    // }

    // }

    // public static void iterationBottom(Stack<Integer> s, int data) {
    // int n = s.size();
    // int arr[] = new int[n];
    // int i = 0;
    // while (!s.isEmpty()) {
    // arr[i] = s.pop();
    // i++;
    // }

    // s.push(data);
    // for (int j = n-1; j >=0; j--) {
    // s.push(arr[j]);
    // }

    // }

    // Mam approach

    public static void recursionBottom(Stack<Integer> s, int data) {

        if (s.isEmpty()) {
            s.push(data);
            return;
        }
        int top = s.pop();
        recursionBottom(s, data);
        s.push(top);
    }

    // Reverse Stack

    public static void reverseStack(Stack<Integer> s) {
        if (s.isEmpty()) {
            return;
        }

        int top = s.pop();
        reverseStack(s);
        recursionBottom(s, top);
    }

    // another aproach to reverse using extra stack

    public static void reverseExtra() {
        Stack<Integer> s1 = new Stack<>();
        s1.push(1);
        s1.push(2);
        s1.push(3);
        s1.push(4);

        Stack<Integer> s2 = new Stack<>();

        while (!s1.isEmpty()) {
            int top = s1.pop();
            s2.push(top);
        }

        while (!s2.isEmpty()) {
            System.out.println(s2.pop());
        }

    }

    // another aproach to push at bottom

    public static void pushBottom(Stack<Integer> s1, int data) {
        Stack<Integer> s2 = new Stack<>();

        while (!s1.isEmpty()) {
            s2.push(s1.pop());
        }

        s1.push(data);

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }

        while (!s1.isEmpty()) {
            System.out.println(s1.pop());
        }
    }

    // mam aproach reverse string

    public static String reverse(String str) {
        Stack<Character> s = new Stack<>();
        int i = 0;
        while (i != str.length()) {
            s.push(str.charAt(i));
            i++;
        }

        StringBuilder result = new StringBuilder();
        while (!s.isEmpty()) {
            result.append(s.pop());
        }

        return result.toString();
    }

    public static void PrintStack(Stack<Integer> s) {
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
    }

    public static String removeDuplicate(String str) {

        Stack<Character> s = new Stack<>();

        for (int i = str.length() - 1; i >= 0; i--) {
            if (!s.isEmpty() && s.peek() == str.charAt(i)) {
                s.pop();
            } else {
                s.push(str.charAt(i));
            }

        }

        StringBuilder sb = new StringBuilder();
        while (!s.isEmpty()) {
            sb.append(s.pop());
        }

        return sb.toString();
    }

    static class Pair {

        char ch;
        int count;

        public Pair(char ch, int count) {
            this.ch = ch;
            this.count = count;
        }
    }

    public static String removeKDuplicate2(String str, int k) {

        Stack<Pair> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (!s.isEmpty() && s.peek().ch == ch) {
                s.peek().count++;

                if (s.peek().count == k) {
                    s.pop();
                }
            } else {
                s.push(new Pair(ch, 1));
            }
        }

        StringBuilder sb = new StringBuilder();
        while (!s.isEmpty()) {
            Pair r = s.pop();
            for (int i = 0; i < r.count; i++) {
                sb.append(r.ch);
            }
        }

        return sb.reverse().toString();
    }

    public static String removeByMap(String str, int k) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            map.put(str.charAt(i), map.getOrDefault(str.charAt(i), 0) + 1);
        }

        Iterator<Character> it = map.keySet().iterator();

        while (it.hasNext()) {
            Character key = it.next();

            if (map.get(key) == k) {
                  it.remove(); 
            }
        }

        StringBuilder sb = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                sb.append(entry.getKey());
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        // Stack s = new Stack();

        // Stack<Integer> s = new Stack<>();

        // s.push(2);
        // s.push(4);
        // s.push(6);
        // s.push(8);
        // recursionBottom(s, 0);
        // iterationBottom(s, 9);
        // while (!s.isEmpty()) {
        // System.out.println(s.peek());
        // s.pop();
        // }

        // Reverse String using stack

        // Stack<String> ss = new Stack<>();
        // ss.push("a");
        // ss.push("b");
        // ss.push("c");

        // while (!ss.isEmpty()) {
        // System.out.print(ss.peek());
        // ss.pop();
        // }

        // mam aproach

        // String str = "damini";
        // System.out.println(reverse(str));

        // Reverse Stack

        // Stack<Integer> s = new Stack<>();
        // s.push(2);
        // s.push(4);
        // s.push(6);
        // s.push(8);

        // pushBottom(s, 0);

        // // reverseStack(s);
        // // PrintStack(s);

        // reverseExtra();

        // System.out.println(removeDuplicate("abbaca"));

        System.out.println(removeByMap("deeedbbcccbdaa", 3));

    }
}
