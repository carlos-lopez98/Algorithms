package org.example.arrays;

import java.sql.SQLOutput;
import java.util.Arrays;

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


/**
 * Find the length of an array without the .length method
 */

    public static int findLength(int[] nums){

        int i = 0;

        for (int j: nums){
            i++;
        }

        return i;
    }


/**
 *Print all elements of the provided array
 */

    public static void printElements(int[] nums){
        for(int j : nums){
            System.out.println(j);
        }
    }

    /**
     * Print the sum of all elements in the array
     */

    public static void sumElements(int[] nums){
        int sum = 0;

        for(int j: nums){
            sum += j;
        }

        System.out.println(sum);
    }


    /**
     * Print the average of all elements within the array
      */

    public static void averageElements(int[] nums){
        if (nums.length == 0){
            System.out.println("Array does not contain any elements");
        } else{
            int sum = 0;

            for(int j: nums){
                sum += j;
            }


            System.out.println(sum/nums.length);
        }
    }


    /**
     * Find the minimum element in the array
      */

    public static void printMinimum(int[] nums){

        int minimum = nums[0];

        for(int j: nums){
            if(minimum > j){
                minimum = j;
            }
        }

        System.out.println(minimum);
    }

/**
 * Find the maximum element in the array
 */

    public static void printMax(int[] nums){

        int max = nums[0];

        for(int j: nums){
            if(j > max){
                max = j;
            }
        }

        System.out.println(max);
    }


    /**
     * Reverse the array and print
      */

    public static void printReversedArray (int[] nums){

        for(int i = 0, j = nums.length - 1; i < j; i++, j--){

            int temp = nums[j];
            nums[j] = nums[i];
            nums[i] = temp;
        }

        System.out.println(Arrays.toString(nums));
    }

    /**
     * Linear search, find an element in the array, print the index
      */

    public static void printIndexOfValue(int nums[], int value){

        for(int i = 0; i < nums.length; i++){

            if (nums[i] == value){
                System.out.println("index is " + i);
                break;
            }

            if(i == nums.length -1){
                System.out.println("Value not found");
            }
        }
    }

    /**
     * Count how many times a specific element appears in an array
      */

    public static void printCountOfValue(int nums[], int value){

        int counter = 0;

        for(int j: nums){

            if(value == j){
                counter++;
            }
        }

        System.out.println("Count of value = " + counter);

    }


    /**
     * Check if the int array is sorted
      */
    public static boolean isSorted(int nums[]){

        for(int j = 0, i = 1; j < nums.length - 1; i++, j++){
            if(nums[j] > nums[i]){
                return false;
            }
        }

      return true;
    }
    /**
     * Find and print the second largest element in the array
      */

    public static void printSecondLargestElement(int nums[]){

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0 ; i < nums.length; i++){
            if(nums[i] > max){
                secondMax = max;
                max = nums[i];
            }else if (nums[i] > secondMax && nums[i] < max){
                secondMax = nums[i];
            }
        }

        if(secondMax == Integer.MIN_VALUE){
         throw new ArithmeticException("No Second Largest Element Available");
        }

        System.out.println("Second Max Element = " + secondMax);
    }
    /**
     * Remove an element from an array
      */
    public static void removeAnElement(int[] nums, int valueToRemove){
        //If we're only removing one element, then we just need to create a new array of size nums.length - 1
        int[] updatedArray = new int[nums.length - 1];

        for(int i =0; i< nums.length; i++){

            if(nums[i] == valueToRemove && i+1 < nums.length){
                int temp = nums[i+1];

               nums[i+1] = nums[i];
               nums[i] = temp;
            }
        }

        for(int i = 0; i < nums.length - 1; i++){
            updatedArray[i] = nums[i];

        }

        System.out.println(Arrays.toString(updatedArray));
    }

    /**
     * Insert an element at a specific position in the array
     */


    //Explanation: We had to create a new array, since we're adding an element and array sizes are immutable
    //We have two pointers, one iterating in one array, one in the second
    //once we reach the position where we wish to insert, we insert into the first array, and move the pointer by one
    //second pointer keeps it's place in the second array, then is able to keep the same order of the array when adding
    // the remainder elements
    public static void insertElement(int[] nums, int position, int insert){

        int[] updatedNums = new int[nums.length + 1];

        for (int i = 0, j = 0; i < updatedNums.length; i++, j++){

            if(position == i){
                updatedNums[i] = insert;
                i++;
                updatedNums[i] = nums[j];
            }else{
                updatedNums[i] = nums[j];
            }

        }
    }

    /**
     * Add one array to the end of another array
     */

    //Explanation: You have to create a new array equal to the length of the sum of the other two array lengths
    //Then just iterate through each array and add the elements in, you'll just need one extra counter to keep
    //position within both for loops
    public static void addArrays(int[] nums, int[] numsTwo){

        int[] sumArray = new int[nums.length + numsTwo.length];

        int counter = 0;

        for(int i = 0; i < nums.length; i++){
            sumArray[i] = nums[i];
            counter++;
        }

        for(int j = 0; j < numsTwo.length; j++){
            sumArray[counter] = numsTwo[j];
            counter++;
        }

    }

    /**
     * Find and print any duplicates in the array
     */

    
}
