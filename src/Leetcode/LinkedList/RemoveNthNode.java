package Leetcode.LinkedList;

public class RemoveNthNode {
    static ListNode head;

    static class ListNode {
        int val;
        ListNode next;

        public ListNode(int val) {
            this.val = val;
            this.next = null;
        }
    }
    public static ListNode removeNthFromEnd1(ListNode head, int n) {
        ListNode slow, fast;
        slow = fast = head;
        for (int i = 0; i < n; i++) fast= fast.next;
        if (fast==null) return head.next;
        while (fast.next!=null) {
            slow=slow.next;
            fast= fast.next;
        }
        //slow.val=slow.next.val;
        slow.next=slow.next.next;
        return head;
    }
    public static ListNode removeNthFromEnd(ListNode head, int n) {
        if (head.next==null) return head=null;
        if (head.next.next==null){
            head.next=null;
            return head;
        }
        ListNode slow, fast;
        slow = fast = head;
        int counter = -1;
        while (fast != null) {
            counter++;
            fast = fast.next;
            if (counter >= n)
                slow=slow.next;
        }
        slow.val=slow.next.val;
        slow.next=slow.next.next;
        return head;
    }

    public static void main(String[] args) {
        head =  new ListNode(1);
        ListNode n2 = new ListNode(2);
        ListNode n3 = new ListNode(3);
        ListNode n4 = new ListNode(4);
        ListNode n5 = new ListNode(5);
        head.next=n2;
        // n2.next=n3;
        // n3.next=n4;
        // n4.next=n5;
         ListNode temp = removeNthFromEnd1(head, 1);
        //ListNode temp=head;
        while (temp!=null) {
            System.out.println(temp.val);
            temp=temp.next;
        }
    }
}
