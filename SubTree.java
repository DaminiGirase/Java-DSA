import java.util.*;
import java.util.LinkedList;

import javax.swing.tree.TreeNode;

public class SubTree {
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

    static class BinaryTree {

        public static boolean isIdentical(Node node, Node subRoot) {
            if (node == null && subRoot == null) {
                return true;
            } else if (node == null || subRoot == null || node.data != subRoot.data) {
                return false;
            }

            if (!isIdentical(node.left, subRoot.left)) {
                return false;
            }

            if (!isIdentical(node.right, subRoot.right)) {
                return false;
            }
            return true;
        }

        public static boolean isSubTree(Node root, Node subRoot) {
            if (root == null) {
                return false;
            }

            if (root.data == subRoot.data) {
                if (isIdentical(root, subRoot)) {
                    return true;
                }
            }

            return isSubTree(root.left, subRoot) || isSubTree(root.right, subRoot);
        }

        static class Info {
            Node node;
            int hd;

            public Info(Node node, int hd) {
                this.node = node;
                this.hd = hd;
            }
        }

        public static void topView(Node root) {

            Queue<Info> q = new LinkedList<>();
            HashMap<Integer, Node> map = new HashMap<>();

            q.add(new Info(root, 0));
            int min = 0, max = 0;

            while (!q.isEmpty()) {
                Info curr = q.remove();

                // only remove this if condition for bottom view

                if (!map.containsKey(curr.hd)) {
                    map.put(curr.hd, curr.node);
                }

                if (curr.node.left != null) {
                    q.add(new Info(curr.node.left, curr.hd - 1));
                    min = Math.min(min, curr.hd - 1);
                }

                if (curr.node.right != null) {
                    q.add(new Info(curr.node.right, curr.hd + 1));
                    max = Math.max(max, curr.hd + 1);
                }

            }

            for (int i = min; i <= max; i++) {
                System.out.print(map.get(i).data + " ");
            }

        }

        public static void printKthLevel(Node root, int level, int k) {

            if (root == null) {
                return;
            }

            if (level == k) {
                System.out.print(root.data + " ");
                return;
            }

            printKthLevel(root.left, level + 1, k);
            printKthLevel(root.right, level + 1, k);
        }

        public static boolean getPath(Node root, int n, ArrayList<Node> path) {

            if (root == null) {
                return false;
            }

            path.add(root);

            if (root.data == n) {
                return true;
            }

            boolean getLeft = getPath(root.left, n, path);
            boolean getRight = getPath(root.right, n, path);

            if (getLeft || getRight) {
                return true;
            }

            path.remove(path.size() - 1);
            return false;
        }

        public static Node LowestCommonAccester(Node root, int n1, int n2) {
            ArrayList<Node> path1 = new ArrayList<>();
            ArrayList<Node> path2 = new ArrayList<>();

            getPath(root, n1, path1);
            getPath(root, n2, path2);

            int i = 0;
            for (; i < path1.size() && i < path2.size(); i++) {
                if (path1.get(i) != path2.get(i)) {
                    break;
                }
            }

            Node lca = path1.get(i - 1);
            return lca;
        }

        public static Node LCA2(Node root, int n1, int n2) {
            if (root == null || root.data == n1 || root.data == n2) {
                return root;
            }

            Node leftLca = LCA2(root.left, n1, n2);
            Node rightLca = LCA2(root.right, n1, n2);

            if (rightLca == null) {
                return leftLca;
            }

            if (leftLca == null) {
                return rightLca;
            }

            return root;
        }

        public static int DistlcaTon(Node root, int n) {
            if (root == null) {
                return -1;
            }

            if (root.data == n) {
                return 0;
            }

            int leftDist = DistlcaTon(root.left, n);
            int rightDist = DistlcaTon(root.right, n);

            if (leftDist == -1 && rightDist == -1) {
                return -1;
            } else if (rightDist == -1) {
                return leftDist + 1;
            } else {
                return rightDist + 1;
            }

        }

        public static int minDistance(Node root, int n1, int n2) {
            Node lca = LCA2(root, n1, n2);

            int dist1 = DistlcaTon(lca, n1);
            int dist2 = DistlcaTon(lca, n2);

            return dist1 + dist2;
        }

        static long min = Long.MAX_VALUE;
        static long secondmin = Long.MAX_VALUE;

        public static int findSecondMinimumValue(Node root) {
            if (root == null) {
                return secondmin == Long.MAX_VALUE ? -1 : (int) secondmin;
            }

            if (root.data < min) {
                secondmin = min;
                min = root.data;
            }
            if (root.data < secondmin && root.data != min) {
                secondmin = root.data;
            }

            findSecondMinimumValue(root.left);
            findSecondMinimumValue(root.right);

            return secondmin == Long.MAX_VALUE ? -1 : (int) secondmin;

        }
    }

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        // Tree

        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        // sub Tree

        // Node subRoot = new Node(2);
        // subRoot.left = new Node(4);
        // subRoot.right = new Node(5);

        // System.out.println(tree.isSubTree(root, subRoot));
        // tree.topView(root);

        tree.printKthLevel(root, 1, 2);
        

        // System.out.println(tree.LCA2(root, 6, 7).data);
        // System.out.println(tree.minDistance(root, 4, 7));
        // // System.out.println(tree.findSecondMinimumValue(root));
    }
}
