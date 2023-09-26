package org.example;

import java.util.Stack;

/*
* Write a program to sort a stack such that the smallest items are on top. You can use an additional temporary stack,
* but you may not copy the elements into any other data structure (such as an array)
* The stack supports the following operations: push, pop, peek and isEmpty()
* */
public class SortStack {


    //Since this algorithm is being done in place no need to return anything

    public void algoOne(Stack<Integer> unsorted){
        //Temporary Stack used for Sorting
        Stack<Integer> tempStack = new Stack<>();

        //Use a while loop because we want to go through all elements to make sure they get sorted
        while(!unsorted.isEmpty()){
            //Hold an element from the first stack to compare to tempStack
            int compare = unsorted.pop();

            //If it's not empty it'll compare and push items from temp to the old stack
            while(!tempStack.isEmpty() && tempStack.peek() > compare){
             unsorted.push(tempStack.pop());
            }

            //If it is empty/ elements on temp stack are less than temp variable,
            //it'll just push the items from the old stack to the tempStack
            tempStack.push(compare);
        }
    }
}
