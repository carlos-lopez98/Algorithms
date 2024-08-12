package org.example.practice;


/*
 * Implement an algorithm to find the kth to last element of a singly linked list
 * */
public class ReturnKthtoLast {

    public static int count = 0;
    public static Integer kthData = null;

    public static int returnKthToLast(Node head, int kthToLast) {

        if (head == null) {
            throw new RuntimeException("Head cannot be null");
        }

        recurse(head, kthToLast);

        return kthData;
    }

    public static void recurse(Node head, int kthToLast) {

        if (head == null) {
            //Initialize to zero as this will be the null position after the last position in the linkedlist
            count = 0;
            return;
        }


        recurse(head.next, kthToLast);
        count++;
        if (count == kthToLast) {
            kthData = head.data;
        }
    }
}
/**
 * One way I can immediately think of is iterate through the linkedlist, to get the linked list size
 * Then on the second iteration loop through the list until you reach linkedlist size - k
 * Return this data
 * <p>
 * O(n) Runtime O(1) Space Complexity
 * <p>
 * Second way is with recursion
 * You'd recurse all the way through the string, on the way back counting spaces, once you reach k save the data
 * Return it at the end
 *
 * O(n) Runtime O(1) Space Complexity
 */
