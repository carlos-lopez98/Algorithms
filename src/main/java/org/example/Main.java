package org.example;

import org.example.practice.MultiDimensionalArrays;
import org.example.practice.Node;
import org.example.practice.ReturnKthtoLast;
import org.example.practice.SinglyLinkedList;
import org.example.practice.reference_type.Person;

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

        DeleteMiddleNode delete = new DeleteMiddleNode();

        Node nodeOne = new Node(1);
        Node nodeTwo = new Node(2);
        Node nodeThree = new Node(3);
        Node nodeFour = new Node(4);
        Node nodeFive = new Node(5);

        nodeOne.next = nodeTwo;
        nodeTwo.next = nodeThree;
        nodeThree.next = nodeFour;
        nodeFour.next = nodeFive;

        delete.algoOne(nodeThree);

        System.out.println(nodeThree.next.data);
    }
}