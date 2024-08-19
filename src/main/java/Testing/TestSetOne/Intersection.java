package Testing.TestSetOne;

import org.example.practice.Node;

/**
 * Given two (singly) linked lists, determine if the two lists intersect. Return the intersecting node. Note that
 * the intersection is defined based on reference, not value. That is, if the kth node of the first linked list
 * is the exact same node (by reference) as the jth node of the second linked list, then they are intersecting.
 */
public class Intersection {


    //Method takes in two heads
    public static Node returnIntersecting(Node one, Node two){
        if(one == null || two == null){
            return null;
        }
        int difference;
        int counter = 0;
        Node longer;
        Node shorter;

        int  lengthOne = returnLength(one);
        int lengthTwo = returnLength(two);

        if(lengthOne > lengthTwo){
            longer = one;
            shorter = two;

            difference = lengthOne - lengthTwo;
        } else{
            shorter = one;
            longer = two;
            difference = lengthTwo - lengthOne;
        }

        while (counter < difference){
            longer = longer.next;
            counter++;
        }

        while (longer != null && shorter != null){
            if(longer == shorter){
                return longer;
            }

            longer = longer.next;
            shorter = shorter.next;
        }

        return null;
    }

    public static int returnLength(Node head){
        Node current = head;
        int length = 0;

        while(current != null){
            length++;
         current = current.next;
        }
        return length;
    }

    public int returnShorter(int one, int two){
        return Math.min(one, two);
    }
}

/**
 * I need to check which string is shorter than the other to get a difference, then the longer string, will have to
 * iterate until the difference is met, then both strings can now start iterating.
 */
