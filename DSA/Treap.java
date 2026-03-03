import java.util.*;

public class Treap {

    static class Node {
        int key, priority;
        Node left, right;

        Node(int key) {
            this.key = key;
            this.priority = new Random().nextInt(1000);
        }
    }

    static Node rotateRight(Node y) {
        Node x = y.left;
        y.left = x.right;
        x.right = y;
        return x;
    }

    static Node rotateLeft(Node x) {
        Node y = x.right;
        x.right = y.left;
        y.left = x;
        return y;
    }

    static Node insert(Node root, int key) {
        if (root == null) return new Node(key);

        if (key < root.key) {
            root.left = insert(root.left, key);
            if (root.left.priority > root.priority)
                root = rotateRight(root);
        } else {
            root.right = insert(root.right, key);
            if (root.right.priority > root.priority)
                root = rotateLeft(root);
        }
        return root;
    }

    public static void main(String[] args) {
        Node root = null;
        root = insert(root, 50);
        root = insert(root, 30);
        root = insert(root, 70);
        System.out.println("Treap constructed");
    }
}
