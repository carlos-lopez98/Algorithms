package org.example.leetcode;


/*
* You are given the heads of two sorted linked lists list1 and list2.
* Merge the two lists into one sorted list. The list should be made by splicing together the nodes of the first two lists.
* Return the head of the merged linked list.
* */

import org.example.practice.Node;

public class MergeTwoSortedLists {

    public static Node mergeTwoLists(Node listOne, Node listTwo){

        Node dummy = new Node();
        //MergePointer points to dummy and can ammend to it
        Node mergePointer = dummy;

        while(listOne != null && listTwo != null){

            if(listOne.data < listTwo.data){
                mergePointer.next = listOne;
                listOne = listOne.next;
            } else{

                mergePointer.next = listTwo;
                listTwo = listTwo.next;
            }

            mergePointer = mergePointer.next;
        }

        //Appends the remaining non-null nodes to the list if any are left
        if(listOne != null){
            mergePointer.next = listOne;
        }else{
            mergePointer.next = listTwo;
        }


        return dummy.next;
    }
}
