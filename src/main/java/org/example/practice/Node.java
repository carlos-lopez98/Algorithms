package org.example.practice;

public class Node {
    Node next = null;
    int data;

    public Node(int d){
        data = d;
    }
    void appendToTail(int d){
        Node end = new Node(d);
        Node n = this;

        while(n.next != null){
            n = n.next;
        }
        n.next= end;
    }

    //This method is meant to delete a node that holds specific data
    //Input: Head node reference to a linkedlist, and data to delete
    public Node deteteNode(Node head, int data){

        if(head == null) return null;

        Node n = head;

        //Returns a new head reference, effectively deleting it
        //Since there will be no future references to it, the garbage collector will eventually remove it from memory
        if(n.data == data){
            return head.next;
        }

        while(n.next != null){
            //You're technically not deleting the nodes
            //We're just removing it's link in the list, which in turn will be cleaned up by the garbage collector
         if(n.next.data == data){
             n.next = n.next.next;
             return head;
         }
         //Notice how we're only moving the position of n, we're always going to return the head reference, when removing
         //a node that's not the head
          n = n.next;
        }
        return head;
    }
}
