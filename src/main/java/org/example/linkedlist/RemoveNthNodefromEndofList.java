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
        //This moves all the way into our list
         if(head.next != null){
            head.next =  removeNth(head.next, n);
         }

         //This starts incrementing on our way back
        //backtracking portion
         counter++;

         //Once we reach our wanted node
        //We skip it by returning head.next instead of head
         if(counter == n){
             return head.next;
         }

         return head;
    }
}
