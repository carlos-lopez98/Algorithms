package org.example.linkedlist;


//Need: Outer variables outside of the recursion call stack
//*When should our recursion stop? What would the base caes be?
//When do we update our stop variable? Why's it needed?
public class ReverseLinkedList {

    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public ListNode left;
    public boolean stop;

    public ListNode reverseList(ListNode head) {

        this.left = head;
        this.stop = false;

        helper(head);

        return head;
    }


    public ListNode helper(ListNode head) {

        if(head == null){
            return null;
        }

        helper(head.next);

        if(this.left == head || head.next == left){
            stop = true;
        }

        if(!stop){
            int temp = left.val;
            left.val = head.val;
            head.val = temp;
            left = left.next;
        }

        return head;
    }

}
