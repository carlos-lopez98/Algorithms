package org.example.linkedlist;

public class RemoveNthNodefromEndofList {

     public class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }

 }

 //This is basically just a recursive algorithm returning the next node in the list
    //If we're at the node we need to skip, we can skip it by returning node.next
    int counter = 0;
    public ListNode removeNthFromEnd(ListNode head, int n) {

            ListNode curr = head;

            head = removeNth(curr, n);

        return head;
    }

    public ListNode removeNth(ListNode head, int n){
        //This moves all the way into our list
         if(head.next != null){

             //Cool trick with linkedlist in recursion
             //If you pass in the next node eventually that node will be null
             //You know you just hit the end of the list
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
