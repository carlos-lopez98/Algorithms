package org.example.practice;

public class MergeSort {
    //Partition the Array - This will be a recursive call
    //On the way back from the call stack, you'll merge

    //Merge function steps
    //1. Only handle merges when the right side is less than the left side, depending on how you're sorting
    //2. Create a temp array - This will store your elements in the correct order for the time being
    //3. You want two pointers - one on the left and one on the right
    // - If the one on the right is less than the one on the left, the one on the right
    // will be placed in the correct position on the temp array - for this you'll need a temp index
    // after the pointer on the right moves forward

    //Lastly, you'll merge your temp array back into the original array, take a moment to think how this will happen
    //You can


    //We want this method to do the partitioning
    public static void mergeSortAlgo(int[] nums, int start, int end) {

        //We need to have an edge case, we want our method to stop partitioning
        if(end - start < 2){
            return;
        }

        //This gives you the midpoint, within a partitioned array as well
        //That's why we don't just use the nums.length()
        int midpoint = (start + end)/ 2;

        mergeSortAlgo(nums, start, midpoint);

        mergeSortAlgo(nums, midpoint, end);

        merge(nums, start, midpoint, end);

    }

    public static void merge(int[] nums, int start, int mid, int end) {
        //break if the right partition is greater than the left partition
        //You use the or equal to, because if they're equal they're technically already in order
        if(nums[mid] >= nums[mid - 1]){
            return;
        }
        //This gives us a correctly sized temp array
        int[] tempArray = new int[end - start];

        int left = start;
        int right = mid;
        int temp = 0; //This one you start at the beginning

        //This will continue until you compare all elements
        while(left < mid && right < end){
            if(nums[left] > nums[right]){
                tempArray[temp] = nums[right];
                right++;
            }else if(nums[right] > nums[left]){
                tempArray[temp] = nums[left];
                left++;
            }
            temp++;
        }

        System.arraycopy(nums, left, nums, start + temp, mid - left);

        System.arraycopy(tempArray, 0, nums, start, temp);
    }
}

/**
 * Merge sort is a divide and conquer algorithm so first we need to partition
 */
