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


            //Technicall pred is also moving along the original linkedlist
            //But it's one step before head
            ListNode pred = dummy;

            while (head != null) {

                //You need the if statement because of the way you move pred
                if (head.next != null && head.val == head.next.val) {

                    while (head.next != null && head.val == head.next.val) {
                        head = head.next;
                    }

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
