package Testing;

import Testing.TestSetOne.Intersection;
import org.example.practice.Node;

public class Main {
    public static void main(String[] args) {

        Node one = new Node(5);
        Node two = new Node(7);
        Node three = new Node(10);
        Node four = new Node(2);
        Node five = new Node(17);

        Node second = new Node(19);
        Node third = new Node(21);


        one.next = two;
        two.next = three;
        three.next = four;
        four.next = five;

        second.next = third;
        third.next = four;

        System.out.println(Intersection.returnIntersecting(one, second).data);

    }
}
