package Leetcode.LinkedList;

public class OddEvenList {
    static Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    // 1 --> 2 --> 3 --> 4 --> 5
    public static Node oddEvenList(Node head) {
        if (head == null)
            return head;

        Node odd = head;
        Node even = head.next;
        Node evenHead = even;

        while (even != null && even.next != null) {
            odd.next = odd.next.next;
            even.next = even.next.next;
            odd = odd.next;
            even = even.next;
        }

        odd.next = evenHead;
        return head;
    }

    public static void main(String[] args) {
        head = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        head.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;
        Node temp = head;
        // while (temp!=null) {
        // System.out.println(temp.data);
        // temp=temp.next;
        // }
        temp = oddEvenList(head);
        // while (temp!=null) {
        // System.out.println(temp.data);
        // temp=temp.next;
        // }
    }
}
