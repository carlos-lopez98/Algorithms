package org.example.linkedlist;

import org.example.practice.Node;

public class MergeTwoSortedLists {


        public Node mergeTwoLists(Node one, Node two){

            //Checks for linkedlists being empty
            if(one == null && two == null){
                return null;
            } else if( one == null){
                return two;
            }else if(two == null){
                return one;
            }

            //Creates a temp head/ tail to store our head
            Node tempHead = null;
            Node tempTail = null;

            while(one != null && two != null){
                if(one.data <= two.data){
                    if(tempHead == null){
                        //tempHead = 1
                        //tempTail = 1
                        tempHead = new Node(one.data);
                        tempTail = tempHead;
                        one = one.next;
                    }else{
                        Node temp = new Node(one.data);
                        tempTail.next = temp;
                        tempTail = tempTail.next;
                        one = one.next;
                    }
                } else {
                    if(tempHead == null){
                        tempHead = new Node(two.data);
                        tempTail = tempHead;
                        two = two.next;
                    }else{
                        Node temp = new Node(two.data);
                        tempTail.next = temp;
                        tempTail = tempTail.next;
                        two = two.next;
                    }
                }
            }

            if(one == null){
                tempTail.next = two;
            }else if(two == null){
                tempTail.next = one;
            }

            return tempHead;
        }
}
