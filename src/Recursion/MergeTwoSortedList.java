package Recursion;


public class MergeTwoSortedList {

    // list1 = 1-->2-->4
    // list2 = 1-->3-->5
    static class Node{
        int data;
        Node next;
        public Node(int data) {
            this.data = data;
            this.next=null;
        }
    }

    public static Node mergeSorted(Node a, Node b) {
        if (a == null)
            return b;
        if (b == null)
            return a;

        if (a.data < b.data) {
            a.next = mergeSorted(a.next, b);
            return a;
        } else {
            b.next = mergeSorted(a, b.next);
            return b;
        }
    }
    public static void traverse(Node head) {
        Node temp= head;
        while (temp!=null) {
            System.out.println(temp.data);
            temp=temp.next;
        }
    }

    public static void main(String[] args) {
        Node n1= new Node(1);
        Node n2= new Node(2);
        Node n3= new Node(4);
        Node n4= new Node(1);
        Node n5= new Node(3);
        Node n6= new Node(5);
        n1.next=n2;
        n2.next=n3;
        n4.next=n5;
        n5.next=n6;
        Node newHead = mergeSorted(n1,n4);;
        traverse(newHead);
    }
}
