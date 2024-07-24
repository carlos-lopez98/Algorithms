package org.example.linkedlist;

import org.example.practice.Node;

import java.util.HashSet;
import java.util.Set;

/*
 * Write code to remove duplicates from an unsorted linked list
 *
 * How would you solve this problem if a temporary buffer is not allowed?
 * */

public class RemoveDups {
    //Edge cases - if list is empty - if no dupes are found
    public Node algoOne(Node head) {

        //Return the same node if it's null
      if(head == null){
          return head;
      }

     Node previousNode = head;
     Node currentNode = head.next;

     //This keeps track of duplicates
     Set<Integer> duplicateSet = new HashSet<>();

     //Add the first value since we're starting at the second iteration
     duplicateSet.add(previousNode.data);

     //This will iterate through our linkedlist
     while(currentNode != null){

         if(duplicateSet.contains(currentNode.data)){
             previousNode.next = currentNode.next;
             currentNode = currentNode.next;
         }else{
             duplicateSet.add(currentNode.data);
             previousNode = currentNode;
             currentNode = currentNode.next;
         }
     }
        return head;
    }
}
