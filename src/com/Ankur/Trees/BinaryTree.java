package com.Ankur.Trees;

public class BinaryTree {
    Node root;

    public void addNode(int a) {
        Node newNode = new Node(a);
        if (root == null)
            root = newNode;
        else {
            Node focus = root;
            Node parent;
            while (true) {
                parent = focus;
                if (a < focus.data) {
                    focus = focus.left;
                    if (focus == null) {
                        parent.left = newNode;
                        break;
                    }
                } else {
                    focus = focus.right;
                    if (focus == null) {
                        parent.right = newNode;
                        break;
                    }
                }
            }
        }
    }

    public void preOrderTraversal(Node focus) {
        if (focus != null) {
            System.out.printf(focus.data + " ");
            preOrderTraversal(focus.left);
            preOrderTraversal(focus.right);
        }
    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.addNode(50);
        tree.addNode(25);
        tree.addNode(75);
        tree.addNode(12);
        tree.addNode(37);
        tree.addNode(43);
        tree.addNode(30);

        tree.preOrderTraversal(tree.root);
    }

}

class Node {
    int data;
    Node left;
    Node right;

    public Node(int d) {
        data = d;
    }
}
