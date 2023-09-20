package org.example.stacks;

/*
*
* Utilizing Generics again to be able to work with any type on our stack
*
* */
public class MyStack<T> {

    private StackNode<T> top;


    //Pop you want to return the top node, but also move your top pointer to the next node
    public StackNode<T> pop(){
        if(top == null){
            return null;
        }else{
            StackNode<T> temp = this.top;
            top = top.next;

            return temp;
        }
    };

    //Returns the data, but pops the top element
    public T popData(){
        if(top == null){
            return null;
        }else{
            T tempData = this.top.data;
            top = top.next;

            return tempData;
        }
    }

    //You want to return the data of the top node
    //Not pop it off - Check for edge cases - What if top node is null?
    public T peek(){
        if(top!=null){
            return top.data;
        }
        return null;
    };

    //We want it to return true if it's null
    public boolean isEmpty(){
        return top == null;
    };


    //Push should be able to push a new Node as well as the data
    public push(T data){

    };
    public push(StackNode<T> Node){


    }
}


