package org.example.stacks;

import java.util.Stack;

/*
*
* Utilizing Generics again to be able to work with any type on our stack
*
* */
public class MyStack<T> {

    private StackNode<T> top;


    //Removes the top from the stack, then makes top = to the next node
    public StackNode<T> pop(){

        if(this.isEmpty()){
            return null;
        }

        StackNode<T> temp = top;
        top = top.next;

        return temp;
    }

    //Adds to the top of the stack
    public void push(StackNode<T> push){
        if(this.isEmpty()){
            top = push;
        }else{
            StackNode<T> temp = new StackNode<>(push.data);
            temp.next = top;
            top = temp;
        }
    }

    public T peek(){
        if(this.isEmpty()){
            return null;
        }

        return top.data;
    }

    public boolean isEmpty(){
        return top == null;
    }
}
/**
 * PopNode()
 * PopData() - Also removes top node though
 * Peek()
 * Push()
 * IsEmpty()
 */

