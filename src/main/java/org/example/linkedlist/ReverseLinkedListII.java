package org.example.linkedlist;

public class ReverseLinkedListII {

    public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

    //We can keep these outside - just so they persist out of each call stack
    private boolean stop;
    private ListNode left;

    public void recurseAndReverse(ListNode right, int m, int n) {

        //When n == 1 right pointer is in position
        if (n == 1) {
            return;
        }

        right = right.next;

        //When m is less than one, we can stop moving left forwards as it's also now in position
        if (m > 1) {
            this.left = this.left.next;
        }

        //Backtracking starts right after this call - remember that only our right is backtracking not our left
        this.recurseAndReverse(right, m - 1, n - 1);

        //If pointers meet or right moves past left
        if (this.left == right || right.next == this.left) {

            //Then we stop
            this.stop = true;
        }

        //If we're stopped then, we stop the swaps - backtracking will still continue - but no swaps will be performed
        //Swaps only happen if our stop is still false
        if (!this.stop) {

            //Then we swap values - and move our left pointer inward left = left.next
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
