package LinkedList;

import java.util.Scanner;

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

    public static void printMemu() {
        System.out.println("\n\t***Singly Linked List Operations***");
        System.out.println("1) Insert at Beginning"
                + "\n2) Insert in the Middle "
                + "\n3) Insert at the End "
                + "\n4) Traverse "
                + "\n5) Delete "
                + "\n6) Search "
                + "\n7) Exit");
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
            temp = temp.link;
        }
        System.out.println();
    }

    public static void insertBeginning() {
        System.out.println("Enter a data value: ");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node myNode = new Node(data);
        myNode.link = head;
        head = myNode;
        System.out.println("Insertion successfull!");
    }

    public static void insertMiddle() {
        if (head == null) {
            System.out.println("List is empty!!");
            return;
        }
        System.out.println("Enter a data value: ");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        System.out.println("After which value? ");
        int target = sc.nextInt();
        Node myNode = new Node(data);
        Node temp = head;
        while (temp != null) {
            if (temp.data == target) {
                myNode.link = temp.link;
                temp.link = myNode;
                System.out.println("Insertion successfull!");
                return;
            }
            temp = temp.link;
        }
        System.out.println(target + " is not in the list");
    }

    public static void insertEnd() {
        System.out.println("Enter a data value: ");
        Scanner sc = new Scanner(System.in);
        int data = sc.nextInt();
        Node myNode = new Node(data);
        Node temp = head;
        while (temp.link != null) {
            temp = temp.link;
        }
        temp.link = myNode;
        System.out.println("Insertion successfull!");
    }

    public static void searchInLinkedList() {
        if (head == null) {
            System.out.println("List is empty!!");
            return;
        }
        System.out.println("Enter a data value to be searched: ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        Node temp = head;
        int counter = 1;
        while (temp != null) {
            if (target == temp.data) {
                System.out.println("Target found at node number: " + counter);
                return;
            }
            counter++;
            temp = temp.link;
        }
        System.out.println("Target not found!");
    }

    public static void deleteFromList() {
        if (head == null) {
            System.out.println("List is empty!!");
            return;
        }
        System.out.println("Enter a data value to be deleted: ");
        Scanner sc = new Scanner(System.in);
        int target = sc.nextInt();
        Node temp = head;
        while (temp.link != null) {
            if (temp.data == target) {
                head = temp.link;
                System.out.println("First Element Deleted");
                return;
            }
            if (temp.link.data == target) {
                temp.link = temp.link.link;
                System.out.println("Element Deleted");
                return;
            }
            temp = temp.link;
        }
        System.out.println("Element doesn't exist!!");
    }

    public static void showMenu() {

        while (true) {
            printMemu();
            Scanner input = new Scanner(System.in);
            System.out.println();
            int choice = input.nextInt();
            // input.close();
            switch (choice) {
                case 1:
                    insertBeginning();
                    break;
                case 2:
                    insertMiddle();
                    break;
                case 3:
                    insertEnd();
                    break;
                case 4:
                    traverse(head);
                    break;
                case 5:
                    deleteFromList();
                    break;
                case 6:
                    searchInLinkedList();
                    break;
                case 7:
                    System.out.println("Program Terminated!!");
                    System.exit(0);
                default:
                    System.out.println("Wrong Input!");
                    break;
            }
        }
    }

    public static void listCreateHelper() {
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
        traverse(head);
    }

    public static void main(String[] args) {
        listCreateHelper();
        showMenu();
    }
}
