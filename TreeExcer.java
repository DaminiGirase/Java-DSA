import java.util.*;
import java.util.LinkedList;

public class TreeExcer {
    static class Node {

        int data;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    static class Tree {

        public static int KthAncester(Node root, int n, int k) {
            if (root == null) {
                return -1;
            }

            if (root.data == n) {
                return 0;
            }

            int leftDist = KthAncester(root.left, n, k);
            int rightDist = KthAncester(root.right, n, k);

            if (leftDist == -1 && rightDist == -1) {
                return -1;
            }

            int max = Math.max(leftDist, rightDist);
            if (max + 1 == k) {
                System.out.println(root.data);
            }

            return max + 1;
        }

        public static int MySumTree(Node root) {

            if (root == null) {
                return 0;
            }

            if (root.left == null && root.right == null) {
                root.data = root.data;
            } else {
                root.data = root.left.data + root.right.data;
            }

            MySumTree(root.left);
            MySumTree(root.right);

            return root.data;

        }

        public static int SumTree(Node root) {
            if (root == null) {
                return 0;
            }

            int leftSum = SumTree(root.left);
            int rightSum = SumTree(root.right);

            int newLeft = root.left == null ? 0 : root.left.data;
            int newRight = root.right == null ? 0 : root.right.data;

            int data = root.data;
            root.data = newLeft + leftSum + newRight + rightSum;
            return data;
        }

        public static void PrintPreOrder(Node root) {
            if (root == null) {
                return;
            }

            System.out.print(root.data + " ");
            PrintPreOrder(root.left);
            PrintPreOrder(root.right);

        }

        public static boolean Univalued(Node root) {
            if (root == null) {
                return true;
            }

            if (root.left != null && root.left.data != root.data) {
                return false;
            }

            if (root.right != null && root.right.data != root.data) {
                return false;
            }

            boolean inleft = Univalued(root.left);
            boolean inright = Univalued(root.right);

            return inleft && inright;
        }

        public static boolean isMirror(Node root1, Node root2) {
            if (root1 == null && root2 == null) {
                return true;
            }

            if (root1 == null || root2 == null) {
                return false;
            }

            if (root1.data != root2.data) {
                return false;
            }

            boolean Cleft = isMirror(root1.left, root2.right);
            boolean Cright = isMirror(root1.right, root2.left);

            return Cleft && Cright;
        }

        public static Node invert(Node root) {
            if (root == null) {
                return root;
            }

            Node temp = root.left;
            root.left = root.right;
            root.right = temp;

            invert(root.left);
            invert(root.right);

            return root;
        }

        public static void removeLeafe(Node root, int n) {
            if (root == null) {
                return;
            }

            if (root.left != null && root.left.left == null && root.left.right == null && root.left.data == n) {
                root.left = null;
            }

            if (root.right != null && root.right.left == null && root.right.right == null && root.right.data == n) {
                root.right = null;
            }

            removeLeafe(root.left, n);
            removeLeafe(root.right, n);

        }

        public static List<Integer> rightView(Node root) {

            List<Integer> list = new ArrayList<>();
            helper(root, list, 0);
            return list;

        }

        public static void helper(Node root, List<Integer> list, int depth) {
            if (root == null) {
                return;
            }

            if (depth == list.size()) {
                list.add(root.data);
            }

            helper(root.right, list, depth + 1);
            helper(root.left, list, depth + 1);
        }

        public static boolean pathSum(Node root, int targetSum) {
            if (root == null) {
                return false;
            }

            if (root.left == null && root.right == null) {
                return root.data == targetSum;
            }

            return pathSum(root.left, targetSum - root.data) || pathSum(root.right, targetSum - root.data);
        }

        public static Node deleteLeave(Node root, int n) {
            if (root == null) {
                return null;
            }

            root.left = deleteLeave(root.left, n);
            root.right = deleteLeave(root.right, n);

            if (root.left == null && root.right == null && root.data == n) {
                return null;
            }

            return root;
        }

        public static String subtree(Node root, HashMap<String, Integer> map, List<Node> ans) {
            if (root == null) {
                return "?";
            }

            String left = subtree(root.left, map, ans);
            String right = subtree(root.right, map, ans);

            String pattern = Integer.toString(root.data) + "#" + left + "#" + right + "#";

            if (map.containsKey(pattern) == false) {
                map.put(pattern, 1);
            } else {
                if (map.get(pattern) == 1) {
                    ans.add(root);
                }
                map.put(pattern, map.get(pattern) + 1);
            }

            return pattern;
        }

        public static List<Node> duplicateSubTree(Node root) {
            HashMap<String, Integer> map = new HashMap<>();
            List<Node> ans = new ArrayList<>();
            subtree(root, map, ans);
            return ans;
        }

        static int ans = Integer.MIN_VALUE;

        public static int rec(Node root) {
            if (root == null) {
                return 0;
            }

            int left = Math.max(0, rec(root.left));
            int right = Math.max(0, rec(root.right));

            ans = Math.max(ans, left + right + root.data);

            return Math.max(left, right) + root.data;

        }

        public static int maxSum(Node root) {
            ans = Integer.MIN_VALUE;
            rec(root);
            return ans;
        }
    }

    public static void main(String[] args) {

        Tree tree = new Tree();

        // Q1

        // Node root = new Node(2);
        // root.left = new Node(2);
        // root.right = new Node(2);
        // root.left.left = new Node(2);
        // root.left.right = new Node(2);

        // if (tree.Univalued(root)) {
        // System.out.println("Yes");
        // } else {
        // System.out.println("No");
        // }

        // Q2

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // Node root2 = new Node(1);
        // root2.left = new Node(3);
        // root2.right = new Node(2);
        // root2.left.left = new Node(7);
        // root2.left.right = new Node(6);
        // root2.right.left = new Node(5);
        // root2.right.right = new Node(4);

        // if (tree.isMirror(root1, root2)) {
        // System.out.println("Yes");
        // } else {
        // System.out.println("No");
        // }

        // invert

        Node root1 = new Node(1);
        root1.left = new Node(2);
        root1.right = new Node(3);
        root1.left.left = new Node(4);
        root1.left.right = new Node(5);
        root1.right.left = new Node(6);
        root1.right.right = new Node(7);

        // System.out.println(tree.maxSum(root1));

        // List<Node> list = tree.duplicateSubTree(root1);
        // for (int i = 0; i < list.size(); i++) {
        // System.out.print(list.get(i).data + " ");
        // }
        // System.out.println(tree.pathSum(root1, 18));

        // List<Integer> list = tree.rightView(root1);
        // System.out.println(list);

        tree.invert(root);

        // tree.deleteLeave(root1, 7);
        // tree.PrintPreOrder(root1);

        // tree.KthAncester(root, 3, 1);
        // tree.SumTree(root);
        tree.PrintPreOrder(root);

    }
}
