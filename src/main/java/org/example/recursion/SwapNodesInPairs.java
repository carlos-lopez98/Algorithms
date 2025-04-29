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
         if(head == null || head.next == null){
             return head;
         }

         ListNode first = head;
         ListNode second = head.next;

         //Because of the recursion the space is O(n)
        first.next = swapPairs(head.next.next);

        second.next = first;

        return second;
    }
}
