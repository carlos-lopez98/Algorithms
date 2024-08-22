package org.example;

import org.example.arrays.*;
import org.example.helper.Pair;
import org.example.linkedlist.*;
import org.example.linkedlist.DeleteMiddleNode;
import org.example.linkedlist.Partition;
import org.example.practice.*;
import org.example.practice.MergeSort;
import org.example.practice.RotateString;
import org.example.stacks.*;
import org.example.strings.*;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Stack;


public class Main {
    public static void main(String[] args) {

        int[][] matrix = {
                {0, 1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 11},
                {12, 13, 14, 15}
        };


//        Node head = new Node(1);
//        Node one = new Node(2);
//        Node two = new Node(3);
//        Node three = new Node(4);
//        Node four = new Node(5);
//
//        Node headTwo = new Node(15);
//        Node seven = new Node(17);
//
//        headTwo.next = seven; // 15 -> 17 -> 4 -> 5
//
//        head.next = one; // 1 -> 2 -> 3 -> 4 -> 5
//        one.next = two;
//        two.next = three;
//        three.next = four;
//
//
//        Node intersecting = Intersection.intersectionLinkedList(head, headTwo);
//        System.out.println(intersecting.data);

//        int[] nums = {2, 5, 3, 4, 1,7,8,10};
//
//
//        System.out.println(Arrays.toString(nums));


//        StackNode head = new StackNode(1);
//        StackNode one = new StackNode(2);
//        StackNode two = new StackNode(3);
//        StackNode three = new StackNode(4);
//        StackNode four = new StackNode(5);
//
//        MyStack<Integer> stack = new MyStack<Integer>();
//
//        stack.push(head);
//        stack.push(one);
//        stack.push(two);
//        stack.push(three);
//        stack.push(four);
//
//        while(!stack.isEmpty()){
//            System.out.println(stack.pop().data.toString());
//        }


//        StackMin minimumStack = new StackMin();
//
//
//
//        minimumStack.push(5);
//        minimumStack.push(33);
//        System.out.println("The minimum should be five result = " + minimumStack.peekMin());
//
//        minimumStack.push(1);
//        minimumStack.push(12);
//        System.out.println("The minimum should be one result = " + minimumStack.peekMin());
//        minimumStack.pop();
//        minimumStack.pop();
//        minimumStack.push(3);
//
//        System.out.println("The minimum should be threre result = " + minimumStack.peekMin());

//        StackOfPlates dinnerPlates = new StackOfPlates(2);
//
//        dinnerPlates.push(11);
//        dinnerPlates.push(15);
//
//        dinnerPlates.push(16);
//        dinnerPlates.push(11);
//
//        dinnerPlates.push(15);
//        dinnerPlates.push(16);
//
//        dinnerPlates.push(11);
//        dinnerPlates.push(15);
//
//        dinnerPlates.push(16);
//
//        System.out.println(dinnerPlates.popAt(0));
//        System.out.println(dinnerPlates.popAt(0));
//
//        System.out.println(dinnerPlates.topStack);
//
//        System.out.println(dinnerPlates.popAt(0));

        MyQueue queue = new MyQueue();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);

        System.out.println(queue.deQueue());
        System.out.println(queue.deQueue());
    }
}