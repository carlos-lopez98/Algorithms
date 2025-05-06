package org.example.recursion;

public class SwapNodesInPairs {

     public class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


  //Need to understand that you need to return the value
    //That needs to connect to your current list
    public ListNode swapPairs(ListNode head){
         //It'd be even easier if we renamed head as current
        //As it'll let us see what's going on
        if(head == null || head.next == null){
            return head;
        }

        ListNode one = head;
        ListNode two = head.next;

        one.next = swapPairs(one.next.next);
        //We do two.next after we call swap because if not we'll create an infinite loop
        two.next = one;

        return two;
    }
}
