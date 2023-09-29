package org.example.trees;

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

}
