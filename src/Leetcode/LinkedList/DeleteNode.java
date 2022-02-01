package Leetcode.LinkedList;

public class DeleteNode {
    static Node head;
    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void createList() {
        
    }
    public static void traverse(Node head) {
        if (head == null) {
            System.out.println("List is empty!!");
            return;
        }
        System.out.println("\nThe current list is: ");
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void deleteNode(Node node) {
        System.out.println(node + " " +node.data);
        System.out.println(node.next +" "+node.next.data);
        node.data=node.next.data;
        node.next=node.next.next;
    }

    public static void main(String[] args) {
        //createList();
        head =  new Node(1);
        Node n2 = new Node(4);
        Node n3 = new Node(6);
        Node n4 = new Node(8);
        head.next=n2;
        n2.next=n3;
        n3.next=n4;
        traverse(head);
        deleteNode(n2);
        traverse(head);
    }
}
