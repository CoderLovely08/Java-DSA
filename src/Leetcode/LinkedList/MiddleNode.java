package Leetcode.LinkedList;

public class MiddleNode {

    static Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node middleNode(Node head) {
        Node slow =head, fast = head;
        while (fast!=null && fast.next!=null) {
            fast=fast.next.next;
            slow=slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        head =  new Node(1);
        Node n2 = new Node(4);
        Node n3 = new Node(6);
        Node n4 = new Node(8);
        //Node n5 = new Node(9);
        head.next=n2;
        n2.next=n3;
        n3.next=n4;
        //n4.next=n5;
        middleNode(head);
    }
}
