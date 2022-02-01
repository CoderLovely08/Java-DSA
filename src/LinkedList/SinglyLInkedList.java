package LinkedList;

public class SinglyLInkedList {
    static Node head;

    static class Node {
        int data;
        Node link;

        public Node(int data) {
            this.data = data;
            this.link = null;
        }
    }

    public static void traverse(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.link;
        }
    }

    public static void insertBeginning(Node myNode) {
        myNode.link = head;
        head = myNode;

    }

    public static void insertMiddle(Node myNode, int data) {
        Node temp = head;
        while (temp != null) {
            if (temp.data == data) {
                myNode.link = temp.link;
                temp.link = myNode;
                break;
            }
            temp = temp.link;
        }
    }

    public static void insertEnd(Node myNode) {
        Node temp = head;
        while (temp.link != null) {
            temp = temp.link;
        }
        temp.link = myNode;
    }

    public static int searchInLinkedList(int target) {
        Node temp = head;
        int counter = 0;
        while (temp != null) {
            if (target == temp.data)
                return counter;
            counter++;
            temp = temp.link;
        }
        return -1;
    }

    public static void showMenu() {
        System.out.println("\nSingly Linked List Operations");
        System.out.println("1) Insert at Beginning"
                + "\n2) Insert in the Middle "
                + "\n3) Insert at the End "
                + "\n3) Traverse "
                + "\n4) Search "
                + "\n5) Exit");
    }

    public static void helper() {
        head = new Node(5);
        Node secondNode = new Node(6);
        Node thirdNode = new Node(7);
        Node fourthNode = new Node(8);
        Node fiftNode = new Node(9);
        Node sixtNode = new Node(66);
        head.link = secondNode;
        secondNode.link = thirdNode;
        thirdNode.link = fourthNode;
        fourthNode.link = fiftNode;
        fiftNode.link = sixtNode;
        System.out.println("\nThe list is : ");
        traverse(head);
        Node newnode = new Node(77);
        insertBeginning(newnode);
        System.out.println("\nAfter inserting at head : ");
        traverse(head);
        Node endNode = new Node(88);
        insertEnd(endNode);
        System.out.println("\nAfter inserting at end : ");
        traverse(head);
        System.out.println("\nFound at node number : " + searchInLinkedList(8));
        Node midNode = new Node(55);
        insertMiddle(midNode, 7);
        traverse(head);

    }

    public static void main(String[] args) {
        showMenu();
    }
}
