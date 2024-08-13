package org.example.linkedlist;

import org.example.practice.Node;

/*
* Given two (singly) linked lists, determine if the two lists intersect. Return the intersecting node
* . Note that the intersection is defined by reference , not value. That is, if the kth node of
* the first linked list is the exact same node (by reference) as the jth node of the second linked list,
* then they are intersecting.
* */
public class IntersectionLinkedList {

        //Get the difference of each list -- this will give you where the pointer should start in the greater list
        public static Node intersection(Node headOne, Node headTwo){
            Node intersecting = null;
            Node pointerListOne = headOne;
            int sizeListOne = 0;

            Node pointerListTwo = headTwo;
            int sizeListTwo = 0;

            while(pointerListOne != null){
                sizeListOne++;
                pointerListOne = pointerListOne.next;
            }

            while(pointerListTwo != null){
                sizeListTwo++;
                pointerListTwo = pointerListTwo.next;
            }

            pointerListOne = headOne;
            pointerListTwo = headTwo;

            System.out.println("listTwoSize " + sizeListTwo);
            System.out.println("listOneSize " + sizeListOne);

            if(sizeListOne > sizeListTwo){
               int difference = sizeListOne - sizeListTwo;
               int counter = 0;

               while(counter != difference && pointerListOne != null){
                   pointerListOne = pointerListOne.next;
                   counter++;
               }
            }else if(sizeListTwo > sizeListOne){
                int difference = sizeListTwo - sizeListOne;
                int counter = 0;

                while(counter != difference && pointerListOne != null){
                    pointerListTwo = pointerListTwo.next;
                    counter++;
                }
            }


            while(pointerListTwo !=null && pointerListOne !=null){
                if(pointerListOne == pointerListTwo){
                    return pointerListOne;
                }
                pointerListOne = pointerListOne.next;
                pointerListTwo = pointerListTwo.next;
            }


            return intersecting;
        }



        //TODO implement another solution, how can you have the pointers meet without knowing the difference in the lists
        //You can reset the pointers**
}
