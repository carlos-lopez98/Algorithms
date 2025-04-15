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
        ListNode dummy = new ListNode();
        ListNode curr =  head;

        while(curr != null){

            //You need to create a prev in each while loop iteration
            //So that we can iterate through our sorted list
            //Dummy always points to our starting point in our sorted list
            ListNode prev = dummy;


            //We do this while loop to get to our insertion point
            while(prev.next != null && prev.next.val <= curr.val){
                prev = prev.next;
            }


            //This saves our next point in our unsorted list
            //That way we can continue the iteration afterward
            ListNode next =curr.next;

            //This is our inserting first slice off prev.next and connect it to our
            //Inserting element
            curr.next = prev.next;

            //Next make our current element our inserted element
            prev.next = curr;

            //Then move curr back to pointing to our unsorted list
            //So that we can continue iterating through it
            curr = next;
        }

        return dummy.next;
  }
}
