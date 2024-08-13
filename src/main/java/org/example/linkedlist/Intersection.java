package org.example.linkedlist;

import org.example.practice.Node;

/**
 * Given two (singly) linked lists, determine if the two lists intersect. Return the
 * Intersecting node. Note that the intersection is defined based on reference, not value.
 * That is, if the kth node of the first linked list is the exact same node (by reference)
 * as the jth node of the second linked list, then they are intersecting.
 */
public class Intersection {
 public static Node intersectionLinkedList(Node headOne, Node headTwo){

     if(headOne == null || headTwo == null){
         return null;
     }

     Node one = headOne;
     Node two = headTwo;

     int lengthOne = getLength(headOne);
     int lengthTwo = getLength(headTwo);

     if(lengthOne == lengthTwo){
         return returnIntersectingEqual(one, two);
     }else if(lengthOne > lengthTwo){
         return returnIntersectingDifferentLengths(two, one, lengthOne - lengthTwo);
     }else{
         return returnIntersectingDifferentLengths(one, two, lengthTwo - lengthOne);
     }
 }

 //Returns the length of each linkedlist
 public static int getLength(Node head){
     Node current = head;
     int length = 0;

     while(current != null){
         current = current.next;
         length++;
     }

     return length;
 }

 //Returns Intersecting Node if lengths are equal
 public static Node returnIntersectingEqual(Node headOne, Node headTwo){

     Node one = headOne;
     Node two = headTwo;

     while (one != null){
         if(one == two){
             return one;
         }
         one = one.next;
         two = two.next;
     }

     return null;
 }

 public static Node returnIntersectingDifferentLengths(Node shortList, Node longList, int difference){

     Node shorter = shortList;
     Node longer = longList;

     int position = 0;

     while(position != difference){
         longer = longer.next;
         position++;
     }

     return returnIntersectingEqual(shorter, longer);
 }
}

/**
 * With this one, you're checking to see if both linkedlists meet at a node, you're checking if both lists'
 * Reference the same node, you're not only checking if the nodes have the same data value
 * But if they both reference the same node
 *
 * Since both lists could potentially be different lengths, we need a way to start the pointers at the same positions
 * This way you can check if either node matches each other
 */
