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
            // Dummy Node otherwise known as a sentinel
            ListNode dummy = new ListNode(0, head);

            // predecessor = the last node
            // before the sublist of duplicates
            ListNode pred = dummy;

            //Iterating through the original list containing dupes
            while (head != null) {

                //The check to see if we're starting a duplicate chain
                if (head.next != null && head.val == head.next.val) {
                    // Move till the end of the duplicates sublist
                    while (head.next != null && head.val == head.next.val) {
                        head = head.next;
                    }

                    // Skip all duplicates
                    pred.next = head.next;
                    // otherwise, move previous forward
                } else {
                    pred = pred.next;
                }

                // move forward
                head = head.next;
            }

            return dummy.next;
        }
}
