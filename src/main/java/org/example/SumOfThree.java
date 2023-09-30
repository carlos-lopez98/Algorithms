package org.example;

/*
*
* Given an array of integers, nums, and an integer value, target, determine if there are any three integers
* in nums whose sum is equal to the target, that is, nums[i] + nums[j] + nums[k] == target.
* Return TRUE if three such integers exist in the array. Otherwise, return FALSE.
*
* */

public class SumOfThree {

    //For this one, think how we don't have to return indices, just true or false
    //For this one, we can sort the array based of of that giving us O(n log n) runtime to sort
    //After that you can do the three pointer method, where you keep one pointer at the start
    //Then based off of your target value you move the inner left pointer or the outer right one

    public boolean findThreeSum(int[] nums, int target){
        //Think about the end of your first pointer, we don't need to go to nums.length - 1 or nums.length -2, because
        //We have three pointers and if we were to go all the way through the array
        //The first pointer would stop at nums.length -3, second one would stop at nums.length -2 and third at nums.length -1
     for(int i = 0; i < nums.length - 2; i++){
         //You could rename the ints for readibality - left & right or low and high
         int j = i+1;
         int k = nums.length -1;
        //You could potentially use a for loop here,but while loop is more readible and concise
        while(j < k){
            int sum = nums[i] + nums[j] + nums[k];

            if(sum == target){
                return true;
            }else if(sum < target){
                j++;
            }else{
                k--;
            }
         }

     }
     return false;
    }
}
