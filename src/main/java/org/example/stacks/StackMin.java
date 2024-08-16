package org.example.stacks;

/*
*
* How would you design a stack which, in addition to push and pop, has a function min
* which returns the minimum element? Push, pop and min should all operate in O(1) time.
*
* */

public class StackMin {

    public StackNodeMin top;


    public void push(int data){
        StackNodeMin temp = new StackNodeMin(data);
        if(isEmpty()){
            top = temp;
            top.min = data;
            return;
        }
        temp.next = top;
        if(temp.data <= top.data){
            temp.min = temp.data;
        }else{
            temp.min = top.data;
        }
        top = temp;
    }

    public StackNodeMin pop(){
        if(isEmpty()){
            throw new RuntimeException("stack is empty cannot pop");
        }

        StackNodeMin temp = top;
        top = top.next;

        return temp;
    }

    public int peekMin(){
        if(isEmpty()){
            throw new RuntimeException("List is empty, no min to retrieve");
        }

        return this.top.min;
    }

    public int peekNode(){
        if(isEmpty()){
            throw new RuntimeException("List is empty, nothing to retrieve");
        }

        return top.data;
    }

    public boolean isEmpty(){
        if(this.top == null){
            return true;
        }

        return false;
    }

    public class StackNodeMin{

        StackNodeMin next;
        int data;
        int min;

       public StackNodeMin(int data){
            this.data = data;
        }
    }

}

/**
 * This one would be easy you just create an extra variable inside the individual nodes, you'd only have to keep track
 * Of the minimum position at each node addition, when you pop, that node goes away, and the min value will now
 * Be in the top node of the remaining stack
 *
 */