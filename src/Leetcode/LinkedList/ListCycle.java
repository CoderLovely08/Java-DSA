package Leetcode.LinkedList;

public class ListCycle {
    static Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static boolean hasCycle(Node head) {
        Node slow, fast;
        slow = fast = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
            if (fast.data == slow.data)
                return true;
        }
        return false;
    }

    public static void main(String[] args) {
        head = new Node(1);
        Node n2= new Node(2);
        Node n3= new Node(3);
        Node n4= new Node(4);
        Node n5= new Node(5);
        head.next=n2;
        n2.next=n3;
        n3.next=n4;
        n4.next=n5;
        n5.next=n3;
        System.out.println(hasCycle(head));
        // Node temp = head;
        // while (temp!=null) {
        //     System.out.println(temp.data);
        // }
    }
}
