import java.util.*;

public class BSTFirst {
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

    static class BSearchT {

        public static Node insert(Node root, int data) {
            if (root == null) {
                return new Node(data);
            }

            if (root.val > data) {
                root.left = insert(root.left, data);
            } else {
                root.right = insert(root.right, data);
            }

            return root;
        }

        public static void inOrder(Node root) {
            if (root == null) {
                return;
            }

            inOrder(root.left);
            System.out.print(root.val + " ");
            inOrder(root.right);
        }

        public static boolean search(Node root, int key) {
            if (root == null) {
                return false;
            }

            if (root.val == key) {
                return true;
            }

            if (key < root.val) {
                return search(root.left, key);
            } else {
                return search(root.right, key);
            }
        }

        public static Node DeleteAnyNode(Node root, int data) {
            if (root == null) {
                return null;
            }

            if (data < root.val) {
                root.left = DeleteAnyNode(root.left, data);
            } else if (data > root.val) {
                root.right = DeleteAnyNode(root.right, data);
            } else {

                // case 1 : leave node
                if (root.left == null && root.right == null) {
                    return null;
                }

                // case 2 : one child
                if (root.left == null) {
                    return root.right;
                }

                if (root.right == null) {
                    return root.left;
                }

                // Case 3 : two child
                Node IS = InOrderS(root.right);
                root.val = IS.val;
                root.right = DeleteAnyNode(root.right, IS.val);

            }
            return root;
        }

        public static Node InOrderS(Node root) {
            while (root.left != null) {
                root = root.left;
            }

            return root;
        }

        public static void printInRange(Node root, int k1, int k2) {
            if (root == null) {
                return;
            }

            if (k1 <= root.val && k2 >= root.val) {
                printInRange(root.left, k1, k2);
                System.out.print(root.val + " ");
                printInRange(root.right, k1, k2);
            } else if (k2 <= root.val) {
                printInRange(root.left, k1, k2);
            } else {
                printInRange(root.right, k1, k2);
            }
        }

        public static void printPath(ArrayList<Integer> path) {
            for (int i = 0; i < path.size(); i++) {
                System.out.print(path.get(i) + " ");
            }
            System.out.println();
        }

        public static void printAllPathRtoL(Node root, ArrayList<Integer> path) {
            if (root == null) {
                return;
            }

            path.add(root.val);

            if (root.left == null && root.right == null) {
                printPath(path);
            }
            printAllPathRtoL(root.left, path);
            printAllPathRtoL(root.right, path);

            path.remove(path.size() - 1);

        }

        public static boolean isValid(Node root, Node min, Node max) {
            if (root == null) {
                return true;
            }

            if (min != null && root.val <= min.val) {
                return false;
            }

            if (max != null && root.val >= max.val) {
                return false;
            }

            return isValid(root.left, min, root) && isValid(root.right, root, max);
        }

        static class Data {
            int mi;
            int mx;
            boolean isBST;

            public Data(int mi, int mx, boolean isBST) {
                this.mi = mi;
                this.mx = mx;
                this.isBST = isBST;
            }
        }

        public static Data isValidnext(Node root) {
            if (root == null) {
                return new Data(Integer.MAX_VALUE, Integer.MIN_VALUE, true);
            }

            Data leftInfo = isValidnext(root.left);
            Data rightInfo = isValidnext(root.right);

            int mi = Math.min(root.val, Math.min(leftInfo.mi, rightInfo.mi));
            int mx = Math.max(root.val, Math.max(leftInfo.mx, rightInfo.mx));

            if (leftInfo.isBST && rightInfo.isBST && root.val > leftInfo.mx && root.val < rightInfo.mi) {
                return new Data(mi, mx, true);
            }

            return new Data(mi, mx, false);
        }

        public static boolean findBST(Node root) {

            return isValidnext(root).isBST;
        }

        // same code for mirror
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

        public static Node mirror2(Node root) {
            if (root == null) {
                return null;
            }

            Node leftmirror = mirror2(root.left);
            Node rightmirror = mirror2(root.right);

            root.left = rightmirror;
            root.right = leftmirror;

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

    }

    public static void main(String[] args) {

        BSearchT bst = new BSearchT();

        int nodes[] = { 4, 2, 6};
        Node root = null;

        for (int i = 0; i < nodes.length; i++) {
        root = bst.insert(root, nodes[i]);
        }

        // System.out.println(bst.findBST(root));

        // bst.mirror2(root);

        System.out.println(bst.isValid(root, null, null));

        // bst.printInRange(root, 5, 12);
        // bst.printAllPathRtoL(root, new ArrayList<>());

        // bst.inOrder(root);

        // bst.DeleteAnyNode(root, 8);
        // System.out.println();
        // bst.inOrder(root);

        // System.out.println(bst.search(root, 33));
    }
}