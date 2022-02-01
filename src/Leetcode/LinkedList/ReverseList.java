package Leetcode.LinkedList;

public class ReverseList {

    static Node head;

    static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
static int counter,ans=0;
    public static int reverse(Node head) {
        if (head==null){
            counter = -1;
            return 0;
        }
        reverse(head.next);
        counter++;
        ans += head.data* Math.pow(2, counter);
        return ans;
    }
    
    //better approach
    public static int getDecimalValue(Node head) {     
        int ans1 = 0;
        for(Node temp =  head;temp!=null;temp=temp.next){
            ans1 =  (ans1<<1)+temp.data;
            System.out.println(ans1);
        }                
        return ans1;        
    }

    public static void main(String[] args) {
        head =  new Node(1);
        Node n2 = new Node(0);
        Node n3 = new Node(1);
        Node n4 = new Node(0);
        head.next=n2;
        n2.next=n3;
        n3.next=n4;
       // System.out.println(reverse(head));;
        System.out.println(getDecimalValue(head));
    }
}
