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

                //We need to check first if we've reached the start of a duplicating section
                if (head.next != null && head.val == head.next.val) {

                    //if we're at the start of a duplicating section then we remove all of them
                    while (head.next != null && head.val == head.next.val) {
                        head = head.next;
                    }

                    //Then we skip the starting pointer
                    pred.next = head.next;
                } else {

                    //If not we can just move normally through our list
                    pred = pred.next;
                }

                //head will always move forward, regardless if we skip or not
                head = head.next;
            }


            return dummy.next;
        }
}
