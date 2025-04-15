package org.example.sorting;

public class SortanArray {
    public int[] sortArrayHeap(int[] nums) {

        //First what you do is you turn your array into a max heap
        //If you think about what a max heap is
        //It's just a binary tree, where the parent node is always greater than
        //Both of it's children
        //The way this looks in an array - is the array now has the greatest element at the index of 0
        //So first you heapify - your entire array
        //In this for loop you only go up to nums.length/ 2  - 1, because positions after that are already
        //leaf nodes only, so that heap property is already verified
        for (int i = nums.length / 2 - 1; i >= 0; i--) {
            maxHeapify(nums, nums.length, i);
        }

        //After heapifing your entire array
        //Your position at 0 in the array is the greatest element
        //You can simply perform a swap now with the final element
        for (int i = nums.length - 1; i > 0; i--) {
            // swap last element with first element
            int temp = nums[i];
            nums[i] = nums[0];
            nums[0] = temp;

            //Now we can heapfiy the rest of the array, but exclude the final element
            //Since it's been sorted
            maxHeapify(nums, i, 0);
        }

        return nums;
    }

    //This is where the magic happens
    private void maxHeapify(int[] arr, int heapSize, int index) {

        //This is how you get the children of your ith index within an array
        //You have to remember that in a max heap - your array
        //Then becomes a binary tree representation - well a complete binary tree
        int left = 2 * index + 1;
        int right = 2 * index + 2;
        int largest = index;

        //Heapsize is used to make sure that our left and right indexes
        //Don't go out of bounds

        //First check if the left index - is out of bounds
        //Check if our left is larger than our current
        //If it is move our current down
        if (left < heapSize && arr[left] > arr[largest]) {
            largest = left;
        }

        //Check if the right index is out of bounds
        //Second check if our element is larger than it's right child
        //If it is move it down
        if (right < heapSize && arr[right] > arr[largest]) {
            largest = right;
        }

        //If largest is not the input index
        //We can perform a swap
        if (largest != index) {
            int temp = arr[index];

            //Move our largest up
            arr[index] = arr[largest];

            //Swap with the current index
            arr[largest] = temp;

            //Recursively go down the tree to ensure
            //We're maintaining the max-heap structure
            maxHeapify(arr, heapSize, largest);
        }
    }

    public int[] sortArrayMergeSort(int[] nums) {

        return null;
    }
}
