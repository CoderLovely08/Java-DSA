package Trees;

public class BST {
    public static Node rootNode;

    static class Node {
        Node left, right;
        int data;

        public Node(int data) {
            this.data = data;
            this.left = this.right = null;
        }
    }

    public static void createBinaryTree() {

        rootNode = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        rootNode.left = n2;
        rootNode.right = n3;
        n2.left = n4;
        n4.left = null;
        n3.right = n5;
        //         n1               1
        //        /  \             / \
        //      n2    n3          2   3
        //     /        \        /     \
        //    n4         n5     4       5
    }

    public static void preOrderTraverse(Node root) {
        if (root == null)
            return;
        System.out.print(root.data + " ");
        preOrderTraverse(root.left);
        preOrderTraverse(root.right);
    }

    public static void postOrderTraverse(Node root) {
        if (root == null)
            return;
        postOrderTraverse(root.left);
        postOrderTraverse(root.right);
        System.out.print(root.data + " ");
    }
    
    public static void inOrderTraverse(Node root) {
        if (root == null)
            return;
        inOrderTraverse(root.left);
        System.out.print(root.data + " ");
        inOrderTraverse(root.right);
    }

    public static void main(String[] args) {
        createBinaryTree();
        System.out.println("Preorder traversal");
        preOrderTraverse(rootNode);
        System.out.println("\nPostorder traversal");
        postOrderTraverse(rootNode);
        System.out.println("\nInorder traversal");
        inOrderTraverse(rootNode);

    }
}
