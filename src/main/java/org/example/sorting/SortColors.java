package org.example.sorting;

public class SortColors {

    //This uses selection sort - O (n^2)
    public void sortColors(int[] nums) {

        for(int out = nums.length - 1; out > 0; out --){
            int largestIndex = 0;

            for(int inner = 0; inner <= out; inner++){
                if(nums[inner] > nums[largestIndex]){
                    largestIndex = inner;
                }

                if(inner == out){
                    swap(inner, largestIndex, nums);
                }
            }
        }

    }


    private void swap(int index, int maxIndex, int[] nums){
        int temp = nums[index];

        nums[index] = nums[maxIndex];
        nums[maxIndex] = temp;
    }
}
