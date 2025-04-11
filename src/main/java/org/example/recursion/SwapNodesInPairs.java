package org.example.recursion;

public class SwapNodesInPairs {

     public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }

    //Singly linked list
    //Only pointing in one direction
    public ListNode swapPairs(ListNode head){
         if(head == null || head.next == null){
             return head;
         }

         ListNode first = head;
         ListNode second = head.next;

         //When working with recursion, we must think, where does our answer go?
        //Here we swap first and second, but then our first.next - should equal the next appropriate swap
        //So that's why our first.next becomes swapPairs(head.next.next)
        first.next = swapPairs(head.next.next);

        second.next = first;

        return second;
    }


}
