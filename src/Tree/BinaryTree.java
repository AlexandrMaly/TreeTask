package Tree;

import Node.Node;

public class BinaryTree {
    Node root;

    public BinaryTree() {
        root = null;
    }

    public void inorder(Node node) {
        if (node == null)
            return;
        inorder(node.left);
        System.out.print(node.index + " ");
        inorder(node.right);
    }

    public void preorder(Node node) {
        if (node == null)
            return;
        System.out.print(node.index + " ");
        preorder(node.left);
        preorder(node.right);
    }

    public void postorder(Node node) {
        if (node == null)
            return;
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.index + " ");
    }
}
