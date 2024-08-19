package Testing;

import Testing.TestSetOne.Intersection;
import Testing.TestSetOne.IsPalindrome;
import org.example.practice.Node;

public class Main {
    public static void main(String[] args) {

        /**
         * Test Set Problem One Intersection
         */
//        Node one = new Node(5);
//        Node two = new Node(7);
//        Node three = new Node(10);
//        Node four = new Node(2);
//        Node five = new Node(17);
//
//        Node second = new Node(19);
//        Node third = new Node(21);
//
//
//        one.next = two;
//        two.next = three;
//        three.next = four;
//        four.next = five;
//
//        second.next = third;
//        third.next = four;
//
//        System.out.println(Intersection.returnIntersecting(one, second).data);

                Node one = new Node(1);
                Node two = new Node(1);
                Node three = new Node(15);
                Node four = new Node(1);
                Node five = new Node(3);

            one.next = two;
            two.next = three;
            three.next = four;
            four.next = five;

        System.out.println(IsPalindrome.isPalindrome(one));
    }
}
