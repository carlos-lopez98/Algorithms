package org.example.SortAlgorithms;

public class InsertionSortList {
  public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }


  public ListNode insertionSortList(ListNode head) {
        //Create a dummy head
        ListNode dummy = new ListNode();
        ListNode curr =  head;

        //Current is to stay pointing to the original unsorted list
        while(curr != null){
            //Points to an empty node
            //In every iteration we're creating a new prev pointer
            //Then iterating from prev to an insertion point
            //If we're at the correct insertion point - we insert
            ListNode prev = dummy;

            //Prev is to point to the sorted list
            //This while loop finds the insertion point
            while(prev.next != null && prev.next.val <= curr.val){
                prev = prev.next;
            }
            //Once we're out - prev.next is our insertion point


            //This creates a pointer pointing to the remainder of our unsorted list
            ListNode next =curr.next;

            //Our next node is set to
            //Our inserted node must preserve the sorted lists positions
            //So our curr.next becomes prev.next
            curr.next = prev.next;

            //This inserts our curr into the new list
            //Then our prev.next becomes curr
            prev.next = curr;

            //Curr then becomes our next element in the unsorted list
            //Then we reset curr back to the original list
            curr = next;
        }

        return dummy.next;
  }
}
