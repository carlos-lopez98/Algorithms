package Testing.TestSetOne;

import org.example.practice.Node;

/**
 * Implement an algorithm to find the kth to last element of a singly linked list.
 * <p>
 * Input will be the head of the list and the kthToLast Position
 */
public class KthToLast {
    static Node kth;
    static int counter = 0;

    public static Node returnKthToLast(Node head, int k) {
        if (head == null) {
            return null;
        }

        setKth(head, k);

        return kth;
    }

    private static void setKth(Node head, int k) {
        if (head == null) {
            counter++;
            return;
        }

        setKth(head.next, k);
        if (k == counter) {
            kth = head;
        }
        counter++;
    }
}
