public class TrieUniqueSubStrings {

    static class Node {

        Node children[] = new Node[26];
        boolean eow = false;

        public Node() {
            for (int i = 0; i < children.length; i++) {
                children[i] = null;
            }
        }
    }

    public static Node root = new Node();

    public static void insert(String str) {
        Node curr = root;
        for (int i = 0; i < str.length(); i++) {
            int indx = str.charAt(i) - 'a';
            if (curr.children[indx] == null) {
                curr.children[indx] = new Node();
            }
            curr = curr.children[indx];
        }

        curr.eow = true;
    }

    public static String finalSt = "";

    public static void LWwithAllP(Node root, StringBuilder sb) {
        if (root == null) {
            return;
        }

        for (int i = 0; i < 26; i++) {
            if (root.children[i] != null && root.children[i].eow == true) {
                char ch = (char) (i + 'a');
                sb.append(ch);
                
                if (sb.length() > finalSt.length()) {
                    finalSt = sb.toString();
                }
                LWwithAllP(root.children[i], sb);
                sb.deleteCharAt(sb.length() - 1);
            }

        }
    }

    public static int countString(Node root) {
        if (root == null) {
            return 0;
        }

        int count = 0;
        for (int i = 0; i < root.children.length; i++) {
            if (root.children[i] != null) {
                count += countString(root.children[i]);
            }
        }

        return count + 1;
    }

    public static void main(String[] args) {

        String words[] = { "a", "banana", "app", "appl", "ap", "apply", "apple" };

        for (int i = 0; i < words.length; i++) {
            insert(words[i]);
        }

        LWwithAllP(root, new StringBuilder(""));
        System.out.println(finalSt);

        // String str = "ababa";

        // for (int i = 0; i < str.length(); i++) {
        // insert(str.substring(i));
        // }

        // System.out.println(countString(root));
    }
}
