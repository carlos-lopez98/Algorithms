package org.example.linkedlist;

public class ReverseLinkedListII {

    public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

    //Need global variables to track a stop flag
    private boolean stop;

    //Need a global left so we can perform a two pointer iteration
    private ListNode left;

    public void recurseAndReverse(ListNode right, int m, int n) {

        //This one is what gets me - you need to be able to tell what node will be in the first backtrack
        //call
        if (n == 1) {
            return;
        }

        right = right.next;

        if (m > 1) {
            this.left = this.left.next;
        }

        this.recurseAndReverse(right, m - 1, n - 1);

        if (this.left == right || right.next == this.left) {
            this.stop = true;
        }

        if (!this.stop) {

            int t = this.left.val;
            this.left.val = right.val;
            right.val = t;

            //With the global left we can move this pointer inward
            //While our right pointer backtracks because of the recursion
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
