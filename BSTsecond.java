import java.util.*;

public class BSTsecond {

    static class Node {

        int val;
        Node left;
        Node right;

        public Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static Node BalancedTree(int nodes[], int st, int end) {

        if (st > end) {
            return null;
        }

        int mid = (st + end) / 2;
        Node root = new Node(nodes[mid]);

        root.left = BalancedTree(nodes, st, mid - 1);
        root.right = BalancedTree(nodes, mid + 1, end);

        return root;

    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.val + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static void inOrder(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return;
        }

        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);
    }

    public static Node BalancedTreeinOrder(ArrayList<Integer> list, int st, int end) {

        if (st > end) {
            return null;
        }

        int mid = (st + end) / 2;
        Node root = new Node(list.get(mid));

        root.left = BalancedTreeinOrder(list, st, mid - 1);
        root.right = BalancedTreeinOrder(list, mid + 1, end);

        return root;

    }

    public static Node BalancedBST(Node root) {
        if (root == null) {
            return null;
        }

        ArrayList<Integer> list = new ArrayList<>();
        inOrder(root, list);

        root = BalancedTreeinOrder(list, 0, list.size() - 1);
        return root;
    }

    static class Info {

        boolean isBST;
        int size;
        int min;
        int max;

        public Info(boolean isBST, int size, int min, int max) {
            this.isBST = isBST;
            this.size = size;
            this.min = min;
            this.max = max;
        }
    }

    static int maxSize = 0;

    public static Info balanced(Node root) {
        if (root == null) {
            return new Info(true, 0, Integer.MAX_VALUE, Integer.MIN_VALUE);
        }

        Info leftInfo = balanced(root.left);
        Info rightInfo = balanced(root.right);

        int size = leftInfo.size + rightInfo.size + 1;
        int min = Math.min(root.val, Math.min(leftInfo.min, rightInfo.min));
        int max = Math.max(root.val, Math.max(leftInfo.max, rightInfo.max));

        if (leftInfo.isBST && rightInfo.isBST && root.val > leftInfo.max && root.val < rightInfo.min) {
            maxSize = Math.max(size, maxSize);
            return new Info(true, size, min, max);
        }

        return new Info(false, size, min, max);
    }

    static int sum = 0;

    public static int sumRang(Node root, int L, int R) {
        if (root == null) {
            return sum;
        }

        if (L <= root.val && root.val <= R) {
            sumRang(root.left, L, R);
            sum += root.val;
            sumRang(root.right, L, R);
        }

        else if (R < root.val) {
            sumRang(root.left, L, R);
        }

        else {
            sumRang(root.right, L, R);
        }

        return sum;

    }

    public static List<Integer> inOrderT(Node root, ArrayList<Integer> list) {
        if (root == null) {
            return new ArrayList<>(0);
        }

        inOrder(root.left, list);
        list.add(root.val);
        inOrder(root.right, list);

        return list;
    }

    public static void findKthSmall(Node root, int k) {
        ArrayList<Integer> list = new ArrayList<>();
        inOrderT(root, list);
        Collections.sort(list, Collections.reverseOrder());
        for (int i = 0; i < list.size() - 1; i++) {
            if (i == k - 1) {
                System.out.print(list.get(i));
                break;
            }
        }

    }

    public static Node findMin(Node root, int k) {
        if (root == null) {
            return null;
        }

        findMin(root.left, k);

        if (Math.abs(root.val - k) < min) {
            min = Math.abs(root.val - k);
            ans = root;
        }

        findMin(root.right, k);

        return ans;
    }

    static int min = Integer.MAX_VALUE;
    static Node ans = null;

    public static Node minDiff(Node root, int k) {

        min = Integer.MAX_VALUE;
        ans = null;
        return findMin(root, k);

    }

    public static void main(String[] args) {

        // int nodes[] = { 3, 5, 6, 8, 10, 11, 12 };

        // Node root1 = BalancedTree(nodes, 0, nodes.length - 1);

        Node root = new Node(4);
        root.left = new Node(2);
        root.left.left = new Node(1);
        root.left.right = new Node(3);

        root.right = new Node(6);
        root.right.left = new Node(5);
        root.right.right = new Node(7);

        findKthSmall(root, 5);

        // sum = 0;
        // System.out.println(sumRang(root, 2, 6));

        // System.out.println(findMin(root, 9).val);

        // preOrder(root);
        // balanced(root);
        // System.out.println(maxSize);

    }
}
