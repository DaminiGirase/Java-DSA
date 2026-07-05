import java.util.*;
import java.util.LinkedList;

public class treeBuldPre {
    static class Node {

        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }

    }

    static class BinaryPreOrderTree {
        static int indx = -1;

        public static Node PreOrder(int nodes[]) {
            indx++;
            if (nodes[indx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[indx]);
            newNode.left = PreOrder(nodes);
            newNode.right = PreOrder(nodes);
            return newNode;
        }

        public static void PrintPreOrder(Node root) {
            if (root == null) {
                System.out.print("-1 ");
                return;
            }

            System.out.print(root.data + " ");
            PrintPreOrder(root.left);
            PrintPreOrder(root.right);

        }

        public static void InOrder(Node root) {

            if (root == null) {
                return;
            }

            InOrder(root.left);
            System.out.print(root.data + " ");
            InOrder(root.right);
        }

        public static void PostOrder(Node root) {
            if (root == null) {
                return;
            }

            PostOrder(root.left);
            PostOrder(root.right);
            System.out.print(root.data + " ");
        }

        public static void LevelOrder(Node root) {

            if (root == null) {
                return;
            }

            Queue<Node> q = new LinkedList<>();
            q.add(root);
            q.add(null);

            // if we want to print only kth level
            int level = 1;
            int k = 2;

            while (!q.isEmpty()) {
                Node currNode = q.remove();
                if (currNode == null) {
                    System.out.println();
                    if (q.isEmpty()) {
                        break;
                    } else {
                        q.add(null);

                        // if we want to print only kth level
                        level++;
                    }
                } else {

                    // if we want to print only kth level
                    if (level == k) {
                        System.out.print(currNode.data + " ");
                    }
                    if (currNode.left != null) {
                        q.add(currNode.left);
                    }

                    if (currNode.right != null) {
                        q.add(currNode.right);
                    }
                }
            }
        }

        public static int Height(Node root) {
            if (root == null) {
                return 0;
            }

            int lh = Height(root.left);
            int rh = Height(root.right);

            return Math.max(lh, rh) + 1;
        }

        public static int CountNodes(Node root) {
            if (root == null) {
                return 0;
            }

            int lcount = CountNodes(root.left);
            int rcount = CountNodes(root.right);

            return lcount + rcount + 1;
        }

        public static int NodeSum(Node root) {
            if (root == null) {
                return 0;
            }

            int ls = NodeSum(root.left);
            int rs = NodeSum(root.right);

            return ls + rs + root.data;
        }

        public static int Diameter(Node root) {
            if (root == null) {
                return 0;
            }

            int lD = Diameter(root.left);
            int rD = Diameter(root.right);
            int lh = Height(root.left);
            int rh = Height(root.right);

            int SelfD = lh + rh + 1;

            return Math.max(SelfD, Math.max(lD, rD));
        }

        static class Info {

            int diam;
            int ht;

            public Info(int diam, int ht) {
                this.diam = diam;
                this.ht = ht;
            }

        }

        public static Info DiameterOptimal(Node root) {
            if (root == null) {
                return new Info(0, 0);
            }

            Info leftInfo = DiameterOptimal(root.left);
            Info rightInfo = DiameterOptimal(root.right);

            int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
            int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

            return new Info(diam, ht);

        }

        // another way  leetcode

        int ans = 0;

        public int dia(Node root) {
            helper(root);
            return ans;
        }

        public int helper(Node root) {
            if (root == null) {
                return 0;
            }

            int left = helper(root.left);
            int right = helper(root.right);

            ans = Math.max(ans, left + right);

            return Math.max(left, right) + 1;
        }
    }

    public static void main(String[] args) {

        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1 };
        BinaryPreOrderTree tree = new BinaryPreOrderTree();
        Node root = tree.PreOrder(nodes);

        // tree.PrintPreOrder(root);
        // tree.InOrder(root);
        // tree.PostOrder(root);
        // tree.LevelOrder(root);

        // System.out.println(tree.Height(root));
        // System.out.println(tree.CountNodes(root));
        // System.out.println(tree.NodeSum(root));
        // System.out.println(tree.Diameter(root));

        // System.out.println(tree.DiameterOptimal(root).diam);
        System.out.println(tree.dia(root));
    }
}
