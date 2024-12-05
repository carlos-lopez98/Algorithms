package org.example;

import org.example.SortAlgorithms.*;
import org.example.linkedlist.MergeTwoSortedLists;
import org.example.practice.Node;
import org.example.trees.BinarySearchTree;
import org.example.trees.BinarySearchTreeNode;
import org.example.trees.Tree;

import java.sql.SQLOutput;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) {

        int[][] matrix = {
                {0, 1, 2, 3},
                {4, 5, 6, 7},
                {8, 9, 10, 11},
                {12, 13, 14, 15}
        };


        int[] newArray = {5, 3, 15, 10, 11, 7, 0};
        //{ 5, 3, 0, 10, 11, 7, 15}
        //{ 5, 3, 0, 10, 7, 11, 15}
        //{5, 3, 0, 7, 10, 11, 15}
        //
       BubbleSort.sortAscendingRightToLeft(newArray);
        for(int num: newArray){
            System.out.println(num +" ");
        }

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

//      Stack<Integer> intStack = new Stack<>();
//      intStack.push(10);
//      intStack.push(7);
//      intStack.push(15);
//      intStack.push(22);
//      intStack.push(3);

//
//      SortStack.sort(intStack);
//
//      while(!intStack.isEmpty()){
//          System.out.println(intStack.pop() + " ");
//      }

//        AnimalShelter shelter = new AnimalShelter();
//        Animal animal = new Animal();
//
//        Animal.Cat catOne = animal.new Cat(LocalDateTime.now());
//        Animal.Dog dogOne = animal.new Dog(LocalDateTime.now());
//
//        shelter.enQueue(catOne);
//        shelter.enQueue(dogOne);
//
//        System.out.println("Animal in front " + shelter.deQueueAny().getClass());

//        int[] array = new int[]{2, 5, 9, 8, 2, 8, 7, 10, 4, 3};
//        CountingSort.countSort(array, 2, 10);
//        System.out.println();
//        for(int num: array){
//            System.out.print(num + " ");
//        }

//        Node one = new Node(1);
//        Node two = new Node(2);
//        Node three = new Node(4);
//
//        one.next = two;
//        two.next = three;
//
//        Node secondOne = new Node(1);
//        Node secondTwo = new Node(3);
//        Node secondThree = new Node(4);
//
//        secondOne.next = secondTwo;
//        secondTwo.next = secondThree;
//
//        MergeTwoSortedLists mergeAlgo = new MergeTwoSortedLists();
//        Node newList = mergeAlgo.mergeTwoLists(one, secondOne);
//
//
//        while(newList != null){
//            System.out.print(newList.data + " ");
//            newList = newList.next;
//
//
//        }

//        int[] radixArray = {4725,4586,1330,8792,1594,5729};
//
//        RadixSort.radSort(radixArray,10,4);
//
//        System.out.println(Arrays.toString(radixArray));
//
//        BinarySearchTree intTree = new BinarySearchTree();
//        intTree.insert(25);
//        intTree.insert(20);
//        intTree.insert(15);
//        intTree.insert(27);
//        intTree.insert(30);
//        intTree.insert(29);
//        intTree.insert(26);
//        intTree.insert(22);
//        intTree.insert(32);
//
//
////
////        System.out.println(intTree.getValue(22).getData());
////        System.out.println(intTree.getValue(32).getData());
////        System.out.println(intTree.getValue(16).getData());
//
//
//        System.out.println(intTree.getMin());
//        System.out.println(intTree.getMax());



    }
}