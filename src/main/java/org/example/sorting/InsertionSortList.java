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

            //Prev starts iterating everytime at dummy
            ListNode prev = dummy;


            while(prev.next != null && prev.next.val <= curr.val){
                prev = prev.next;
            }


            //This is the splicing part
            //We need to be able to visualize what's going on
            //In order to do this properly and in the right order
            ListNode next =curr.next;
            curr.next = prev.next;
            prev.next = curr;
            curr = next;
        }

        return dummy.next;
  }
}
