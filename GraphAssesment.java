public class GraphAssesment {

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

        static int indx = -1;

        public static Node insert(int nodes[]) {
            indx++;
            if (nodes[indx] == -1) {
                return null;
            }

            Node newNode = new Node(nodes[indx]);
            newNode.left = insert(nodes);
            newNode.right = insert(nodes);

            return newNode;
        }
    }

    public static void preO(Node root) {
        if (root == null) {
            return;
        }

        System.out.println(root.data);
        preO(root.left);
        preO(root.right);
    }

    public static int minHeight(Node root) {
        if (root == null) {
            return 0;
        }

        if(root.left == null && root.right == null){
            return 1;
        }

        if(root.left == null){
           return minHeight(root.right)+1;
        }

        if(root.right == null){
            return minHeight(root.left)+1;
        }
        

        return Math.min(minHeight(root.left), minHeight(root.right)) + 1;
    }

    public static void main(String[] args) {
        int nodes[] = { 1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, 7, -1, -1};
        Tree t = new Tree();
        Node root = t.insert(nodes);
        // preO(root);
        System.out.println(minHeight(root));

    }
}