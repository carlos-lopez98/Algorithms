package org.example;

import org.example.practice.MultiDimensionalArrays;
import org.example.practice.Node;
import org.example.practice.ReturnKthtoLast;
import org.example.practice.SinglyLinkedList;
import org.example.practice.reference_type.Person;
import org.example.trees.Tree;
import org.example.trees.TreeNode;

public class Main {
    public static void main(String[] args) {

//        //String Compression
//        System.out.println(StringCompression.algoOne("aaaabbcc"));
//        System.out.println(StringCompression.algoOne("aaaaaaa"));
//        System.out.println(StringCompression.algoOne("Carlos"));
//        System.out.println(StringCompression.algoOne("AABBBCC"));

//        int[][] matrix = {{1,2,3},
//                          {4,5,6},
//                          {7,8,9}};
//
//        //Excersises Accessing Elements
//        //2nd Column third row
//        System.out.println(matrix[2][1]); //8
//        //3rd Column second row
//        System.out.println(matrix[1][2]); //6
//        //Last row, second column
//        System.out.println(matrix[2][1]); //8
//        //Last row, third column
//        System.out.println(matrix[2][2]); //9
//        //First Column, First Row
//        System.out.println(matrix[0][0]); //1
//        //First Column, Second Row
//        System.out.println(matrix[1][0]); //4
//
//        MultiDimensionalArrays.printIndicesByColumn();
//            MultiDimensionalArrays.sumColumns();


//        //These objects reference the same address - Whenever a change is made to one object - you update both...
//        Person personOne = new Person("Carlos");
//        Person personTwo = personOne;
//
//        System.out.println(personOne.getName());
//        System.out.println(personTwo.getName());
//
//        personOne.setName("Naomi");
//
//        System.out.println("Person One: " + personOne.getName());
//        System.out.println("Person Two: " + personTwo.getName());
//
//        personTwo.setName("Jack");
//
//        System.out.println("Person One: " + personOne.getName());
//        System.out.println("Person Two: " + personTwo.getName());
//
//        personOne.setName("April");
//
//        System.out.println("Person One: " + personOne.getName());
//        System.out.println("Person Two: " + personTwo.getName());


//        String test = new String("Carlos");
//
//        for(int i = 0; i < 10; i++){
//            //Concat returns a new string everytime - based on the original test string
//            String current = test.concat(String.valueOf(i));
//            current = test.concat(String.valueOf(i + 1));
//            System.out.print(" " + current + " ");
//        }

//        //KthToLast Test
//        SinglyLinkedList list = new SinglyLinkedList();
//        // Append 15 elements to the list
//        for (int i = 1; i <= 15; i++) {
//            list.append(i);
//        }
//        ReturnKthtoLast instant = new ReturnKthtoLast();
//        System.out.println(instant.algoOne(list.head, 1).data);

        //Delete Middle Node
//        DeleteMiddleNode delete = new DeleteMiddleNode();
//
//        Node nodeOne = new Node(1);
//        Node nodeTwo = new Node(2);
//        Node nodeThree = new Node(3);
//        Node nodeFour = new Node(4);
//        Node nodeFive = new Node(5);
//
//        nodeOne.next = nodeTwo;
//        nodeTwo.next = nodeThree;
//        nodeThree.next = nodeFour;
//        nodeFour.next = nodeFive;
//
//        delete.algoOne(nodeThree);
//
//
//        while(nodeOne.next !=null){
//            System.out.println(nodeOne.next.data);
//
//            nodeOne = nodeOne.next;
//        }


//        3 -> 5 -> 8 -> 5 -> 10 -> 2 -> 1 [x=5]
//        //Partition
//        Node nodeOne = new Node(3);
//        Node nodeTwo = new Node(5);
//        Node nodeThree = new Node(8);
//        Node nodeFour = new Node(5);
//        Node nodeFive = new Node(10);
//        Node nodeSix = new Node(2);
//        Node nodeSeven = new Node(1);
//
//        nodeOne.next = nodeTwo;
//        nodeTwo.next = nodeThree;
//        nodeThree.next = nodeFour;
//        nodeFour.next = nodeFive;
//        nodeFive.next = nodeSix;
//        nodeSix.next = nodeSeven;
//
//
//        Partition partition = new Partition();
//
//        Node head = partition.algoOne(nodeOne, 5);
//
//        while(head != null){
//            System.out.println(head.data);
//
//            head = head.next;
//        }
//    }


//        //FindCommonElements Implementation
//        int[] one = new int[]{1, 5, 10, 20, 40, 80};
//        int[] two = new int[]{6, 7, 20, 80, 100};
//        int[] three = new int[]{3, 4, 15, 20, 30, 70, 80, 120};
//
//        FindCommonElements elements = new FindCommonElements();
//        elements.algoOne(one, two, three);


//        //MajorityElement in SortedArray
//        int arr[] = {1, 2, 3, 3, 3, 3, 10};
//        int n = arr.length;
//        int x = 3;
//
//        MajorityElement element = new MajorityElement();
//        if (element.isMajority(arr, n, x)==true) {
//
//            System.out.println(x + " appears more than "+
//                    n/2 + " times in arr[]");
//        } else {
//            System.out.println(x + " does not appear more than " +
//                    n/2 + " times in arr[]");
//        }


        TreeNode root = new TreeNode();
        root.name = "root";
        TreeNode nodeB = new TreeNode();
        nodeB.name = "nodeB";
        TreeNode nodeC = new TreeNode();
        nodeC.name = "nodeC";
        TreeNode nodeD = new TreeNode();
        nodeD.name = "nodeD";
        TreeNode nodeE = new TreeNode();
        nodeE.name = "nodeE";
        TreeNode nodeF = new TreeNode();
        nodeF.name = "nodeF";
        TreeNode nodeG = new TreeNode();
        nodeG.name = "nodeG";
        TreeNode nodeH = new TreeNode();
        nodeH.name = "nodeH";
        root.children.add(nodeB);
        root.children.add(nodeC);
        root.children.add(nodeD);
        nodeB.children.add(nodeE);
        nodeB.children.add(nodeF);
        nodeC.children.add(nodeG);
        nodeD.children.add(nodeH);

        Tree.postOrderTraversal(root);



    }
}