package org.example.stacks;


/**
 * Implement three stacks using an array
 */
public class ThreeInOne {


    public int[] threeStack;


    //This will initialize our max stack size per stack
    public ThreeInOne(int stackSize){
        threeStack = new int[3 * stackSize];

    }


    //Offset for this one is 0
    private class StackOne{

    }

    //Offset for this one is 1
    private class StackTwo{

    }

    //Offset for this one is 2
    private class StackThree{

    }
}
