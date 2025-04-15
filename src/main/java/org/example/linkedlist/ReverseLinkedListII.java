package org.example.linkedlist;

public class ReverseLinkedListII {

    public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

    private boolean stop;
    private ListNode left;

    public void recurseAndReverse(ListNode right, int m, int n) {
        //Then this one keeps going up ontil n is 1
        //Which n is always greater than m
        if (n == 1) {
            return;
        }

        right = right.next;


        //This essentially creates a stopping point for our left pointer
        //Which is a global variable saved outside of our recursion call stack
        if (m > 1) {
            this.left = this.left.next;
        }

        this.recurseAndReverse(right, m - 1, n - 1);


        //Now this is the backtracking part
        //We start with both left and right pointers in the correct position
        //This is our queue to stop when our pointers are crossing
        if (this.left == right || right.next == this.left) {
            this.stop = true;
        }

        //We continue swapping if our stop variable
        //Isn't flipped
        if (!this.stop) {
            int t = this.left.val;
            this.left.val = right.val;
            right.val = t;

            this.left = this.left.next;
        }
    }

    public ListNode reverseBetween(ListNode head, int m, int n) {
        this.left = head;
        this.stop = false;
        this.recurseAndReverse(head, m, n);
        return head;
    }
}
