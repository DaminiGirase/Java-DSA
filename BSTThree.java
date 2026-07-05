public class BSTThree {

    static class Node {
        int data;
        int height;
        Node left;
        Node right;

        public Node(int data) {
            this.data = data;
            height = 1;
        }

    }

    public static Node root;

    public static int height(Node root) {
        if (root == null) {
            return 0;
        }

        return root.height;
    }

    public static int BalanceFactor(Node root) {
        if (root == null) {
            return 0;
        }

        return height(root.left) - height(root.right);
    }

    public static Node leftRotate(Node x) {

        Node y = x.right;
        Node T2 = y.left;

        y.left = x;
        x.right = T2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    public static Node rightRotate(Node y) {

        Node x = y.left;
        Node T2 = x.right;

        x.right = y;
        y.left = T2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    public static Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (key < root.data) {
            root.left = insert(root.left, key);
        } else if (key > root.data) {
            root.right = insert(root.right, key);
        } else {
            return root;
        }

        root.height = 1 + Math.max(height(root.left), height(root.right));

        int bf = BalanceFactor(root);

        if (bf > 1 && key < root.left.data) {
            return rightRotate(root);
        }

        if (bf < -1 && key > root.right.data) {
            return leftRotate(root);
        }

        if (bf > 1 && key > root.left.data) {
            root.left = leftRotate(root.left);
            return rightRotate(root);
        }

        if (bf < -1 && key < root.right.data) {
            root.right = rightRotate(root.right);
            return leftRotate(root);
        }

        return root;
    }

    public static void preOrder(Node root) {
        if (root == null) {
            return;
        }

        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public static Node minValueNode(Node root) {
    Node curr = root;

    while (curr.left != null) {
        curr = curr.left;
    }

    return curr;
}

public static Node delete(Node root, int key) {

    // Step 1: Normal BST deletion
    if (root == null) {
        return null;
    }

    if (key < root.data) {
        root.left = delete(root.left, key);
    } else if (key > root.data) {
        root.right = delete(root.right, key);
    } else {

        // Node with one child or no child
        if (root.left == null) {
            return root.right;
        } else if (root.right == null) {
            return root.left;
        }

        // Node with two children
        Node temp = minValueNode(root.right);
        root.data = temp.data;
        root.right = delete(root.right, temp.data);
    }

    // Step 2: Update height
    root.height = 1 + Math.max(height(root.left), height(root.right));

    // Step 3: Balance factor
    int bf = BalanceFactor(root);

    // LL Case
    if (bf > 1 && BalanceFactor(root.left) >= 0) {
        return rightRotate(root);
    }

    // RR Case
    if (bf < -1 && BalanceFactor(root.right) <= 0) {
        return leftRotate(root);
    }

    // LR Case
    if (bf > 1 && BalanceFactor(root.left) < 0) {
        root.left = leftRotate(root.left);
        return rightRotate(root);
    }

    // RL Case
    if (bf < -1 && BalanceFactor(root.right) > 0) {
        root.right = rightRotate(root.right);
        return leftRotate(root);
    }

    return root;
}

    public static void main(String[] args) {

        root = insert(root, 10);
        root = insert(root, 20);
        root = insert(root, 30);
        root = insert(root, 40);
        root = insert(root, 50);
        root = insert(root, 25);

        delete(root, 30);
        preOrder(root);
    }
}