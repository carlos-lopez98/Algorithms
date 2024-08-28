package org.example;

import org.example.SortAlgorithms.QuickSort;


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

        int[] array = new int[]{20, 35, -15, 7, 55, 1, -22};
        QuickSort.quickSort(array, 0, array.length);

        for(int num: array){
            System.out.print(num + " ");
        }
    }
}