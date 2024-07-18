package org.example.arrays;

public class BasicArrayOperations {

/**
 * Create an array
 */
    public int[] createIntArray(int one, int two, int three, int four, int five){

        return new int[]{one, two, three, four, five};
    }

/**
 * Access Elements
 */

    public void printFirstElement(int[] nums){
        System.out.println(nums[0]);
    }

    public void printLastElement(int[] nums){
        System.out.println(nums[nums.length-1]);
    }

/**
 * Change Value
 */

    public static void changeElementAtIndex(int[] nums, int index, int value){

        for(int i = 0; i < nums.length; i++){

            if(i == index){
                nums[i] = value;
            }
        }

    }
}
