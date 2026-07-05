
import java.util.Stack;

public class StackExcerces {

    public static class Node {

        char data;
        Node next;

        public Node(char data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public static boolean isPalindrom() {

        Stack<Character> s = new Stack<>();

        Node temp = head;
        while (temp != null) {
            s.push(temp.data);
            temp = temp.next;
        }

        temp = head;
        while (temp != null) {
            if (s.pop() != temp.data) {
                return false;
            }
            temp = temp.next;
        }

        return true;
    }

    public static String StringToS(String str) {

        Stack<Integer> sint = new Stack<>();
        Stack<String> sstring = new Stack<>();

        int num = 0;
        String curr = "";

        for (int i = 0; i < str.length(); i++) {

            char ch = str.charAt(i);
            
            if (Character.isDigit(ch)) {
                num = ch - '0';
            } else if (ch == '[') {
                sint.push(num);
                sstring.push(curr);

                num = 0;
                curr = "";
            } else if (ch == ']') {
                int count = sint.pop();
                String prev = sstring.pop();

                for (int j = 0; j < count; j++) {
                    prev += curr;
                }

                curr = prev;
            } else {
                curr += ch;
            }
        }

        return curr;
    }

    public static String SimplifyPath(String str) {
        String arr[] = str.split("/");
        Stack<String> s = new Stack<>();

        for (int i = 0; i < arr.length; i++) {
            String st = arr[i];

            if (st.equals("") || st.equals(".")) {
                continue;
            } else if (st.equals("..")) {
                if (!s.isEmpty()) {
                    s.pop();
                }
            } else {
                s.push(st);
            }
        }

        StringBuilder sb = new StringBuilder();
        for (String ele : s) {
            sb.append("/");
            sb.append(ele);
        }

        if (sb.length() == 0) {
            return "/";
        } else {
            return sb.toString();
        }

    }

    public static void main(String[] args) {

        head = new Node('A');
        head.next = new Node('B');
        head.next.next = new Node('A');

        // if (isPalindrom()) {
        // System.out.println("True");
        // } else {
        // System.out.println("False");
        // }

        // String str = "V5VB";
        // System.out.println(StringToS(str));

        // System.out.println(SimplifyPath("/home/damini/gi.."));

        System.out.println(StringToS("2[vb]"));
    }

}
