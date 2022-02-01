// package Trees;

// import java.util.ArrayDeque;

// /**
//  Node
// */

// public class BST {
//     public static Node rootNode;

//     class Node {
//         Node left, right;
//         int data;
//         public Node(int data) {
//             this.data = data;
//         }
//     }

//     public void createBinaryTree() {

//         Node n1= new Node(1);
//         Node n2= new Node(2);
//         Node n3= new Node(3);
//         Node n4= new Node(4);
//         Node n5= new Node(5);
//         rootNode = n1;
//         n1.left= n2;
//         n1.right= n3;
//         n2.left = n4;
//         n4.left=null;
//         n3.right = n5;
//         //         n1
//         //        /  \
//         //      n2    n3
//         //     /        \
//         //    n4         n5
//     }
//     public static void traverse(Node root) {
//         if (root==null) return;
//         System.out.println(root.data);
//         traverse(root.left);
//         traverse(root.right);
//     }
//     public static void main(String[] args) {
//         System.out.println(rootNode);
//         traverse(rootNode);
//     }
// }
