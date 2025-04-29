package org.example.sorting;

public class InsertionSortList {
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


  public ListNode insertionSortList(ListNode head) {
        //You don't have to have an initial dummy.next
        //Because in every iteration prev is adding to dummy.next
        //so in the first iteration it'll be null -> prev -> prev -> prev
        //Eventually dummy.next - is the head for a new sorted list
        ListNode dummy = new ListNode();
        ListNode curr =  head;

        while(curr != null){

            //Resets prev
            ListNode prev = dummy;


            //Finds insertion point
            while(prev.next != null && prev.next.val <= curr.val){
                prev = prev.next;
            }


            //Splicing being done
            ListNode next =curr.next;
            curr.next = prev.next;
            prev.next = curr;

            //Resets current
            curr = next;
        }

        return dummy.next;
  }
}
