package org.example.linkedlist;


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


    ListNode left;

    public ListNode reverseList(ListNode head) {
        if(head == null){
            return null;
        }


        this.left = head;

        recurse(head);

        return head;
    }


    public void recurse(ListNode head){
        if(head == null){
            return;
        }

        recurse(head.next);

        if(this.left == head || head.next == left){
            return;
        }else{
            int temp = this.left.val;
            this.left.val = head.val;
            head.val = temp;
            this.left = left.next;
        }
    }

}
