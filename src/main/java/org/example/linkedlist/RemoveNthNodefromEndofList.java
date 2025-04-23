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

         //Counter allows us to know what spot we're in in the linked list
         counter++;

         //but when we reach nth node
        //we return head.next - meaning we just removed the nth node
         if(counter == n){
             return head.next;
         }

         return head;
    }
}
