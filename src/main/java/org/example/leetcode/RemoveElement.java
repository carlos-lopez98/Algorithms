package org.example.leetcode;



/*
Given an integer array nums and an integer val,
remove all occurrences of val in nums in-place.
The order of the elements may be changed.

Then return the number of elements in nums which are not equal to val.

Consider the number of elements in nums which are not equal to val be k,
to get accepted, you need to do the following things:

---Change the array nums such that the first k elements of nums contain the
elements which are not equal to val. The remaining elements of nums are
not important as well as the size of nums.

---Return k.
 */


public class RemoveElement {


    //One important note to remember here is that it doesn't matter if you keep the removed elements in the array
    //You only need to return the length of the elements that belong in the array
    public int removeElement(int[] nums, int val) {

        int firstPointer = 0;


        for(int i = 0; i < nums.length ; i++){

            if(nums[i] != val){
                int temp = nums[i];
                nums[firstPointer] = temp;

                firstPointer++;
            }
        }

        return firstPointer;
    }
}


//Questions
//Knowing the above makes the problem way easier
//What approach can we take here?
//How many for loops do we need?
//What Variables do we need to keep track of?
//What and why do we return?