package org.example.stacks;


import java.sql.SQLOutput;
import java.util.Stack;

/**
 * Implement three stacks using an array
 */
public class ThreeInOne {


    public int[] threeStack;
    public int stackSize;
    private StackOne one;
    public StackTwo two;
    public StackThree three;


    //This will initialize our max stack size per stack
    public ThreeInOne(int stackSize){
        threeStack = new int[3 * stackSize];
        this.stackSize = stackSize;
        one = new StackOne();
        two = new StackTwo();
        three = new StackThree();
    }


    //Offset for this one is 0
    public class StackOne{
        private int top;
        private int offset = 0;

        StackOne(){
            top = stackSize * offset;
        }

        public int pop(){
            if (isEmpty()){
                throw new RuntimeException("StackOne is empty, Nothing to pop");
            }

            int data = threeStack[top - 1];

            top -= 1;
            return data;
        }

        public void push(int data){

            if(isFull()){
                System.out.println("StackOne is full");
                return;
            }

            threeStack[offset * stackSize + top] = data;
            top++;
        }

        public boolean isEmpty(){
            if(top - offset == 0){
                return true;
            }
            return false;
        }

        public boolean isFull(){
            if(top - (stackSize*offset) >= stackSize){
                return true;
            }
            return false;
        }
    }

    //Offset for this one is 1
    private class StackTwo{
        private int top;
        private int offset = 1;

        StackTwo(){
            this.top = offset*stackSize;
        }

    }

    //Offset for this one is 2
    private class StackThree{
        private int top;
        private int offset = 2;

        StackThree(){
            this.top = offset * stackSize;
        }
    }

    public StackOne getOne() {
        return one;
    }

    public StackTwo getTwo() {
        return two;
    }

    public StackThree getThree() {
        return three;
    }
}

/**
 * Here we created an outer threeStack class, that chas threee inner stack classes, each class responsible for creating
 * Stack One, two and three, we keep track of each stack's respective position in our array, by using the offset value
 * and size of the respective stack
 */
