package Testing.TestSetOne;

import org.example.practice.Node;

/**
 * Write code to partition a linkedlist around a value x, such that all nodes less than x come before all nodes
 * greater than or equal to x. (IMPORTANT) The partition element x can appear anywhere in the "right partition"
 * , it does not need to appear between the left and right partitions. The additional spacing in the example below
 * indicates the partition. Yes, the output below is one of many valid outputs!
 *
 * 3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 (partition = 5)
 *
 * 3 ->1 -> 2 -> 10 -> 5 -> 5 -> 8
 */
public class Partition {

    public static Node partition(Node head, int partition){
        //Returns null if the input is null
        if(head == null){
            return null;
        }
        Node leftHead = null;
        Node leftTail = null;
        Node rightHead = null;
        Node rightTail = null;

        while(head != null){

            Node temp = new Node(head.data);
            //If less then add to left side
            if(head.data < partition){
                if(leftHead == null){
                    leftHead = temp;
                    leftTail = leftHead;
                }else{
                 leftTail.next = temp;
                 leftTail = leftTail.next;
                }

            }
            //If greater add to right side
            else{
                if(rightHead == null){
                    rightHead = temp;
                    rightTail = rightHead;
                }else{
                    rightTail.next = temp;
                    rightTail = rightTail.next;
                }
            }
            head = head.next;
        }

        leftTail.next = rightHead;

        return leftHead;
    }
}
/**
 * The solution for this one involves creating two separate lists, then combining them together at the end
 * In order to do this successfully, you need to combine the tail of the left list with the head of the right list
 */