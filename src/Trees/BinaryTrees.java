package Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTrees {
    static class Node {
        int data;
        Node left;
        Node right;

        public Node(int key) {
            this.data = key;
            this.left = null;
            this.right = null;
        }
    }

    // Traverse method 
    /**
     * @param   root    pass the root node from which you want to perform traversal
     * @param   order    specify the type of order, ex: preOrder
     * @return  null
     */
    public static void traverse(Node root, String order) {
        switch (order) {
            case "preOrder": {
                System.out.printf("\nPrinting %s traversal\n", order);
                preOrder(root);
            }
                break;
            case "inOrder": {
                System.out.printf("\nPrinting %s traversal\n", order);
                inOrder(root);
            }
                break;
            case "postOrder": {
                System.out.printf("\nPrinting %s traversal\n", order);
                postOrder(root);
            }
                break;
            default:
                System.out.println("Nothing to print");
                break;
        }
    }

    public static void preOrder(Node root){
        if(root == null) return;

        System.out.print(root.data + "-> ");
        preOrder(root.left);
        preOrder(root.right);

    }
    
    public static void inOrder(Node root){
        if(root == null) return;

        inOrder(root.left);
        System.out.print(root.data + "-> ");
        inOrder(root.right);

    }
    
    public static void postOrder(Node root){
        if(root == null) return;

        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data + "-> ");

    }

    // Depth First Search
    public static void dfs(Node root){
        if (root == null) return;

        Stack<Node> stack = new Stack<>();
        stack.push(root);

        while(!stack.isEmpty()){

            Node node = stack.pop();
            System.out.println(node.data);
            
            if(node.right != null) stack.push(node.right);
            if(node.left != null) stack.push(node.left);
        }
    }

    // Breadth First Search
    public static void bfs(Node root){
        if(root == null) return;

        Queue<Node> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            Node node = queue.poll();
            System.out.println(node.data);

            if(node.left !=null) queue.offer(node.left);
            if(node.right !=null) queue.offer(node.right);
        }
    }

    public static void main(String[] args) {
        Node root = new Node(10);
        Node n1 = new Node(5);
        Node n2 = new Node(15);
        Node n3 = new Node(3);
        Node n4 = new Node(2);
        Node n5 = new Node(20);
        Node n6 = new Node(25);

        root.left = n1;
        root.right = n2;
        /*
         *          root
         *          /   \
         *         n1    n2   
         */

        n1.left = n3;
        n1.right = n5;

        /*
         *          root
         *          /   \
         *         n1    n2   
         *        /  \
         *       n3   n5 
         */

        n2.left = n4;
        n2.right = n6;

        /*
         *           root
         *         /      \
         *        n1       n2   
         *       /  \      / \   
         *      n3   n5   n4  n6 
         * 
         * 
         * 
         *            10
         *         /      \
         *        5        15   
         *       /  \      / \   
         *      3   20    2  25 
         */


        // traverse(root, "preOrder");
        // traverse(root, "inOrder");
        // traverse(root, "postOrder");
        // dfs(root);
        bfs(root);

    }
}
