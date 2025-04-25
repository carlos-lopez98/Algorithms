package org.example.linkedlist;

public class RemoveNthNodefromEndofList {

     public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }

 }

    int counter = 0;
    public ListNode removeNthFromEnd(ListNode head, int n) {

            ListNode curr = head;

            head = removeNth(curr, n);

        return head;
    }

    public ListNode removeNth(ListNode head, int n){

        //We essentially return the head in each iteration
         if(head.next != null){
            head.next =  removeNth(head.next, n);
         }

         //but we skip when the counter is equal to n on the way back up
        //during the backtracking part
         counter++;
         if(counter == n){
             return head.next;
         }

         //we return the head like normal
         return head;
    }
}
