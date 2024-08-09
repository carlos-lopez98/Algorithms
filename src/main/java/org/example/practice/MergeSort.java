package org.example.practice;

public class MergeSort {


    // {2, 5, 3, 4, 1,7,8,10}
    public static void mergeSortAlgo(int[] nums, int start, int end) {

        //Base case, as this is a recursive algorithm
        if (end - start < 2) {
            return;
        }

        int midpoint = (start + end) / 2;
        //Partition all the way left
        mergeSortAlgo(nums, start, midpoint);

        //Partition all the way right
        mergeSortAlgo(nums, midpoint, end);
        merge(nums, start, midpoint, end);
    }

    public static void merge(int[] nums, int start, int mid, int end) {

        //Since each iteration is getting sorted as they merge
        //If an element on the right is greater than an element on the left
        //That automatically means, any elements further right will also be greater
        //Since we're sorting as we merge

        //If they're equal then obviously they're also in the correct position
        if(nums[mid] >= nums[mid -1]){
            return;
        }

        //Creates our temp array, used to store our temp values
        //Size end - start, gives us the correctly sized array
        int[] tempArray = new int[end - start];

        //These will be our pointers, i
        int i = start;
        int j = mid;
        int temp = 0;

        while(i < mid && j < end){

            //Having the equals, handles cases where elements are equal
            //If we don't put the equal then we'll miss elements
            //Something won't get added into our temp array
            if(nums[i] <= nums[j]){
                tempArray[temp] = nums[i];
                i++;
            }else if(nums[i] > nums[j]){
                tempArray[temp] = nums[j];
                j++;
            }
            temp++;
        }

        //Here we need to copy the any elements remaining on the left partition into the right partition
        //That means our copy position will be at temp, since we've been increasing temp for every element
        //That is inserted
        // {1, 5} {3, 4}

        // {1, 3, 4}

        //The below will copy over the five

        //This will copy any remaining elements in the left partition
        System.arraycopy(nums, i, nums, start + temp, mid - i);

        //This will copy everything over from temp to nums
        System.arraycopy(tempArray, 0, nums, start, temp);
    }
}

/**
 * Merge sort is a divide and conquer algorithm so first we need to partition
 */
