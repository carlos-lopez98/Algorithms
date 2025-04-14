package org.example.heap;

import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;

//In Java heaps are represented by PriorityQueues
public class ConstructHeap {

    //Construct a minHeap
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();

    //Contruct a maxHeap
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

    //Construct a minheap with default values
    PriorityQueue<Integer> heapwValues = new PriorityQueue<>(Arrays.asList(3,1,2));


    //Inserting an element
    //When inserting into a heap all heap properties are preserved
    public void heapOperations(){
        minHeap.add(1);

        minHeap.add(5);
    }

}
