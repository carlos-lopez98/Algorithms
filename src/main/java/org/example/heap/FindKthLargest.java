package org.example.heap;

import java.util.PriorityQueue;

//This is the classic min heap solution
//Using a priority queue add all elements onto the queue
//The original implementation of the priority queue will place elements
//Into the queue in ascending fashion
//Therfore when you have a queue larger than size k, you're popping a smaller element

//At the end, you're left with a min heap exactly of length k - which the first element in the queue is
//The kth largest element
public class FindKthLargest {

    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        //Add all elements to the priority queue
        for(int num: nums){
            minHeap.add(num);

            //This ensures our kth largest becomes the first element in the resulting heap
            if(minHeap.size() > k){
                minHeap.remove();
            }
        }

        //Return the first element
        return minHeap.peek();
    }
}
