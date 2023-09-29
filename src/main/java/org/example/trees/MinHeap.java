package org.example.trees;

import java.lang.module.FindException;

/*
*
* A min heap is an unordered complete binary tree, where each node can have at max two child elements
* It keeps elements ordered in descending value from root - children, so the root is always the minimum value
*
* A max heap would just be the vice versa of this
*
* */
public class MinHeap {

        // Our min heap needs to have basic functionality
        //Add, Delete, Peek
        //When you add/ remove an element you need to be able to resort your heap
        //You can add helper methods, heapifyDown() or heapifyUp()
        int size;
        int[] items;

        //Initializes our heap, to have an array size of the provided size
        public MinHeap(int size){
                this.size = size;
                items = new int[size];
        }

        //We're also going to add methods to provide help in retrieving child and parent nodes
        private int getParentIndex(int index){
                int parentInd = (index - 1)/2; // Why does this give us the parent index?
                return parentInd;
        }
        private int getLeftChildIndex(int index){
                int leftChildInd = (index * 2) + 1;
                return leftChildInd;
        }
        //Think about positioning in an array - to deduce why this works
        private int getRightChildIndex(int index){
                int rightChildIndex = (index * 2) + 2;
                return rightChildIndex;
        }

        //When adding an element to the heap - it's preffered to add it to the end of the array, then bubble up to sort
        //This is because, if you were to swap with the root, then bubble down, it would be a lot more complex to implement
        //Even though the runtimes are not much different

}
