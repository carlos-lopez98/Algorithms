package org.example;

import org.example.practice.Node;

/*
*
* Implement a function to check if a linked list is a palindrome
*
* */
public class PalindromeLinkedList {
    //A palindrome will be the same forwards and backwards
    //If a palindrome is a palindrome, then that means we'd only have to check half of the list
    //As the other half would = the first half

    public boolean algoOne(Node node){
        Node reversed = reverse(node);
        boolean isEqual = isEqual(node, reversed);
        return isEqual;
    }

    public Node reverse(Node node){
        Node head = null;

        while (node!= null){
            Node n = new Node(node.data);
            //First node's next will become null
            n.next = head;
            //Then head is moved to the next node
            head = n;
            //Finally we move the node on original list for the next iteration
            node = node.next;
        }
        return head;
    }

    //Once you reverse a list you can check to see if the new list is equal
    //You only have to check half
    public boolean isEqual(Node original, Node reversed){

        while(original != null && reversed != null){

            if(original.data != reversed.data){
                return false;
            }

            original = original.next;
            reversed = reversed.next;
        }


        //This is to ensure both the last nodes are null
        //If they both are, it means the lengths are the same
        //And all nodes didn't return false making them equal
        //We can Technically just return true as our lists will always be the same since we're reversing it first
        return original == null && reversed == null;
    }
}
