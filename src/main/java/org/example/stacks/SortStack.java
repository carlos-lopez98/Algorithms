package org.example.stacks;

import java.util.Stack;

/**
 * Write a program to sort a stack such that the smallest items are on the top. You can use an additional
 * temporary stack, but you may not copy the elements into any other data structure (such as an array). The stack
 * supports the following operations: push, pop, peek, and isEmpty.
 */
public class SortStack {

    //10, 7, 15, 22, 3
    //22, 15, 10, 7, 3
    public static void sort(Stack<Integer> input){
     Stack<Integer> tempStack = new Stack<>();

     //While the input is not empty
     while(!input.isEmpty()){
         int temp = input.pop();

         if(tempStack.isEmpty()){
             tempStack.push(temp);
         }else{
             while(!tempStack.isEmpty() && temp > tempStack.peek()){
                 input.push(tempStack.pop());
             }

             tempStack.push(temp);
         }
     }

     while(!tempStack.isEmpty()){
         input.push(tempStack.pop());
     }
    }
}
