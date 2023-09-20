package org.example.stacks;

/*
*
* Generic StackNode class
*
* */

//Notice how the T goes in the signature variables and even methods
public class StackNode<T> {
    public T data;
    public StackNode<T> next;

    public StackNode(T d) {
        this.data = d;
    }
}
