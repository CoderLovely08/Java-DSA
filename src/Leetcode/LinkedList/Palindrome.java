package Leetcode.LinkedList;

import java.util.Stack;

public class Palindrome {
    static ListNode head;

    static class ListNode {
        int data;
        ListNode next;

        public ListNode(int data) {
            this.data = data;
            this.next = null;
        }
    }
    
    public boolean isPalindrome(ListNode head) {
        Stack<Integer> s = new Stack<>();
        ListNode temp = head;
        while (temp!=null) {
            s.push(temp.data);
            temp=temp.next;
        }
        temp=head;
        while (temp!=null) {
            if(temp.data!=s.pop()) return false;
            temp=temp.next;
        }
        return false;
    }

    public static void main(String[] args) {

    }
}
