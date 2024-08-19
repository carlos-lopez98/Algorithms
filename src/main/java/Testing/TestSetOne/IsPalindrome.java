package Testing.TestSetOne;

import org.example.practice.Node;

/**
 * Implement a function to check if a linkedlist is a palindrome.
 */
public class IsPalindrome {
    static Node reversed;

    public static boolean isPalindrome(Node head){
        if(head == null){
            return false;
        }

        reverseList(head);
        while(reversed != null){
            if(reversed.data != head.data){
                return false;
            }
            reversed = reversed.next;
            head = head.next;
        }

        return true;
    }


    //This will reverse the list, as you're adding to the head and not the tail
    public static void reverseList(Node head){

        while(head != null){
            Node current = new Node(head.data);
            current.next = reversed;
            reversed = current;
            head = head.next;
        }

    }
}

/**
 * One way to check if something is a palindrome is to just reverse it, then compmare the new item with the old item
 */
