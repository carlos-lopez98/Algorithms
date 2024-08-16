package org.example.stacks;

/*
*
* How would you design a stack which, in addition to push and pop, has a function min
* which returns the minimum element? Push, pop and min should all operate in O(1) time.
*
* */

public class StackMin {

    public StackNodeMin top;


    StackMin(){

    }

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
 * This one would be easy you just create an extra variabe besides top
 *
 * You could call this one min, everytime you push to the stack you just verify if this new value is the new min
 * Then if it is set it equal to min.
 *
 * Then when calling min, you just return the min value, this won't be able to pop() thoush, as the min value can be
 * In a position not at the top of our stack
 *
 * What happens when the min value is popped? How would you keep track of the new min value?
 */