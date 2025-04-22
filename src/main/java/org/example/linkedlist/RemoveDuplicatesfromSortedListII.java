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

            ListNode dummy = new ListNode(0, head);

            ListNode pred = dummy;

            while (head != null) {

                if (head.next != null && head.val == head.next.val) {

                    //This skips all duplicates
                    while (head.next != null && head.val == head.next.val) {
                        head = head.next;
                    }

                    //This skips the start of the duplicates
                    pred.next = head.next;
                } else {

                    //Only moves forward regularly if no dupes are involved
                    pred = pred.next;
                }

                head = head.next;
            }


            return dummy.next;
        }
}
