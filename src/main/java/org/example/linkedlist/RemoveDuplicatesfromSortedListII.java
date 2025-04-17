package org.example.linkedlist;

public class RemoveDuplicatesfromSortedListII {

    public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }
        public ListNode deleteDuplicates(ListNode head) {
            //Dummy node is a new node - with head as the next node
            //Basically just an empty node
            ListNode dummy = new ListNode(0, head);

            // predecessor = the last node
            // before the sublist of duplicates
            ListNode pred = dummy;

            //Iterating through the original list containing dupes
            while (head != null) {

                //The check to see if we're starting a duplicate chain
                if (head.next != null && head.val == head.next.val) {
                    // Move till the end of the duplicates sublist
                    //Keeps skipping until we reach a new unique node
                    while (head.next != null && head.val == head.next.val) {
                        head = head.next;
                    }

                    //Sets Pred = head.next - removing our chained elements
                    pred.next = head.next;
                } else {

                    //Otherwise we just move forward like normal, since the next element is unique
                    pred = pred.next;
                }

                // move forward
                head = head.next;
            }

            //Return the start position of the list
            //This is common when working with linkedlist
            return dummy.next;
        }
}
