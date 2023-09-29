package org.example.trees;

import java.lang.module.FindException;
import java.net.BindException;
import java.util.Arrays;

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
        int capacity;
        int[] items;

        //Initializes our heap, to have an array size of the provided size
        public MinHeap(int size){
                this.capacity = size;
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

        private void ensureCapacity(){
                //This will make sure we have enough space to add new elements
                if(size == capacity){
                        items = Arrays.copyOf(items, items.length * 2);
                }
        }

        //This is how we retrieve and remove the minimum value
        //After the retreival we want to sort the array, back to descending values
        public int poll(){
                if(items == null){
                        throw new RuntimeException();
                }

                int min = items[0];
                items[0] = items[size - 1];
                //We want to keep track of our size, to ensure we add properly to the end of the list
                size--;

                heapifyDown();
                return min;
        }

        public void add(int value){
                //Make sure we have enough space in our array to add
                ensureCapacity();

                //Add item to last position
                items[size] = value;
                //Size moves up one position
                size++;
                //Then re-sort the array
                heapifyUp();
        }


        //This will be the helper method used to sort down
        private void heapifyDown(){






        }

        //This will be the helper method used to sort up
        private void heapifyUp(){
                int index = size - 1;

             while(hasParent(items[index]) && items[getParentIndex(index)] > items[index]){
                     //Swap parent with current


             }




        }

        //Checks if current element has as parent element
        private boolean hasParent(int index){
                if(getParentIndex(index) > -1){
                        return true;
                }else{
                       return false;
                }
        }

        //Performs a swap between two values in the items array
        private void swap(int indexOne, int indexTwo){
                int value = items[indexOne];
                items[indexOne] = items[indexTwo];
                items[indexTwo] = value;
        }
}
